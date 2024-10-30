#include "kv_client_impl.h"
#include <algorithm>
#include <cstring>
#include <thread>
#include "message.h"
using namespace std;

void SimpleRW(const char* config_file) {
    KVClientImpl* client = new KVClientImpl();
    client->init(config_file);
    for (int i = 0; i < 1000; i++) {
        char *old_value = 0;
        uint32_t old_value_size;
        int res =
            client->put(to_string(i).c_str(), ("value" + to_string(i)).c_str(),
                       old_value);
        M_ASSERT(res == 1, "unexpected res for put of key %d: %d", i, res);
    }

    // varify the data
    for (int i = 0; i < 1000; i++) {
        char value[2048]; 
        int res = client->get(to_string(i).c_str(), value);
        M_ASSERT(res == 0, "unexpected res for get of key %d: %d", i, res);
        M_ASSERT(strcmp(("value" + to_string(i)).c_str(), value) == 0,
                 "unexpected res for Get of key %d, get value %s, expected %s",
                 i, value, ("value" + to_string(i)).c_str());
    }
    client->shutdown();
}


void SimpleWrite(const char* config_file) {
    KVClientImpl* client = new KVClientImpl();
    client->init(config_file);
    for (int i = 0; i < 1000; i++) {
        char old_value[2048]; 
        int res =
            client->put(to_string(i).c_str(), ("value" + to_string(i)).c_str(),
                       old_value);
        M_ASSERT(res == 1, "unexpected res for put of key %d: %d", i, res);
    }

    // varify the data after rewriting
    for (int i = 0; i < 1000; i++) {
           char old_value[2048]; 
        int res = client->put(to_string(i).c_str(),
                             ("newvalue" + to_string(i)).c_str(), old_value);
        M_ASSERT(res == 0, "unexpected res for put of key %d: %d", i, res);
        M_ASSERT(strcmp(("value" + to_string(i)).c_str(), old_value) == 0,
                 "unexpected res for Get of key %d, get value %s, expected %s"
                 i, old_value, ("value" + to_string(i)).c_str());
        char value[2048]; 
        res = client->get(to_string(i).c_str(), value);
        M_ASSERT(res == 0, "unexpected res for get of key %d: %d", i, res);
        M_ASSERT(strcmp(("newvalue" + to_string(i)).c_str(), value) == 0,
                 "unexpected res for Get of key %d, get value %s, expected %s",
                 i, value, ("value" + to_string(i)).c_str());
    }
    client->shutdown();

}



void SimpleConcurrency(const char* config_file) {
    auto worker = [&config_file](int start, int end) {
        KVClientImpl* client = new KVClientImpl();
        client->init(config_file);
        for (int i = start; i < end; i++) {
            char old_value[2048]; 

            int res = client->put(std::to_string(i).c_str(),
                                 ("value" + std::to_string(i)).c_str(),
                                 old_value);
            M_ASSERT(res == 1, "unexpected res for put of key %d: %d", i, res);

            res = client->put(std::to_string(i).c_str(),
                             ("newvalue" + std::to_string(i)).c_str(),
                             old_value);
            M_ASSERT(res == 0, "unexpected res for put of key %d: %d", i, res);
            M_ASSERT(
                strcmp(("value" + std::to_string(i)).c_str(), old_value) == 0,
                "unexpected res for Get of key %d, get value %s, "
                "expected %s",
                i, old_value);

            char value[2048]; 
            res = client->get(std::to_string(i).c_str(), value);
            M_ASSERT(res == 0, "unexpected res for get of key %d: %d", i, res);
            M_ASSERT(
                strcmp(("newvalue" + std::to_string(i)).c_str(), value) == 0,
                "unexpected res for Get of key %d, get value %s, "
                "expected %s",
                i, value, ("newvalue" + std::to_string(i)).c_str());
        }
        client->shutdown();
    };

    int num_threads = 4;
    int num_keys = 2000;
    int keys_per_thread = num_keys / num_threads;

    std::vector<std::thread> threads;
    for (int t = 0; t < num_threads; ++t) {
        int start = t * keys_per_thread;
        int end = (t + 1) * keys_per_thread;
        threads.emplace_back(worker, start, end);
    }

    for (auto &t : threads) {
        t.join();
    }

}


void ConflictConcurrent(const char* config_file) {
// V    KvStore *store = new KvStore();
//     store->Init("dbtest.db");
    std::vector<bool> accessedNumbers(1001, false);  
    std::mutex mtx;  

    // auto worker = [&config_file, &mtx, &accessedNumbers](int id) {
    auto worker = [&](int id) {
        KVClientImpl* client = new KVClientImpl();
        client->init(config_file); 
        for (int i = 0; i < 1000; i++) {
            char old_value[2048]; 

            std::string key = std::to_string(i);
            string thread_value = to_string(id);
            int res = client->put(key.c_str(), thread_value.c_str(), old_value);

            if (res == 1) {
                // Key was newly inserted by this thread
                std::lock_guard<std::mutex> lock(mtx); 
                accessedNumbers[i] = true; 
            } else if (res == 0) {
                // Key was already present
                // the old key must not be inserted by the current thread id
                 M_ASSERT(strcmp((to_string(id)).c_str(), old_value) != 0,
                 "unexpected res for Get of key %d, get value %s, expected %s",
                 i, old_value, to_string(i).c_str());
            } else {
                // Unexpected result, add an assert to catch errors
                M_ASSERT(false,
                         "Unexpected result for put operation for key %d "
                         "by thread %d: %d",
                         i, id, res);
            }
        }
        client->shutdown();
    };

    const int num_threads = 4;

    std::vector<std::thread> threads;
    for (int t = 0; t < num_threads; ++t) {
        threads.emplace_back(worker, t);
    }

    for (auto &t : threads) {
        t.join();
    }

    for (int i = 0; i < 1000; i++) {
        M_ASSERT(accessedNumbers[i], "key %d has not been accessed", i);
    }

}

int main(int argc, char* argv[]) {
    
    if (argc != 3) {
        std::cerr << "Usage: " << argv[0] << "<test type> <config_file>" << std::endl;
        return 1;
    }


    if (argv[1] == "sr") {
       SimpleRW(argv[1]);
    } else if (argv[1] == "sw") {
       SimpleWrite(argv[1]);
    } else if (argv[1] == "sc") {
       SimpleConcurrency(argv[1]);
    } else if (argv[1] == "cc") {
       ConflictConcurrent(argv[1]);
    }


    return 0;
}

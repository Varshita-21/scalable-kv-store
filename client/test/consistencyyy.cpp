#include "kv_client_impl.h"
#include <algorithm>
#include <cstring>
#include <thread>
#include <mutex>
#include <iostream>
#include <cassert>
#include <string>

using namespace std;

void SimpleRW(const char* config_file) {
    KVClientImpl* client = new KVClientImpl();
    client->init(config_file);
    for (int i = 0; i < 1000; i++) {
        char *old_value = nullptr;
        int res = client->put(to_string(i).c_str(), ("value" + to_string(i)).c_str(), old_value);
        assert(res == 1 && "unexpected result for put");
    }

    // Verify the data
    for (int i = 0; i < 1000; i++) {
        char value[2048];
        int res = client->get(to_string(i).c_str(), value);
        assert(res == 0 && "unexpected result for get");
        assert(strcmp(("value" + to_string(i)).c_str(), value) == 0 && "unexpected value in get");
    }
    client->shutdown();
}

void SimpleWrite(const char* config_file) {
    KVClientImpl* client = new KVClientImpl();
    client->init(config_file);
    for (int i = 0; i < 1000; i++) {
        char old_value[2048];
        int res = client->put(to_string(i).c_str(), ("value" + to_string(i)).c_str(), old_value);
        assert(res == 1 && "unexpected result for put");
    }

    // Verify the data after rewriting
    for (int i = 0; i < 1000; i++) {
        char old_value[2048];
        int res = client->put(to_string(i).c_str(), ("newvalue" + to_string(i)).c_str(), old_value);
        assert(res == 0 && "unexpected result for put");
        assert(strcmp(("value" + to_string(i)).c_str(), old_value) == 0 && "unexpected old value");
        
        char value[2048];
        res = client->get(to_string(i).c_str(), value);
        assert(res == 0 && "unexpected result for get");
        assert(strcmp(("newvalue" + to_string(i)).c_str(), value) == 0 && "unexpected new value in get");
    }
    client->shutdown();
}

void SimpleConcurrency(const char* config_file) {
    auto worker = [&config_file](int start, int end) {
        KVClientImpl* client = new KVClientImpl();
        client->init(config_file);
        for (int i = start; i < end; i++) {
            char old_value[2048];

            int res = client->put(to_string(i).c_str(), ("value" + to_string(i)).c_str(), old_value);
            assert(res == 1 && "unexpected result for put");

            res = client->put(to_string(i).c_str(), ("newvalue" + to_string(i)).c_str(), old_value);
            assert(res == 0 && "unexpected result for put");

            assert(strcmp(("value" + to_string(i)).c_str(), old_value) == 0 && "unexpected old value");

            char value[2048];
            res = client->get(to_string(i).c_str(), value);
            assert(res == 0 && "unexpected result for get");
            assert(strcmp(("newvalue" + to_string(i)).c_str(), value) == 0 && "unexpected new value");
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
    std::vector<bool> accessedNumbers(1001, false);
    std::mutex mtx;

    auto worker = [&](int id) {
        KVClientImpl* client = new KVClientImpl();
        client->init(config_file);
        for (int i = 0; i < 1000; i++) {
            char old_value[2048];

            std::string key = std::to_string(i);
            std::string thread_value = std::to_string(id);
            int res = client->put(key.c_str(), thread_value.c_str(), old_value);

            if (res == 1) {
                std::lock_guard<std::mutex> lock(mtx);
                accessedNumbers[i] = true;
            } else if (res == 0) {
                assert(strcmp(std::to_string(id).c_str(), old_value) != 0 && "unexpected value in conflict check");
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
        assert(accessedNumbers[i] && "key has not been accessed");
    }
}

int main(int argc, char* argv[]) {
    if (argc != 3) {
        std::cerr << "Usage: " << argv[0] << " <test_type> <config_file>" << std::endl;
        return 1;
    }

    const char* test_type = argv[1];
    const char* config_file = argv[2];

    if (std::string(test_type) == "sr") {
        SimpleRW(config_file);
    } else if (std::string(test_type) == "sw") {
        SimpleWrite(config_file);
    } else if (std::string(test_type) == "sc") {
        SimpleConcurrency(config_file);
    } else if (std::string(test_type) == "cc") {
        ConflictConcurrent(config_file);
    } else {
        std::cerr << "Unknown test type: " << test_type << std::endl;
        return 1;
    }

    return 0;
}


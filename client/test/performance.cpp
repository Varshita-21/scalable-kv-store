#include <iostream>
#include <fstream>
#include <sstream>
#include <vector>
#include <string>
#include <cassert>
#include <chrono>
#include "kvclient.h"
#include "kv_client_impl.h"

int main(int argc, char* argv[]) {
    if (argc != 3) {
        std::cerr << "Usage: " << argv[0] << " <config_file> <workload_file>" << std::endl;
        return 1;
    }

    const char* config_file = argv[1];
    const char* workload_file = argv[2];

    std::cout << "Running Performance Tests with Workload File..." << std::endl;

    assert(kv739_init(const_cast<char*>(config_file)) == 0);

    std::ifstream infile(workload_file);
    if (!infile.is_open()) {
        std::cerr << "Error: Could not open workload file: " << workload_file << std::endl;
        return 1;
    }

    std::string line;
    char value[2049];
    int total_operations = 0;
    long long total_latency = 0;

    while (std::getline(infile, line)) {
        std::istringstream iss(line);
        std::string operation, key, val;
        iss >> operation;

        auto start = std::chrono::high_resolution_clock::now();

        if (operation == "put") {
            iss >> key >> val;
            int result = kv739_put(const_cast<char*>(key.c_str()), const_cast<char*>(val.c_str()), value);
            assert(result == 0 || result == 1);
        } else if (operation == "get") {
            iss >> key;
            int result = kv739_get(const_cast<char*>(key.c_str()), value);
            assert(result == 0);
        } else {
            std::cerr << "Unknown operation: " << operation << std::endl;
            continue;
        }

        auto end = std::chrono::high_resolution_clock::now();
        auto latency = std::chrono::duration_cast<std::chrono::microseconds>(end - start).count();
        total_latency += latency;
        total_operations++;
    }

    infile.close();

    std::cout << "Workload Results:" << std::endl;
    std::cout << "Total Operations: " << total_operations << std::endl;
    std::cout << "Average Latency: " << (total_operations > 0 ? total_latency / total_operations : 0) << " microseconds" << std::endl;

    kv739_shutdown();

    std::cout << "Performance Tests Completed" << std::endl;

    return 0;
}

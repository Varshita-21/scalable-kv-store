#include <iostream>
#include <fstream>
#include <sstream>
#include <vector>
#include <string>
#include <cassert>
#include <random>
#include "kvclient.h"
#include <bits/algorithmfwd.h>
#include "kv_client_impl.h"
#include <algorithm>
#include <cstring>
#include <thread>
#include "message.h"

std::vector<std::string> load_servers_from_config(const char* config_file) {
    std::vector<std::string> server_list;
    std::ifstream infile(config_file);

    if (!infile.is_open()) {
        std::cerr << "Error opening config file: " << config_file << std::endl;
        return server_list;
    }

    std::string line;
    while (std::getline(infile, line)) {
        if (!line.empty()) {
            server_list.push_back(line);
        }
    }

    infile.close();
    return server_list;
}

void test_availability(const char* config_file) {
    std::cout << "Running Availability Tests..." << std::endl;

    std::vector<std::string> servers = load_servers_from_config(config_file);
    if (servers.empty()) {
        std::cerr << "No servers found in config file." << std::endl;
        return;
    }

    // Step 1: Test with all servers available
    assert(kv739_init(config_file) == 0);
    std::cout << "All servers are up, performing operations..." << std::endl;

    char value[2049];
    int result = kv739_put("test_key1", "test_value1", value);
    assert(result == 0 || result == 1);

    result = kv739_get("test_key1", value);
    assert(result == 0);
    std::cout << "Put and Get operations successful with all servers up." << std::endl;

    kv739_shutdown();

    // Step 2: Test with a subset of servers down
    assert(kv739_init(config_file) == 0);
    std::cout << "Simulating server failure..." << std::endl;

    // Kill a random server
    std::random_device rd;
    std::mt19937 gen(rd());
    std::uniform_int_distribution<> dis(0, servers.size() - 1);
    kv739_die(servers[dis(gen)].c_str(), 1);

    result = kv739_put("test_key2", "test_value2", value);
    assert(result == 0 || result == 1);

    result = kv739_get("test_key2", value);
    assert(result == 0);
    std::cout << "Put and Get operations successful with some servers down." << std::endl;

    kv739_shutdown();

    // Step 3: Test with 49% of servers down
    assert(kv739_init(config_file) == 0);
    std::cout << "Simulating 49% server failure..." << std::endl;

    int servers_to_kill = servers.size() / 2; // Kill 49% of servers
    std::vector<int> indices(servers.size());
    std::iota(indices.begin(), indices.end(), 0);
    std::shuffle(indices.begin(), indices.end(), gen);

    for (int i = 0; i < servers_to_kill; ++i) {
        kv739_die(servers[indices[i]].c_str(), 1);
    }

    result = kv739_put("test_key3", "test_value3", value);
    assert(result == 0);  // Should succeed as quorum is maintained

    result = kv739_get("test_key2", value);  // Testing previously inserted key
    assert(result == 0);  

    kv739_shutdown();
    std::cout << "Availability Tests Passed with 49% failure handled correctly." << std::endl;

    // Step 4: Test with more than 50% of servers down
    assert(kv739_init(config_file) == 0);
    std::cout << "Simulating more than 50% server failure..." << std::endl;

    servers_to_kill = servers.size() / 2 + 1; // Kill more than 50% of servers

    for (int i = 0; i < servers_to_kill; ++i) {
        kv739_die(servers[indices[i]].c_str(), 1);
    }

    result = kv739_put("test_key4", "test_value4", value);
    assert(result != 0);  // Should fail because Raft cannot achieve consensus with a majority down

    result = kv739_get("test_key2", value);  // Testing previously inserted key
    assert(result != 0);  // Should fail

    kv739_shutdown();
    std::cout << "Availability Tests Passed with majority failure (over 50%) handled correctly." << std::endl;
}

int main(int argc, char* argv[]) {
    if (argc != 2) {
        std::cerr << "Usage: " << argv[0] << " <config_file>" << std::endl;
        return 1;
    }
    const char* config_file = argv[1];
    test_availability(config_file);

    return 0;
}

#include "kvclient.h"
#include "kv_client_impl.h"

extern "C" {

int kv739_init(const char *config_file) {
    return KVClientImpl::getInstance().init(config_file);
}

int kv739_shutdown(void) {
    return KVClientImpl::getInstance().shutdown();
}

int kv739_get(const char *key, char *value) {
    return KVClientImpl::getInstance().get(key, value);
}

int kv739_put(const char *key, const char *value, char *old_value) {
    return KVClientImpl::getInstance().put(key, value, old_value);
}

int kv739_die(const char *server_name, int clean) {
    return KVClientImpl::getInstance().die(server_name, clean);
}

}


#ifndef KVCLIENT_H
#define KVCLIENT_H

#ifdef __cplusplus
extern "C" {
#endif

int kv739_init(const char *config_file);
int kv739_shutdown(void);
int kv739_get(const char *key, char *value);
int kv739_put(const char *key,const char *value, char *old_value);
int kv739_die(const char *server_name, int clean);

#ifdef __cplusplus
}
#endif

#endif // KVCLIENT_H

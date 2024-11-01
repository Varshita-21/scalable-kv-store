// Generated by the gRPC C++ plugin.
// If you make any local change, they will be lost.
// source: kv_store.proto
#ifndef GRPC_kv_5fstore_2eproto__INCLUDED
#define GRPC_kv_5fstore_2eproto__INCLUDED

#include "kv_store.pb.h"

#include <functional>
#include <grpcpp/generic/async_generic_service.h>
#include <grpcpp/support/async_stream.h>
#include <grpcpp/support/async_unary_call.h>
#include <grpcpp/support/client_callback.h>
#include <grpcpp/client_context.h>
#include <grpcpp/completion_queue.h>
#include <grpcpp/support/message_allocator.h>
#include <grpcpp/support/method_handler.h>
#include <grpcpp/impl/proto_utils.h>
#include <grpcpp/impl/rpc_method.h>
#include <grpcpp/support/server_callback.h>
#include <grpcpp/impl/server_callback_handlers.h>
#include <grpcpp/server_context.h>
#include <grpcpp/impl/service_type.h>
#include <grpcpp/support/status.h>
#include <grpcpp/support/stub_options.h>
#include <grpcpp/support/sync_stream.h>

namespace kvstore {

class KVStoreService final {
 public:
  static constexpr char const* service_full_name() {
    return "kvstore.KVStoreService";
  }
  class StubInterface {
   public:
    virtual ~StubInterface() {}
    virtual ::grpc::Status Get(::grpc::ClientContext* context, const ::kvstore::GetRequest& request, ::kvstore::GetResponse* response) = 0;
    std::unique_ptr< ::grpc::ClientAsyncResponseReaderInterface< ::kvstore::GetResponse>> AsyncGet(::grpc::ClientContext* context, const ::kvstore::GetRequest& request, ::grpc::CompletionQueue* cq) {
      return std::unique_ptr< ::grpc::ClientAsyncResponseReaderInterface< ::kvstore::GetResponse>>(AsyncGetRaw(context, request, cq));
    }
    std::unique_ptr< ::grpc::ClientAsyncResponseReaderInterface< ::kvstore::GetResponse>> PrepareAsyncGet(::grpc::ClientContext* context, const ::kvstore::GetRequest& request, ::grpc::CompletionQueue* cq) {
      return std::unique_ptr< ::grpc::ClientAsyncResponseReaderInterface< ::kvstore::GetResponse>>(PrepareAsyncGetRaw(context, request, cq));
    }
    virtual ::grpc::Status Put(::grpc::ClientContext* context, const ::kvstore::PutRequest& request, ::kvstore::PutResponse* response) = 0;
    std::unique_ptr< ::grpc::ClientAsyncResponseReaderInterface< ::kvstore::PutResponse>> AsyncPut(::grpc::ClientContext* context, const ::kvstore::PutRequest& request, ::grpc::CompletionQueue* cq) {
      return std::unique_ptr< ::grpc::ClientAsyncResponseReaderInterface< ::kvstore::PutResponse>>(AsyncPutRaw(context, request, cq));
    }
    std::unique_ptr< ::grpc::ClientAsyncResponseReaderInterface< ::kvstore::PutResponse>> PrepareAsyncPut(::grpc::ClientContext* context, const ::kvstore::PutRequest& request, ::grpc::CompletionQueue* cq) {
      return std::unique_ptr< ::grpc::ClientAsyncResponseReaderInterface< ::kvstore::PutResponse>>(PrepareAsyncPutRaw(context, request, cq));
    }
    virtual ::grpc::Status Die(::grpc::ClientContext* context, const ::kvstore::DieRequest& request, ::kvstore::DieResponse* response) = 0;
    std::unique_ptr< ::grpc::ClientAsyncResponseReaderInterface< ::kvstore::DieResponse>> AsyncDie(::grpc::ClientContext* context, const ::kvstore::DieRequest& request, ::grpc::CompletionQueue* cq) {
      return std::unique_ptr< ::grpc::ClientAsyncResponseReaderInterface< ::kvstore::DieResponse>>(AsyncDieRaw(context, request, cq));
    }
    std::unique_ptr< ::grpc::ClientAsyncResponseReaderInterface< ::kvstore::DieResponse>> PrepareAsyncDie(::grpc::ClientContext* context, const ::kvstore::DieRequest& request, ::grpc::CompletionQueue* cq) {
      return std::unique_ptr< ::grpc::ClientAsyncResponseReaderInterface< ::kvstore::DieResponse>>(PrepareAsyncDieRaw(context, request, cq));
    }
    class async_interface {
     public:
      virtual ~async_interface() {}
      virtual void Get(::grpc::ClientContext* context, const ::kvstore::GetRequest* request, ::kvstore::GetResponse* response, std::function<void(::grpc::Status)>) = 0;
      virtual void Get(::grpc::ClientContext* context, const ::kvstore::GetRequest* request, ::kvstore::GetResponse* response, ::grpc::ClientUnaryReactor* reactor) = 0;
      virtual void Put(::grpc::ClientContext* context, const ::kvstore::PutRequest* request, ::kvstore::PutResponse* response, std::function<void(::grpc::Status)>) = 0;
      virtual void Put(::grpc::ClientContext* context, const ::kvstore::PutRequest* request, ::kvstore::PutResponse* response, ::grpc::ClientUnaryReactor* reactor) = 0;
      virtual void Die(::grpc::ClientContext* context, const ::kvstore::DieRequest* request, ::kvstore::DieResponse* response, std::function<void(::grpc::Status)>) = 0;
      virtual void Die(::grpc::ClientContext* context, const ::kvstore::DieRequest* request, ::kvstore::DieResponse* response, ::grpc::ClientUnaryReactor* reactor) = 0;
    };
    typedef class async_interface experimental_async_interface;
    virtual class async_interface* async() { return nullptr; }
    class async_interface* experimental_async() { return async(); }
   private:
    virtual ::grpc::ClientAsyncResponseReaderInterface< ::kvstore::GetResponse>* AsyncGetRaw(::grpc::ClientContext* context, const ::kvstore::GetRequest& request, ::grpc::CompletionQueue* cq) = 0;
    virtual ::grpc::ClientAsyncResponseReaderInterface< ::kvstore::GetResponse>* PrepareAsyncGetRaw(::grpc::ClientContext* context, const ::kvstore::GetRequest& request, ::grpc::CompletionQueue* cq) = 0;
    virtual ::grpc::ClientAsyncResponseReaderInterface< ::kvstore::PutResponse>* AsyncPutRaw(::grpc::ClientContext* context, const ::kvstore::PutRequest& request, ::grpc::CompletionQueue* cq) = 0;
    virtual ::grpc::ClientAsyncResponseReaderInterface< ::kvstore::PutResponse>* PrepareAsyncPutRaw(::grpc::ClientContext* context, const ::kvstore::PutRequest& request, ::grpc::CompletionQueue* cq) = 0;
    virtual ::grpc::ClientAsyncResponseReaderInterface< ::kvstore::DieResponse>* AsyncDieRaw(::grpc::ClientContext* context, const ::kvstore::DieRequest& request, ::grpc::CompletionQueue* cq) = 0;
    virtual ::grpc::ClientAsyncResponseReaderInterface< ::kvstore::DieResponse>* PrepareAsyncDieRaw(::grpc::ClientContext* context, const ::kvstore::DieRequest& request, ::grpc::CompletionQueue* cq) = 0;
  };
  class Stub final : public StubInterface {
   public:
    Stub(const std::shared_ptr< ::grpc::ChannelInterface>& channel, const ::grpc::StubOptions& options = ::grpc::StubOptions());
    ::grpc::Status Get(::grpc::ClientContext* context, const ::kvstore::GetRequest& request, ::kvstore::GetResponse* response) override;
    std::unique_ptr< ::grpc::ClientAsyncResponseReader< ::kvstore::GetResponse>> AsyncGet(::grpc::ClientContext* context, const ::kvstore::GetRequest& request, ::grpc::CompletionQueue* cq) {
      return std::unique_ptr< ::grpc::ClientAsyncResponseReader< ::kvstore::GetResponse>>(AsyncGetRaw(context, request, cq));
    }
    std::unique_ptr< ::grpc::ClientAsyncResponseReader< ::kvstore::GetResponse>> PrepareAsyncGet(::grpc::ClientContext* context, const ::kvstore::GetRequest& request, ::grpc::CompletionQueue* cq) {
      return std::unique_ptr< ::grpc::ClientAsyncResponseReader< ::kvstore::GetResponse>>(PrepareAsyncGetRaw(context, request, cq));
    }
    ::grpc::Status Put(::grpc::ClientContext* context, const ::kvstore::PutRequest& request, ::kvstore::PutResponse* response) override;
    std::unique_ptr< ::grpc::ClientAsyncResponseReader< ::kvstore::PutResponse>> AsyncPut(::grpc::ClientContext* context, const ::kvstore::PutRequest& request, ::grpc::CompletionQueue* cq) {
      return std::unique_ptr< ::grpc::ClientAsyncResponseReader< ::kvstore::PutResponse>>(AsyncPutRaw(context, request, cq));
    }
    std::unique_ptr< ::grpc::ClientAsyncResponseReader< ::kvstore::PutResponse>> PrepareAsyncPut(::grpc::ClientContext* context, const ::kvstore::PutRequest& request, ::grpc::CompletionQueue* cq) {
      return std::unique_ptr< ::grpc::ClientAsyncResponseReader< ::kvstore::PutResponse>>(PrepareAsyncPutRaw(context, request, cq));
    }
    ::grpc::Status Die(::grpc::ClientContext* context, const ::kvstore::DieRequest& request, ::kvstore::DieResponse* response) override;
    std::unique_ptr< ::grpc::ClientAsyncResponseReader< ::kvstore::DieResponse>> AsyncDie(::grpc::ClientContext* context, const ::kvstore::DieRequest& request, ::grpc::CompletionQueue* cq) {
      return std::unique_ptr< ::grpc::ClientAsyncResponseReader< ::kvstore::DieResponse>>(AsyncDieRaw(context, request, cq));
    }
    std::unique_ptr< ::grpc::ClientAsyncResponseReader< ::kvstore::DieResponse>> PrepareAsyncDie(::grpc::ClientContext* context, const ::kvstore::DieRequest& request, ::grpc::CompletionQueue* cq) {
      return std::unique_ptr< ::grpc::ClientAsyncResponseReader< ::kvstore::DieResponse>>(PrepareAsyncDieRaw(context, request, cq));
    }
    class async final :
      public StubInterface::async_interface {
     public:
      void Get(::grpc::ClientContext* context, const ::kvstore::GetRequest* request, ::kvstore::GetResponse* response, std::function<void(::grpc::Status)>) override;
      void Get(::grpc::ClientContext* context, const ::kvstore::GetRequest* request, ::kvstore::GetResponse* response, ::grpc::ClientUnaryReactor* reactor) override;
      void Put(::grpc::ClientContext* context, const ::kvstore::PutRequest* request, ::kvstore::PutResponse* response, std::function<void(::grpc::Status)>) override;
      void Put(::grpc::ClientContext* context, const ::kvstore::PutRequest* request, ::kvstore::PutResponse* response, ::grpc::ClientUnaryReactor* reactor) override;
      void Die(::grpc::ClientContext* context, const ::kvstore::DieRequest* request, ::kvstore::DieResponse* response, std::function<void(::grpc::Status)>) override;
      void Die(::grpc::ClientContext* context, const ::kvstore::DieRequest* request, ::kvstore::DieResponse* response, ::grpc::ClientUnaryReactor* reactor) override;
     private:
      friend class Stub;
      explicit async(Stub* stub): stub_(stub) { }
      Stub* stub() { return stub_; }
      Stub* stub_;
    };
    class async* async() override { return &async_stub_; }

   private:
    std::shared_ptr< ::grpc::ChannelInterface> channel_;
    class async async_stub_{this};
    ::grpc::ClientAsyncResponseReader< ::kvstore::GetResponse>* AsyncGetRaw(::grpc::ClientContext* context, const ::kvstore::GetRequest& request, ::grpc::CompletionQueue* cq) override;
    ::grpc::ClientAsyncResponseReader< ::kvstore::GetResponse>* PrepareAsyncGetRaw(::grpc::ClientContext* context, const ::kvstore::GetRequest& request, ::grpc::CompletionQueue* cq) override;
    ::grpc::ClientAsyncResponseReader< ::kvstore::PutResponse>* AsyncPutRaw(::grpc::ClientContext* context, const ::kvstore::PutRequest& request, ::grpc::CompletionQueue* cq) override;
    ::grpc::ClientAsyncResponseReader< ::kvstore::PutResponse>* PrepareAsyncPutRaw(::grpc::ClientContext* context, const ::kvstore::PutRequest& request, ::grpc::CompletionQueue* cq) override;
    ::grpc::ClientAsyncResponseReader< ::kvstore::DieResponse>* AsyncDieRaw(::grpc::ClientContext* context, const ::kvstore::DieRequest& request, ::grpc::CompletionQueue* cq) override;
    ::grpc::ClientAsyncResponseReader< ::kvstore::DieResponse>* PrepareAsyncDieRaw(::grpc::ClientContext* context, const ::kvstore::DieRequest& request, ::grpc::CompletionQueue* cq) override;
    const ::grpc::internal::RpcMethod rpcmethod_Get_;
    const ::grpc::internal::RpcMethod rpcmethod_Put_;
    const ::grpc::internal::RpcMethod rpcmethod_Die_;
  };
  static std::unique_ptr<Stub> NewStub(const std::shared_ptr< ::grpc::ChannelInterface>& channel, const ::grpc::StubOptions& options = ::grpc::StubOptions());

  class Service : public ::grpc::Service {
   public:
    Service();
    virtual ~Service();
    virtual ::grpc::Status Get(::grpc::ServerContext* context, const ::kvstore::GetRequest* request, ::kvstore::GetResponse* response);
    virtual ::grpc::Status Put(::grpc::ServerContext* context, const ::kvstore::PutRequest* request, ::kvstore::PutResponse* response);
    virtual ::grpc::Status Die(::grpc::ServerContext* context, const ::kvstore::DieRequest* request, ::kvstore::DieResponse* response);
  };
  template <class BaseClass>
  class WithAsyncMethod_Get : public BaseClass {
   private:
    void BaseClassMustBeDerivedFromService(const Service* /*service*/) {}
   public:
    WithAsyncMethod_Get() {
      ::grpc::Service::MarkMethodAsync(0);
    }
    ~WithAsyncMethod_Get() override {
      BaseClassMustBeDerivedFromService(this);
    }
    // disable synchronous version of this method
    ::grpc::Status Get(::grpc::ServerContext* /*context*/, const ::kvstore::GetRequest* /*request*/, ::kvstore::GetResponse* /*response*/) override {
      abort();
      return ::grpc::Status(::grpc::StatusCode::UNIMPLEMENTED, "");
    }
    void RequestGet(::grpc::ServerContext* context, ::kvstore::GetRequest* request, ::grpc::ServerAsyncResponseWriter< ::kvstore::GetResponse>* response, ::grpc::CompletionQueue* new_call_cq, ::grpc::ServerCompletionQueue* notification_cq, void *tag) {
      ::grpc::Service::RequestAsyncUnary(0, context, request, response, new_call_cq, notification_cq, tag);
    }
  };
  template <class BaseClass>
  class WithAsyncMethod_Put : public BaseClass {
   private:
    void BaseClassMustBeDerivedFromService(const Service* /*service*/) {}
   public:
    WithAsyncMethod_Put() {
      ::grpc::Service::MarkMethodAsync(1);
    }
    ~WithAsyncMethod_Put() override {
      BaseClassMustBeDerivedFromService(this);
    }
    // disable synchronous version of this method
    ::grpc::Status Put(::grpc::ServerContext* /*context*/, const ::kvstore::PutRequest* /*request*/, ::kvstore::PutResponse* /*response*/) override {
      abort();
      return ::grpc::Status(::grpc::StatusCode::UNIMPLEMENTED, "");
    }
    void RequestPut(::grpc::ServerContext* context, ::kvstore::PutRequest* request, ::grpc::ServerAsyncResponseWriter< ::kvstore::PutResponse>* response, ::grpc::CompletionQueue* new_call_cq, ::grpc::ServerCompletionQueue* notification_cq, void *tag) {
      ::grpc::Service::RequestAsyncUnary(1, context, request, response, new_call_cq, notification_cq, tag);
    }
  };
  template <class BaseClass>
  class WithAsyncMethod_Die : public BaseClass {
   private:
    void BaseClassMustBeDerivedFromService(const Service* /*service*/) {}
   public:
    WithAsyncMethod_Die() {
      ::grpc::Service::MarkMethodAsync(2);
    }
    ~WithAsyncMethod_Die() override {
      BaseClassMustBeDerivedFromService(this);
    }
    // disable synchronous version of this method
    ::grpc::Status Die(::grpc::ServerContext* /*context*/, const ::kvstore::DieRequest* /*request*/, ::kvstore::DieResponse* /*response*/) override {
      abort();
      return ::grpc::Status(::grpc::StatusCode::UNIMPLEMENTED, "");
    }
    void RequestDie(::grpc::ServerContext* context, ::kvstore::DieRequest* request, ::grpc::ServerAsyncResponseWriter< ::kvstore::DieResponse>* response, ::grpc::CompletionQueue* new_call_cq, ::grpc::ServerCompletionQueue* notification_cq, void *tag) {
      ::grpc::Service::RequestAsyncUnary(2, context, request, response, new_call_cq, notification_cq, tag);
    }
  };
  typedef WithAsyncMethod_Get<WithAsyncMethod_Put<WithAsyncMethod_Die<Service > > > AsyncService;
  template <class BaseClass>
  class WithCallbackMethod_Get : public BaseClass {
   private:
    void BaseClassMustBeDerivedFromService(const Service* /*service*/) {}
   public:
    WithCallbackMethod_Get() {
      ::grpc::Service::MarkMethodCallback(0,
          new ::grpc::internal::CallbackUnaryHandler< ::kvstore::GetRequest, ::kvstore::GetResponse>(
            [this](
                   ::grpc::CallbackServerContext* context, const ::kvstore::GetRequest* request, ::kvstore::GetResponse* response) { return this->Get(context, request, response); }));}
    void SetMessageAllocatorFor_Get(
        ::grpc::MessageAllocator< ::kvstore::GetRequest, ::kvstore::GetResponse>* allocator) {
      ::grpc::internal::MethodHandler* const handler = ::grpc::Service::GetHandler(0);
      static_cast<::grpc::internal::CallbackUnaryHandler< ::kvstore::GetRequest, ::kvstore::GetResponse>*>(handler)
              ->SetMessageAllocator(allocator);
    }
    ~WithCallbackMethod_Get() override {
      BaseClassMustBeDerivedFromService(this);
    }
    // disable synchronous version of this method
    ::grpc::Status Get(::grpc::ServerContext* /*context*/, const ::kvstore::GetRequest* /*request*/, ::kvstore::GetResponse* /*response*/) override {
      abort();
      return ::grpc::Status(::grpc::StatusCode::UNIMPLEMENTED, "");
    }
    virtual ::grpc::ServerUnaryReactor* Get(
      ::grpc::CallbackServerContext* /*context*/, const ::kvstore::GetRequest* /*request*/, ::kvstore::GetResponse* /*response*/)  { return nullptr; }
  };
  template <class BaseClass>
  class WithCallbackMethod_Put : public BaseClass {
   private:
    void BaseClassMustBeDerivedFromService(const Service* /*service*/) {}
   public:
    WithCallbackMethod_Put() {
      ::grpc::Service::MarkMethodCallback(1,
          new ::grpc::internal::CallbackUnaryHandler< ::kvstore::PutRequest, ::kvstore::PutResponse>(
            [this](
                   ::grpc::CallbackServerContext* context, const ::kvstore::PutRequest* request, ::kvstore::PutResponse* response) { return this->Put(context, request, response); }));}
    void SetMessageAllocatorFor_Put(
        ::grpc::MessageAllocator< ::kvstore::PutRequest, ::kvstore::PutResponse>* allocator) {
      ::grpc::internal::MethodHandler* const handler = ::grpc::Service::GetHandler(1);
      static_cast<::grpc::internal::CallbackUnaryHandler< ::kvstore::PutRequest, ::kvstore::PutResponse>*>(handler)
              ->SetMessageAllocator(allocator);
    }
    ~WithCallbackMethod_Put() override {
      BaseClassMustBeDerivedFromService(this);
    }
    // disable synchronous version of this method
    ::grpc::Status Put(::grpc::ServerContext* /*context*/, const ::kvstore::PutRequest* /*request*/, ::kvstore::PutResponse* /*response*/) override {
      abort();
      return ::grpc::Status(::grpc::StatusCode::UNIMPLEMENTED, "");
    }
    virtual ::grpc::ServerUnaryReactor* Put(
      ::grpc::CallbackServerContext* /*context*/, const ::kvstore::PutRequest* /*request*/, ::kvstore::PutResponse* /*response*/)  { return nullptr; }
  };
  template <class BaseClass>
  class WithCallbackMethod_Die : public BaseClass {
   private:
    void BaseClassMustBeDerivedFromService(const Service* /*service*/) {}
   public:
    WithCallbackMethod_Die() {
      ::grpc::Service::MarkMethodCallback(2,
          new ::grpc::internal::CallbackUnaryHandler< ::kvstore::DieRequest, ::kvstore::DieResponse>(
            [this](
                   ::grpc::CallbackServerContext* context, const ::kvstore::DieRequest* request, ::kvstore::DieResponse* response) { return this->Die(context, request, response); }));}
    void SetMessageAllocatorFor_Die(
        ::grpc::MessageAllocator< ::kvstore::DieRequest, ::kvstore::DieResponse>* allocator) {
      ::grpc::internal::MethodHandler* const handler = ::grpc::Service::GetHandler(2);
      static_cast<::grpc::internal::CallbackUnaryHandler< ::kvstore::DieRequest, ::kvstore::DieResponse>*>(handler)
              ->SetMessageAllocator(allocator);
    }
    ~WithCallbackMethod_Die() override {
      BaseClassMustBeDerivedFromService(this);
    }
    // disable synchronous version of this method
    ::grpc::Status Die(::grpc::ServerContext* /*context*/, const ::kvstore::DieRequest* /*request*/, ::kvstore::DieResponse* /*response*/) override {
      abort();
      return ::grpc::Status(::grpc::StatusCode::UNIMPLEMENTED, "");
    }
    virtual ::grpc::ServerUnaryReactor* Die(
      ::grpc::CallbackServerContext* /*context*/, const ::kvstore::DieRequest* /*request*/, ::kvstore::DieResponse* /*response*/)  { return nullptr; }
  };
  typedef WithCallbackMethod_Get<WithCallbackMethod_Put<WithCallbackMethod_Die<Service > > > CallbackService;
  typedef CallbackService ExperimentalCallbackService;
  template <class BaseClass>
  class WithGenericMethod_Get : public BaseClass {
   private:
    void BaseClassMustBeDerivedFromService(const Service* /*service*/) {}
   public:
    WithGenericMethod_Get() {
      ::grpc::Service::MarkMethodGeneric(0);
    }
    ~WithGenericMethod_Get() override {
      BaseClassMustBeDerivedFromService(this);
    }
    // disable synchronous version of this method
    ::grpc::Status Get(::grpc::ServerContext* /*context*/, const ::kvstore::GetRequest* /*request*/, ::kvstore::GetResponse* /*response*/) override {
      abort();
      return ::grpc::Status(::grpc::StatusCode::UNIMPLEMENTED, "");
    }
  };
  template <class BaseClass>
  class WithGenericMethod_Put : public BaseClass {
   private:
    void BaseClassMustBeDerivedFromService(const Service* /*service*/) {}
   public:
    WithGenericMethod_Put() {
      ::grpc::Service::MarkMethodGeneric(1);
    }
    ~WithGenericMethod_Put() override {
      BaseClassMustBeDerivedFromService(this);
    }
    // disable synchronous version of this method
    ::grpc::Status Put(::grpc::ServerContext* /*context*/, const ::kvstore::PutRequest* /*request*/, ::kvstore::PutResponse* /*response*/) override {
      abort();
      return ::grpc::Status(::grpc::StatusCode::UNIMPLEMENTED, "");
    }
  };
  template <class BaseClass>
  class WithGenericMethod_Die : public BaseClass {
   private:
    void BaseClassMustBeDerivedFromService(const Service* /*service*/) {}
   public:
    WithGenericMethod_Die() {
      ::grpc::Service::MarkMethodGeneric(2);
    }
    ~WithGenericMethod_Die() override {
      BaseClassMustBeDerivedFromService(this);
    }
    // disable synchronous version of this method
    ::grpc::Status Die(::grpc::ServerContext* /*context*/, const ::kvstore::DieRequest* /*request*/, ::kvstore::DieResponse* /*response*/) override {
      abort();
      return ::grpc::Status(::grpc::StatusCode::UNIMPLEMENTED, "");
    }
  };
  template <class BaseClass>
  class WithRawMethod_Get : public BaseClass {
   private:
    void BaseClassMustBeDerivedFromService(const Service* /*service*/) {}
   public:
    WithRawMethod_Get() {
      ::grpc::Service::MarkMethodRaw(0);
    }
    ~WithRawMethod_Get() override {
      BaseClassMustBeDerivedFromService(this);
    }
    // disable synchronous version of this method
    ::grpc::Status Get(::grpc::ServerContext* /*context*/, const ::kvstore::GetRequest* /*request*/, ::kvstore::GetResponse* /*response*/) override {
      abort();
      return ::grpc::Status(::grpc::StatusCode::UNIMPLEMENTED, "");
    }
    void RequestGet(::grpc::ServerContext* context, ::grpc::ByteBuffer* request, ::grpc::ServerAsyncResponseWriter< ::grpc::ByteBuffer>* response, ::grpc::CompletionQueue* new_call_cq, ::grpc::ServerCompletionQueue* notification_cq, void *tag) {
      ::grpc::Service::RequestAsyncUnary(0, context, request, response, new_call_cq, notification_cq, tag);
    }
  };
  template <class BaseClass>
  class WithRawMethod_Put : public BaseClass {
   private:
    void BaseClassMustBeDerivedFromService(const Service* /*service*/) {}
   public:
    WithRawMethod_Put() {
      ::grpc::Service::MarkMethodRaw(1);
    }
    ~WithRawMethod_Put() override {
      BaseClassMustBeDerivedFromService(this);
    }
    // disable synchronous version of this method
    ::grpc::Status Put(::grpc::ServerContext* /*context*/, const ::kvstore::PutRequest* /*request*/, ::kvstore::PutResponse* /*response*/) override {
      abort();
      return ::grpc::Status(::grpc::StatusCode::UNIMPLEMENTED, "");
    }
    void RequestPut(::grpc::ServerContext* context, ::grpc::ByteBuffer* request, ::grpc::ServerAsyncResponseWriter< ::grpc::ByteBuffer>* response, ::grpc::CompletionQueue* new_call_cq, ::grpc::ServerCompletionQueue* notification_cq, void *tag) {
      ::grpc::Service::RequestAsyncUnary(1, context, request, response, new_call_cq, notification_cq, tag);
    }
  };
  template <class BaseClass>
  class WithRawMethod_Die : public BaseClass {
   private:
    void BaseClassMustBeDerivedFromService(const Service* /*service*/) {}
   public:
    WithRawMethod_Die() {
      ::grpc::Service::MarkMethodRaw(2);
    }
    ~WithRawMethod_Die() override {
      BaseClassMustBeDerivedFromService(this);
    }
    // disable synchronous version of this method
    ::grpc::Status Die(::grpc::ServerContext* /*context*/, const ::kvstore::DieRequest* /*request*/, ::kvstore::DieResponse* /*response*/) override {
      abort();
      return ::grpc::Status(::grpc::StatusCode::UNIMPLEMENTED, "");
    }
    void RequestDie(::grpc::ServerContext* context, ::grpc::ByteBuffer* request, ::grpc::ServerAsyncResponseWriter< ::grpc::ByteBuffer>* response, ::grpc::CompletionQueue* new_call_cq, ::grpc::ServerCompletionQueue* notification_cq, void *tag) {
      ::grpc::Service::RequestAsyncUnary(2, context, request, response, new_call_cq, notification_cq, tag);
    }
  };
  template <class BaseClass>
  class WithRawCallbackMethod_Get : public BaseClass {
   private:
    void BaseClassMustBeDerivedFromService(const Service* /*service*/) {}
   public:
    WithRawCallbackMethod_Get() {
      ::grpc::Service::MarkMethodRawCallback(0,
          new ::grpc::internal::CallbackUnaryHandler< ::grpc::ByteBuffer, ::grpc::ByteBuffer>(
            [this](
                   ::grpc::CallbackServerContext* context, const ::grpc::ByteBuffer* request, ::grpc::ByteBuffer* response) { return this->Get(context, request, response); }));
    }
    ~WithRawCallbackMethod_Get() override {
      BaseClassMustBeDerivedFromService(this);
    }
    // disable synchronous version of this method
    ::grpc::Status Get(::grpc::ServerContext* /*context*/, const ::kvstore::GetRequest* /*request*/, ::kvstore::GetResponse* /*response*/) override {
      abort();
      return ::grpc::Status(::grpc::StatusCode::UNIMPLEMENTED, "");
    }
    virtual ::grpc::ServerUnaryReactor* Get(
      ::grpc::CallbackServerContext* /*context*/, const ::grpc::ByteBuffer* /*request*/, ::grpc::ByteBuffer* /*response*/)  { return nullptr; }
  };
  template <class BaseClass>
  class WithRawCallbackMethod_Put : public BaseClass {
   private:
    void BaseClassMustBeDerivedFromService(const Service* /*service*/) {}
   public:
    WithRawCallbackMethod_Put() {
      ::grpc::Service::MarkMethodRawCallback(1,
          new ::grpc::internal::CallbackUnaryHandler< ::grpc::ByteBuffer, ::grpc::ByteBuffer>(
            [this](
                   ::grpc::CallbackServerContext* context, const ::grpc::ByteBuffer* request, ::grpc::ByteBuffer* response) { return this->Put(context, request, response); }));
    }
    ~WithRawCallbackMethod_Put() override {
      BaseClassMustBeDerivedFromService(this);
    }
    // disable synchronous version of this method
    ::grpc::Status Put(::grpc::ServerContext* /*context*/, const ::kvstore::PutRequest* /*request*/, ::kvstore::PutResponse* /*response*/) override {
      abort();
      return ::grpc::Status(::grpc::StatusCode::UNIMPLEMENTED, "");
    }
    virtual ::grpc::ServerUnaryReactor* Put(
      ::grpc::CallbackServerContext* /*context*/, const ::grpc::ByteBuffer* /*request*/, ::grpc::ByteBuffer* /*response*/)  { return nullptr; }
  };
  template <class BaseClass>
  class WithRawCallbackMethod_Die : public BaseClass {
   private:
    void BaseClassMustBeDerivedFromService(const Service* /*service*/) {}
   public:
    WithRawCallbackMethod_Die() {
      ::grpc::Service::MarkMethodRawCallback(2,
          new ::grpc::internal::CallbackUnaryHandler< ::grpc::ByteBuffer, ::grpc::ByteBuffer>(
            [this](
                   ::grpc::CallbackServerContext* context, const ::grpc::ByteBuffer* request, ::grpc::ByteBuffer* response) { return this->Die(context, request, response); }));
    }
    ~WithRawCallbackMethod_Die() override {
      BaseClassMustBeDerivedFromService(this);
    }
    // disable synchronous version of this method
    ::grpc::Status Die(::grpc::ServerContext* /*context*/, const ::kvstore::DieRequest* /*request*/, ::kvstore::DieResponse* /*response*/) override {
      abort();
      return ::grpc::Status(::grpc::StatusCode::UNIMPLEMENTED, "");
    }
    virtual ::grpc::ServerUnaryReactor* Die(
      ::grpc::CallbackServerContext* /*context*/, const ::grpc::ByteBuffer* /*request*/, ::grpc::ByteBuffer* /*response*/)  { return nullptr; }
  };
  template <class BaseClass>
  class WithStreamedUnaryMethod_Get : public BaseClass {
   private:
    void BaseClassMustBeDerivedFromService(const Service* /*service*/) {}
   public:
    WithStreamedUnaryMethod_Get() {
      ::grpc::Service::MarkMethodStreamed(0,
        new ::grpc::internal::StreamedUnaryHandler<
          ::kvstore::GetRequest, ::kvstore::GetResponse>(
            [this](::grpc::ServerContext* context,
                   ::grpc::ServerUnaryStreamer<
                     ::kvstore::GetRequest, ::kvstore::GetResponse>* streamer) {
                       return this->StreamedGet(context,
                         streamer);
                  }));
    }
    ~WithStreamedUnaryMethod_Get() override {
      BaseClassMustBeDerivedFromService(this);
    }
    // disable regular version of this method
    ::grpc::Status Get(::grpc::ServerContext* /*context*/, const ::kvstore::GetRequest* /*request*/, ::kvstore::GetResponse* /*response*/) override {
      abort();
      return ::grpc::Status(::grpc::StatusCode::UNIMPLEMENTED, "");
    }
    // replace default version of method with streamed unary
    virtual ::grpc::Status StreamedGet(::grpc::ServerContext* context, ::grpc::ServerUnaryStreamer< ::kvstore::GetRequest,::kvstore::GetResponse>* server_unary_streamer) = 0;
  };
  template <class BaseClass>
  class WithStreamedUnaryMethod_Put : public BaseClass {
   private:
    void BaseClassMustBeDerivedFromService(const Service* /*service*/) {}
   public:
    WithStreamedUnaryMethod_Put() {
      ::grpc::Service::MarkMethodStreamed(1,
        new ::grpc::internal::StreamedUnaryHandler<
          ::kvstore::PutRequest, ::kvstore::PutResponse>(
            [this](::grpc::ServerContext* context,
                   ::grpc::ServerUnaryStreamer<
                     ::kvstore::PutRequest, ::kvstore::PutResponse>* streamer) {
                       return this->StreamedPut(context,
                         streamer);
                  }));
    }
    ~WithStreamedUnaryMethod_Put() override {
      BaseClassMustBeDerivedFromService(this);
    }
    // disable regular version of this method
    ::grpc::Status Put(::grpc::ServerContext* /*context*/, const ::kvstore::PutRequest* /*request*/, ::kvstore::PutResponse* /*response*/) override {
      abort();
      return ::grpc::Status(::grpc::StatusCode::UNIMPLEMENTED, "");
    }
    // replace default version of method with streamed unary
    virtual ::grpc::Status StreamedPut(::grpc::ServerContext* context, ::grpc::ServerUnaryStreamer< ::kvstore::PutRequest,::kvstore::PutResponse>* server_unary_streamer) = 0;
  };
  template <class BaseClass>
  class WithStreamedUnaryMethod_Die : public BaseClass {
   private:
    void BaseClassMustBeDerivedFromService(const Service* /*service*/) {}
   public:
    WithStreamedUnaryMethod_Die() {
      ::grpc::Service::MarkMethodStreamed(2,
        new ::grpc::internal::StreamedUnaryHandler<
          ::kvstore::DieRequest, ::kvstore::DieResponse>(
            [this](::grpc::ServerContext* context,
                   ::grpc::ServerUnaryStreamer<
                     ::kvstore::DieRequest, ::kvstore::DieResponse>* streamer) {
                       return this->StreamedDie(context,
                         streamer);
                  }));
    }
    ~WithStreamedUnaryMethod_Die() override {
      BaseClassMustBeDerivedFromService(this);
    }
    // disable regular version of this method
    ::grpc::Status Die(::grpc::ServerContext* /*context*/, const ::kvstore::DieRequest* /*request*/, ::kvstore::DieResponse* /*response*/) override {
      abort();
      return ::grpc::Status(::grpc::StatusCode::UNIMPLEMENTED, "");
    }
    // replace default version of method with streamed unary
    virtual ::grpc::Status StreamedDie(::grpc::ServerContext* context, ::grpc::ServerUnaryStreamer< ::kvstore::DieRequest,::kvstore::DieResponse>* server_unary_streamer) = 0;
  };
  typedef WithStreamedUnaryMethod_Get<WithStreamedUnaryMethod_Put<WithStreamedUnaryMethod_Die<Service > > > StreamedUnaryService;
  typedef Service SplitStreamedService;
  typedef WithStreamedUnaryMethod_Get<WithStreamedUnaryMethod_Put<WithStreamedUnaryMethod_Die<Service > > > StreamedService;
};

}  // namespace kvstore


#endif  // GRPC_kv_5fstore_2eproto__INCLUDED

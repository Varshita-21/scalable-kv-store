package com.kvstore.grpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.53.0)",
    comments = "Source: kv_store.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class KVStoreServiceGrpc {

  private KVStoreServiceGrpc() {}

  public static final String SERVICE_NAME = "kvstore.KVStoreService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.kvstore.grpc.GetRequest,
      com.kvstore.grpc.GetResponse> getGetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Get",
      requestType = com.kvstore.grpc.GetRequest.class,
      responseType = com.kvstore.grpc.GetResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.kvstore.grpc.GetRequest,
      com.kvstore.grpc.GetResponse> getGetMethod() {
    io.grpc.MethodDescriptor<com.kvstore.grpc.GetRequest, com.kvstore.grpc.GetResponse> getGetMethod;
    if ((getGetMethod = KVStoreServiceGrpc.getGetMethod) == null) {
      synchronized (KVStoreServiceGrpc.class) {
        if ((getGetMethod = KVStoreServiceGrpc.getGetMethod) == null) {
          KVStoreServiceGrpc.getGetMethod = getGetMethod =
              io.grpc.MethodDescriptor.<com.kvstore.grpc.GetRequest, com.kvstore.grpc.GetResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Get"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.kvstore.grpc.GetRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.kvstore.grpc.GetResponse.getDefaultInstance()))
              .setSchemaDescriptor(new KVStoreServiceMethodDescriptorSupplier("Get"))
              .build();
        }
      }
    }
    return getGetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.kvstore.grpc.PutRequest,
      com.kvstore.grpc.PutResponse> getPutMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Put",
      requestType = com.kvstore.grpc.PutRequest.class,
      responseType = com.kvstore.grpc.PutResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.kvstore.grpc.PutRequest,
      com.kvstore.grpc.PutResponse> getPutMethod() {
    io.grpc.MethodDescriptor<com.kvstore.grpc.PutRequest, com.kvstore.grpc.PutResponse> getPutMethod;
    if ((getPutMethod = KVStoreServiceGrpc.getPutMethod) == null) {
      synchronized (KVStoreServiceGrpc.class) {
        if ((getPutMethod = KVStoreServiceGrpc.getPutMethod) == null) {
          KVStoreServiceGrpc.getPutMethod = getPutMethod =
              io.grpc.MethodDescriptor.<com.kvstore.grpc.PutRequest, com.kvstore.grpc.PutResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Put"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.kvstore.grpc.PutRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.kvstore.grpc.PutResponse.getDefaultInstance()))
              .setSchemaDescriptor(new KVStoreServiceMethodDescriptorSupplier("Put"))
              .build();
        }
      }
    }
    return getPutMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.kvstore.grpc.ShutdownRequest,
      com.kvstore.grpc.ShutdownResponse> getShutdownMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Shutdown",
      requestType = com.kvstore.grpc.ShutdownRequest.class,
      responseType = com.kvstore.grpc.ShutdownResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.kvstore.grpc.ShutdownRequest,
      com.kvstore.grpc.ShutdownResponse> getShutdownMethod() {
    io.grpc.MethodDescriptor<com.kvstore.grpc.ShutdownRequest, com.kvstore.grpc.ShutdownResponse> getShutdownMethod;
    if ((getShutdownMethod = KVStoreServiceGrpc.getShutdownMethod) == null) {
      synchronized (KVStoreServiceGrpc.class) {
        if ((getShutdownMethod = KVStoreServiceGrpc.getShutdownMethod) == null) {
          KVStoreServiceGrpc.getShutdownMethod = getShutdownMethod =
              io.grpc.MethodDescriptor.<com.kvstore.grpc.ShutdownRequest, com.kvstore.grpc.ShutdownResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Shutdown"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.kvstore.grpc.ShutdownRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.kvstore.grpc.ShutdownResponse.getDefaultInstance()))
              .setSchemaDescriptor(new KVStoreServiceMethodDescriptorSupplier("Shutdown"))
              .build();
        }
      }
    }
    return getShutdownMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.kvstore.grpc.DieRequest,
      com.kvstore.grpc.DieResponse> getDieMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Die",
      requestType = com.kvstore.grpc.DieRequest.class,
      responseType = com.kvstore.grpc.DieResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.kvstore.grpc.DieRequest,
      com.kvstore.grpc.DieResponse> getDieMethod() {
    io.grpc.MethodDescriptor<com.kvstore.grpc.DieRequest, com.kvstore.grpc.DieResponse> getDieMethod;
    if ((getDieMethod = KVStoreServiceGrpc.getDieMethod) == null) {
      synchronized (KVStoreServiceGrpc.class) {
        if ((getDieMethod = KVStoreServiceGrpc.getDieMethod) == null) {
          KVStoreServiceGrpc.getDieMethod = getDieMethod =
              io.grpc.MethodDescriptor.<com.kvstore.grpc.DieRequest, com.kvstore.grpc.DieResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Die"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.kvstore.grpc.DieRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.kvstore.grpc.DieResponse.getDefaultInstance()))
              .setSchemaDescriptor(new KVStoreServiceMethodDescriptorSupplier("Die"))
              .build();
        }
      }
    }
    return getDieMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static KVStoreServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<KVStoreServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<KVStoreServiceStub>() {
        @java.lang.Override
        public KVStoreServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new KVStoreServiceStub(channel, callOptions);
        }
      };
    return KVStoreServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static KVStoreServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<KVStoreServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<KVStoreServiceBlockingStub>() {
        @java.lang.Override
        public KVStoreServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new KVStoreServiceBlockingStub(channel, callOptions);
        }
      };
    return KVStoreServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static KVStoreServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<KVStoreServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<KVStoreServiceFutureStub>() {
        @java.lang.Override
        public KVStoreServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new KVStoreServiceFutureStub(channel, callOptions);
        }
      };
    return KVStoreServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class KVStoreServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void get(com.kvstore.grpc.GetRequest request,
        io.grpc.stub.StreamObserver<com.kvstore.grpc.GetResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetMethod(), responseObserver);
    }

    /**
     */
    public void put(com.kvstore.grpc.PutRequest request,
        io.grpc.stub.StreamObserver<com.kvstore.grpc.PutResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPutMethod(), responseObserver);
    }

    /**
     */
    public void shutdown(com.kvstore.grpc.ShutdownRequest request,
        io.grpc.stub.StreamObserver<com.kvstore.grpc.ShutdownResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getShutdownMethod(), responseObserver);
    }

    /**
     */
    public void die(com.kvstore.grpc.DieRequest request,
        io.grpc.stub.StreamObserver<com.kvstore.grpc.DieResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDieMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.kvstore.grpc.GetRequest,
                com.kvstore.grpc.GetResponse>(
                  this, METHODID_GET)))
          .addMethod(
            getPutMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.kvstore.grpc.PutRequest,
                com.kvstore.grpc.PutResponse>(
                  this, METHODID_PUT)))
          .addMethod(
            getShutdownMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.kvstore.grpc.ShutdownRequest,
                com.kvstore.grpc.ShutdownResponse>(
                  this, METHODID_SHUTDOWN)))
          .addMethod(
            getDieMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.kvstore.grpc.DieRequest,
                com.kvstore.grpc.DieResponse>(
                  this, METHODID_DIE)))
          .build();
    }
  }

  /**
   */
  public static final class KVStoreServiceStub extends io.grpc.stub.AbstractAsyncStub<KVStoreServiceStub> {
    private KVStoreServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected KVStoreServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new KVStoreServiceStub(channel, callOptions);
    }

    /**
     */
    public void get(com.kvstore.grpc.GetRequest request,
        io.grpc.stub.StreamObserver<com.kvstore.grpc.GetResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void put(com.kvstore.grpc.PutRequest request,
        io.grpc.stub.StreamObserver<com.kvstore.grpc.PutResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPutMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void shutdown(com.kvstore.grpc.ShutdownRequest request,
        io.grpc.stub.StreamObserver<com.kvstore.grpc.ShutdownResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getShutdownMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void die(com.kvstore.grpc.DieRequest request,
        io.grpc.stub.StreamObserver<com.kvstore.grpc.DieResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDieMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class KVStoreServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<KVStoreServiceBlockingStub> {
    private KVStoreServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected KVStoreServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new KVStoreServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.kvstore.grpc.GetResponse get(com.kvstore.grpc.GetRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.kvstore.grpc.PutResponse put(com.kvstore.grpc.PutRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPutMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.kvstore.grpc.ShutdownResponse shutdown(com.kvstore.grpc.ShutdownRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getShutdownMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.kvstore.grpc.DieResponse die(com.kvstore.grpc.DieRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDieMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class KVStoreServiceFutureStub extends io.grpc.stub.AbstractFutureStub<KVStoreServiceFutureStub> {
    private KVStoreServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected KVStoreServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new KVStoreServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.kvstore.grpc.GetResponse> get(
        com.kvstore.grpc.GetRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.kvstore.grpc.PutResponse> put(
        com.kvstore.grpc.PutRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPutMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.kvstore.grpc.ShutdownResponse> shutdown(
        com.kvstore.grpc.ShutdownRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getShutdownMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.kvstore.grpc.DieResponse> die(
        com.kvstore.grpc.DieRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDieMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET = 0;
  private static final int METHODID_PUT = 1;
  private static final int METHODID_SHUTDOWN = 2;
  private static final int METHODID_DIE = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final KVStoreServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(KVStoreServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET:
          serviceImpl.get((com.kvstore.grpc.GetRequest) request,
              (io.grpc.stub.StreamObserver<com.kvstore.grpc.GetResponse>) responseObserver);
          break;
        case METHODID_PUT:
          serviceImpl.put((com.kvstore.grpc.PutRequest) request,
              (io.grpc.stub.StreamObserver<com.kvstore.grpc.PutResponse>) responseObserver);
          break;
        case METHODID_SHUTDOWN:
          serviceImpl.shutdown((com.kvstore.grpc.ShutdownRequest) request,
              (io.grpc.stub.StreamObserver<com.kvstore.grpc.ShutdownResponse>) responseObserver);
          break;
        case METHODID_DIE:
          serviceImpl.die((com.kvstore.grpc.DieRequest) request,
              (io.grpc.stub.StreamObserver<com.kvstore.grpc.DieResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class KVStoreServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    KVStoreServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.kvstore.grpc.KVStoreProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("KVStoreService");
    }
  }

  private static final class KVStoreServiceFileDescriptorSupplier
      extends KVStoreServiceBaseDescriptorSupplier {
    KVStoreServiceFileDescriptorSupplier() {}
  }

  private static final class KVStoreServiceMethodDescriptorSupplier
      extends KVStoreServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    KVStoreServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (KVStoreServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new KVStoreServiceFileDescriptorSupplier())
              .addMethod(getGetMethod())
              .addMethod(getPutMethod())
              .addMethod(getShutdownMethod())
              .addMethod(getDieMethod())
              .build();
        }
      }
    }
    return result;
  }
}

package br.com.zup;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.33.1)",
    comments = "Source: PixKeyWordProtoSearch.proto")
public final class PixKeyWordSarchServiceGrpc {

  private PixKeyWordSarchServiceGrpc() {}

  public static final String SERVICE_NAME = "br.com.zup.PixKeyWordSarchService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<br.com.zup.PixSearchRequest,
      br.com.zup.PixSearchResponse> getFindByCpfMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "findByCpf",
      requestType = br.com.zup.PixSearchRequest.class,
      responseType = br.com.zup.PixSearchResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<br.com.zup.PixSearchRequest,
      br.com.zup.PixSearchResponse> getFindByCpfMethod() {
    io.grpc.MethodDescriptor<br.com.zup.PixSearchRequest, br.com.zup.PixSearchResponse> getFindByCpfMethod;
    if ((getFindByCpfMethod = PixKeyWordSarchServiceGrpc.getFindByCpfMethod) == null) {
      synchronized (PixKeyWordSarchServiceGrpc.class) {
        if ((getFindByCpfMethod = PixKeyWordSarchServiceGrpc.getFindByCpfMethod) == null) {
          PixKeyWordSarchServiceGrpc.getFindByCpfMethod = getFindByCpfMethod =
              io.grpc.MethodDescriptor.<br.com.zup.PixSearchRequest, br.com.zup.PixSearchResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "findByCpf"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  br.com.zup.PixSearchRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  br.com.zup.PixSearchResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PixKeyWordSarchServiceMethodDescriptorSupplier("findByCpf"))
              .build();
        }
      }
    }
    return getFindByCpfMethod;
  }

  private static volatile io.grpc.MethodDescriptor<br.com.zup.PixSearchRequest,
      br.com.zup.PixSearchResponse> getFindByEmailMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "findByEmail",
      requestType = br.com.zup.PixSearchRequest.class,
      responseType = br.com.zup.PixSearchResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<br.com.zup.PixSearchRequest,
      br.com.zup.PixSearchResponse> getFindByEmailMethod() {
    io.grpc.MethodDescriptor<br.com.zup.PixSearchRequest, br.com.zup.PixSearchResponse> getFindByEmailMethod;
    if ((getFindByEmailMethod = PixKeyWordSarchServiceGrpc.getFindByEmailMethod) == null) {
      synchronized (PixKeyWordSarchServiceGrpc.class) {
        if ((getFindByEmailMethod = PixKeyWordSarchServiceGrpc.getFindByEmailMethod) == null) {
          PixKeyWordSarchServiceGrpc.getFindByEmailMethod = getFindByEmailMethod =
              io.grpc.MethodDescriptor.<br.com.zup.PixSearchRequest, br.com.zup.PixSearchResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "findByEmail"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  br.com.zup.PixSearchRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  br.com.zup.PixSearchResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PixKeyWordSarchServiceMethodDescriptorSupplier("findByEmail"))
              .build();
        }
      }
    }
    return getFindByEmailMethod;
  }

  private static volatile io.grpc.MethodDescriptor<br.com.zup.PixSearchRequest,
      br.com.zup.PixSearchResponse> getFindByPhoneMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "findByPhone",
      requestType = br.com.zup.PixSearchRequest.class,
      responseType = br.com.zup.PixSearchResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<br.com.zup.PixSearchRequest,
      br.com.zup.PixSearchResponse> getFindByPhoneMethod() {
    io.grpc.MethodDescriptor<br.com.zup.PixSearchRequest, br.com.zup.PixSearchResponse> getFindByPhoneMethod;
    if ((getFindByPhoneMethod = PixKeyWordSarchServiceGrpc.getFindByPhoneMethod) == null) {
      synchronized (PixKeyWordSarchServiceGrpc.class) {
        if ((getFindByPhoneMethod = PixKeyWordSarchServiceGrpc.getFindByPhoneMethod) == null) {
          PixKeyWordSarchServiceGrpc.getFindByPhoneMethod = getFindByPhoneMethod =
              io.grpc.MethodDescriptor.<br.com.zup.PixSearchRequest, br.com.zup.PixSearchResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "findByPhone"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  br.com.zup.PixSearchRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  br.com.zup.PixSearchResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PixKeyWordSarchServiceMethodDescriptorSupplier("findByPhone"))
              .build();
        }
      }
    }
    return getFindByPhoneMethod;
  }

  private static volatile io.grpc.MethodDescriptor<br.com.zup.PixSearchRequest,
      br.com.zup.PixSearchResponse> getFindByRamdomMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "findByRamdom",
      requestType = br.com.zup.PixSearchRequest.class,
      responseType = br.com.zup.PixSearchResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<br.com.zup.PixSearchRequest,
      br.com.zup.PixSearchResponse> getFindByRamdomMethod() {
    io.grpc.MethodDescriptor<br.com.zup.PixSearchRequest, br.com.zup.PixSearchResponse> getFindByRamdomMethod;
    if ((getFindByRamdomMethod = PixKeyWordSarchServiceGrpc.getFindByRamdomMethod) == null) {
      synchronized (PixKeyWordSarchServiceGrpc.class) {
        if ((getFindByRamdomMethod = PixKeyWordSarchServiceGrpc.getFindByRamdomMethod) == null) {
          PixKeyWordSarchServiceGrpc.getFindByRamdomMethod = getFindByRamdomMethod =
              io.grpc.MethodDescriptor.<br.com.zup.PixSearchRequest, br.com.zup.PixSearchResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "findByRamdom"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  br.com.zup.PixSearchRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  br.com.zup.PixSearchResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PixKeyWordSarchServiceMethodDescriptorSupplier("findByRamdom"))
              .build();
        }
      }
    }
    return getFindByRamdomMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static PixKeyWordSarchServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PixKeyWordSarchServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PixKeyWordSarchServiceStub>() {
        @java.lang.Override
        public PixKeyWordSarchServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PixKeyWordSarchServiceStub(channel, callOptions);
        }
      };
    return PixKeyWordSarchServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static PixKeyWordSarchServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PixKeyWordSarchServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PixKeyWordSarchServiceBlockingStub>() {
        @java.lang.Override
        public PixKeyWordSarchServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PixKeyWordSarchServiceBlockingStub(channel, callOptions);
        }
      };
    return PixKeyWordSarchServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static PixKeyWordSarchServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PixKeyWordSarchServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PixKeyWordSarchServiceFutureStub>() {
        @java.lang.Override
        public PixKeyWordSarchServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PixKeyWordSarchServiceFutureStub(channel, callOptions);
        }
      };
    return PixKeyWordSarchServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class PixKeyWordSarchServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void findByCpf(br.com.zup.PixSearchRequest request,
        io.grpc.stub.StreamObserver<br.com.zup.PixSearchResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getFindByCpfMethod(), responseObserver);
    }

    /**
     */
    public void findByEmail(br.com.zup.PixSearchRequest request,
        io.grpc.stub.StreamObserver<br.com.zup.PixSearchResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getFindByEmailMethod(), responseObserver);
    }

    /**
     */
    public void findByPhone(br.com.zup.PixSearchRequest request,
        io.grpc.stub.StreamObserver<br.com.zup.PixSearchResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getFindByPhoneMethod(), responseObserver);
    }

    /**
     */
    public void findByRamdom(br.com.zup.PixSearchRequest request,
        io.grpc.stub.StreamObserver<br.com.zup.PixSearchResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getFindByRamdomMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getFindByCpfMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                br.com.zup.PixSearchRequest,
                br.com.zup.PixSearchResponse>(
                  this, METHODID_FIND_BY_CPF)))
          .addMethod(
            getFindByEmailMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                br.com.zup.PixSearchRequest,
                br.com.zup.PixSearchResponse>(
                  this, METHODID_FIND_BY_EMAIL)))
          .addMethod(
            getFindByPhoneMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                br.com.zup.PixSearchRequest,
                br.com.zup.PixSearchResponse>(
                  this, METHODID_FIND_BY_PHONE)))
          .addMethod(
            getFindByRamdomMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                br.com.zup.PixSearchRequest,
                br.com.zup.PixSearchResponse>(
                  this, METHODID_FIND_BY_RAMDOM)))
          .build();
    }
  }

  /**
   */
  public static final class PixKeyWordSarchServiceStub extends io.grpc.stub.AbstractAsyncStub<PixKeyWordSarchServiceStub> {
    private PixKeyWordSarchServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PixKeyWordSarchServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PixKeyWordSarchServiceStub(channel, callOptions);
    }

    /**
     */
    public void findByCpf(br.com.zup.PixSearchRequest request,
        io.grpc.stub.StreamObserver<br.com.zup.PixSearchResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getFindByCpfMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void findByEmail(br.com.zup.PixSearchRequest request,
        io.grpc.stub.StreamObserver<br.com.zup.PixSearchResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getFindByEmailMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void findByPhone(br.com.zup.PixSearchRequest request,
        io.grpc.stub.StreamObserver<br.com.zup.PixSearchResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getFindByPhoneMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void findByRamdom(br.com.zup.PixSearchRequest request,
        io.grpc.stub.StreamObserver<br.com.zup.PixSearchResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getFindByRamdomMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class PixKeyWordSarchServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<PixKeyWordSarchServiceBlockingStub> {
    private PixKeyWordSarchServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PixKeyWordSarchServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PixKeyWordSarchServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public br.com.zup.PixSearchResponse findByCpf(br.com.zup.PixSearchRequest request) {
      return blockingUnaryCall(
          getChannel(), getFindByCpfMethod(), getCallOptions(), request);
    }

    /**
     */
    public br.com.zup.PixSearchResponse findByEmail(br.com.zup.PixSearchRequest request) {
      return blockingUnaryCall(
          getChannel(), getFindByEmailMethod(), getCallOptions(), request);
    }

    /**
     */
    public br.com.zup.PixSearchResponse findByPhone(br.com.zup.PixSearchRequest request) {
      return blockingUnaryCall(
          getChannel(), getFindByPhoneMethod(), getCallOptions(), request);
    }

    /**
     */
    public br.com.zup.PixSearchResponse findByRamdom(br.com.zup.PixSearchRequest request) {
      return blockingUnaryCall(
          getChannel(), getFindByRamdomMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class PixKeyWordSarchServiceFutureStub extends io.grpc.stub.AbstractFutureStub<PixKeyWordSarchServiceFutureStub> {
    private PixKeyWordSarchServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PixKeyWordSarchServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PixKeyWordSarchServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<br.com.zup.PixSearchResponse> findByCpf(
        br.com.zup.PixSearchRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getFindByCpfMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<br.com.zup.PixSearchResponse> findByEmail(
        br.com.zup.PixSearchRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getFindByEmailMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<br.com.zup.PixSearchResponse> findByPhone(
        br.com.zup.PixSearchRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getFindByPhoneMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<br.com.zup.PixSearchResponse> findByRamdom(
        br.com.zup.PixSearchRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getFindByRamdomMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_FIND_BY_CPF = 0;
  private static final int METHODID_FIND_BY_EMAIL = 1;
  private static final int METHODID_FIND_BY_PHONE = 2;
  private static final int METHODID_FIND_BY_RAMDOM = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final PixKeyWordSarchServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(PixKeyWordSarchServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_FIND_BY_CPF:
          serviceImpl.findByCpf((br.com.zup.PixSearchRequest) request,
              (io.grpc.stub.StreamObserver<br.com.zup.PixSearchResponse>) responseObserver);
          break;
        case METHODID_FIND_BY_EMAIL:
          serviceImpl.findByEmail((br.com.zup.PixSearchRequest) request,
              (io.grpc.stub.StreamObserver<br.com.zup.PixSearchResponse>) responseObserver);
          break;
        case METHODID_FIND_BY_PHONE:
          serviceImpl.findByPhone((br.com.zup.PixSearchRequest) request,
              (io.grpc.stub.StreamObserver<br.com.zup.PixSearchResponse>) responseObserver);
          break;
        case METHODID_FIND_BY_RAMDOM:
          serviceImpl.findByRamdom((br.com.zup.PixSearchRequest) request,
              (io.grpc.stub.StreamObserver<br.com.zup.PixSearchResponse>) responseObserver);
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

  private static abstract class PixKeyWordSarchServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    PixKeyWordSarchServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return br.com.zup.PixKeywordSearch.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("PixKeyWordSarchService");
    }
  }

  private static final class PixKeyWordSarchServiceFileDescriptorSupplier
      extends PixKeyWordSarchServiceBaseDescriptorSupplier {
    PixKeyWordSarchServiceFileDescriptorSupplier() {}
  }

  private static final class PixKeyWordSarchServiceMethodDescriptorSupplier
      extends PixKeyWordSarchServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    PixKeyWordSarchServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (PixKeyWordSarchServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new PixKeyWordSarchServiceFileDescriptorSupplier())
              .addMethod(getFindByCpfMethod())
              .addMethod(getFindByEmailMethod())
              .addMethod(getFindByPhoneMethod())
              .addMethod(getFindByRamdomMethod())
              .build();
        }
      }
    }
    return result;
  }
}

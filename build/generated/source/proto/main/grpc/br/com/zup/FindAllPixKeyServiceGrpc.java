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
    comments = "Source: FindAllPixKey.proto")
public final class FindAllPixKeyServiceGrpc {

  private FindAllPixKeyServiceGrpc() {}

  public static final String SERVICE_NAME = "br.com.zup.FindAllPixKeyService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<br.com.zup.SearchRequest,
      br.com.zup.SearchResponse> getFindAllMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "findAll",
      requestType = br.com.zup.SearchRequest.class,
      responseType = br.com.zup.SearchResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<br.com.zup.SearchRequest,
      br.com.zup.SearchResponse> getFindAllMethod() {
    io.grpc.MethodDescriptor<br.com.zup.SearchRequest, br.com.zup.SearchResponse> getFindAllMethod;
    if ((getFindAllMethod = FindAllPixKeyServiceGrpc.getFindAllMethod) == null) {
      synchronized (FindAllPixKeyServiceGrpc.class) {
        if ((getFindAllMethod = FindAllPixKeyServiceGrpc.getFindAllMethod) == null) {
          FindAllPixKeyServiceGrpc.getFindAllMethod = getFindAllMethod =
              io.grpc.MethodDescriptor.<br.com.zup.SearchRequest, br.com.zup.SearchResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "findAll"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  br.com.zup.SearchRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  br.com.zup.SearchResponse.getDefaultInstance()))
              .setSchemaDescriptor(new FindAllPixKeyServiceMethodDescriptorSupplier("findAll"))
              .build();
        }
      }
    }
    return getFindAllMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static FindAllPixKeyServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<FindAllPixKeyServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<FindAllPixKeyServiceStub>() {
        @java.lang.Override
        public FindAllPixKeyServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new FindAllPixKeyServiceStub(channel, callOptions);
        }
      };
    return FindAllPixKeyServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static FindAllPixKeyServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<FindAllPixKeyServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<FindAllPixKeyServiceBlockingStub>() {
        @java.lang.Override
        public FindAllPixKeyServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new FindAllPixKeyServiceBlockingStub(channel, callOptions);
        }
      };
    return FindAllPixKeyServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static FindAllPixKeyServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<FindAllPixKeyServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<FindAllPixKeyServiceFutureStub>() {
        @java.lang.Override
        public FindAllPixKeyServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new FindAllPixKeyServiceFutureStub(channel, callOptions);
        }
      };
    return FindAllPixKeyServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class FindAllPixKeyServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void findAll(br.com.zup.SearchRequest request,
        io.grpc.stub.StreamObserver<br.com.zup.SearchResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getFindAllMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getFindAllMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                br.com.zup.SearchRequest,
                br.com.zup.SearchResponse>(
                  this, METHODID_FIND_ALL)))
          .build();
    }
  }

  /**
   */
  public static final class FindAllPixKeyServiceStub extends io.grpc.stub.AbstractAsyncStub<FindAllPixKeyServiceStub> {
    private FindAllPixKeyServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FindAllPixKeyServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new FindAllPixKeyServiceStub(channel, callOptions);
    }

    /**
     */
    public void findAll(br.com.zup.SearchRequest request,
        io.grpc.stub.StreamObserver<br.com.zup.SearchResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getFindAllMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class FindAllPixKeyServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<FindAllPixKeyServiceBlockingStub> {
    private FindAllPixKeyServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FindAllPixKeyServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new FindAllPixKeyServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public br.com.zup.SearchResponse findAll(br.com.zup.SearchRequest request) {
      return blockingUnaryCall(
          getChannel(), getFindAllMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class FindAllPixKeyServiceFutureStub extends io.grpc.stub.AbstractFutureStub<FindAllPixKeyServiceFutureStub> {
    private FindAllPixKeyServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FindAllPixKeyServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new FindAllPixKeyServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<br.com.zup.SearchResponse> findAll(
        br.com.zup.SearchRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getFindAllMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_FIND_ALL = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final FindAllPixKeyServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(FindAllPixKeyServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_FIND_ALL:
          serviceImpl.findAll((br.com.zup.SearchRequest) request,
              (io.grpc.stub.StreamObserver<br.com.zup.SearchResponse>) responseObserver);
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

  private static abstract class FindAllPixKeyServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    FindAllPixKeyServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return br.com.zup.FindAllPixKey.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("FindAllPixKeyService");
    }
  }

  private static final class FindAllPixKeyServiceFileDescriptorSupplier
      extends FindAllPixKeyServiceBaseDescriptorSupplier {
    FindAllPixKeyServiceFileDescriptorSupplier() {}
  }

  private static final class FindAllPixKeyServiceMethodDescriptorSupplier
      extends FindAllPixKeyServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    FindAllPixKeyServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (FindAllPixKeyServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new FindAllPixKeyServiceFileDescriptorSupplier())
              .addMethod(getFindAllMethod())
              .build();
        }
      }
    }
    return result;
  }
}

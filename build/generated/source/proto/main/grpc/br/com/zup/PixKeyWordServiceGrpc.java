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
    comments = "Source: PixKeyWordProto.proto")
public final class PixKeyWordServiceGrpc {

  private PixKeyWordServiceGrpc() {}

  public static final String SERVICE_NAME = "br.com.zup.PixKeyWordService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<br.com.zup.PixRamdomKeyWordRequest,
      br.com.zup.PixRamdomKeyWordResponse> getRamdomKeyWordRegisterMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ramdomKeyWordRegister",
      requestType = br.com.zup.PixRamdomKeyWordRequest.class,
      responseType = br.com.zup.PixRamdomKeyWordResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<br.com.zup.PixRamdomKeyWordRequest,
      br.com.zup.PixRamdomKeyWordResponse> getRamdomKeyWordRegisterMethod() {
    io.grpc.MethodDescriptor<br.com.zup.PixRamdomKeyWordRequest, br.com.zup.PixRamdomKeyWordResponse> getRamdomKeyWordRegisterMethod;
    if ((getRamdomKeyWordRegisterMethod = PixKeyWordServiceGrpc.getRamdomKeyWordRegisterMethod) == null) {
      synchronized (PixKeyWordServiceGrpc.class) {
        if ((getRamdomKeyWordRegisterMethod = PixKeyWordServiceGrpc.getRamdomKeyWordRegisterMethod) == null) {
          PixKeyWordServiceGrpc.getRamdomKeyWordRegisterMethod = getRamdomKeyWordRegisterMethod =
              io.grpc.MethodDescriptor.<br.com.zup.PixRamdomKeyWordRequest, br.com.zup.PixRamdomKeyWordResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ramdomKeyWordRegister"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  br.com.zup.PixRamdomKeyWordRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  br.com.zup.PixRamdomKeyWordResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PixKeyWordServiceMethodDescriptorSupplier("ramdomKeyWordRegister"))
              .build();
        }
      }
    }
    return getRamdomKeyWordRegisterMethod;
  }

  private static volatile io.grpc.MethodDescriptor<br.com.zup.PixRamdomKeyWordDeleteRequest,
      br.com.zup.PixRamdomKeyWordDeleteResponse> getRamdomKeyWordRemoveMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ramdomKeyWordRemove",
      requestType = br.com.zup.PixRamdomKeyWordDeleteRequest.class,
      responseType = br.com.zup.PixRamdomKeyWordDeleteResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<br.com.zup.PixRamdomKeyWordDeleteRequest,
      br.com.zup.PixRamdomKeyWordDeleteResponse> getRamdomKeyWordRemoveMethod() {
    io.grpc.MethodDescriptor<br.com.zup.PixRamdomKeyWordDeleteRequest, br.com.zup.PixRamdomKeyWordDeleteResponse> getRamdomKeyWordRemoveMethod;
    if ((getRamdomKeyWordRemoveMethod = PixKeyWordServiceGrpc.getRamdomKeyWordRemoveMethod) == null) {
      synchronized (PixKeyWordServiceGrpc.class) {
        if ((getRamdomKeyWordRemoveMethod = PixKeyWordServiceGrpc.getRamdomKeyWordRemoveMethod) == null) {
          PixKeyWordServiceGrpc.getRamdomKeyWordRemoveMethod = getRamdomKeyWordRemoveMethod =
              io.grpc.MethodDescriptor.<br.com.zup.PixRamdomKeyWordDeleteRequest, br.com.zup.PixRamdomKeyWordDeleteResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ramdomKeyWordRemove"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  br.com.zup.PixRamdomKeyWordDeleteRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  br.com.zup.PixRamdomKeyWordDeleteResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PixKeyWordServiceMethodDescriptorSupplier("ramdomKeyWordRemove"))
              .build();
        }
      }
    }
    return getRamdomKeyWordRemoveMethod;
  }

  private static volatile io.grpc.MethodDescriptor<br.com.zup.PixCpfWordRequest,
      br.com.zup.PixCpfWordResponse> getCpfKeyWordRegisterMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "cpfKeyWordRegister",
      requestType = br.com.zup.PixCpfWordRequest.class,
      responseType = br.com.zup.PixCpfWordResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<br.com.zup.PixCpfWordRequest,
      br.com.zup.PixCpfWordResponse> getCpfKeyWordRegisterMethod() {
    io.grpc.MethodDescriptor<br.com.zup.PixCpfWordRequest, br.com.zup.PixCpfWordResponse> getCpfKeyWordRegisterMethod;
    if ((getCpfKeyWordRegisterMethod = PixKeyWordServiceGrpc.getCpfKeyWordRegisterMethod) == null) {
      synchronized (PixKeyWordServiceGrpc.class) {
        if ((getCpfKeyWordRegisterMethod = PixKeyWordServiceGrpc.getCpfKeyWordRegisterMethod) == null) {
          PixKeyWordServiceGrpc.getCpfKeyWordRegisterMethod = getCpfKeyWordRegisterMethod =
              io.grpc.MethodDescriptor.<br.com.zup.PixCpfWordRequest, br.com.zup.PixCpfWordResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "cpfKeyWordRegister"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  br.com.zup.PixCpfWordRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  br.com.zup.PixCpfWordResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PixKeyWordServiceMethodDescriptorSupplier("cpfKeyWordRegister"))
              .build();
        }
      }
    }
    return getCpfKeyWordRegisterMethod;
  }

  private static volatile io.grpc.MethodDescriptor<br.com.zup.PixCpfWordRequest,
      br.com.zup.PixCpfWordResponse> getCpfKeyWordRemoveMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "cpfKeyWordRemove",
      requestType = br.com.zup.PixCpfWordRequest.class,
      responseType = br.com.zup.PixCpfWordResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<br.com.zup.PixCpfWordRequest,
      br.com.zup.PixCpfWordResponse> getCpfKeyWordRemoveMethod() {
    io.grpc.MethodDescriptor<br.com.zup.PixCpfWordRequest, br.com.zup.PixCpfWordResponse> getCpfKeyWordRemoveMethod;
    if ((getCpfKeyWordRemoveMethod = PixKeyWordServiceGrpc.getCpfKeyWordRemoveMethod) == null) {
      synchronized (PixKeyWordServiceGrpc.class) {
        if ((getCpfKeyWordRemoveMethod = PixKeyWordServiceGrpc.getCpfKeyWordRemoveMethod) == null) {
          PixKeyWordServiceGrpc.getCpfKeyWordRemoveMethod = getCpfKeyWordRemoveMethod =
              io.grpc.MethodDescriptor.<br.com.zup.PixCpfWordRequest, br.com.zup.PixCpfWordResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "cpfKeyWordRemove"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  br.com.zup.PixCpfWordRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  br.com.zup.PixCpfWordResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PixKeyWordServiceMethodDescriptorSupplier("cpfKeyWordRemove"))
              .build();
        }
      }
    }
    return getCpfKeyWordRemoveMethod;
  }

  private static volatile io.grpc.MethodDescriptor<br.com.zup.PixPhoneKeyWordRequest,
      br.com.zup.PixPhoneKeyWordResponse> getPhoneKeyWordRegisterMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "phoneKeyWordRegister",
      requestType = br.com.zup.PixPhoneKeyWordRequest.class,
      responseType = br.com.zup.PixPhoneKeyWordResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<br.com.zup.PixPhoneKeyWordRequest,
      br.com.zup.PixPhoneKeyWordResponse> getPhoneKeyWordRegisterMethod() {
    io.grpc.MethodDescriptor<br.com.zup.PixPhoneKeyWordRequest, br.com.zup.PixPhoneKeyWordResponse> getPhoneKeyWordRegisterMethod;
    if ((getPhoneKeyWordRegisterMethod = PixKeyWordServiceGrpc.getPhoneKeyWordRegisterMethod) == null) {
      synchronized (PixKeyWordServiceGrpc.class) {
        if ((getPhoneKeyWordRegisterMethod = PixKeyWordServiceGrpc.getPhoneKeyWordRegisterMethod) == null) {
          PixKeyWordServiceGrpc.getPhoneKeyWordRegisterMethod = getPhoneKeyWordRegisterMethod =
              io.grpc.MethodDescriptor.<br.com.zup.PixPhoneKeyWordRequest, br.com.zup.PixPhoneKeyWordResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "phoneKeyWordRegister"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  br.com.zup.PixPhoneKeyWordRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  br.com.zup.PixPhoneKeyWordResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PixKeyWordServiceMethodDescriptorSupplier("phoneKeyWordRegister"))
              .build();
        }
      }
    }
    return getPhoneKeyWordRegisterMethod;
  }

  private static volatile io.grpc.MethodDescriptor<br.com.zup.PixPhoneKeyWordRequest,
      br.com.zup.PixPhoneKeyWordResponse> getPhoneKeyWordRemoveMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "phoneKeyWordRemove",
      requestType = br.com.zup.PixPhoneKeyWordRequest.class,
      responseType = br.com.zup.PixPhoneKeyWordResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<br.com.zup.PixPhoneKeyWordRequest,
      br.com.zup.PixPhoneKeyWordResponse> getPhoneKeyWordRemoveMethod() {
    io.grpc.MethodDescriptor<br.com.zup.PixPhoneKeyWordRequest, br.com.zup.PixPhoneKeyWordResponse> getPhoneKeyWordRemoveMethod;
    if ((getPhoneKeyWordRemoveMethod = PixKeyWordServiceGrpc.getPhoneKeyWordRemoveMethod) == null) {
      synchronized (PixKeyWordServiceGrpc.class) {
        if ((getPhoneKeyWordRemoveMethod = PixKeyWordServiceGrpc.getPhoneKeyWordRemoveMethod) == null) {
          PixKeyWordServiceGrpc.getPhoneKeyWordRemoveMethod = getPhoneKeyWordRemoveMethod =
              io.grpc.MethodDescriptor.<br.com.zup.PixPhoneKeyWordRequest, br.com.zup.PixPhoneKeyWordResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "phoneKeyWordRemove"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  br.com.zup.PixPhoneKeyWordRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  br.com.zup.PixPhoneKeyWordResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PixKeyWordServiceMethodDescriptorSupplier("phoneKeyWordRemove"))
              .build();
        }
      }
    }
    return getPhoneKeyWordRemoveMethod;
  }

  private static volatile io.grpc.MethodDescriptor<br.com.zup.PixEmailKeyWordRequest,
      br.com.zup.PixEmailKeyWordResponse> getEmailKeyWordRegisterMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "emailKeyWordRegister",
      requestType = br.com.zup.PixEmailKeyWordRequest.class,
      responseType = br.com.zup.PixEmailKeyWordResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<br.com.zup.PixEmailKeyWordRequest,
      br.com.zup.PixEmailKeyWordResponse> getEmailKeyWordRegisterMethod() {
    io.grpc.MethodDescriptor<br.com.zup.PixEmailKeyWordRequest, br.com.zup.PixEmailKeyWordResponse> getEmailKeyWordRegisterMethod;
    if ((getEmailKeyWordRegisterMethod = PixKeyWordServiceGrpc.getEmailKeyWordRegisterMethod) == null) {
      synchronized (PixKeyWordServiceGrpc.class) {
        if ((getEmailKeyWordRegisterMethod = PixKeyWordServiceGrpc.getEmailKeyWordRegisterMethod) == null) {
          PixKeyWordServiceGrpc.getEmailKeyWordRegisterMethod = getEmailKeyWordRegisterMethod =
              io.grpc.MethodDescriptor.<br.com.zup.PixEmailKeyWordRequest, br.com.zup.PixEmailKeyWordResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "emailKeyWordRegister"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  br.com.zup.PixEmailKeyWordRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  br.com.zup.PixEmailKeyWordResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PixKeyWordServiceMethodDescriptorSupplier("emailKeyWordRegister"))
              .build();
        }
      }
    }
    return getEmailKeyWordRegisterMethod;
  }

  private static volatile io.grpc.MethodDescriptor<br.com.zup.PixEmailKeyWordRequest,
      br.com.zup.PixEmailKeyWordResponse> getEmailKeyWordRemoveMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "emailKeyWordRemove",
      requestType = br.com.zup.PixEmailKeyWordRequest.class,
      responseType = br.com.zup.PixEmailKeyWordResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<br.com.zup.PixEmailKeyWordRequest,
      br.com.zup.PixEmailKeyWordResponse> getEmailKeyWordRemoveMethod() {
    io.grpc.MethodDescriptor<br.com.zup.PixEmailKeyWordRequest, br.com.zup.PixEmailKeyWordResponse> getEmailKeyWordRemoveMethod;
    if ((getEmailKeyWordRemoveMethod = PixKeyWordServiceGrpc.getEmailKeyWordRemoveMethod) == null) {
      synchronized (PixKeyWordServiceGrpc.class) {
        if ((getEmailKeyWordRemoveMethod = PixKeyWordServiceGrpc.getEmailKeyWordRemoveMethod) == null) {
          PixKeyWordServiceGrpc.getEmailKeyWordRemoveMethod = getEmailKeyWordRemoveMethod =
              io.grpc.MethodDescriptor.<br.com.zup.PixEmailKeyWordRequest, br.com.zup.PixEmailKeyWordResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "emailKeyWordRemove"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  br.com.zup.PixEmailKeyWordRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  br.com.zup.PixEmailKeyWordResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PixKeyWordServiceMethodDescriptorSupplier("emailKeyWordRemove"))
              .build();
        }
      }
    }
    return getEmailKeyWordRemoveMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static PixKeyWordServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PixKeyWordServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PixKeyWordServiceStub>() {
        @java.lang.Override
        public PixKeyWordServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PixKeyWordServiceStub(channel, callOptions);
        }
      };
    return PixKeyWordServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static PixKeyWordServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PixKeyWordServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PixKeyWordServiceBlockingStub>() {
        @java.lang.Override
        public PixKeyWordServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PixKeyWordServiceBlockingStub(channel, callOptions);
        }
      };
    return PixKeyWordServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static PixKeyWordServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PixKeyWordServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PixKeyWordServiceFutureStub>() {
        @java.lang.Override
        public PixKeyWordServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PixKeyWordServiceFutureStub(channel, callOptions);
        }
      };
    return PixKeyWordServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class PixKeyWordServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void ramdomKeyWordRegister(br.com.zup.PixRamdomKeyWordRequest request,
        io.grpc.stub.StreamObserver<br.com.zup.PixRamdomKeyWordResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getRamdomKeyWordRegisterMethod(), responseObserver);
    }

    /**
     */
    public void ramdomKeyWordRemove(br.com.zup.PixRamdomKeyWordDeleteRequest request,
        io.grpc.stub.StreamObserver<br.com.zup.PixRamdomKeyWordDeleteResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getRamdomKeyWordRemoveMethod(), responseObserver);
    }

    /**
     */
    public void cpfKeyWordRegister(br.com.zup.PixCpfWordRequest request,
        io.grpc.stub.StreamObserver<br.com.zup.PixCpfWordResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCpfKeyWordRegisterMethod(), responseObserver);
    }

    /**
     */
    public void cpfKeyWordRemove(br.com.zup.PixCpfWordRequest request,
        io.grpc.stub.StreamObserver<br.com.zup.PixCpfWordResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCpfKeyWordRemoveMethod(), responseObserver);
    }

    /**
     */
    public void phoneKeyWordRegister(br.com.zup.PixPhoneKeyWordRequest request,
        io.grpc.stub.StreamObserver<br.com.zup.PixPhoneKeyWordResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getPhoneKeyWordRegisterMethod(), responseObserver);
    }

    /**
     */
    public void phoneKeyWordRemove(br.com.zup.PixPhoneKeyWordRequest request,
        io.grpc.stub.StreamObserver<br.com.zup.PixPhoneKeyWordResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getPhoneKeyWordRemoveMethod(), responseObserver);
    }

    /**
     */
    public void emailKeyWordRegister(br.com.zup.PixEmailKeyWordRequest request,
        io.grpc.stub.StreamObserver<br.com.zup.PixEmailKeyWordResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getEmailKeyWordRegisterMethod(), responseObserver);
    }

    /**
     */
    public void emailKeyWordRemove(br.com.zup.PixEmailKeyWordRequest request,
        io.grpc.stub.StreamObserver<br.com.zup.PixEmailKeyWordResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getEmailKeyWordRemoveMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getRamdomKeyWordRegisterMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                br.com.zup.PixRamdomKeyWordRequest,
                br.com.zup.PixRamdomKeyWordResponse>(
                  this, METHODID_RAMDOM_KEY_WORD_REGISTER)))
          .addMethod(
            getRamdomKeyWordRemoveMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                br.com.zup.PixRamdomKeyWordDeleteRequest,
                br.com.zup.PixRamdomKeyWordDeleteResponse>(
                  this, METHODID_RAMDOM_KEY_WORD_REMOVE)))
          .addMethod(
            getCpfKeyWordRegisterMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                br.com.zup.PixCpfWordRequest,
                br.com.zup.PixCpfWordResponse>(
                  this, METHODID_CPF_KEY_WORD_REGISTER)))
          .addMethod(
            getCpfKeyWordRemoveMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                br.com.zup.PixCpfWordRequest,
                br.com.zup.PixCpfWordResponse>(
                  this, METHODID_CPF_KEY_WORD_REMOVE)))
          .addMethod(
            getPhoneKeyWordRegisterMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                br.com.zup.PixPhoneKeyWordRequest,
                br.com.zup.PixPhoneKeyWordResponse>(
                  this, METHODID_PHONE_KEY_WORD_REGISTER)))
          .addMethod(
            getPhoneKeyWordRemoveMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                br.com.zup.PixPhoneKeyWordRequest,
                br.com.zup.PixPhoneKeyWordResponse>(
                  this, METHODID_PHONE_KEY_WORD_REMOVE)))
          .addMethod(
            getEmailKeyWordRegisterMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                br.com.zup.PixEmailKeyWordRequest,
                br.com.zup.PixEmailKeyWordResponse>(
                  this, METHODID_EMAIL_KEY_WORD_REGISTER)))
          .addMethod(
            getEmailKeyWordRemoveMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                br.com.zup.PixEmailKeyWordRequest,
                br.com.zup.PixEmailKeyWordResponse>(
                  this, METHODID_EMAIL_KEY_WORD_REMOVE)))
          .build();
    }
  }

  /**
   */
  public static final class PixKeyWordServiceStub extends io.grpc.stub.AbstractAsyncStub<PixKeyWordServiceStub> {
    private PixKeyWordServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PixKeyWordServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PixKeyWordServiceStub(channel, callOptions);
    }

    /**
     */
    public void ramdomKeyWordRegister(br.com.zup.PixRamdomKeyWordRequest request,
        io.grpc.stub.StreamObserver<br.com.zup.PixRamdomKeyWordResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRamdomKeyWordRegisterMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void ramdomKeyWordRemove(br.com.zup.PixRamdomKeyWordDeleteRequest request,
        io.grpc.stub.StreamObserver<br.com.zup.PixRamdomKeyWordDeleteResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRamdomKeyWordRemoveMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void cpfKeyWordRegister(br.com.zup.PixCpfWordRequest request,
        io.grpc.stub.StreamObserver<br.com.zup.PixCpfWordResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCpfKeyWordRegisterMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void cpfKeyWordRemove(br.com.zup.PixCpfWordRequest request,
        io.grpc.stub.StreamObserver<br.com.zup.PixCpfWordResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCpfKeyWordRemoveMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void phoneKeyWordRegister(br.com.zup.PixPhoneKeyWordRequest request,
        io.grpc.stub.StreamObserver<br.com.zup.PixPhoneKeyWordResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getPhoneKeyWordRegisterMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void phoneKeyWordRemove(br.com.zup.PixPhoneKeyWordRequest request,
        io.grpc.stub.StreamObserver<br.com.zup.PixPhoneKeyWordResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getPhoneKeyWordRemoveMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void emailKeyWordRegister(br.com.zup.PixEmailKeyWordRequest request,
        io.grpc.stub.StreamObserver<br.com.zup.PixEmailKeyWordResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getEmailKeyWordRegisterMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void emailKeyWordRemove(br.com.zup.PixEmailKeyWordRequest request,
        io.grpc.stub.StreamObserver<br.com.zup.PixEmailKeyWordResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getEmailKeyWordRemoveMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class PixKeyWordServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<PixKeyWordServiceBlockingStub> {
    private PixKeyWordServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PixKeyWordServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PixKeyWordServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public br.com.zup.PixRamdomKeyWordResponse ramdomKeyWordRegister(br.com.zup.PixRamdomKeyWordRequest request) {
      return blockingUnaryCall(
          getChannel(), getRamdomKeyWordRegisterMethod(), getCallOptions(), request);
    }

    /**
     */
    public br.com.zup.PixRamdomKeyWordDeleteResponse ramdomKeyWordRemove(br.com.zup.PixRamdomKeyWordDeleteRequest request) {
      return blockingUnaryCall(
          getChannel(), getRamdomKeyWordRemoveMethod(), getCallOptions(), request);
    }

    /**
     */
    public br.com.zup.PixCpfWordResponse cpfKeyWordRegister(br.com.zup.PixCpfWordRequest request) {
      return blockingUnaryCall(
          getChannel(), getCpfKeyWordRegisterMethod(), getCallOptions(), request);
    }

    /**
     */
    public br.com.zup.PixCpfWordResponse cpfKeyWordRemove(br.com.zup.PixCpfWordRequest request) {
      return blockingUnaryCall(
          getChannel(), getCpfKeyWordRemoveMethod(), getCallOptions(), request);
    }

    /**
     */
    public br.com.zup.PixPhoneKeyWordResponse phoneKeyWordRegister(br.com.zup.PixPhoneKeyWordRequest request) {
      return blockingUnaryCall(
          getChannel(), getPhoneKeyWordRegisterMethod(), getCallOptions(), request);
    }

    /**
     */
    public br.com.zup.PixPhoneKeyWordResponse phoneKeyWordRemove(br.com.zup.PixPhoneKeyWordRequest request) {
      return blockingUnaryCall(
          getChannel(), getPhoneKeyWordRemoveMethod(), getCallOptions(), request);
    }

    /**
     */
    public br.com.zup.PixEmailKeyWordResponse emailKeyWordRegister(br.com.zup.PixEmailKeyWordRequest request) {
      return blockingUnaryCall(
          getChannel(), getEmailKeyWordRegisterMethod(), getCallOptions(), request);
    }

    /**
     */
    public br.com.zup.PixEmailKeyWordResponse emailKeyWordRemove(br.com.zup.PixEmailKeyWordRequest request) {
      return blockingUnaryCall(
          getChannel(), getEmailKeyWordRemoveMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class PixKeyWordServiceFutureStub extends io.grpc.stub.AbstractFutureStub<PixKeyWordServiceFutureStub> {
    private PixKeyWordServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PixKeyWordServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PixKeyWordServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<br.com.zup.PixRamdomKeyWordResponse> ramdomKeyWordRegister(
        br.com.zup.PixRamdomKeyWordRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getRamdomKeyWordRegisterMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<br.com.zup.PixRamdomKeyWordDeleteResponse> ramdomKeyWordRemove(
        br.com.zup.PixRamdomKeyWordDeleteRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getRamdomKeyWordRemoveMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<br.com.zup.PixCpfWordResponse> cpfKeyWordRegister(
        br.com.zup.PixCpfWordRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCpfKeyWordRegisterMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<br.com.zup.PixCpfWordResponse> cpfKeyWordRemove(
        br.com.zup.PixCpfWordRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCpfKeyWordRemoveMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<br.com.zup.PixPhoneKeyWordResponse> phoneKeyWordRegister(
        br.com.zup.PixPhoneKeyWordRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getPhoneKeyWordRegisterMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<br.com.zup.PixPhoneKeyWordResponse> phoneKeyWordRemove(
        br.com.zup.PixPhoneKeyWordRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getPhoneKeyWordRemoveMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<br.com.zup.PixEmailKeyWordResponse> emailKeyWordRegister(
        br.com.zup.PixEmailKeyWordRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getEmailKeyWordRegisterMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<br.com.zup.PixEmailKeyWordResponse> emailKeyWordRemove(
        br.com.zup.PixEmailKeyWordRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getEmailKeyWordRemoveMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_RAMDOM_KEY_WORD_REGISTER = 0;
  private static final int METHODID_RAMDOM_KEY_WORD_REMOVE = 1;
  private static final int METHODID_CPF_KEY_WORD_REGISTER = 2;
  private static final int METHODID_CPF_KEY_WORD_REMOVE = 3;
  private static final int METHODID_PHONE_KEY_WORD_REGISTER = 4;
  private static final int METHODID_PHONE_KEY_WORD_REMOVE = 5;
  private static final int METHODID_EMAIL_KEY_WORD_REGISTER = 6;
  private static final int METHODID_EMAIL_KEY_WORD_REMOVE = 7;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final PixKeyWordServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(PixKeyWordServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_RAMDOM_KEY_WORD_REGISTER:
          serviceImpl.ramdomKeyWordRegister((br.com.zup.PixRamdomKeyWordRequest) request,
              (io.grpc.stub.StreamObserver<br.com.zup.PixRamdomKeyWordResponse>) responseObserver);
          break;
        case METHODID_RAMDOM_KEY_WORD_REMOVE:
          serviceImpl.ramdomKeyWordRemove((br.com.zup.PixRamdomKeyWordDeleteRequest) request,
              (io.grpc.stub.StreamObserver<br.com.zup.PixRamdomKeyWordDeleteResponse>) responseObserver);
          break;
        case METHODID_CPF_KEY_WORD_REGISTER:
          serviceImpl.cpfKeyWordRegister((br.com.zup.PixCpfWordRequest) request,
              (io.grpc.stub.StreamObserver<br.com.zup.PixCpfWordResponse>) responseObserver);
          break;
        case METHODID_CPF_KEY_WORD_REMOVE:
          serviceImpl.cpfKeyWordRemove((br.com.zup.PixCpfWordRequest) request,
              (io.grpc.stub.StreamObserver<br.com.zup.PixCpfWordResponse>) responseObserver);
          break;
        case METHODID_PHONE_KEY_WORD_REGISTER:
          serviceImpl.phoneKeyWordRegister((br.com.zup.PixPhoneKeyWordRequest) request,
              (io.grpc.stub.StreamObserver<br.com.zup.PixPhoneKeyWordResponse>) responseObserver);
          break;
        case METHODID_PHONE_KEY_WORD_REMOVE:
          serviceImpl.phoneKeyWordRemove((br.com.zup.PixPhoneKeyWordRequest) request,
              (io.grpc.stub.StreamObserver<br.com.zup.PixPhoneKeyWordResponse>) responseObserver);
          break;
        case METHODID_EMAIL_KEY_WORD_REGISTER:
          serviceImpl.emailKeyWordRegister((br.com.zup.PixEmailKeyWordRequest) request,
              (io.grpc.stub.StreamObserver<br.com.zup.PixEmailKeyWordResponse>) responseObserver);
          break;
        case METHODID_EMAIL_KEY_WORD_REMOVE:
          serviceImpl.emailKeyWordRemove((br.com.zup.PixEmailKeyWordRequest) request,
              (io.grpc.stub.StreamObserver<br.com.zup.PixEmailKeyWordResponse>) responseObserver);
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

  private static abstract class PixKeyWordServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    PixKeyWordServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return br.com.zup.PixKeyword.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("PixKeyWordService");
    }
  }

  private static final class PixKeyWordServiceFileDescriptorSupplier
      extends PixKeyWordServiceBaseDescriptorSupplier {
    PixKeyWordServiceFileDescriptorSupplier() {}
  }

  private static final class PixKeyWordServiceMethodDescriptorSupplier
      extends PixKeyWordServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    PixKeyWordServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (PixKeyWordServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new PixKeyWordServiceFileDescriptorSupplier())
              .addMethod(getRamdomKeyWordRegisterMethod())
              .addMethod(getRamdomKeyWordRemoveMethod())
              .addMethod(getCpfKeyWordRegisterMethod())
              .addMethod(getCpfKeyWordRemoveMethod())
              .addMethod(getPhoneKeyWordRegisterMethod())
              .addMethod(getPhoneKeyWordRemoveMethod())
              .addMethod(getEmailKeyWordRegisterMethod())
              .addMethod(getEmailKeyWordRemoveMethod())
              .build();
        }
      }
    }
    return result;
  }
}

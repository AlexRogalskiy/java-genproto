package yandex.cloud.api.iam.v1;

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
 * <pre>
 * A set of methods for managing IAM tokens.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.22.0)",
    comments = "Source: yandex/cloud/iam/v1/iam_token_service.proto")
public final class IamTokenServiceGrpc {

  private IamTokenServiceGrpc() {}

  public static final String SERVICE_NAME = "yandex.cloud.iam.v1.IamTokenService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.iam.v1.IamTokenServiceOuterClass.CreateIamTokenRequest,
      yandex.cloud.api.iam.v1.IamTokenServiceOuterClass.CreateIamTokenResponse> getCreateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Create",
      requestType = yandex.cloud.api.iam.v1.IamTokenServiceOuterClass.CreateIamTokenRequest.class,
      responseType = yandex.cloud.api.iam.v1.IamTokenServiceOuterClass.CreateIamTokenResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.iam.v1.IamTokenServiceOuterClass.CreateIamTokenRequest,
      yandex.cloud.api.iam.v1.IamTokenServiceOuterClass.CreateIamTokenResponse> getCreateMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.iam.v1.IamTokenServiceOuterClass.CreateIamTokenRequest, yandex.cloud.api.iam.v1.IamTokenServiceOuterClass.CreateIamTokenResponse> getCreateMethod;
    if ((getCreateMethod = IamTokenServiceGrpc.getCreateMethod) == null) {
      synchronized (IamTokenServiceGrpc.class) {
        if ((getCreateMethod = IamTokenServiceGrpc.getCreateMethod) == null) {
          IamTokenServiceGrpc.getCreateMethod = getCreateMethod = 
              io.grpc.MethodDescriptor.<yandex.cloud.api.iam.v1.IamTokenServiceOuterClass.CreateIamTokenRequest, yandex.cloud.api.iam.v1.IamTokenServiceOuterClass.CreateIamTokenResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.iam.v1.IamTokenService", "Create"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.iam.v1.IamTokenServiceOuterClass.CreateIamTokenRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.iam.v1.IamTokenServiceOuterClass.CreateIamTokenResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new IamTokenServiceMethodDescriptorSupplier("Create"))
                  .build();
          }
        }
     }
     return getCreateMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static IamTokenServiceStub newStub(io.grpc.Channel channel) {
    return new IamTokenServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static IamTokenServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new IamTokenServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static IamTokenServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new IamTokenServiceFutureStub(channel);
  }

  /**
   * <pre>
   * A set of methods for managing IAM tokens.
   * </pre>
   */
  public static abstract class IamTokenServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Creates an IAM token for the specified identity.
     * </pre>
     */
    public void create(yandex.cloud.api.iam.v1.IamTokenServiceOuterClass.CreateIamTokenRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.iam.v1.IamTokenServiceOuterClass.CreateIamTokenResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.iam.v1.IamTokenServiceOuterClass.CreateIamTokenRequest,
                yandex.cloud.api.iam.v1.IamTokenServiceOuterClass.CreateIamTokenResponse>(
                  this, METHODID_CREATE)))
          .build();
    }
  }

  /**
   * <pre>
   * A set of methods for managing IAM tokens.
   * </pre>
   */
  public static final class IamTokenServiceStub extends io.grpc.stub.AbstractStub<IamTokenServiceStub> {
    private IamTokenServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private IamTokenServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected IamTokenServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new IamTokenServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Creates an IAM token for the specified identity.
     * </pre>
     */
    public void create(yandex.cloud.api.iam.v1.IamTokenServiceOuterClass.CreateIamTokenRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.iam.v1.IamTokenServiceOuterClass.CreateIamTokenResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * A set of methods for managing IAM tokens.
   * </pre>
   */
  public static final class IamTokenServiceBlockingStub extends io.grpc.stub.AbstractStub<IamTokenServiceBlockingStub> {
    private IamTokenServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private IamTokenServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected IamTokenServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new IamTokenServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Creates an IAM token for the specified identity.
     * </pre>
     */
    public yandex.cloud.api.iam.v1.IamTokenServiceOuterClass.CreateIamTokenResponse create(yandex.cloud.api.iam.v1.IamTokenServiceOuterClass.CreateIamTokenRequest request) {
      return blockingUnaryCall(
          getChannel(), getCreateMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * A set of methods for managing IAM tokens.
   * </pre>
   */
  public static final class IamTokenServiceFutureStub extends io.grpc.stub.AbstractStub<IamTokenServiceFutureStub> {
    private IamTokenServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private IamTokenServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected IamTokenServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new IamTokenServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Creates an IAM token for the specified identity.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.iam.v1.IamTokenServiceOuterClass.CreateIamTokenResponse> create(
        yandex.cloud.api.iam.v1.IamTokenServiceOuterClass.CreateIamTokenRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final IamTokenServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(IamTokenServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE:
          serviceImpl.create((yandex.cloud.api.iam.v1.IamTokenServiceOuterClass.CreateIamTokenRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.iam.v1.IamTokenServiceOuterClass.CreateIamTokenResponse>) responseObserver);
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

  private static abstract class IamTokenServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    IamTokenServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return yandex.cloud.api.iam.v1.IamTokenServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("IamTokenService");
    }
  }

  private static final class IamTokenServiceFileDescriptorSupplier
      extends IamTokenServiceBaseDescriptorSupplier {
    IamTokenServiceFileDescriptorSupplier() {}
  }

  private static final class IamTokenServiceMethodDescriptorSupplier
      extends IamTokenServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    IamTokenServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (IamTokenServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new IamTokenServiceFileDescriptorSupplier())
              .addMethod(getCreateMethod())
              .build();
        }
      }
    }
    return result;
  }
}

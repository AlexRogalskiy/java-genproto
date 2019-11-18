package yandex.cloud.api.mdb.clickhouse.v1;

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
    value = "by gRPC proto compiler (version 1.22.0)",
    comments = "Source: yandex/cloud/mdb/clickhouse/v1/ml_model_service.proto")
public final class MlModelServiceGrpc {

  private MlModelServiceGrpc() {}

  public static final String SERVICE_NAME = "yandex.cloud.mdb.clickhouse.v1.MlModelService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.mdb.clickhouse.v1.MlModelServiceOuterClass.GetMlModelRequest,
      yandex.cloud.api.mdb.clickhouse.v1.MlModelOuterClass.MlModel> getGetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Get",
      requestType = yandex.cloud.api.mdb.clickhouse.v1.MlModelServiceOuterClass.GetMlModelRequest.class,
      responseType = yandex.cloud.api.mdb.clickhouse.v1.MlModelOuterClass.MlModel.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.mdb.clickhouse.v1.MlModelServiceOuterClass.GetMlModelRequest,
      yandex.cloud.api.mdb.clickhouse.v1.MlModelOuterClass.MlModel> getGetMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.mdb.clickhouse.v1.MlModelServiceOuterClass.GetMlModelRequest, yandex.cloud.api.mdb.clickhouse.v1.MlModelOuterClass.MlModel> getGetMethod;
    if ((getGetMethod = MlModelServiceGrpc.getGetMethod) == null) {
      synchronized (MlModelServiceGrpc.class) {
        if ((getGetMethod = MlModelServiceGrpc.getGetMethod) == null) {
          MlModelServiceGrpc.getGetMethod = getGetMethod = 
              io.grpc.MethodDescriptor.<yandex.cloud.api.mdb.clickhouse.v1.MlModelServiceOuterClass.GetMlModelRequest, yandex.cloud.api.mdb.clickhouse.v1.MlModelOuterClass.MlModel>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.mdb.clickhouse.v1.MlModelService", "Get"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.mdb.clickhouse.v1.MlModelServiceOuterClass.GetMlModelRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.mdb.clickhouse.v1.MlModelOuterClass.MlModel.getDefaultInstance()))
                  .setSchemaDescriptor(new MlModelServiceMethodDescriptorSupplier("Get"))
                  .build();
          }
        }
     }
     return getGetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.mdb.clickhouse.v1.MlModelServiceOuterClass.ListMlModelsRequest,
      yandex.cloud.api.mdb.clickhouse.v1.MlModelServiceOuterClass.ListMlModelsResponse> getListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "List",
      requestType = yandex.cloud.api.mdb.clickhouse.v1.MlModelServiceOuterClass.ListMlModelsRequest.class,
      responseType = yandex.cloud.api.mdb.clickhouse.v1.MlModelServiceOuterClass.ListMlModelsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.mdb.clickhouse.v1.MlModelServiceOuterClass.ListMlModelsRequest,
      yandex.cloud.api.mdb.clickhouse.v1.MlModelServiceOuterClass.ListMlModelsResponse> getListMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.mdb.clickhouse.v1.MlModelServiceOuterClass.ListMlModelsRequest, yandex.cloud.api.mdb.clickhouse.v1.MlModelServiceOuterClass.ListMlModelsResponse> getListMethod;
    if ((getListMethod = MlModelServiceGrpc.getListMethod) == null) {
      synchronized (MlModelServiceGrpc.class) {
        if ((getListMethod = MlModelServiceGrpc.getListMethod) == null) {
          MlModelServiceGrpc.getListMethod = getListMethod = 
              io.grpc.MethodDescriptor.<yandex.cloud.api.mdb.clickhouse.v1.MlModelServiceOuterClass.ListMlModelsRequest, yandex.cloud.api.mdb.clickhouse.v1.MlModelServiceOuterClass.ListMlModelsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.mdb.clickhouse.v1.MlModelService", "List"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.mdb.clickhouse.v1.MlModelServiceOuterClass.ListMlModelsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.mdb.clickhouse.v1.MlModelServiceOuterClass.ListMlModelsResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new MlModelServiceMethodDescriptorSupplier("List"))
                  .build();
          }
        }
     }
     return getListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.mdb.clickhouse.v1.MlModelServiceOuterClass.CreateMlModelRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Create",
      requestType = yandex.cloud.api.mdb.clickhouse.v1.MlModelServiceOuterClass.CreateMlModelRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.mdb.clickhouse.v1.MlModelServiceOuterClass.CreateMlModelRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.mdb.clickhouse.v1.MlModelServiceOuterClass.CreateMlModelRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod;
    if ((getCreateMethod = MlModelServiceGrpc.getCreateMethod) == null) {
      synchronized (MlModelServiceGrpc.class) {
        if ((getCreateMethod = MlModelServiceGrpc.getCreateMethod) == null) {
          MlModelServiceGrpc.getCreateMethod = getCreateMethod = 
              io.grpc.MethodDescriptor.<yandex.cloud.api.mdb.clickhouse.v1.MlModelServiceOuterClass.CreateMlModelRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.mdb.clickhouse.v1.MlModelService", "Create"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.mdb.clickhouse.v1.MlModelServiceOuterClass.CreateMlModelRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
                  .setSchemaDescriptor(new MlModelServiceMethodDescriptorSupplier("Create"))
                  .build();
          }
        }
     }
     return getCreateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.mdb.clickhouse.v1.MlModelServiceOuterClass.UpdateMlModelRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Update",
      requestType = yandex.cloud.api.mdb.clickhouse.v1.MlModelServiceOuterClass.UpdateMlModelRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.mdb.clickhouse.v1.MlModelServiceOuterClass.UpdateMlModelRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.mdb.clickhouse.v1.MlModelServiceOuterClass.UpdateMlModelRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMethod;
    if ((getUpdateMethod = MlModelServiceGrpc.getUpdateMethod) == null) {
      synchronized (MlModelServiceGrpc.class) {
        if ((getUpdateMethod = MlModelServiceGrpc.getUpdateMethod) == null) {
          MlModelServiceGrpc.getUpdateMethod = getUpdateMethod = 
              io.grpc.MethodDescriptor.<yandex.cloud.api.mdb.clickhouse.v1.MlModelServiceOuterClass.UpdateMlModelRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.mdb.clickhouse.v1.MlModelService", "Update"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.mdb.clickhouse.v1.MlModelServiceOuterClass.UpdateMlModelRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
                  .setSchemaDescriptor(new MlModelServiceMethodDescriptorSupplier("Update"))
                  .build();
          }
        }
     }
     return getUpdateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.mdb.clickhouse.v1.MlModelServiceOuterClass.DeleteMlModelRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Delete",
      requestType = yandex.cloud.api.mdb.clickhouse.v1.MlModelServiceOuterClass.DeleteMlModelRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.mdb.clickhouse.v1.MlModelServiceOuterClass.DeleteMlModelRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.mdb.clickhouse.v1.MlModelServiceOuterClass.DeleteMlModelRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod;
    if ((getDeleteMethod = MlModelServiceGrpc.getDeleteMethod) == null) {
      synchronized (MlModelServiceGrpc.class) {
        if ((getDeleteMethod = MlModelServiceGrpc.getDeleteMethod) == null) {
          MlModelServiceGrpc.getDeleteMethod = getDeleteMethod = 
              io.grpc.MethodDescriptor.<yandex.cloud.api.mdb.clickhouse.v1.MlModelServiceOuterClass.DeleteMlModelRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.mdb.clickhouse.v1.MlModelService", "Delete"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.mdb.clickhouse.v1.MlModelServiceOuterClass.DeleteMlModelRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
                  .setSchemaDescriptor(new MlModelServiceMethodDescriptorSupplier("Delete"))
                  .build();
          }
        }
     }
     return getDeleteMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static MlModelServiceStub newStub(io.grpc.Channel channel) {
    return new MlModelServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static MlModelServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new MlModelServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static MlModelServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new MlModelServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class MlModelServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void get(yandex.cloud.api.mdb.clickhouse.v1.MlModelServiceOuterClass.GetMlModelRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.mdb.clickhouse.v1.MlModelOuterClass.MlModel> responseObserver) {
      asyncUnimplementedUnaryCall(getGetMethod(), responseObserver);
    }

    /**
     */
    public void list(yandex.cloud.api.mdb.clickhouse.v1.MlModelServiceOuterClass.ListMlModelsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.mdb.clickhouse.v1.MlModelServiceOuterClass.ListMlModelsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListMethod(), responseObserver);
    }

    /**
     */
    public void create(yandex.cloud.api.mdb.clickhouse.v1.MlModelServiceOuterClass.CreateMlModelRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateMethod(), responseObserver);
    }

    /**
     */
    public void update(yandex.cloud.api.mdb.clickhouse.v1.MlModelServiceOuterClass.UpdateMlModelRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateMethod(), responseObserver);
    }

    /**
     */
    public void delete(yandex.cloud.api.mdb.clickhouse.v1.MlModelServiceOuterClass.DeleteMlModelRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.mdb.clickhouse.v1.MlModelServiceOuterClass.GetMlModelRequest,
                yandex.cloud.api.mdb.clickhouse.v1.MlModelOuterClass.MlModel>(
                  this, METHODID_GET)))
          .addMethod(
            getListMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.mdb.clickhouse.v1.MlModelServiceOuterClass.ListMlModelsRequest,
                yandex.cloud.api.mdb.clickhouse.v1.MlModelServiceOuterClass.ListMlModelsResponse>(
                  this, METHODID_LIST)))
          .addMethod(
            getCreateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.mdb.clickhouse.v1.MlModelServiceOuterClass.CreateMlModelRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_CREATE)))
          .addMethod(
            getUpdateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.mdb.clickhouse.v1.MlModelServiceOuterClass.UpdateMlModelRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_UPDATE)))
          .addMethod(
            getDeleteMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.mdb.clickhouse.v1.MlModelServiceOuterClass.DeleteMlModelRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_DELETE)))
          .build();
    }
  }

  /**
   */
  public static final class MlModelServiceStub extends io.grpc.stub.AbstractStub<MlModelServiceStub> {
    private MlModelServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private MlModelServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MlModelServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new MlModelServiceStub(channel, callOptions);
    }

    /**
     */
    public void get(yandex.cloud.api.mdb.clickhouse.v1.MlModelServiceOuterClass.GetMlModelRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.mdb.clickhouse.v1.MlModelOuterClass.MlModel> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void list(yandex.cloud.api.mdb.clickhouse.v1.MlModelServiceOuterClass.ListMlModelsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.mdb.clickhouse.v1.MlModelServiceOuterClass.ListMlModelsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void create(yandex.cloud.api.mdb.clickhouse.v1.MlModelServiceOuterClass.CreateMlModelRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void update(yandex.cloud.api.mdb.clickhouse.v1.MlModelServiceOuterClass.UpdateMlModelRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void delete(yandex.cloud.api.mdb.clickhouse.v1.MlModelServiceOuterClass.DeleteMlModelRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class MlModelServiceBlockingStub extends io.grpc.stub.AbstractStub<MlModelServiceBlockingStub> {
    private MlModelServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private MlModelServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MlModelServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new MlModelServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public yandex.cloud.api.mdb.clickhouse.v1.MlModelOuterClass.MlModel get(yandex.cloud.api.mdb.clickhouse.v1.MlModelServiceOuterClass.GetMlModelRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetMethod(), getCallOptions(), request);
    }

    /**
     */
    public yandex.cloud.api.mdb.clickhouse.v1.MlModelServiceOuterClass.ListMlModelsResponse list(yandex.cloud.api.mdb.clickhouse.v1.MlModelServiceOuterClass.ListMlModelsRequest request) {
      return blockingUnaryCall(
          getChannel(), getListMethod(), getCallOptions(), request);
    }

    /**
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation create(yandex.cloud.api.mdb.clickhouse.v1.MlModelServiceOuterClass.CreateMlModelRequest request) {
      return blockingUnaryCall(
          getChannel(), getCreateMethod(), getCallOptions(), request);
    }

    /**
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation update(yandex.cloud.api.mdb.clickhouse.v1.MlModelServiceOuterClass.UpdateMlModelRequest request) {
      return blockingUnaryCall(
          getChannel(), getUpdateMethod(), getCallOptions(), request);
    }

    /**
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation delete(yandex.cloud.api.mdb.clickhouse.v1.MlModelServiceOuterClass.DeleteMlModelRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class MlModelServiceFutureStub extends io.grpc.stub.AbstractStub<MlModelServiceFutureStub> {
    private MlModelServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private MlModelServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MlModelServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new MlModelServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.mdb.clickhouse.v1.MlModelOuterClass.MlModel> get(
        yandex.cloud.api.mdb.clickhouse.v1.MlModelServiceOuterClass.GetMlModelRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.mdb.clickhouse.v1.MlModelServiceOuterClass.ListMlModelsResponse> list(
        yandex.cloud.api.mdb.clickhouse.v1.MlModelServiceOuterClass.ListMlModelsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> create(
        yandex.cloud.api.mdb.clickhouse.v1.MlModelServiceOuterClass.CreateMlModelRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> update(
        yandex.cloud.api.mdb.clickhouse.v1.MlModelServiceOuterClass.UpdateMlModelRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> delete(
        yandex.cloud.api.mdb.clickhouse.v1.MlModelServiceOuterClass.DeleteMlModelRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET = 0;
  private static final int METHODID_LIST = 1;
  private static final int METHODID_CREATE = 2;
  private static final int METHODID_UPDATE = 3;
  private static final int METHODID_DELETE = 4;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final MlModelServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(MlModelServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET:
          serviceImpl.get((yandex.cloud.api.mdb.clickhouse.v1.MlModelServiceOuterClass.GetMlModelRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.mdb.clickhouse.v1.MlModelOuterClass.MlModel>) responseObserver);
          break;
        case METHODID_LIST:
          serviceImpl.list((yandex.cloud.api.mdb.clickhouse.v1.MlModelServiceOuterClass.ListMlModelsRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.mdb.clickhouse.v1.MlModelServiceOuterClass.ListMlModelsResponse>) responseObserver);
          break;
        case METHODID_CREATE:
          serviceImpl.create((yandex.cloud.api.mdb.clickhouse.v1.MlModelServiceOuterClass.CreateMlModelRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_UPDATE:
          serviceImpl.update((yandex.cloud.api.mdb.clickhouse.v1.MlModelServiceOuterClass.UpdateMlModelRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_DELETE:
          serviceImpl.delete((yandex.cloud.api.mdb.clickhouse.v1.MlModelServiceOuterClass.DeleteMlModelRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
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

  private static abstract class MlModelServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    MlModelServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return yandex.cloud.api.mdb.clickhouse.v1.MlModelServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("MlModelService");
    }
  }

  private static final class MlModelServiceFileDescriptorSupplier
      extends MlModelServiceBaseDescriptorSupplier {
    MlModelServiceFileDescriptorSupplier() {}
  }

  private static final class MlModelServiceMethodDescriptorSupplier
      extends MlModelServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    MlModelServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (MlModelServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new MlModelServiceFileDescriptorSupplier())
              .addMethod(getGetMethod())
              .addMethod(getListMethod())
              .addMethod(getCreateMethod())
              .addMethod(getUpdateMethod())
              .addMethod(getDeleteMethod())
              .build();
        }
      }
    }
    return result;
  }
}

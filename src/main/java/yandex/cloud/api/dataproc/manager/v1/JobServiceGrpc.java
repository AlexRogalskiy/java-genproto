package yandex.cloud.api.dataproc.manager.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.43.2)",
    comments = "Source: yandex/cloud/dataproc/manager/v1/job_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class JobServiceGrpc {

  private JobServiceGrpc() {}

  public static final String SERVICE_NAME = "yandex.cloud.dataproc.manager.v1.JobService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.dataproc.manager.v1.JobServiceOuterClass.ListJobsRequest,
      yandex.cloud.api.dataproc.manager.v1.JobServiceOuterClass.ListJobsResponse> getListActiveMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListActive",
      requestType = yandex.cloud.api.dataproc.manager.v1.JobServiceOuterClass.ListJobsRequest.class,
      responseType = yandex.cloud.api.dataproc.manager.v1.JobServiceOuterClass.ListJobsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.dataproc.manager.v1.JobServiceOuterClass.ListJobsRequest,
      yandex.cloud.api.dataproc.manager.v1.JobServiceOuterClass.ListJobsResponse> getListActiveMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.dataproc.manager.v1.JobServiceOuterClass.ListJobsRequest, yandex.cloud.api.dataproc.manager.v1.JobServiceOuterClass.ListJobsResponse> getListActiveMethod;
    if ((getListActiveMethod = JobServiceGrpc.getListActiveMethod) == null) {
      synchronized (JobServiceGrpc.class) {
        if ((getListActiveMethod = JobServiceGrpc.getListActiveMethod) == null) {
          JobServiceGrpc.getListActiveMethod = getListActiveMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.dataproc.manager.v1.JobServiceOuterClass.ListJobsRequest, yandex.cloud.api.dataproc.manager.v1.JobServiceOuterClass.ListJobsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListActive"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.dataproc.manager.v1.JobServiceOuterClass.ListJobsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.dataproc.manager.v1.JobServiceOuterClass.ListJobsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new JobServiceMethodDescriptorSupplier("ListActive"))
              .build();
        }
      }
    }
    return getListActiveMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.dataproc.manager.v1.JobServiceOuterClass.UpdateJobStatusRequest,
      yandex.cloud.api.dataproc.manager.v1.JobServiceOuterClass.UpdateJobStatusResponse> getUpdateStatusMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateStatus",
      requestType = yandex.cloud.api.dataproc.manager.v1.JobServiceOuterClass.UpdateJobStatusRequest.class,
      responseType = yandex.cloud.api.dataproc.manager.v1.JobServiceOuterClass.UpdateJobStatusResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.dataproc.manager.v1.JobServiceOuterClass.UpdateJobStatusRequest,
      yandex.cloud.api.dataproc.manager.v1.JobServiceOuterClass.UpdateJobStatusResponse> getUpdateStatusMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.dataproc.manager.v1.JobServiceOuterClass.UpdateJobStatusRequest, yandex.cloud.api.dataproc.manager.v1.JobServiceOuterClass.UpdateJobStatusResponse> getUpdateStatusMethod;
    if ((getUpdateStatusMethod = JobServiceGrpc.getUpdateStatusMethod) == null) {
      synchronized (JobServiceGrpc.class) {
        if ((getUpdateStatusMethod = JobServiceGrpc.getUpdateStatusMethod) == null) {
          JobServiceGrpc.getUpdateStatusMethod = getUpdateStatusMethod =
              io.grpc.MethodDescriptor.<yandex.cloud.api.dataproc.manager.v1.JobServiceOuterClass.UpdateJobStatusRequest, yandex.cloud.api.dataproc.manager.v1.JobServiceOuterClass.UpdateJobStatusResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateStatus"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.dataproc.manager.v1.JobServiceOuterClass.UpdateJobStatusRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.dataproc.manager.v1.JobServiceOuterClass.UpdateJobStatusResponse.getDefaultInstance()))
              .setSchemaDescriptor(new JobServiceMethodDescriptorSupplier("UpdateStatus"))
              .build();
        }
      }
    }
    return getUpdateStatusMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static JobServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<JobServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<JobServiceStub>() {
        @java.lang.Override
        public JobServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new JobServiceStub(channel, callOptions);
        }
      };
    return JobServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static JobServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<JobServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<JobServiceBlockingStub>() {
        @java.lang.Override
        public JobServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new JobServiceBlockingStub(channel, callOptions);
        }
      };
    return JobServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static JobServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<JobServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<JobServiceFutureStub>() {
        @java.lang.Override
        public JobServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new JobServiceFutureStub(channel, callOptions);
        }
      };
    return JobServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class JobServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Retrieves a list of jobs for Data Proc cluster.
     * </pre>
     */
    public void listActive(yandex.cloud.api.dataproc.manager.v1.JobServiceOuterClass.ListJobsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.dataproc.manager.v1.JobServiceOuterClass.ListJobsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListActiveMethod(), responseObserver);
    }

    /**
     * <pre>
     * Currently used to update Job status.
     * </pre>
     */
    public void updateStatus(yandex.cloud.api.dataproc.manager.v1.JobServiceOuterClass.UpdateJobStatusRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.dataproc.manager.v1.JobServiceOuterClass.UpdateJobStatusResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateStatusMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getListActiveMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.dataproc.manager.v1.JobServiceOuterClass.ListJobsRequest,
                yandex.cloud.api.dataproc.manager.v1.JobServiceOuterClass.ListJobsResponse>(
                  this, METHODID_LIST_ACTIVE)))
          .addMethod(
            getUpdateStatusMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.dataproc.manager.v1.JobServiceOuterClass.UpdateJobStatusRequest,
                yandex.cloud.api.dataproc.manager.v1.JobServiceOuterClass.UpdateJobStatusResponse>(
                  this, METHODID_UPDATE_STATUS)))
          .build();
    }
  }

  /**
   */
  public static final class JobServiceStub extends io.grpc.stub.AbstractAsyncStub<JobServiceStub> {
    private JobServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected JobServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new JobServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Retrieves a list of jobs for Data Proc cluster.
     * </pre>
     */
    public void listActive(yandex.cloud.api.dataproc.manager.v1.JobServiceOuterClass.ListJobsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.dataproc.manager.v1.JobServiceOuterClass.ListJobsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListActiveMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Currently used to update Job status.
     * </pre>
     */
    public void updateStatus(yandex.cloud.api.dataproc.manager.v1.JobServiceOuterClass.UpdateJobStatusRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.dataproc.manager.v1.JobServiceOuterClass.UpdateJobStatusResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateStatusMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class JobServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<JobServiceBlockingStub> {
    private JobServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected JobServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new JobServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Retrieves a list of jobs for Data Proc cluster.
     * </pre>
     */
    public yandex.cloud.api.dataproc.manager.v1.JobServiceOuterClass.ListJobsResponse listActive(yandex.cloud.api.dataproc.manager.v1.JobServiceOuterClass.ListJobsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListActiveMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Currently used to update Job status.
     * </pre>
     */
    public yandex.cloud.api.dataproc.manager.v1.JobServiceOuterClass.UpdateJobStatusResponse updateStatus(yandex.cloud.api.dataproc.manager.v1.JobServiceOuterClass.UpdateJobStatusRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateStatusMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class JobServiceFutureStub extends io.grpc.stub.AbstractFutureStub<JobServiceFutureStub> {
    private JobServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected JobServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new JobServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Retrieves a list of jobs for Data Proc cluster.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.dataproc.manager.v1.JobServiceOuterClass.ListJobsResponse> listActive(
        yandex.cloud.api.dataproc.manager.v1.JobServiceOuterClass.ListJobsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListActiveMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Currently used to update Job status.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.dataproc.manager.v1.JobServiceOuterClass.UpdateJobStatusResponse> updateStatus(
        yandex.cloud.api.dataproc.manager.v1.JobServiceOuterClass.UpdateJobStatusRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateStatusMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_LIST_ACTIVE = 0;
  private static final int METHODID_UPDATE_STATUS = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final JobServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(JobServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_LIST_ACTIVE:
          serviceImpl.listActive((yandex.cloud.api.dataproc.manager.v1.JobServiceOuterClass.ListJobsRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.dataproc.manager.v1.JobServiceOuterClass.ListJobsResponse>) responseObserver);
          break;
        case METHODID_UPDATE_STATUS:
          serviceImpl.updateStatus((yandex.cloud.api.dataproc.manager.v1.JobServiceOuterClass.UpdateJobStatusRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.dataproc.manager.v1.JobServiceOuterClass.UpdateJobStatusResponse>) responseObserver);
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

  private static abstract class JobServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    JobServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return yandex.cloud.api.dataproc.manager.v1.JobServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("JobService");
    }
  }

  private static final class JobServiceFileDescriptorSupplier
      extends JobServiceBaseDescriptorSupplier {
    JobServiceFileDescriptorSupplier() {}
  }

  private static final class JobServiceMethodDescriptorSupplier
      extends JobServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    JobServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (JobServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new JobServiceFileDescriptorSupplier())
              .addMethod(getListActiveMethod())
              .addMethod(getUpdateStatusMethod())
              .build();
        }
      }
    }
    return result;
  }
}

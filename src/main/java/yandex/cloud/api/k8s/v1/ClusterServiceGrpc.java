package yandex.cloud.api.k8s.v1;

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
 * A set of methods for managing Kubernetes cluster.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.22.0)",
    comments = "Source: yandex/cloud/k8s/v1/cluster_service.proto")
public final class ClusterServiceGrpc {

  private ClusterServiceGrpc() {}

  public static final String SERVICE_NAME = "yandex.cloud.k8s.v1.ClusterService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.k8s.v1.ClusterServiceOuterClass.GetClusterRequest,
      yandex.cloud.api.k8s.v1.ClusterOuterClass.Cluster> getGetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Get",
      requestType = yandex.cloud.api.k8s.v1.ClusterServiceOuterClass.GetClusterRequest.class,
      responseType = yandex.cloud.api.k8s.v1.ClusterOuterClass.Cluster.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.k8s.v1.ClusterServiceOuterClass.GetClusterRequest,
      yandex.cloud.api.k8s.v1.ClusterOuterClass.Cluster> getGetMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.k8s.v1.ClusterServiceOuterClass.GetClusterRequest, yandex.cloud.api.k8s.v1.ClusterOuterClass.Cluster> getGetMethod;
    if ((getGetMethod = ClusterServiceGrpc.getGetMethod) == null) {
      synchronized (ClusterServiceGrpc.class) {
        if ((getGetMethod = ClusterServiceGrpc.getGetMethod) == null) {
          ClusterServiceGrpc.getGetMethod = getGetMethod = 
              io.grpc.MethodDescriptor.<yandex.cloud.api.k8s.v1.ClusterServiceOuterClass.GetClusterRequest, yandex.cloud.api.k8s.v1.ClusterOuterClass.Cluster>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.k8s.v1.ClusterService", "Get"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.k8s.v1.ClusterServiceOuterClass.GetClusterRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.k8s.v1.ClusterOuterClass.Cluster.getDefaultInstance()))
                  .setSchemaDescriptor(new ClusterServiceMethodDescriptorSupplier("Get"))
                  .build();
          }
        }
     }
     return getGetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.k8s.v1.ClusterServiceOuterClass.ListClustersRequest,
      yandex.cloud.api.k8s.v1.ClusterServiceOuterClass.ListClustersResponse> getListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "List",
      requestType = yandex.cloud.api.k8s.v1.ClusterServiceOuterClass.ListClustersRequest.class,
      responseType = yandex.cloud.api.k8s.v1.ClusterServiceOuterClass.ListClustersResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.k8s.v1.ClusterServiceOuterClass.ListClustersRequest,
      yandex.cloud.api.k8s.v1.ClusterServiceOuterClass.ListClustersResponse> getListMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.k8s.v1.ClusterServiceOuterClass.ListClustersRequest, yandex.cloud.api.k8s.v1.ClusterServiceOuterClass.ListClustersResponse> getListMethod;
    if ((getListMethod = ClusterServiceGrpc.getListMethod) == null) {
      synchronized (ClusterServiceGrpc.class) {
        if ((getListMethod = ClusterServiceGrpc.getListMethod) == null) {
          ClusterServiceGrpc.getListMethod = getListMethod = 
              io.grpc.MethodDescriptor.<yandex.cloud.api.k8s.v1.ClusterServiceOuterClass.ListClustersRequest, yandex.cloud.api.k8s.v1.ClusterServiceOuterClass.ListClustersResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.k8s.v1.ClusterService", "List"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.k8s.v1.ClusterServiceOuterClass.ListClustersRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.k8s.v1.ClusterServiceOuterClass.ListClustersResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ClusterServiceMethodDescriptorSupplier("List"))
                  .build();
          }
        }
     }
     return getListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.k8s.v1.ClusterServiceOuterClass.CreateClusterRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Create",
      requestType = yandex.cloud.api.k8s.v1.ClusterServiceOuterClass.CreateClusterRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.k8s.v1.ClusterServiceOuterClass.CreateClusterRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.k8s.v1.ClusterServiceOuterClass.CreateClusterRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getCreateMethod;
    if ((getCreateMethod = ClusterServiceGrpc.getCreateMethod) == null) {
      synchronized (ClusterServiceGrpc.class) {
        if ((getCreateMethod = ClusterServiceGrpc.getCreateMethod) == null) {
          ClusterServiceGrpc.getCreateMethod = getCreateMethod = 
              io.grpc.MethodDescriptor.<yandex.cloud.api.k8s.v1.ClusterServiceOuterClass.CreateClusterRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.k8s.v1.ClusterService", "Create"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.k8s.v1.ClusterServiceOuterClass.CreateClusterRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
                  .setSchemaDescriptor(new ClusterServiceMethodDescriptorSupplier("Create"))
                  .build();
          }
        }
     }
     return getCreateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.k8s.v1.ClusterServiceOuterClass.UpdateClusterRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Update",
      requestType = yandex.cloud.api.k8s.v1.ClusterServiceOuterClass.UpdateClusterRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.k8s.v1.ClusterServiceOuterClass.UpdateClusterRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.k8s.v1.ClusterServiceOuterClass.UpdateClusterRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getUpdateMethod;
    if ((getUpdateMethod = ClusterServiceGrpc.getUpdateMethod) == null) {
      synchronized (ClusterServiceGrpc.class) {
        if ((getUpdateMethod = ClusterServiceGrpc.getUpdateMethod) == null) {
          ClusterServiceGrpc.getUpdateMethod = getUpdateMethod = 
              io.grpc.MethodDescriptor.<yandex.cloud.api.k8s.v1.ClusterServiceOuterClass.UpdateClusterRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.k8s.v1.ClusterService", "Update"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.k8s.v1.ClusterServiceOuterClass.UpdateClusterRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
                  .setSchemaDescriptor(new ClusterServiceMethodDescriptorSupplier("Update"))
                  .build();
          }
        }
     }
     return getUpdateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.k8s.v1.ClusterServiceOuterClass.DeleteClusterRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Delete",
      requestType = yandex.cloud.api.k8s.v1.ClusterServiceOuterClass.DeleteClusterRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.k8s.v1.ClusterServiceOuterClass.DeleteClusterRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.k8s.v1.ClusterServiceOuterClass.DeleteClusterRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getDeleteMethod;
    if ((getDeleteMethod = ClusterServiceGrpc.getDeleteMethod) == null) {
      synchronized (ClusterServiceGrpc.class) {
        if ((getDeleteMethod = ClusterServiceGrpc.getDeleteMethod) == null) {
          ClusterServiceGrpc.getDeleteMethod = getDeleteMethod = 
              io.grpc.MethodDescriptor.<yandex.cloud.api.k8s.v1.ClusterServiceOuterClass.DeleteClusterRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.k8s.v1.ClusterService", "Delete"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.k8s.v1.ClusterServiceOuterClass.DeleteClusterRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
                  .setSchemaDescriptor(new ClusterServiceMethodDescriptorSupplier("Delete"))
                  .build();
          }
        }
     }
     return getDeleteMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.k8s.v1.ClusterServiceOuterClass.StopClusterRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getStopMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Stop",
      requestType = yandex.cloud.api.k8s.v1.ClusterServiceOuterClass.StopClusterRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.k8s.v1.ClusterServiceOuterClass.StopClusterRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getStopMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.k8s.v1.ClusterServiceOuterClass.StopClusterRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getStopMethod;
    if ((getStopMethod = ClusterServiceGrpc.getStopMethod) == null) {
      synchronized (ClusterServiceGrpc.class) {
        if ((getStopMethod = ClusterServiceGrpc.getStopMethod) == null) {
          ClusterServiceGrpc.getStopMethod = getStopMethod = 
              io.grpc.MethodDescriptor.<yandex.cloud.api.k8s.v1.ClusterServiceOuterClass.StopClusterRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.k8s.v1.ClusterService", "Stop"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.k8s.v1.ClusterServiceOuterClass.StopClusterRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
                  .setSchemaDescriptor(new ClusterServiceMethodDescriptorSupplier("Stop"))
                  .build();
          }
        }
     }
     return getStopMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.k8s.v1.ClusterServiceOuterClass.StartClusterRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getStartMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Start",
      requestType = yandex.cloud.api.k8s.v1.ClusterServiceOuterClass.StartClusterRequest.class,
      responseType = yandex.cloud.api.operation.OperationOuterClass.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.k8s.v1.ClusterServiceOuterClass.StartClusterRequest,
      yandex.cloud.api.operation.OperationOuterClass.Operation> getStartMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.k8s.v1.ClusterServiceOuterClass.StartClusterRequest, yandex.cloud.api.operation.OperationOuterClass.Operation> getStartMethod;
    if ((getStartMethod = ClusterServiceGrpc.getStartMethod) == null) {
      synchronized (ClusterServiceGrpc.class) {
        if ((getStartMethod = ClusterServiceGrpc.getStartMethod) == null) {
          ClusterServiceGrpc.getStartMethod = getStartMethod = 
              io.grpc.MethodDescriptor.<yandex.cloud.api.k8s.v1.ClusterServiceOuterClass.StartClusterRequest, yandex.cloud.api.operation.OperationOuterClass.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.k8s.v1.ClusterService", "Start"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.k8s.v1.ClusterServiceOuterClass.StartClusterRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.operation.OperationOuterClass.Operation.getDefaultInstance()))
                  .setSchemaDescriptor(new ClusterServiceMethodDescriptorSupplier("Start"))
                  .build();
          }
        }
     }
     return getStartMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.k8s.v1.ClusterServiceOuterClass.ListClusterNodeGroupsRequest,
      yandex.cloud.api.k8s.v1.ClusterServiceOuterClass.ListClusterNodeGroupsResponse> getListNodeGroupsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListNodeGroups",
      requestType = yandex.cloud.api.k8s.v1.ClusterServiceOuterClass.ListClusterNodeGroupsRequest.class,
      responseType = yandex.cloud.api.k8s.v1.ClusterServiceOuterClass.ListClusterNodeGroupsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.k8s.v1.ClusterServiceOuterClass.ListClusterNodeGroupsRequest,
      yandex.cloud.api.k8s.v1.ClusterServiceOuterClass.ListClusterNodeGroupsResponse> getListNodeGroupsMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.k8s.v1.ClusterServiceOuterClass.ListClusterNodeGroupsRequest, yandex.cloud.api.k8s.v1.ClusterServiceOuterClass.ListClusterNodeGroupsResponse> getListNodeGroupsMethod;
    if ((getListNodeGroupsMethod = ClusterServiceGrpc.getListNodeGroupsMethod) == null) {
      synchronized (ClusterServiceGrpc.class) {
        if ((getListNodeGroupsMethod = ClusterServiceGrpc.getListNodeGroupsMethod) == null) {
          ClusterServiceGrpc.getListNodeGroupsMethod = getListNodeGroupsMethod = 
              io.grpc.MethodDescriptor.<yandex.cloud.api.k8s.v1.ClusterServiceOuterClass.ListClusterNodeGroupsRequest, yandex.cloud.api.k8s.v1.ClusterServiceOuterClass.ListClusterNodeGroupsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.k8s.v1.ClusterService", "ListNodeGroups"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.k8s.v1.ClusterServiceOuterClass.ListClusterNodeGroupsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.k8s.v1.ClusterServiceOuterClass.ListClusterNodeGroupsResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ClusterServiceMethodDescriptorSupplier("ListNodeGroups"))
                  .build();
          }
        }
     }
     return getListNodeGroupsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.k8s.v1.ClusterServiceOuterClass.ListClusterOperationsRequest,
      yandex.cloud.api.k8s.v1.ClusterServiceOuterClass.ListClusterOperationsResponse> getListOperationsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListOperations",
      requestType = yandex.cloud.api.k8s.v1.ClusterServiceOuterClass.ListClusterOperationsRequest.class,
      responseType = yandex.cloud.api.k8s.v1.ClusterServiceOuterClass.ListClusterOperationsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.k8s.v1.ClusterServiceOuterClass.ListClusterOperationsRequest,
      yandex.cloud.api.k8s.v1.ClusterServiceOuterClass.ListClusterOperationsResponse> getListOperationsMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.k8s.v1.ClusterServiceOuterClass.ListClusterOperationsRequest, yandex.cloud.api.k8s.v1.ClusterServiceOuterClass.ListClusterOperationsResponse> getListOperationsMethod;
    if ((getListOperationsMethod = ClusterServiceGrpc.getListOperationsMethod) == null) {
      synchronized (ClusterServiceGrpc.class) {
        if ((getListOperationsMethod = ClusterServiceGrpc.getListOperationsMethod) == null) {
          ClusterServiceGrpc.getListOperationsMethod = getListOperationsMethod = 
              io.grpc.MethodDescriptor.<yandex.cloud.api.k8s.v1.ClusterServiceOuterClass.ListClusterOperationsRequest, yandex.cloud.api.k8s.v1.ClusterServiceOuterClass.ListClusterOperationsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.k8s.v1.ClusterService", "ListOperations"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.k8s.v1.ClusterServiceOuterClass.ListClusterOperationsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.k8s.v1.ClusterServiceOuterClass.ListClusterOperationsResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ClusterServiceMethodDescriptorSupplier("ListOperations"))
                  .build();
          }
        }
     }
     return getListOperationsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yandex.cloud.api.k8s.v1.ClusterServiceOuterClass.ListClusterNodesRequest,
      yandex.cloud.api.k8s.v1.ClusterServiceOuterClass.ListClusterNodesResponse> getListNodesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListNodes",
      requestType = yandex.cloud.api.k8s.v1.ClusterServiceOuterClass.ListClusterNodesRequest.class,
      responseType = yandex.cloud.api.k8s.v1.ClusterServiceOuterClass.ListClusterNodesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yandex.cloud.api.k8s.v1.ClusterServiceOuterClass.ListClusterNodesRequest,
      yandex.cloud.api.k8s.v1.ClusterServiceOuterClass.ListClusterNodesResponse> getListNodesMethod() {
    io.grpc.MethodDescriptor<yandex.cloud.api.k8s.v1.ClusterServiceOuterClass.ListClusterNodesRequest, yandex.cloud.api.k8s.v1.ClusterServiceOuterClass.ListClusterNodesResponse> getListNodesMethod;
    if ((getListNodesMethod = ClusterServiceGrpc.getListNodesMethod) == null) {
      synchronized (ClusterServiceGrpc.class) {
        if ((getListNodesMethod = ClusterServiceGrpc.getListNodesMethod) == null) {
          ClusterServiceGrpc.getListNodesMethod = getListNodesMethod = 
              io.grpc.MethodDescriptor.<yandex.cloud.api.k8s.v1.ClusterServiceOuterClass.ListClusterNodesRequest, yandex.cloud.api.k8s.v1.ClusterServiceOuterClass.ListClusterNodesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "yandex.cloud.k8s.v1.ClusterService", "ListNodes"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.k8s.v1.ClusterServiceOuterClass.ListClusterNodesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yandex.cloud.api.k8s.v1.ClusterServiceOuterClass.ListClusterNodesResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ClusterServiceMethodDescriptorSupplier("ListNodes"))
                  .build();
          }
        }
     }
     return getListNodesMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ClusterServiceStub newStub(io.grpc.Channel channel) {
    return new ClusterServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ClusterServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new ClusterServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ClusterServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new ClusterServiceFutureStub(channel);
  }

  /**
   * <pre>
   * A set of methods for managing Kubernetes cluster.
   * </pre>
   */
  public static abstract class ClusterServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Returns the specified Kubernetes cluster.
     * To get the list of available Kubernetes cluster, make a [List] request.
     * </pre>
     */
    public void get(yandex.cloud.api.k8s.v1.ClusterServiceOuterClass.GetClusterRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.k8s.v1.ClusterOuterClass.Cluster> responseObserver) {
      asyncUnimplementedUnaryCall(getGetMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieves the list of Kubernetes cluster in the specified folder.
     * </pre>
     */
    public void list(yandex.cloud.api.k8s.v1.ClusterServiceOuterClass.ListClustersRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.k8s.v1.ClusterServiceOuterClass.ListClustersResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListMethod(), responseObserver);
    }

    /**
     * <pre>
     * Creates a Kubernetes cluster in the specified folder.
     * </pre>
     */
    public void create(yandex.cloud.api.k8s.v1.ClusterServiceOuterClass.CreateClusterRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Updates the specified Kubernetes cluster.
     * </pre>
     */
    public void update(yandex.cloud.api.k8s.v1.ClusterServiceOuterClass.UpdateClusterRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Deletes the specified Kubernetes cluster.
     * </pre>
     */
    public void delete(yandex.cloud.api.k8s.v1.ClusterServiceOuterClass.DeleteClusterRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteMethod(), responseObserver);
    }

    /**
     * <pre>
     * Stops the specified Kubernetes cluster.
     * </pre>
     */
    public void stop(yandex.cloud.api.k8s.v1.ClusterServiceOuterClass.StopClusterRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnimplementedUnaryCall(getStopMethod(), responseObserver);
    }

    /**
     * <pre>
     * Starts the specified Kubernetes cluster.
     * </pre>
     */
    public void start(yandex.cloud.api.k8s.v1.ClusterServiceOuterClass.StartClusterRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnimplementedUnaryCall(getStartMethod(), responseObserver);
    }

    /**
     * <pre>
     * Lists nodegroup for the specified Kubernetes cluster.
     * </pre>
     */
    public void listNodeGroups(yandex.cloud.api.k8s.v1.ClusterServiceOuterClass.ListClusterNodeGroupsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.k8s.v1.ClusterServiceOuterClass.ListClusterNodeGroupsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListNodeGroupsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Lists operations for the specified Kubernetes cluster.
     * </pre>
     */
    public void listOperations(yandex.cloud.api.k8s.v1.ClusterServiceOuterClass.ListClusterOperationsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.k8s.v1.ClusterServiceOuterClass.ListClusterOperationsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListOperationsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Lists cluster's nodes.
     * </pre>
     */
    public void listNodes(yandex.cloud.api.k8s.v1.ClusterServiceOuterClass.ListClusterNodesRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.k8s.v1.ClusterServiceOuterClass.ListClusterNodesResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListNodesMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.k8s.v1.ClusterServiceOuterClass.GetClusterRequest,
                yandex.cloud.api.k8s.v1.ClusterOuterClass.Cluster>(
                  this, METHODID_GET)))
          .addMethod(
            getListMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.k8s.v1.ClusterServiceOuterClass.ListClustersRequest,
                yandex.cloud.api.k8s.v1.ClusterServiceOuterClass.ListClustersResponse>(
                  this, METHODID_LIST)))
          .addMethod(
            getCreateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.k8s.v1.ClusterServiceOuterClass.CreateClusterRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_CREATE)))
          .addMethod(
            getUpdateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.k8s.v1.ClusterServiceOuterClass.UpdateClusterRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_UPDATE)))
          .addMethod(
            getDeleteMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.k8s.v1.ClusterServiceOuterClass.DeleteClusterRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_DELETE)))
          .addMethod(
            getStopMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.k8s.v1.ClusterServiceOuterClass.StopClusterRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_STOP)))
          .addMethod(
            getStartMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.k8s.v1.ClusterServiceOuterClass.StartClusterRequest,
                yandex.cloud.api.operation.OperationOuterClass.Operation>(
                  this, METHODID_START)))
          .addMethod(
            getListNodeGroupsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.k8s.v1.ClusterServiceOuterClass.ListClusterNodeGroupsRequest,
                yandex.cloud.api.k8s.v1.ClusterServiceOuterClass.ListClusterNodeGroupsResponse>(
                  this, METHODID_LIST_NODE_GROUPS)))
          .addMethod(
            getListOperationsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.k8s.v1.ClusterServiceOuterClass.ListClusterOperationsRequest,
                yandex.cloud.api.k8s.v1.ClusterServiceOuterClass.ListClusterOperationsResponse>(
                  this, METHODID_LIST_OPERATIONS)))
          .addMethod(
            getListNodesMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                yandex.cloud.api.k8s.v1.ClusterServiceOuterClass.ListClusterNodesRequest,
                yandex.cloud.api.k8s.v1.ClusterServiceOuterClass.ListClusterNodesResponse>(
                  this, METHODID_LIST_NODES)))
          .build();
    }
  }

  /**
   * <pre>
   * A set of methods for managing Kubernetes cluster.
   * </pre>
   */
  public static final class ClusterServiceStub extends io.grpc.stub.AbstractStub<ClusterServiceStub> {
    private ClusterServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ClusterServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ClusterServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ClusterServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the specified Kubernetes cluster.
     * To get the list of available Kubernetes cluster, make a [List] request.
     * </pre>
     */
    public void get(yandex.cloud.api.k8s.v1.ClusterServiceOuterClass.GetClusterRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.k8s.v1.ClusterOuterClass.Cluster> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieves the list of Kubernetes cluster in the specified folder.
     * </pre>
     */
    public void list(yandex.cloud.api.k8s.v1.ClusterServiceOuterClass.ListClustersRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.k8s.v1.ClusterServiceOuterClass.ListClustersResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Creates a Kubernetes cluster in the specified folder.
     * </pre>
     */
    public void create(yandex.cloud.api.k8s.v1.ClusterServiceOuterClass.CreateClusterRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Updates the specified Kubernetes cluster.
     * </pre>
     */
    public void update(yandex.cloud.api.k8s.v1.ClusterServiceOuterClass.UpdateClusterRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Deletes the specified Kubernetes cluster.
     * </pre>
     */
    public void delete(yandex.cloud.api.k8s.v1.ClusterServiceOuterClass.DeleteClusterRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Stops the specified Kubernetes cluster.
     * </pre>
     */
    public void stop(yandex.cloud.api.k8s.v1.ClusterServiceOuterClass.StopClusterRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getStopMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Starts the specified Kubernetes cluster.
     * </pre>
     */
    public void start(yandex.cloud.api.k8s.v1.ClusterServiceOuterClass.StartClusterRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getStartMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Lists nodegroup for the specified Kubernetes cluster.
     * </pre>
     */
    public void listNodeGroups(yandex.cloud.api.k8s.v1.ClusterServiceOuterClass.ListClusterNodeGroupsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.k8s.v1.ClusterServiceOuterClass.ListClusterNodeGroupsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListNodeGroupsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Lists operations for the specified Kubernetes cluster.
     * </pre>
     */
    public void listOperations(yandex.cloud.api.k8s.v1.ClusterServiceOuterClass.ListClusterOperationsRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.k8s.v1.ClusterServiceOuterClass.ListClusterOperationsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListOperationsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Lists cluster's nodes.
     * </pre>
     */
    public void listNodes(yandex.cloud.api.k8s.v1.ClusterServiceOuterClass.ListClusterNodesRequest request,
        io.grpc.stub.StreamObserver<yandex.cloud.api.k8s.v1.ClusterServiceOuterClass.ListClusterNodesResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListNodesMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * A set of methods for managing Kubernetes cluster.
   * </pre>
   */
  public static final class ClusterServiceBlockingStub extends io.grpc.stub.AbstractStub<ClusterServiceBlockingStub> {
    private ClusterServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ClusterServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ClusterServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ClusterServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the specified Kubernetes cluster.
     * To get the list of available Kubernetes cluster, make a [List] request.
     * </pre>
     */
    public yandex.cloud.api.k8s.v1.ClusterOuterClass.Cluster get(yandex.cloud.api.k8s.v1.ClusterServiceOuterClass.GetClusterRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieves the list of Kubernetes cluster in the specified folder.
     * </pre>
     */
    public yandex.cloud.api.k8s.v1.ClusterServiceOuterClass.ListClustersResponse list(yandex.cloud.api.k8s.v1.ClusterServiceOuterClass.ListClustersRequest request) {
      return blockingUnaryCall(
          getChannel(), getListMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates a Kubernetes cluster in the specified folder.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation create(yandex.cloud.api.k8s.v1.ClusterServiceOuterClass.CreateClusterRequest request) {
      return blockingUnaryCall(
          getChannel(), getCreateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates the specified Kubernetes cluster.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation update(yandex.cloud.api.k8s.v1.ClusterServiceOuterClass.UpdateClusterRequest request) {
      return blockingUnaryCall(
          getChannel(), getUpdateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Deletes the specified Kubernetes cluster.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation delete(yandex.cloud.api.k8s.v1.ClusterServiceOuterClass.DeleteClusterRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Stops the specified Kubernetes cluster.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation stop(yandex.cloud.api.k8s.v1.ClusterServiceOuterClass.StopClusterRequest request) {
      return blockingUnaryCall(
          getChannel(), getStopMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Starts the specified Kubernetes cluster.
     * </pre>
     */
    public yandex.cloud.api.operation.OperationOuterClass.Operation start(yandex.cloud.api.k8s.v1.ClusterServiceOuterClass.StartClusterRequest request) {
      return blockingUnaryCall(
          getChannel(), getStartMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Lists nodegroup for the specified Kubernetes cluster.
     * </pre>
     */
    public yandex.cloud.api.k8s.v1.ClusterServiceOuterClass.ListClusterNodeGroupsResponse listNodeGroups(yandex.cloud.api.k8s.v1.ClusterServiceOuterClass.ListClusterNodeGroupsRequest request) {
      return blockingUnaryCall(
          getChannel(), getListNodeGroupsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Lists operations for the specified Kubernetes cluster.
     * </pre>
     */
    public yandex.cloud.api.k8s.v1.ClusterServiceOuterClass.ListClusterOperationsResponse listOperations(yandex.cloud.api.k8s.v1.ClusterServiceOuterClass.ListClusterOperationsRequest request) {
      return blockingUnaryCall(
          getChannel(), getListOperationsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Lists cluster's nodes.
     * </pre>
     */
    public yandex.cloud.api.k8s.v1.ClusterServiceOuterClass.ListClusterNodesResponse listNodes(yandex.cloud.api.k8s.v1.ClusterServiceOuterClass.ListClusterNodesRequest request) {
      return blockingUnaryCall(
          getChannel(), getListNodesMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * A set of methods for managing Kubernetes cluster.
   * </pre>
   */
  public static final class ClusterServiceFutureStub extends io.grpc.stub.AbstractStub<ClusterServiceFutureStub> {
    private ClusterServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ClusterServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ClusterServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ClusterServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the specified Kubernetes cluster.
     * To get the list of available Kubernetes cluster, make a [List] request.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.k8s.v1.ClusterOuterClass.Cluster> get(
        yandex.cloud.api.k8s.v1.ClusterServiceOuterClass.GetClusterRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieves the list of Kubernetes cluster in the specified folder.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.k8s.v1.ClusterServiceOuterClass.ListClustersResponse> list(
        yandex.cloud.api.k8s.v1.ClusterServiceOuterClass.ListClustersRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Creates a Kubernetes cluster in the specified folder.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> create(
        yandex.cloud.api.k8s.v1.ClusterServiceOuterClass.CreateClusterRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Updates the specified Kubernetes cluster.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> update(
        yandex.cloud.api.k8s.v1.ClusterServiceOuterClass.UpdateClusterRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Deletes the specified Kubernetes cluster.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> delete(
        yandex.cloud.api.k8s.v1.ClusterServiceOuterClass.DeleteClusterRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Stops the specified Kubernetes cluster.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> stop(
        yandex.cloud.api.k8s.v1.ClusterServiceOuterClass.StopClusterRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getStopMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Starts the specified Kubernetes cluster.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.operation.OperationOuterClass.Operation> start(
        yandex.cloud.api.k8s.v1.ClusterServiceOuterClass.StartClusterRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getStartMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Lists nodegroup for the specified Kubernetes cluster.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.k8s.v1.ClusterServiceOuterClass.ListClusterNodeGroupsResponse> listNodeGroups(
        yandex.cloud.api.k8s.v1.ClusterServiceOuterClass.ListClusterNodeGroupsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListNodeGroupsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Lists operations for the specified Kubernetes cluster.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.k8s.v1.ClusterServiceOuterClass.ListClusterOperationsResponse> listOperations(
        yandex.cloud.api.k8s.v1.ClusterServiceOuterClass.ListClusterOperationsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListOperationsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Lists cluster's nodes.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yandex.cloud.api.k8s.v1.ClusterServiceOuterClass.ListClusterNodesResponse> listNodes(
        yandex.cloud.api.k8s.v1.ClusterServiceOuterClass.ListClusterNodesRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListNodesMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET = 0;
  private static final int METHODID_LIST = 1;
  private static final int METHODID_CREATE = 2;
  private static final int METHODID_UPDATE = 3;
  private static final int METHODID_DELETE = 4;
  private static final int METHODID_STOP = 5;
  private static final int METHODID_START = 6;
  private static final int METHODID_LIST_NODE_GROUPS = 7;
  private static final int METHODID_LIST_OPERATIONS = 8;
  private static final int METHODID_LIST_NODES = 9;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ClusterServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ClusterServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET:
          serviceImpl.get((yandex.cloud.api.k8s.v1.ClusterServiceOuterClass.GetClusterRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.k8s.v1.ClusterOuterClass.Cluster>) responseObserver);
          break;
        case METHODID_LIST:
          serviceImpl.list((yandex.cloud.api.k8s.v1.ClusterServiceOuterClass.ListClustersRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.k8s.v1.ClusterServiceOuterClass.ListClustersResponse>) responseObserver);
          break;
        case METHODID_CREATE:
          serviceImpl.create((yandex.cloud.api.k8s.v1.ClusterServiceOuterClass.CreateClusterRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_UPDATE:
          serviceImpl.update((yandex.cloud.api.k8s.v1.ClusterServiceOuterClass.UpdateClusterRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_DELETE:
          serviceImpl.delete((yandex.cloud.api.k8s.v1.ClusterServiceOuterClass.DeleteClusterRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_STOP:
          serviceImpl.stop((yandex.cloud.api.k8s.v1.ClusterServiceOuterClass.StopClusterRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_START:
          serviceImpl.start((yandex.cloud.api.k8s.v1.ClusterServiceOuterClass.StartClusterRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.operation.OperationOuterClass.Operation>) responseObserver);
          break;
        case METHODID_LIST_NODE_GROUPS:
          serviceImpl.listNodeGroups((yandex.cloud.api.k8s.v1.ClusterServiceOuterClass.ListClusterNodeGroupsRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.k8s.v1.ClusterServiceOuterClass.ListClusterNodeGroupsResponse>) responseObserver);
          break;
        case METHODID_LIST_OPERATIONS:
          serviceImpl.listOperations((yandex.cloud.api.k8s.v1.ClusterServiceOuterClass.ListClusterOperationsRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.k8s.v1.ClusterServiceOuterClass.ListClusterOperationsResponse>) responseObserver);
          break;
        case METHODID_LIST_NODES:
          serviceImpl.listNodes((yandex.cloud.api.k8s.v1.ClusterServiceOuterClass.ListClusterNodesRequest) request,
              (io.grpc.stub.StreamObserver<yandex.cloud.api.k8s.v1.ClusterServiceOuterClass.ListClusterNodesResponse>) responseObserver);
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

  private static abstract class ClusterServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ClusterServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return yandex.cloud.api.k8s.v1.ClusterServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ClusterService");
    }
  }

  private static final class ClusterServiceFileDescriptorSupplier
      extends ClusterServiceBaseDescriptorSupplier {
    ClusterServiceFileDescriptorSupplier() {}
  }

  private static final class ClusterServiceMethodDescriptorSupplier
      extends ClusterServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ClusterServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (ClusterServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ClusterServiceFileDescriptorSupplier())
              .addMethod(getGetMethod())
              .addMethod(getListMethod())
              .addMethod(getCreateMethod())
              .addMethod(getUpdateMethod())
              .addMethod(getDeleteMethod())
              .addMethod(getStopMethod())
              .addMethod(getStartMethod())
              .addMethod(getListNodeGroupsMethod())
              .addMethod(getListOperationsMethod())
              .addMethod(getListNodesMethod())
              .build();
        }
      }
    }
    return result;
  }
}

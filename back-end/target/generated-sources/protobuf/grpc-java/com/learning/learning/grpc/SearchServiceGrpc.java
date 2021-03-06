package com.learning.learning.grpc;

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
    value = "by gRPC proto compiler (version 1.23.0)",
    comments = "Source: SearchService.proto")
public final class SearchServiceGrpc {

  private SearchServiceGrpc() {}

  public static final String SERVICE_NAME = "com.learning.learning.grpc.SearchService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.learning.learning.grpc.NewsRequest,
      com.learning.learning.grpc.NewsResponse> getSearchNewsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "searchNews",
      requestType = com.learning.learning.grpc.NewsRequest.class,
      responseType = com.learning.learning.grpc.NewsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.learning.learning.grpc.NewsRequest,
      com.learning.learning.grpc.NewsResponse> getSearchNewsMethod() {
    io.grpc.MethodDescriptor<com.learning.learning.grpc.NewsRequest, com.learning.learning.grpc.NewsResponse> getSearchNewsMethod;
    if ((getSearchNewsMethod = SearchServiceGrpc.getSearchNewsMethod) == null) {
      synchronized (SearchServiceGrpc.class) {
        if ((getSearchNewsMethod = SearchServiceGrpc.getSearchNewsMethod) == null) {
          SearchServiceGrpc.getSearchNewsMethod = getSearchNewsMethod =
              io.grpc.MethodDescriptor.<com.learning.learning.grpc.NewsRequest, com.learning.learning.grpc.NewsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "searchNews"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.learning.learning.grpc.NewsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.learning.learning.grpc.NewsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SearchServiceMethodDescriptorSupplier("searchNews"))
              .build();
        }
      }
    }
    return getSearchNewsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.learning.learning.grpc.GraphRequest,
      com.learning.learning.grpc.GraphResponse> getSearchGraphMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "searchGraph",
      requestType = com.learning.learning.grpc.GraphRequest.class,
      responseType = com.learning.learning.grpc.GraphResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.learning.learning.grpc.GraphRequest,
      com.learning.learning.grpc.GraphResponse> getSearchGraphMethod() {
    io.grpc.MethodDescriptor<com.learning.learning.grpc.GraphRequest, com.learning.learning.grpc.GraphResponse> getSearchGraphMethod;
    if ((getSearchGraphMethod = SearchServiceGrpc.getSearchGraphMethod) == null) {
      synchronized (SearchServiceGrpc.class) {
        if ((getSearchGraphMethod = SearchServiceGrpc.getSearchGraphMethod) == null) {
          SearchServiceGrpc.getSearchGraphMethod = getSearchGraphMethod =
              io.grpc.MethodDescriptor.<com.learning.learning.grpc.GraphRequest, com.learning.learning.grpc.GraphResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "searchGraph"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.learning.learning.grpc.GraphRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.learning.learning.grpc.GraphResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SearchServiceMethodDescriptorSupplier("searchGraph"))
              .build();
        }
      }
    }
    return getSearchGraphMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.learning.learning.grpc.WordCloudRequest,
      com.learning.learning.grpc.WordCloudResponse> getSearchWordCloudMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "searchWordCloud",
      requestType = com.learning.learning.grpc.WordCloudRequest.class,
      responseType = com.learning.learning.grpc.WordCloudResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.learning.learning.grpc.WordCloudRequest,
      com.learning.learning.grpc.WordCloudResponse> getSearchWordCloudMethod() {
    io.grpc.MethodDescriptor<com.learning.learning.grpc.WordCloudRequest, com.learning.learning.grpc.WordCloudResponse> getSearchWordCloudMethod;
    if ((getSearchWordCloudMethod = SearchServiceGrpc.getSearchWordCloudMethod) == null) {
      synchronized (SearchServiceGrpc.class) {
        if ((getSearchWordCloudMethod = SearchServiceGrpc.getSearchWordCloudMethod) == null) {
          SearchServiceGrpc.getSearchWordCloudMethod = getSearchWordCloudMethod =
              io.grpc.MethodDescriptor.<com.learning.learning.grpc.WordCloudRequest, com.learning.learning.grpc.WordCloudResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "searchWordCloud"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.learning.learning.grpc.WordCloudRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.learning.learning.grpc.WordCloudResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SearchServiceMethodDescriptorSupplier("searchWordCloud"))
              .build();
        }
      }
    }
    return getSearchWordCloudMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.learning.learning.grpc.CalenderRequest,
      com.learning.learning.grpc.CalenderResponse> getSearchCalenderMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "searchCalender",
      requestType = com.learning.learning.grpc.CalenderRequest.class,
      responseType = com.learning.learning.grpc.CalenderResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.learning.learning.grpc.CalenderRequest,
      com.learning.learning.grpc.CalenderResponse> getSearchCalenderMethod() {
    io.grpc.MethodDescriptor<com.learning.learning.grpc.CalenderRequest, com.learning.learning.grpc.CalenderResponse> getSearchCalenderMethod;
    if ((getSearchCalenderMethod = SearchServiceGrpc.getSearchCalenderMethod) == null) {
      synchronized (SearchServiceGrpc.class) {
        if ((getSearchCalenderMethod = SearchServiceGrpc.getSearchCalenderMethod) == null) {
          SearchServiceGrpc.getSearchCalenderMethod = getSearchCalenderMethod =
              io.grpc.MethodDescriptor.<com.learning.learning.grpc.CalenderRequest, com.learning.learning.grpc.CalenderResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "searchCalender"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.learning.learning.grpc.CalenderRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.learning.learning.grpc.CalenderResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SearchServiceMethodDescriptorSupplier("searchCalender"))
              .build();
        }
      }
    }
    return getSearchCalenderMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static SearchServiceStub newStub(io.grpc.Channel channel) {
    return new SearchServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static SearchServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new SearchServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static SearchServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new SearchServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class SearchServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void searchNews(com.learning.learning.grpc.NewsRequest request,
        io.grpc.stub.StreamObserver<com.learning.learning.grpc.NewsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSearchNewsMethod(), responseObserver);
    }

    /**
     */
    public void searchGraph(com.learning.learning.grpc.GraphRequest request,
        io.grpc.stub.StreamObserver<com.learning.learning.grpc.GraphResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSearchGraphMethod(), responseObserver);
    }

    /**
     */
    public void searchWordCloud(com.learning.learning.grpc.WordCloudRequest request,
        io.grpc.stub.StreamObserver<com.learning.learning.grpc.WordCloudResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSearchWordCloudMethod(), responseObserver);
    }

    /**
     */
    public void searchCalender(com.learning.learning.grpc.CalenderRequest request,
        io.grpc.stub.StreamObserver<com.learning.learning.grpc.CalenderResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSearchCalenderMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSearchNewsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.learning.learning.grpc.NewsRequest,
                com.learning.learning.grpc.NewsResponse>(
                  this, METHODID_SEARCH_NEWS)))
          .addMethod(
            getSearchGraphMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.learning.learning.grpc.GraphRequest,
                com.learning.learning.grpc.GraphResponse>(
                  this, METHODID_SEARCH_GRAPH)))
          .addMethod(
            getSearchWordCloudMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.learning.learning.grpc.WordCloudRequest,
                com.learning.learning.grpc.WordCloudResponse>(
                  this, METHODID_SEARCH_WORD_CLOUD)))
          .addMethod(
            getSearchCalenderMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.learning.learning.grpc.CalenderRequest,
                com.learning.learning.grpc.CalenderResponse>(
                  this, METHODID_SEARCH_CALENDER)))
          .build();
    }
  }

  /**
   */
  public static final class SearchServiceStub extends io.grpc.stub.AbstractStub<SearchServiceStub> {
    private SearchServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SearchServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SearchServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SearchServiceStub(channel, callOptions);
    }

    /**
     */
    public void searchNews(com.learning.learning.grpc.NewsRequest request,
        io.grpc.stub.StreamObserver<com.learning.learning.grpc.NewsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSearchNewsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void searchGraph(com.learning.learning.grpc.GraphRequest request,
        io.grpc.stub.StreamObserver<com.learning.learning.grpc.GraphResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSearchGraphMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void searchWordCloud(com.learning.learning.grpc.WordCloudRequest request,
        io.grpc.stub.StreamObserver<com.learning.learning.grpc.WordCloudResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSearchWordCloudMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void searchCalender(com.learning.learning.grpc.CalenderRequest request,
        io.grpc.stub.StreamObserver<com.learning.learning.grpc.CalenderResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSearchCalenderMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class SearchServiceBlockingStub extends io.grpc.stub.AbstractStub<SearchServiceBlockingStub> {
    private SearchServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SearchServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SearchServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SearchServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.learning.learning.grpc.NewsResponse searchNews(com.learning.learning.grpc.NewsRequest request) {
      return blockingUnaryCall(
          getChannel(), getSearchNewsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.learning.learning.grpc.GraphResponse searchGraph(com.learning.learning.grpc.GraphRequest request) {
      return blockingUnaryCall(
          getChannel(), getSearchGraphMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.learning.learning.grpc.WordCloudResponse searchWordCloud(com.learning.learning.grpc.WordCloudRequest request) {
      return blockingUnaryCall(
          getChannel(), getSearchWordCloudMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.learning.learning.grpc.CalenderResponse searchCalender(com.learning.learning.grpc.CalenderRequest request) {
      return blockingUnaryCall(
          getChannel(), getSearchCalenderMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class SearchServiceFutureStub extends io.grpc.stub.AbstractStub<SearchServiceFutureStub> {
    private SearchServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SearchServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SearchServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SearchServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.learning.learning.grpc.NewsResponse> searchNews(
        com.learning.learning.grpc.NewsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSearchNewsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.learning.learning.grpc.GraphResponse> searchGraph(
        com.learning.learning.grpc.GraphRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSearchGraphMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.learning.learning.grpc.WordCloudResponse> searchWordCloud(
        com.learning.learning.grpc.WordCloudRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSearchWordCloudMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.learning.learning.grpc.CalenderResponse> searchCalender(
        com.learning.learning.grpc.CalenderRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSearchCalenderMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SEARCH_NEWS = 0;
  private static final int METHODID_SEARCH_GRAPH = 1;
  private static final int METHODID_SEARCH_WORD_CLOUD = 2;
  private static final int METHODID_SEARCH_CALENDER = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final SearchServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(SearchServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SEARCH_NEWS:
          serviceImpl.searchNews((com.learning.learning.grpc.NewsRequest) request,
              (io.grpc.stub.StreamObserver<com.learning.learning.grpc.NewsResponse>) responseObserver);
          break;
        case METHODID_SEARCH_GRAPH:
          serviceImpl.searchGraph((com.learning.learning.grpc.GraphRequest) request,
              (io.grpc.stub.StreamObserver<com.learning.learning.grpc.GraphResponse>) responseObserver);
          break;
        case METHODID_SEARCH_WORD_CLOUD:
          serviceImpl.searchWordCloud((com.learning.learning.grpc.WordCloudRequest) request,
              (io.grpc.stub.StreamObserver<com.learning.learning.grpc.WordCloudResponse>) responseObserver);
          break;
        case METHODID_SEARCH_CALENDER:
          serviceImpl.searchCalender((com.learning.learning.grpc.CalenderRequest) request,
              (io.grpc.stub.StreamObserver<com.learning.learning.grpc.CalenderResponse>) responseObserver);
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

  private static abstract class SearchServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    SearchServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.learning.learning.grpc.SearchServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("SearchService");
    }
  }

  private static final class SearchServiceFileDescriptorSupplier
      extends SearchServiceBaseDescriptorSupplier {
    SearchServiceFileDescriptorSupplier() {}
  }

  private static final class SearchServiceMethodDescriptorSupplier
      extends SearchServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    SearchServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (SearchServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new SearchServiceFileDescriptorSupplier())
              .addMethod(getSearchNewsMethod())
              .addMethod(getSearchGraphMethod())
              .addMethod(getSearchWordCloudMethod())
              .addMethod(getSearchCalenderMethod())
              .build();
        }
      }
    }
    return result;
  }
}

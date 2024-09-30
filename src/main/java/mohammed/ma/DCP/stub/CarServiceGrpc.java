package mohammed.ma.DCP.stub;

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
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: CarSchema.proto")
public final class CarServiceGrpc {

  private CarServiceGrpc() {}

  public static final String SERVICE_NAME = "CarService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<mohammed.ma.DCP.stub.CarSchema.GetAllCars,
      mohammed.ma.DCP.stub.CarSchema.CarsResponse> getAllCarsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "allCars",
      requestType = mohammed.ma.DCP.stub.CarSchema.GetAllCars.class,
      responseType = mohammed.ma.DCP.stub.CarSchema.CarsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<mohammed.ma.DCP.stub.CarSchema.GetAllCars,
      mohammed.ma.DCP.stub.CarSchema.CarsResponse> getAllCarsMethod() {
    io.grpc.MethodDescriptor<mohammed.ma.DCP.stub.CarSchema.GetAllCars, mohammed.ma.DCP.stub.CarSchema.CarsResponse> getAllCarsMethod;
    if ((getAllCarsMethod = CarServiceGrpc.getAllCarsMethod) == null) {
      synchronized (CarServiceGrpc.class) {
        if ((getAllCarsMethod = CarServiceGrpc.getAllCarsMethod) == null) {
          CarServiceGrpc.getAllCarsMethod = getAllCarsMethod = 
              io.grpc.MethodDescriptor.<mohammed.ma.DCP.stub.CarSchema.GetAllCars, mohammed.ma.DCP.stub.CarSchema.CarsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "CarService", "allCars"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mohammed.ma.DCP.stub.CarSchema.GetAllCars.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mohammed.ma.DCP.stub.CarSchema.CarsResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new CarServiceMethodDescriptorSupplier("allCars"))
                  .build();
          }
        }
     }
     return getAllCarsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<mohammed.ma.DCP.stub.CarSchema.CarByIdReq,
      mohammed.ma.DCP.stub.CarSchema.Car> getCarByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "carById",
      requestType = mohammed.ma.DCP.stub.CarSchema.CarByIdReq.class,
      responseType = mohammed.ma.DCP.stub.CarSchema.Car.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<mohammed.ma.DCP.stub.CarSchema.CarByIdReq,
      mohammed.ma.DCP.stub.CarSchema.Car> getCarByIdMethod() {
    io.grpc.MethodDescriptor<mohammed.ma.DCP.stub.CarSchema.CarByIdReq, mohammed.ma.DCP.stub.CarSchema.Car> getCarByIdMethod;
    if ((getCarByIdMethod = CarServiceGrpc.getCarByIdMethod) == null) {
      synchronized (CarServiceGrpc.class) {
        if ((getCarByIdMethod = CarServiceGrpc.getCarByIdMethod) == null) {
          CarServiceGrpc.getCarByIdMethod = getCarByIdMethod = 
              io.grpc.MethodDescriptor.<mohammed.ma.DCP.stub.CarSchema.CarByIdReq, mohammed.ma.DCP.stub.CarSchema.Car>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "CarService", "carById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mohammed.ma.DCP.stub.CarSchema.CarByIdReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mohammed.ma.DCP.stub.CarSchema.Car.getDefaultInstance()))
                  .setSchemaDescriptor(new CarServiceMethodDescriptorSupplier("carById"))
                  .build();
          }
        }
     }
     return getCarByIdMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static CarServiceStub newStub(io.grpc.Channel channel) {
    return new CarServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static CarServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new CarServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static CarServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new CarServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class CarServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void allCars(mohammed.ma.DCP.stub.CarSchema.GetAllCars request,
        io.grpc.stub.StreamObserver<mohammed.ma.DCP.stub.CarSchema.CarsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getAllCarsMethod(), responseObserver);
    }

    /**
     */
    public void carById(mohammed.ma.DCP.stub.CarSchema.CarByIdReq request,
        io.grpc.stub.StreamObserver<mohammed.ma.DCP.stub.CarSchema.Car> responseObserver) {
      asyncUnimplementedUnaryCall(getCarByIdMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getAllCarsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                mohammed.ma.DCP.stub.CarSchema.GetAllCars,
                mohammed.ma.DCP.stub.CarSchema.CarsResponse>(
                  this, METHODID_ALL_CARS)))
          .addMethod(
            getCarByIdMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                mohammed.ma.DCP.stub.CarSchema.CarByIdReq,
                mohammed.ma.DCP.stub.CarSchema.Car>(
                  this, METHODID_CAR_BY_ID)))
          .build();
    }
  }

  /**
   */
  public static final class CarServiceStub extends io.grpc.stub.AbstractStub<CarServiceStub> {
    private CarServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CarServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CarServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CarServiceStub(channel, callOptions);
    }

    /**
     */
    public void allCars(mohammed.ma.DCP.stub.CarSchema.GetAllCars request,
        io.grpc.stub.StreamObserver<mohammed.ma.DCP.stub.CarSchema.CarsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAllCarsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void carById(mohammed.ma.DCP.stub.CarSchema.CarByIdReq request,
        io.grpc.stub.StreamObserver<mohammed.ma.DCP.stub.CarSchema.Car> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCarByIdMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class CarServiceBlockingStub extends io.grpc.stub.AbstractStub<CarServiceBlockingStub> {
    private CarServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CarServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CarServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CarServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public mohammed.ma.DCP.stub.CarSchema.CarsResponse allCars(mohammed.ma.DCP.stub.CarSchema.GetAllCars request) {
      return blockingUnaryCall(
          getChannel(), getAllCarsMethod(), getCallOptions(), request);
    }

    /**
     */
    public mohammed.ma.DCP.stub.CarSchema.Car carById(mohammed.ma.DCP.stub.CarSchema.CarByIdReq request) {
      return blockingUnaryCall(
          getChannel(), getCarByIdMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class CarServiceFutureStub extends io.grpc.stub.AbstractStub<CarServiceFutureStub> {
    private CarServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CarServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CarServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CarServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<mohammed.ma.DCP.stub.CarSchema.CarsResponse> allCars(
        mohammed.ma.DCP.stub.CarSchema.GetAllCars request) {
      return futureUnaryCall(
          getChannel().newCall(getAllCarsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<mohammed.ma.DCP.stub.CarSchema.Car> carById(
        mohammed.ma.DCP.stub.CarSchema.CarByIdReq request) {
      return futureUnaryCall(
          getChannel().newCall(getCarByIdMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_ALL_CARS = 0;
  private static final int METHODID_CAR_BY_ID = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final CarServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(CarServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_ALL_CARS:
          serviceImpl.allCars((mohammed.ma.DCP.stub.CarSchema.GetAllCars) request,
              (io.grpc.stub.StreamObserver<mohammed.ma.DCP.stub.CarSchema.CarsResponse>) responseObserver);
          break;
        case METHODID_CAR_BY_ID:
          serviceImpl.carById((mohammed.ma.DCP.stub.CarSchema.CarByIdReq) request,
              (io.grpc.stub.StreamObserver<mohammed.ma.DCP.stub.CarSchema.Car>) responseObserver);
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

  private static abstract class CarServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    CarServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return mohammed.ma.DCP.stub.CarSchema.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("CarService");
    }
  }

  private static final class CarServiceFileDescriptorSupplier
      extends CarServiceBaseDescriptorSupplier {
    CarServiceFileDescriptorSupplier() {}
  }

  private static final class CarServiceMethodDescriptorSupplier
      extends CarServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    CarServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (CarServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new CarServiceFileDescriptorSupplier())
              .addMethod(getAllCarsMethod())
              .addMethod(getCarByIdMethod())
              .build();
        }
      }
    }
    return result;
  }
}

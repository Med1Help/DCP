package mohammed.ma.DCP.services;

import io.grpc.stub.StreamObserver;
import mohammed.ma.DCP.dtos.mappers.CarMapper;
import mohammed.ma.DCP.entities.Car;
import mohammed.ma.DCP.repositories.CarRepo;
import mohammed.ma.DCP.stub.CarSchema;
import mohammed.ma.DCP.stub.CarServiceGrpc;

import java.util.List;

@net.devh.boot.grpc.server.service.GrpcService
public class GrpcService extends CarServiceGrpc.CarServiceImplBase {
    private final CarRepo carRepo;
    private final CarMapper carMapper;

    public GrpcService(CarRepo carRepo, CarMapper carMapper) {
        this.carRepo = carRepo;
        this.carMapper = carMapper;
    }

    @Override
    public void carById(CarSchema.CarByIdReq request, StreamObserver<CarSchema.Car> responseObserver) {
        Car car = this.carRepo.findById(request.getCarId()).orElse(null);
        CarSchema.Car carResponse = this.carMapper.carToCarResponse(car);
        responseObserver.onNext(carResponse);
        responseObserver.onCompleted();

    }

    @Override
    public void allCars(CarSchema.GetAllCars request, StreamObserver<CarSchema.CarsResponse> responseObserver) {
        List<Car> cars = this.carRepo.findAll();
        List<CarSchema.Car> carsGrpc = this.carMapper.carsToCarsResponse(cars);
        CarSchema.CarsResponse carsResponse = CarSchema.CarsResponse.newBuilder()
                .addAllCars(carsGrpc)
                        .build();
        responseObserver.onNext(carsResponse);
        responseObserver.onCompleted();
    }
}

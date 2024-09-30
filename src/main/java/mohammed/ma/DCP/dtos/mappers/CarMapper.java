package mohammed.ma.DCP.dtos.mappers;

import mohammed.ma.DCP.dtos.CarDto;
import mohammed.ma.DCP.entities.Car;
import mohammed.ma.DCP.stub.CarSchema;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface CarMapper {
    Car carDtoToCar(CarDto carDto);

    List<CarSchema.Car> carsToCarsResponse(List<Car> cars);

    CarSchema.Car carToCarResponse(Car car);
}

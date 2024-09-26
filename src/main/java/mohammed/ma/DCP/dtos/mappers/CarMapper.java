package mohammed.ma.DCP.dtos.mappers;

import mohammed.ma.DCP.dtos.CarDto;
import mohammed.ma.DCP.entities.Car;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface CarMapper {
    Car carDtoToCar(CarDto carDto);
}

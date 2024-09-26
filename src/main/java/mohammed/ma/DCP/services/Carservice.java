package mohammed.ma.DCP.services;

import mohammed.ma.DCP.dtos.CarDto;
import mohammed.ma.DCP.dtos.mappers.CarMapper;
import mohammed.ma.DCP.entities.Car;
import mohammed.ma.DCP.repositories.CarRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Carservice {
    private final CarRepo carRepo;
    private final CarMapper carMapper;

    public Carservice(CarRepo carRepo, CarMapper carMapper) {
        this.carRepo = carRepo;
        this.carMapper = carMapper;
    }

    public List<Car> carList() {
        return this.carRepo.findAll();
    }

    public Car car(long id) {
        return this.carRepo.findById(id).orElse(null);
    }

    public boolean add(CarDto carDto) {
        Car savedCar = this.carRepo.save(this.carMapper.carDtoToCar(carDto));
        return savedCar.getId() != null;
    }
}

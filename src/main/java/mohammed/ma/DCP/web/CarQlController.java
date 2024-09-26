package mohammed.ma.DCP.web;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import mohammed.ma.DCP.dtos.CarDto;
import mohammed.ma.DCP.entities.Car;
import mohammed.ma.DCP.services.Carservice;
import org.springframework.data.jpa.repository.Query;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class CarQlController {
    private final Carservice carservice;

    public CarQlController(Carservice carservice) {
        this.carservice = carservice;
    }

    @QueryMapping
    public List<Car> allCars(){
        return this.carservice.carList();
    }
    @QueryMapping
    public Car carById(@Argument long id){
        Car car = this.carservice.car(id);
        if(car == null) throw new RuntimeException("No car Found for id:" + id);
        return car;
    }
    @MutationMapping
    public boolean addCar(@Argument CarDto car){
        return this.carservice.add(car);
    }
}

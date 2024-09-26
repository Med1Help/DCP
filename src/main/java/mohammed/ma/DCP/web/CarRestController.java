package mohammed.ma.DCP.web;

import mohammed.ma.DCP.dtos.CarDto;
import mohammed.ma.DCP.entities.Car;
import mohammed.ma.DCP.services.Carservice;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CarRestController {
    private final Carservice carservice;

    public CarRestController(Carservice carservice) {
        this.carservice = carservice;
    }
    @GetMapping("/cars")
    public ResponseEntity<Object> carList(){
        List<Car> cars = this.carservice.carList();
        if(cars.isEmpty()) return new ResponseEntity<>("No Car found", HttpStatus.NO_CONTENT);
        return new ResponseEntity<>(cars,HttpStatus.OK);
    }
    @GetMapping("/car")
    public ResponseEntity<Object> carList(@RequestParam long id){
        Car car = this.carservice.car(id);
        if(car == null) return new ResponseEntity<>("No Car found", HttpStatus.NO_CONTENT);
        return new ResponseEntity<>(car,HttpStatus.OK);
    }
    @PostMapping("/car")
    public ResponseEntity<Object> addCar(@RequestBody CarDto car){
        boolean added = this.carservice.add(car);
        if(added) return new ResponseEntity<>("succesfully added",HttpStatus.CREATED);
        return new ResponseEntity<>("error",HttpStatus.CONFLICT);
    }
}

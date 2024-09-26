package mohammed.ma.DCP.repositories;

import mohammed.ma.DCP.entities.Car;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRepo extends JpaRepository<Car,Long> {

}

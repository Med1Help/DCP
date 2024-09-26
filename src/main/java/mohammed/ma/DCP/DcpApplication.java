package mohammed.ma.DCP;

import mohammed.ma.DCP.entities.Car;
import mohammed.ma.DCP.repositories.CarRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;

@SpringBootApplication
public class DcpApplication {

	public static void main(String[] args) {
		SpringApplication.run(DcpApplication.class, args);
	}
	@Bean
	CommandLineRunner start(CarRepo carRepo){
		return args -> {
			carRepo.save(Car.builder().name("C220").color("red").brand("mercedes").width(2f).length(4f).fuelCap(500.0).regNumber("1234ا44").yearModel(new Date(1)).location("agadir").build());
			carRepo.save(Car.builder().name("CLA").color("black").brand("mercedes").width(2f).length(3f).fuelCap(400.0).regNumber("1255ا44").yearModel(new Date(1)).location("casa").build());
			carRepo.save(Car.builder().name("G7").color("white").brand("volswagen").width(1.5f).length(4f).fuelCap(430.0).regNumber("1034ا44").yearModel(new Date(1)).location("taghazout").build());
		};
	}
}

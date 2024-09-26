package mohammed.ma.DCP.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class CarDto {
    private String name;
    private String brand;
    private String color;
    private Double fuelCap;
    private String regNumber;
    private Date yearModel;
    private float length;
    private float width;
    private String location;
}

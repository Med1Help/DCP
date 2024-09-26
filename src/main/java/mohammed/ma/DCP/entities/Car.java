package mohammed.ma.DCP.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Car extends BaseEntity {

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

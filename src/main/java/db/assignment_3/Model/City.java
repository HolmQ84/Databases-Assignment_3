package db.assignment_3.Model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.List;

@Data
@Document(collection = "cities")
public class City {
    @Id
    private String id;
    private String city;
    @Field("loc")
    private List<Float> latitude;
    @Field("pop")
    private int population;
    private String state;
}

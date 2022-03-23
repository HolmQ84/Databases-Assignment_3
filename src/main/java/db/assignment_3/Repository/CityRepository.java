package db.assignment_3.Repository;

import com.google.gson.JsonArray;
import db.assignment_3.Model.City;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CityRepository extends MongoRepository<City, String> {

}

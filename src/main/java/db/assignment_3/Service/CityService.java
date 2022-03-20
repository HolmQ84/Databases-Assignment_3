package db.assignment_3.Service;

import db.assignment_3.Model.City;

import java.util.List;
import java.util.Optional;

public interface CityService {
    List<City> getCities();
    Optional<City> getCityById(String  id);
    City createCity(City city);
    String updateCity(City city);
    void deleteCity(String reviewId);
    List<City> generateCities(int count);
}

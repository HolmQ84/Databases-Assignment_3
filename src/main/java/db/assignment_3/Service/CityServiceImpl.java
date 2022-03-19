package db.assignment_3.Service;

import db.assignment_3.Model.City;
import db.assignment_3.Repository.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CityServiceImpl implements CityService {

    @Autowired
    private CityRepository repo;

    @Override
    public List<City> getCities() {
        return this.repo.findAll();
    }

    @Override
    public Optional<City> getCityById(String id) {
        Optional<City> city = this.repo.findById(id);
        System.out.println(city);
        return city;
    }

    @Override
    public String createCity(City city) {
        return this.repo.save(city).getId();
    }

    @Override
    public String updateCity(City city) {
        Optional<City> updateReview = this.repo.findById(city.getId());
        if (updateReview.isPresent()) {
            City current = updateReview.get();
            current.setCity(city.getCity());
            current.setLatitude(city.getLatitude());
            current.setPopulation(city.getPopulation());
            current.setState(city.getState());
            return this.repo.save(current).getId();
        }
        return null;
    }

    @Override
    public void deleteCity(String reviewId) {
        this.repo.deleteById(reviewId);
    }
}

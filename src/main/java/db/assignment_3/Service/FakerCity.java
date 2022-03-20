package db.assignment_3.Service;

import com.github.javafaker.Faker;
import db.assignment_3.Model.City;

import java.util.ArrayList;
import java.util.Arrays;

public class FakerCity {

    public City createCity() {
        Faker faker = new Faker();
        City city = new City();
        city.setCity(faker.address().cityName());
        city.setLatitude(new ArrayList<>(Arrays.asList(
                faker.random().nextDouble() + faker.random().nextInt(-30, 30),
                faker.random().nextDouble() + faker.random().nextInt(-30, 30)
        )));
        city.setPopulation(faker.random().nextInt(1000, 5000000));
        city.setState(faker.address().state());
        return city;
    }
}

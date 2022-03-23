package db.assignment_3.Controller;

import com.google.gson.JsonArray;
import db.assignment_3.Model.City;
import db.assignment_3.Repository.TweetRepository;
import db.assignment_3.Service.CityService;
import db.assignment_3.Service.TweetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RequestMapping("/cities")
@RestController
public class CityController {

    @Autowired
    CityService cityService;

    @Autowired
    TweetService tweetService;

    @GetMapping("/")
    public ModelAndView getAllCities() {
        ModelAndView modelAndView = new ModelAndView("cities");
        List<City> cities = cityService.getCities();
        modelAndView.addObject("cities", cities);
        return modelAndView;
    }

    @GetMapping("/{id}")
    public ModelAndView getCityById(@PathVariable String id) {
        ModelAndView modelAndView = new ModelAndView("city");
        Optional<City> city = cityService.getCityById(id);
        city.ifPresent(value -> modelAndView.addObject("city", value));
        return modelAndView;
    }

    @PostMapping("/")
    public City createCity(@RequestBody City city) {
        return cityService.createCity(city);
    }

    @PostMapping("/generateCities/{count}")
    public List<City> generateCities(@PathVariable int count) {
        return cityService.generateCities(count);
    }

    @GetMapping("/top10cities")
    public List<City> top10cities() {
        List<City> cities = cityService.getCities();
        return cities.subList(0,10);
    }

    @GetMapping("/top10")
    public List<JsonArray> top10tweets() {
        return tweetService.top10tweets();
    }
}

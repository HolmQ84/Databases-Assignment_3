package db.assignment_3.Controller;

import db.assignment_3.Model.City;
import db.assignment_3.Service.CityService;
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
}

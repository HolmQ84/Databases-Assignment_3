package db.assignment_3;

import db.assignment_3.Service.FakerCity;

public class Tester {

    public static void main(String[] args) {
        FakerCity fakerCity = new FakerCity();
        System.out.println(fakerCity.createCity());
    }
}

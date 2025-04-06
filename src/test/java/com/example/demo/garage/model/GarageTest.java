package com.example.demo.garage.model;

import java.util.List;

import org.junit.jupiter.api.Test;

public class GarageTest {
    @Test
    void addVehicle() {
        Garage garage = new Garage();
        Car car = new Car("car");
        garage.add(car);
        List<Vehicle> cars =  garage.getVehicles();
        int size = cars.size();
        System.out.println(">>>>>>>>>>>>>>>>>"+size);
    }
}

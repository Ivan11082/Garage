package com.example.demo.garage.model;

import java.util.*;
import org.springframework.stereotype.Component;

@Component
public class Garage {
    private List<Vehicle> cars = new ArrayList<>();

    public void add(Vehicle v) {
        cars.add(v);
    }

    public List<Vehicle> getVehicles() {
        return cars;
    }
}

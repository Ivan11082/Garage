package com.example.demo.garage;

import java.util.*;
import org.springframework.stereotype.Component;

@Component
public class Garage {
    private List<Vehicle> cars = new ArrayList<>();

    void add(Vehicle v) {
        cars.add(v);
    }

    List<Vehicle> getVehicles() {
        return cars;
    }
}

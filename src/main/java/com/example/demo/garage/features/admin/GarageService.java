/*
 * (c) 2024 Mobile TeleSystems PJSC, Russia
 * All Rights Reserved.
 * <p>
 * NOTICE: All information contained herein is, and remains
 * the property of Mobile TeleSystems PJSC ("MTS" - NYSE:MBT; MOEX:MTSS)
 * and its suppliers, if any. The intellectual and technical concepts
 * contained herein are proprietary to Mobile TeleSystems PJSC
 * and its suppliers, and are protected by trade secret or copyright law.
 * Dissemination of this information or reproduction of this material
 * is strictly forbidden unless prior written permission is obtained
 * from Mobile TeleSystems PJSC.
 */
package com.example.demo.garage.features.admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.util.List;
import com.example.demo.garage.model.Car;
import com.example.demo.garage.model.Garage;
import com.example.demo.garage.model.Vehicle;

/**
 * @author Alex
 * @since 09/03/2025
 */
@Component
public class GarageService {

    // fields
    @Autowired
    Garage garage;
    // method
    public void addCar(String name){
        Car vehicle = new Car(name);
        garage.add(vehicle);
    }
    public int numberOfCars(){   
     return garage.getVehicles().size();
    }

    public List<Vehicle> getVehicles() {
        return garage.getVehicles();
    }
}

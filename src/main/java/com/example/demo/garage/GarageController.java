package com.example.demo.garage;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;

@RestController
public class GarageController {

    @Autowired
    GarageService garageService;

    @GetMapping("/add")
    public String add(@RequestParam(value = "name", defaultValue = "World") String name) {
        // добавить машину с названием name в гараж
        garageService.addCar(name);
        return String.format("Добавлена машина %s!", name);
    }       
    
    @GetMapping("/list")
    public String list() {
        // выдать число машин в гараже
        String result = "В гараже "+garageService.numberOfCars()+" машин";
        // <li>111<li>2222 
        List<Vehicle> listVehicles = garageService.getVehicles();  
        String list = listVehicles.stream().map(v -> "<li> "+v.name()).collect(Collectors.joining(""));
;
        return result + list;
    }

    
    
    
    
    
    
    

}

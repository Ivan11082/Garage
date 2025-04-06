package com.example.demo.garage.features.admin;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class GarageControllerTest {

    @Autowired
    GarageController garageController;

    @Test
    void testList() {
       garageController.add("Lada"); 
       garageController.add("Audi"); 
        String result = garageController.list();
        System.out.println(result);

    }
}

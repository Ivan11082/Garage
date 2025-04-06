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
package com.example.demo.garage.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.ZonedDateTime;

/**
 * @author Alex
 * @since 10/03/2025
 */
public class VehicleTest {
    @Test
    void testVehicle() {
        String expected = "Lada";
        Vehicle car = new Car(expected);
        String actual = car.name();
        assertEquals(expected, actual);
        Vehicle bike = new Bike(expected);
        car.signal();
        bike.signal();
    }

    @Test
    void testDate() {
        Vehicle car = new Car("Lada");
        car.setRentDate(ZonedDateTime.now());
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>.." + car.getRentDate());
        car.setReleaseDate(ZonedDateTime.now());
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>.." + car.getReleaseDate());
    }
}

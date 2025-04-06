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

/**
 * @author Alex
 * @since 16/03/2025
 */
public class Car extends Vehicle {

    public Car(String n) {
        super(n);
    }
    public void signal() {
        System.out.println("BI, BI");
    }
}

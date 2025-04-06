package com.example.demo.garage.model;

import java.time.ZonedDateTime;

abstract public class Vehicle {
    private final String name;
    private ZonedDateTime rentDate;
    private ZonedDateTime releaseDate;

    // constructor
    public Vehicle(String n) {
        name = n;
    }

    // method get name
    public String name() {
        return name;
    }

    abstract public void signal();

    public void setRentDate(ZonedDateTime rentDate) {
        this.rentDate = rentDate;
    }

    public ZonedDateTime getRentDate() {
        return this.rentDate;
    }

    public void  setReleaseDate (ZonedDateTime releaseDate){
    this.releaseDate = releaseDate;

    }

    public ZonedDateTime getReleaseDate() {
        return this.releaseDate;
    }

}

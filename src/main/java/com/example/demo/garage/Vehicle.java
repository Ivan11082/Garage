package com.example.demo.garage;

import java.time.ZonedDateTime;

abstract public class Vehicle {
    private final String name;
    private ZonedDateTime date;

    //constructor
    public Vehicle(String n) {
        name = n;
    }

    //method get name
    public String name() {
        return name;
    }
    abstract public void signal();


    public void setDate(ZonedDateTime date){
        this.date = date;
    }

    public ZonedDateTime getDate(){
        return this.date;
    }
}

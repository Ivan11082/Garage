package com.example.demo.garage;

abstract public class Vehicle {
    private final String name;

    //constructor
    public Vehicle(String n) {
        name = n;
    }

    //method get name
    public String name() {
        return name;
    }
    abstract public void signal();
}

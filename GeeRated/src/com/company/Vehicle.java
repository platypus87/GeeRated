package com.company;

public class Vehicle {

    int year, tires;
    String color,  make = "none", model = "none";

    public Vehicle(){

    }
    public Vehicle(int year, String color, String make, String model){
        this.year = year;
        this.color = color;
        this.make = make;
        this.model = model;
    }
}

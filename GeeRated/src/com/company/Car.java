package com.company;

public class Car extends Vehicle {

    public int year;
    public String model, make, color;
    public int tires = 4;

    public Car(){

    }

    public Car(int year, String color, String make, String model){
        this.year = year;
        this.color = color;
        this.make = make;
        this.model = model;
    }

    public void setTires(int x){
        this.tires = x;
    }

    public int getTires(){
        return this.tires;
    }

    @Override
    public String toString(){
        String retval = "Year: "+this.year+" Make: "+this.make+" Model: "+this.model;
        return retval;
    }


}






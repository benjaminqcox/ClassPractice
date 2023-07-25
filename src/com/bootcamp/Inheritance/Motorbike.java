package com.bootcamp.Inheritance;

public class Motorbike extends Vehicle {
    boolean hasSideCar;

    public Motorbike(String make, String model, int year, int maxSpeed, int numPreviousOwners, boolean hasSideCar) {
        super(make, model, year, maxSpeed, numPreviousOwners, 2);
        this.hasSideCar = hasSideCar;
    }
   
    @Override
    public double getBill() {
        return this.getYear() * 0.1;
    }
}
package com.bootcamp.Inheritance;

public class Van extends Vehicle {

    int loadCapacity; // in kg

    public Van(String make, String model, int year, int maxSpeed, int numPreviousOwners, int numWheels, int loadCapacity) {
        super(make, model, year, maxSpeed, numPreviousOwners, numWheels);
        this.loadCapacity = loadCapacity;
    }

    public double getBill() {
        return this.getMaxSpeed() * this.getNumWheels();
    }
}

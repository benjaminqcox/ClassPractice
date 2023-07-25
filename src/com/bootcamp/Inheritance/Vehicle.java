package com.bootcamp.Inheritance;

import java.util.Random;

public class Vehicle {
    private int numWheels;
    private int maxSpeed;
    private int year;
    private int numPreviousOwners;
    private int id;

    private String make;
    private String model;

    public Vehicle(String make, String model, int year, int maxSpeed, int numPreviousOwners, int numWheels) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.maxSpeed = maxSpeed;
        this.numPreviousOwners = numPreviousOwners;
        this.numWheels = numWheels;
        Random rand = new Random();
        this.id = rand.nextInt(1000);
    }
    
    public int getId(){
        return this.id;
    }

    public double getBill() {
        return 0.02;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setNumWheels(int numWheels) {
        this.numWheels = numWheels;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
    
    public void setNumPreviousOwners(int numPreviousOwners) {
        this.numPreviousOwners = numPreviousOwners;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public int getNumWheels() {
        return numWheels;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public int getNumPreviousOwners() {
        return numPreviousOwners;
    }

    @Override
    public String toString() {
        return make + " " + model + " has had " + numPreviousOwners + " previous owners. This vehicle has: " 
        + numWheels + " wheels and its top speed in mph is: " + maxSpeed ;
    }
}

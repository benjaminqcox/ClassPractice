package com.bootcamp.Inheritance;

public class Car extends Vehicle implements Fly {
    private boolean hasSunRoof;

    public Car(String make, String model, int year, int maxSpeed, int numPreviousOwners, int numWheels, boolean hasSunRoof) {
        super(make, model, year, maxSpeed, numPreviousOwners, numWheels);
        setHasSunRoof(hasSunRoof);
    }

    public double getBill() {
        return (this.getNumPreviousOwners() + 2) * (this.getHasSunRoof() ? 2 : 3) * this.getMaxSpeed();
    }

    public void setHasSunRoof(boolean hasSunRoof) {
        this.hasSunRoof = hasSunRoof;
    }

    public boolean getHasSunRoof() {
        return hasSunRoof;
    }

    public void fly() {
        System.out.println("My fly mode seems to be broken :(");
    }

    @Override
    public String toString() {
        return super.toString() + " This car does not have a sunroof.";
    }
}

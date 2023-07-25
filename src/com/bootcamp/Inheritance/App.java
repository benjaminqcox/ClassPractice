package com.bootcamp.Inheritance;

public class App {
    public static void main(String[] args) {
        Car car1 = new Car("Ford", "Focus", 2008, 120, 3, 4, false);
        Motorbike motorbike1 = new Motorbike("BMW", "R 1250 RS", 2023, 142, 0, false);
        Van van1 = new Van("Ford", "Transit", 2018, 4, 110, 1, 900);
        Garage garage = new Garage(car1, motorbike1);
        garage.addVehicle(van1);
        garage.removeVehicle(motorbike1.getId());

        System.out.println(garage);
    }
    
}

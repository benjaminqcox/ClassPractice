package com.bootcamp.Inheritance;

public class VehicleNotFoundException extends Exception {
    
    VehicleNotFoundException() {

    }

    VehicleNotFoundException(String message) {
        System.out.println(message);
    }
}

package com.bootcamp.Inheritance;

import java.util.ArrayList;
import java.util.List;

public class Garage {
    private List<Vehicle> myAwesomeCollection = new ArrayList<>();

    public Garage(Vehicle... myVehicles) {
        for (Vehicle v : myVehicles) {
            myAwesomeCollection.add(v);
        }
    }
    
    public int getTotalBill() {
        int totalBill = 0;
        for (Vehicle v : myAwesomeCollection) {
            totalBill += v.getBill();
        }
        
        return totalBill;
    }

    public void addVehicle(Vehicle v) {
        myAwesomeCollection.add(v);
    }

    public void removeVehicle(int id) {
        for (Vehicle v : myAwesomeCollection) {
            if (v.getId() == id) {
                myAwesomeCollection.remove(v);
                return;
            }
        }
    }

    @Override
    public String toString() {
        String output = "Your garage contains: ";
        for (Vehicle v : myAwesomeCollection) {
            output += v.getMake() + " " + v.getModel() + "\n";
        }
        return output;
    }
}

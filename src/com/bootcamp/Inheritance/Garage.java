package com.bootcamp.Inheritance;

import java.util.*;

public class Garage {
    private List<Vehicle> myAwesomeCollection = new ArrayList<>();

    public Garage(Vehicle... myVehicles) {
        Arrays.sort(myVehicles);
        for (Vehicle v : myVehicles) {
            myAwesomeCollection.add(v);
        }
        Collections.sort(myAwesomeCollection);
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
        Collections.sort(myAwesomeCollection);
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
        String output = "Your garage contains: \n";
        for (Vehicle v : myAwesomeCollection) {
            output += v.getMake() + " " + v.getModel() + " " + v.getYear() + "\n";
        }
        return output;
    }
}

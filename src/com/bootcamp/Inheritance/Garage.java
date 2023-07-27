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

    public Vehicle findById(int id) throws VehicleNotFoundException {
        for (Vehicle v : myAwesomeCollection) {
            if (v.getId() == id) {
                return v;
            }
        }
        throw new VehicleNotFoundException("No vehicle found with that ID.");
    }

    public boolean addVehicle(Vehicle v) {
        boolean isSuccessful = myAwesomeCollection.add(v);
        Collections.sort(myAwesomeCollection);
        return isSuccessful;
    }

    public boolean removeVehicle(int id) throws VehicleNotFoundException {
        for (Vehicle v : myAwesomeCollection) {
            if (v.getId() == id) {
                return myAwesomeCollection.remove(v);
            }
        }
        throw new VehicleNotFoundException("Could not remove that vehicle because it doesn't exist.");
    }

    @Override
    public String toString() {
        String output = "Your garage contains: \n";
        for (Vehicle v : myAwesomeCollection) {
            output += v.getMake() + " " + v.getModel() + " " + v.getYear() + "\n";
        }
        return output;
    }

    public static int chooseGarageOption() {
        //add vehicle --> 1
        //remove vehicle --> 2
        //calc bill --> 3
        System.out.println("Enter one of the following:\n" +
            "(1) Add vehicle\n" +
            "(2) Remove vehicle\n"+
            "(3) Calculate bill\n" +
            "(4) Quit");
        int userChoice = UserInput.getInt();
        while (!UserInput.isInRange(userChoice, 1, 4)) {
            System.out.println("Not a valid choice, please enter between 1 and 3.");
            userChoice = UserInput.getInt();
        }
        return userChoice;
    }
}

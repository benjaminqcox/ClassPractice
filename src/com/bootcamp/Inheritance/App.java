package com.bootcamp.Inheritance;

public class App {
    public static void main(String[] args) {
        Car car1 = new Car("Ford", "Focus", 2008, 120, 3, 4, false);
        Motorbike motorbike1 = new Motorbike("BMW", "R 1250 RS", 2023, 142, 0, false);
        Van van1 = new Van("Ford", "Transit", 2018, 110, 1, 4, 900);
        Garage garage = new Garage(car1, motorbike1);
        garage.addVehicle(van1);
        
        car1.fly();

        try {
            garage.findById(234029348);
            garage.removeVehicle(234234);
        } catch (Exception e) {

        }
        int choice = Garage.chooseGarageOption();
        while (choice != 4) {
            
            switch (choice) {
                case 1:
                    System.out.println("Vehicle added: " + garage.addVehicle(van1));
                    break;
                case 2:
                    try {
                        System.out.println("Vehicle removed: " + garage.removeVehicle(van1.getId()));
                    }
                    catch(Exception e) { }
                    break;
                case 3:
                    System.out.println(garage.getTotalBill());
                    break;
                default:
                    break;
            }
            choice = Garage.chooseGarageOption();
        }



        // System.out.println(garage.getTotalBill());
        // System.out.println(garage);
        UserInput.closeScanner();
    }
}

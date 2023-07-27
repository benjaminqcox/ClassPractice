package com.bootcamp.Inheritance;

import java.util.Scanner;

public class UserInput {
    private static Scanner scanner = new Scanner(System.in);
    
    public static void closeScanner() {
        scanner.close();
    }

    public static int getInt() {
        String userChoice = scanner.nextLine();
        Integer intChoice = null;
        do{
            try{
                intChoice = Integer.parseInt(userChoice);
            } 
            catch (NumberFormatException e) {
                System.out.println(e);
            } 
        } while (intChoice == null);
        return intChoice.intValue();
    }

    public static boolean isInRange(int checkMe, int lowerBound, int upperBound) {
        return checkMe >= lowerBound && checkMe <= upperBound;
    }
}

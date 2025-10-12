package org.java_fundamentals._07_OOP._06_inheritanceAndPolymorphism._04_carRentalSystem;

import java.util.Scanner;

public class Validation {
    private static final String USERNAME = "admin";
    private static final String PASSWORD = "1234";

    public static boolean login (Scanner sc){
        System.out.println("===== CityDrive Admin Login =====");
        System.out.print("Enter username: ");
        String userN = sc.nextLine();

        System.out.print("Enter password: ");
        String passW = sc.nextLine();

        if (userN.equals(USERNAME) && passW.equals(PASSWORD)){
            System.out.println("Login successful!");
            return true;
        }else {
            System.out.println("Username or password incorrect. Unable to proceed.");
            return false;
        }
    }





    public static boolean isValidName(String name){
        return name != null && !name.trim().isEmpty();
    }



    public static boolean isValidId(String id){
        return id != null && id.matches("[A-Za-z0-9]+");

    }



    public static boolean isValidPrice(double price){
        return price > 0.0;

    }

}

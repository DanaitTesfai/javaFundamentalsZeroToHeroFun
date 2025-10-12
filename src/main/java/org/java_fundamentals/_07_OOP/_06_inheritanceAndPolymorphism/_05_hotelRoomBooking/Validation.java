package org.java_fundamentals._07_OOP._06_inheritanceAndPolymorphism._05_hotelRoomBooking;

import java.util.Scanner;

public class Validation {
    private static final String USERNAME = "admin";
    private static final String PASSWORD = "1234";

    public static boolean login(Scanner input){
        System.out.println("===== GoldenStay Admin Login =====");
        System.out.print("Username: ");
        String userN = input.nextLine();

        System.out.print("Password: ");
        String passW = input.nextLine();

        if (userN.equals(USERNAME) && passW.equals(PASSWORD)){
            System.out.println("Login successful!");
            return true;
        }else {
            System.out.println("Incorrect username or password. Exiting...");
            return false;
        }
    }


    public static boolean isValidPrice(double price){
        return price > 0.0;
    }


    public static boolean isValidRoomId(String roomId){
        return roomId != null && roomId.matches("[A-Za-z0-9]+");
    }

}

package org.java_fundamentals._07_OOP._08_abstractClass._02_HotelBookingSystem;

import java.util.Scanner;

public class Validation {
    private static final String USERNAME = "admin";
    private static final String PASSWORD = "1234";

    public static boolean login(Scanner sc){
        System.out.println("===== RoyalStay Admin Login =====");
        System.out.print("Username: ");
        String uName = sc.nextLine();

        System.out.print("Password: ");
        String pWord = sc.nextLine();

        if (uName.equals(USERNAME) && pWord.equals(PASSWORD)){
            System.out.println("Login successful!");
            return true;
        }else {
            System.out.println("Incorrect username or password.");
            return false;
        }
    }

    public static boolean isNonEmpty(String s) {
        return s != null && !s.trim().isEmpty();
    }

    public static boolean isPositive(double n) {
        return n > 0;
    }

    public static boolean isPositiveInt(int n) {
        return n > 0;
    }

    public static boolean isValidId(String id) {
        return id != null && id.matches("[A-Za-z0-9]+");
    }
}

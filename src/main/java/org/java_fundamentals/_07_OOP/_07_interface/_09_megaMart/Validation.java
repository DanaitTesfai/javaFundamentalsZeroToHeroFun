package org.java_fundamentals._07_OOP._07_interface._09_megaMart;

import java.util.Scanner;

public class Validation {
    private static final String USERNAME = "admin";
    private static final String PASSWORD = "1234";

    public static boolean login(Scanner sc){
        System.out.println("===== MegaMart Admin Login =====");
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

    public static boolean isValidDaysOrYears(int daysOrYears){
        return daysOrYears > 0;
    }
}

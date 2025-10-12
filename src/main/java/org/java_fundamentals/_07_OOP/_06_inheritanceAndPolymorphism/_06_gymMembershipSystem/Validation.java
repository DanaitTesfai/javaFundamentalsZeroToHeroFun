package org.java_fundamentals._07_OOP._06_inheritanceAndPolymorphism._06_gymMembershipSystem;

import java.util.Scanner;

public class Validation {
    private static final String USERNAME ="admin";
    private static final String PASSWORD ="1234";

    public static boolean login(Scanner sc){
        System.out.println(" ===== PowerFit Admin Login =====");
        System.out.print("Username: ");
        String userN = sc.nextLine();

        System.out.print("Password: ");
        String passW = sc.nextLine();

        if (userN.equals(USERNAME) && passW. equals(PASSWORD)){
            System.out.println("Login successful!");
            return true;
        }else {
            System.out.println("Incorrect username or password.");
            return false;
        }

    }



    public static boolean isValidId(String id){
        return id != null && id.matches("[A-Za-z0-9]+");
    }


    public static boolean isValidName(String name){
        return name != null && !name.trim().isEmpty();
    }

    public static boolean isValidAge(int age){
        return age >18 && age <=120;
    }

    public static boolean isValidFee(double fee){
        return fee > 0.0;
    }
}

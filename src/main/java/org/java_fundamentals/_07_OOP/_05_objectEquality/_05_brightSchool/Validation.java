package org.java_fundamentals._07_OOP._05_objectEquality._05_brightSchool;

import java.nio.file.LinkPermission;
import java.util.Scanner;

public class Validation {
    private static final String USERNAME = "admin";
    private static final String PASSWORD = "1234";

    public static boolean login(Scanner input){

        System.out.println("===== School Admin Login =====");
        System.out.print("Enter your username: ");
        String userN = input.nextLine();

        System.out.print("Enter your password: ");
        String passW = input.nextLine();

        if (userN.equals(USERNAME) && passW.equals(PASSWORD)){
            System.out.println("Login successful.");
            return true;
        }else {
            System.out.println("Username or password is incorrect. Access denied.");
            return false;
        }

    }

    public static boolean isValidName(String name){
        return name != null && !name.trim().isEmpty();
    }

    public static boolean isValidId(String id){
        return id != null && id.matches("[A-Za-z0-9]+");
    }

    public static boolean isValidAge(int age){
        return age > 0 && age <= 120;
    }
}

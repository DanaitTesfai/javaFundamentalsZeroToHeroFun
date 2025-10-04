package org.java_fundamentals._07_OOP._05_objectEquality._05_brightSchool;

import java.nio.file.LinkPermission;
import java.util.Scanner;

public class Validation {
    private static final String USERNAME = "admin";
    private static final String PASSWORD = "1234";

    public static boolean login(Scanner input){

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
}

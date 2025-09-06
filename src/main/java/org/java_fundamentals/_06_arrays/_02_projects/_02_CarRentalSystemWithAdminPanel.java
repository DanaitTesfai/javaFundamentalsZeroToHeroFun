package org.java_fundamentals._06_arrays._02_projects;

import java.util.Scanner;

public class _02_CarRentalSystemWithAdminPanel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //user database
        String[] usernames = new String[10]; //[null,null,null,null,null,null,null,null,null,null]
        String[] passwords = new String[10]; //[null,null,null,null,null,null,null,null,null,null]
        int userCount = 0;

        //default users
        usernames[0] = "admin";  //[admin,null,null,null,null,null,null,null,null,null]
        passwords[0] = "1234";   //[1234,null,null,null,null,null,null,null,null,null]
        userCount++;             // = 1

        usernames[1] = "user1"; //[admin,user1,null,null,null,null,null,null,null,null]
        passwords[1] = "pass1"; //[1234,pass1,null,null,null,null,null,null,null,null]
        userCount++;            // = 2

        //available cars with prices
        String[] cars = {"Sedan", "SUV", "Truck" };
        double[] carPrices = {50, 80, 100};

        //multi user car rental tracking [user][car]
        int[][] rentedQuantity = new int[10][3];
        double[][] carIncome = new double[10][3];

        boolean exitProgram = false;

        while (!exitProgram) {
            System.out.println("====== Car Rental System ======");
            System.out.println("1. Login");
            System.out.println("2. Register");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            int currentUserIndex = -1;


            if (choice == 1) {
                //Login

                for (int attempts = 0; attempts < 3; attempts++) {
                    System.out.println("--- Login ---");
                    System.out.print("Enter username: ");
                    String uName = scanner.nextLine();
                    System.out.print("Enter password: ");
                    String pass = scanner.nextLine();

                    for (int i = 0; i < userCount; i++) {
                        if (usernames[i].equals(uName) && passwords[i].equals(pass)) {
                            currentUserIndex = i;
                            break;
                        }
                    }

                    if (currentUserIndex == -1) {
                        System.out.println("Wrong username or password. Please try again.");
                    }else {
                        break;
                    }
                }
                if (currentUserIndex ==-1){
                    System.out.println("Too many attempts. Please try again. Return to main menu.");
                    continue;
                }


                if (usernames[currentUserIndex].equals("admin")){
                    System.out.println("Admin Login Successful! Welcome, admin.");
                }else {
                    System.out.println("Login Successful! Welcome, " + usernames[currentUserIndex] + ".");
                }

            }
        }


    }
}

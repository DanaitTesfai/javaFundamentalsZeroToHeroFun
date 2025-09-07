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
                    while (true){
                        System.out.println("==============================\n" +
                                "        ADMIN PANEL\n" +
                                "==============================");
                        System.out.println("1. View Car Prices");
                        System.out.println("2. Update Car Price");
                        System.out.println("3. View All Users' Rental Summary");
                        System.out.println("4. Logout");
                        System.out.print("Enter your choice: ");
                        int choiceAdmin = scanner.nextInt();

                        if (choiceAdmin==1){
                            System.out.println("--- Car Prices ---");
                            for (int i= 0 ; i< cars.length ; i++){
                                System.out.println(cars[i] + ": $" + carPrices[i] +"/day");
                            }
                        } else if (choiceAdmin==2) {
                            System.out.println("Which car price do you want to update? ");
                            for (int i= 0 ; i< cars.length ; i++){
                                System.out.println((i+1)+"."+cars[i]);
                            }
                            System.out.print("Enter choice: ");
                            int updateChoice = scanner.nextInt();

                            System.out.print("Enter new price for " + cars[updateChoice-1]+": ");
                            carPrices[updateChoice-1] = scanner.nextDouble();
                            System.out.println("Price updated successfully!");

                        } else if (choiceAdmin==3) {
                            System.out.println("--- All Users' Rental Summary ---");
                            for (int i = 0 ; i < userCount ; i++){
                                System.out.println("User: " + usernames[i]);
                                double totalSpent = 0;
                                for ( int j = 0 ; j < cars.length ; j++){
                                    System.out.println(cars[j] +"/s rented: " + rentedQuantity[i][j] +" | Income: $" + carIncome[i][j] );
                                    totalSpent += carIncome[i][j];

                                }
                                System.out.println("Total Spent: $" + totalSpent);
                                System.out.println("----------------------------");
                            }


                        } else if (choiceAdmin==4) {
                            System.out.println("Admin logged out!");
                            break;
                        }else {
                            System.out.println("Invalid input.Please try again.");
                        }

                    }
                }else {
                    System.out.println("Login Successful! Welcome, " + usernames[currentUserIndex] + ".");
                }



            }
        }


    }
}

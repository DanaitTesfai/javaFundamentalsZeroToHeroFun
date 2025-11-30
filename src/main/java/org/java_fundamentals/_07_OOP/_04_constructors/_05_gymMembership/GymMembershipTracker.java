package org.java_fundamentals._07_OOP._04_constructors._05_gymMembership;

import java.util.ArrayList;
import java.util.Scanner;

public class GymMembershipTracker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<GymMembership> members = new ArrayList<>();

        String username = "owner";
        String password = "owner123";

        while (true){
            System.out.println("===== Gym Owner Login =====");
            System.out.print("Enter username: ");
            String userN = sc.nextLine();

            System.out.print("Enter password: ");
            String pass = sc.nextLine();

            if (username.equals(userN) && password.equals(pass)){
                System.out.println("Login successful!");
                break;
            }else {
                System.out.println("Invalid username or password. Please try again.");
                System.out.print("Do you want to continue or exit?(1. Yes 2. No  ) ");
                int option = sc.nextInt();
                sc.nextLine();

                if (option ==2 ) {
                    System.out.println("Exiting program. See you next time.");
                    return;
                }else if (option != 1){
                    System.out.println("Invalid input. Please try again.");
                }
            }
        }
        System.out.println();

        while (true){
            System.out.println("=== Gym EnrollmentController ===\n" +
                    "1. Register Member\n" +
                    "2. View Member\n" +
                    "3. Exit");
            System.out.print("Choose an option: ");
            int option = sc.nextInt();
            sc.nextLine();

            if (option == 1){
                System.out.print("Enter Member Name: ");
                String memName = sc.nextLine();

                System.out.print("Enter Membership Type (Monthly/Annual): ");
                String memType = sc.nextLine();

                System.out.print("Enter Weight: ");
                double weight = sc.nextDouble();

                GymMembership mem1 = new GymMembership(memName, memType,weight);
                members.add(mem1);
                System.out.println("Member registered successfully!");

            } else if (option == 2) {
                for (GymMembership m : members){
                    System.out.println(m);
                }

            } else if (option==3) {
                System.out.println("Exiting system... Goodbye!");
                break;
            }else {
                System.out.println("Invalid input. Please try again.");
            }
        }


    }
}

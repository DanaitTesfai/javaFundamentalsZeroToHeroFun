package org.java_fundamentals._07_OOP._05_objectEquality._03_gymMembership;

import javax.xml.transform.Source;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.SimpleTimeZone;

public class GymMembershipTracker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<GymMembership> members = new ArrayList<>();

        System.out.println("===== Gym Owner Login =====");

        String username = "owner";
        String password = "gym123";

        String userN;
        String passW;

        while (true) {
            System.out.print("Enter username: ");
            userN = input.nextLine();

            System.out.print("Enter password: ");
            passW = input.nextLine();

            if (userN.equals(username) && passW.equals(password)) {
                System.out.println("Login successful!");
                break;
            } else {
                System.out.println("Wrong username or password. Please try again.");
            }
        }


        System.out.println("=== Gym Menu ===");

        while (true) {
            System.out.println("1. Register Member\n" +
                    "2. View Members\n" +
                    "3. Search Member by ID\n" +
                    "4. Exit");
            System.out.print("Choose an option: ");
            int option = input.nextInt();
            input.nextLine();


            switch (option) {
                case 1:
                    System.out.print("Enter Member ID: ");
                    String memberId = input.nextLine();

                    System.out.print("Enter Name: ");
                    String name = input.nextLine();

                    System.out.print("Enter Membership Type (Monthly/Annual): ");
                    String memType = input.nextLine();

                    GymMembership mem1 = new GymMembership(memberId, name, memType);
                    if (members.contains(mem1)) {
                        System.out.println("Duplicate member! Cannot register.");
                    } else {
                        members.add(mem1);
                        System.out.println("Member registered successfully!");
                    }
                    break;


                case 2:
                    if (members.isEmpty()) {
                        System.out.println("There are no members.");
                    } else {
                        for (GymMembership g : members) {
                            System.out.println(g);
                        }
                    }
                    break;


                case 3:
                    System.out.print("Enter Member ID to search: ");
                    String newMem = input.nextLine();

                    boolean isFound = false;
                    for (GymMembership g : members) {
                        if (g.getMemberId().equals(newMem)) {
                            System.out.println("Member found: " + g);
                            isFound = true;
                            break;
                        }
                    }
                    if (!isFound) {
                        System.out.println("Member not found.");
                    }
                    break;


                case 4:
                    System.out.println("Exiting Gym System... Goodbye!");
                    return;

                default:
                    System.out.println("Invalid input. Please try again.");

            }
        }
    }
}


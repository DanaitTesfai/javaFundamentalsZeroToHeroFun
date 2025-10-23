package org.java_fundamentals._07_OOP._06_inheritanceAndPolymorphism._06_gymMembershipSystem;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    static ArrayList<Member> members = new ArrayList<>();

    public static void displayMenu(Scanner sc){
        while (true){
            System.out.println("=== Gym Membership Menu ===\n" +
                    "1. Register Member\n" +
                    "2. View All Member\n" +
                    "3. Search Member by ID\n" +
                    "4. Exit");
            System.out.print("Choose an option: ");
            int option = sc.nextInt();
            sc.nextLine();

            switch (option){
                case 1:
                    registerMember(sc);
                    break;
                case 2:
                    viewMembers();
                    break;
                case 3:
                    searchMember(sc);
                    break;
                case 4:
                    System.out.println("Exiting system... Goodbye!");
                    return;
                default:
                    System.out.println("Invalid input. Please try again.");
                    break;
            }
        }
    }


    public static void registerMember(Scanner sc){
        System.out.println("Select membership type:");
        System.out.println("1.Regular Member\n" +
                "2.Premium Member");
        int choice = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Member ID: ");
        String id = sc.nextLine();

        if (!Validation.isValidId(id)){
            System.out.println("Invalid id.");
            return;
        }

        for (Member m : members){
            if (m.getMemberId().equals(id)){
                System.out.println("Member already exists.");
                return;
            }
        }

        System.out.print("Enter name: ");
        String name = sc.nextLine();

        System.out.print("Enter age: ");
        int age = sc.nextInt();

        System.out.print("Enter monthly fee: ");
        double fee = sc.nextDouble();


        if (!Validation.isValidName(name)){
            System.out.println("Invalid name.");
            return;
        }

        if (!Validation.isValidAge(age)){
            System.out.println("Invalid age.");
            return;
        }

        if (!Validation.isValidFee(fee)){
            System.out.println("Invalid fee.");
            return;
        }
        Member member;
        if (choice == 1) {
            System.out.print("Enter Duration (in months): ");
            int months = sc.nextInt();

            member = new RegularMember(id, name, age, fee, months);
        } else if (choice == 2) {
            System.out.print("Has Personal Trainer? (true/false): ");
            boolean hasTrainer = sc.nextBoolean();

            System.out.print("Has Special class? (true/false): ");
            boolean hasClass = sc.nextBoolean();

            member = new PremiumMember(id, name, age, fee, hasTrainer, hasClass);

        }else {
            System.out.println("Invalid membership type.");
            return;
        }

        members.add(member);
        System.out.println("Member registered successfully!");


    }

    public static void viewMembers(){
        if (members.isEmpty()){
            System.out.println("There are no registered members.");
        }else {
            for (Member m: members){
                m.displayInfo();
            }
        }
    }

    public static void searchMember(Scanner sc){
        System.out.print("Enter Member ID to search: ");
        String id = sc.nextLine();

        for (Member m: members){
            if (m.getMemberId().equals(id)){
                System.out.println("Member found:");
                m.displayInfo();
                return;
            }
        }
        System.out.println("Member not found.");
    }
}

package org.java_fundamentals._07_OOP._09_realLifeProjects._01_FitLifeGymManagementSystem;

import java.awt.*;
import java.util.Scanner;

public class Menu {

    public void start(Scanner sc, UserManager um, MemberManager mm) {
        System.out.println(" ===== FitLife Gym Login =====");
        System.out.print("Username: ");
        String userName = sc.nextLine();

        System.out.print("Password: ");
        String passWord = sc.nextLine();

        User user = um.authenticate(userName, passWord);
        if (user == null) {
            System.out.println("Invalid credentials or account inactive.Exiting ...");
            return;
        }

        if (user.isAdmin()) {
            System.out.println("Welcome admin " + user.getUsername());
            adminMenu(sc, um, mm);
        } else {
            System.out.println("Welcome staff " + user.getUsername());
            staffMenu(sc, mm);
        }
    }


    private void adminMenu(Scanner sc, UserManager um, MemberManager mm) {
        while (true) {
            System.out.println("=== ADMIN MENU - FitLife Gym ===\n" +
                    "    1. User Management\n" +
                    "    2. Member Management\n" +
                    "    3. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    userManagement(sc, um);
                    break;
                case 2:
                    memberManagement(sc, mm);
                    break;
                case 3:
                    System.out.println("Exiting system....");
                    return;

                default:
                    System.out.println("Invalid input. Please try again.");
                    break;
            }
        }
    }

    public void userManagement(Scanner sc, UserManager um) {
        while (true) {
            System.out.println("User Management");
            System.out.println("1. Register New Staff User\n" +
                    "2. View All Users\n" +
                    "3. Deactivate User\n" +
                    "4. Back");
            System.out.print("Choose: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    registerStaff(sc, um);
                    break;
                case 2:
                    viewUsers(um);
                    break;
                case 3:
                    deactivateUser(sc, um);
                    break;
                case 4:
                    System.out.println("Back to admin menu.");
                    return;
                default:
                    System.out.println("Invalid input. Please try again.");
                    break;
            }

        }
    }

    public void registerStaff(Scanner sc, UserManager um) {
        System.out.print("Enter username: ");
        String userN = sc.nextLine();

        System.out.print("Enter password: ");
        String passW = sc.nextLine();

        if (userN.isBlank() || passW.isBlank()) {
            System.out.println("Username or password cant be blank.");
            return;
        }
        User user = new User(userN, passW, "Staff", true);
        boolean ok = um.addUser(user);
        System.out.println(ok ? "Staff user registered." : "Duplicate username, registration failed.");
    }

    public void viewUsers(UserManager um) {
        um.listUsers();
    }

    public void deactivateUser(Scanner sc, UserManager um) {
        System.out.print("Enter username to deactivate: ");
        String userN = sc.nextLine();

        boolean ok = um.deactivateUser(userN);
        System.out.println(ok ? "User deactivated." : "User not found.");
    }



    public void memberManagement(Scanner sc, MemberManager mm) {
        while (true){
            System.out.println("Member Management\n" +
                    "1. Register Member\n" +
                    "2. View All Members\n" +
                    "3. Search Member by ID\n" +
                    "4. Generate Bill / Check-Out\n"+
                    "5. Back");
            System.out.print("Choose: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice){
                case 1:
                    registerMember(sc,mm);
                    break;
                case 2:
                    viewMembers(mm);
                    break;
                case 3:
                    searchMember(sc, mm);
                    break;
                case 4:
                    checkOut(sc,mm);
                    break;
                case 5:
                    System.out.println("Back to admin menu.");
                    return;
                default:
                    System.out.println("Invalid input. Please try again.");
            }
        }
    }

    public void registerMember(Scanner sc,MemberManager mm){
        System.out.print("Select Member Type: 1. Basic  2. Premium: ");
        int memType = sc.nextInt();
        sc.nextLine();

        Member member;
        System.out.print("Enter Member ID: ");
        String memberId = sc.nextLine();

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Age: ");
        int age = sc.nextInt();

        System.out.print("Enter Months Subscribed: ");
        int monthsSubscribed = sc.nextInt();

        String membershipStatus = "Active";

        if (memType == 1){
            System.out.print("Enter monthly fee: ");
            double monthlyFee = sc.nextDouble();

            member = new BasicMember(memberId,name, age, monthsSubscribed, membershipStatus, monthlyFee);
        } else if (memType == 2) {
            System.out.print("Enter monthly fee: ");
            double monthlyFee = sc.nextDouble();

            System.out.print("Enter trainer fee: ");
            double trainerFee = sc.nextDouble();

            System.out.print("Enter diet plan fee: ");
            double dietFee = sc.nextDouble();

            member = new PremiumMember(memberId, name, age, monthsSubscribed, membershipStatus, monthlyFee, trainerFee, dietFee);
        }else {
            System.out.println("Invalid input.");
            return;
        }
        boolean ok = mm.addMember(member);
        System.out.println(ok ? "Member registered successfully!" : "Duplicate member Id.");
    }

    public void viewMembers(MemberManager mm){
        mm.listMembers();
    }

    public void  searchMember(Scanner sc, MemberManager mm){
        System.out.print("Enter the member Id to search: ");
        String memberId = sc.nextLine();

        Member member = mm.findById(memberId);
        if (member == null){
            System.out.println("Member not found.");
            return;
        }
        System.out.println("Member found:" );
        member.displayInfo();
    }

    public void checkOut(Scanner sc , MemberManager mm){
        System.out.print("Enter member Id to check out: ");
        String memberId = sc.nextLine();

        boolean ok = mm.checkout(memberId);

        if (!ok){
            System.out.println("Member not found.");
        }

    }



    private void staffMenu(Scanner sc, MemberManager mm) {
        while (true) {
            System.out.println("=== STAFF MENU - FitLife Gym ===\n" +
                    "    1. Register Member\n" +
                    "    2. View All Members\n" +
                    "    3. Search Member by ID\n" +
                    "    4. Generate Bill\n" +
                    "    5. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    registerMember(sc,mm);
                    break;
                case 2:
                    viewMembers(mm);
                    break;
                case 3:
                    searchMember(sc,mm);
                    break;
                case 4:
                    checkOut(sc,mm);
                    break;
                case 5:
                    System.out.println("Exiting system.");
                    return;
                default:
                    System.out.println("Invalid input. Please try again.");
                    break;
            }
        }

    }


}

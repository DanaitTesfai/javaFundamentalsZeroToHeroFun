package org.java_fundamentals._05_looping._02_mini_projects;

import java.util.Scanner;

public class _03_GymMembershipBookingSystem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double basicPrice = 30;
        double premiumPrice = 50;
        double vipPrice = 80;
        int basicMonths = 0;
        int premiumMonths = 0;
        int vipMonths = 0;
        double basicTotal = 0;
        double premiumTotal = 0;
        double vipTotal = 0;

        while (true){
            System.out.println("=== Welcome to FitLife Gym ===");
            System.out.println("1. View Membership Prices\n" +
                    "2. Register for Membership\n" +
                    "3. Exit");

            System.out.print("Enter your choice: ");
            int choice = input.nextInt();
            input.nextLine();

            if (choice == 1){
                System.out.println("Basic: $30/month\n" +
                        "Premium: $50/month\n" +
                        "VIP: $80/month\n");
            } else if (choice == 2) {
                System.out.print("Enter membership type (basic/premium/vip): ");
                String membershipType = input.nextLine();

                System.out.print("Enter number of months: ");
                int months = input.nextInt();
                double discount = 0;

                if (membershipType.equalsIgnoreCase("basic")){
                    basicMonths += months;
                    basicTotal = basicPrice * basicMonths;
                    discount = basicTotal * 0.10;
                    basicTotal -= discount;
                    System.out.println("Discount applied: $" + discount);
                    System.out.println("Final Price: $" + basicTotal);
                } else if (membershipType.equalsIgnoreCase("premium")) {
                    premiumMonths += months;
                    premiumTotal = premiumPrice * premiumMonths;
                    discount = premiumTotal * 0.10;
                    premiumTotal -= discount;
                    System.out.println("Discount applied: $" + discount);
                    System.out.println("Final Price: $" + premiumTotal);
                } else if (membershipType.equalsIgnoreCase("vip")){
                    vipMonths += months;
                    vipTotal = vipPrice * vipMonths;
                    discount = vipTotal * 0.10;
                    vipTotal -= discount;
                    System.out.println("Discount applied: $" + discount);
                    System.out.println("Final Price: $" + vipTotal);
                } else {
                    System.out.println("Invalid input. Please input again!");
                }



            } else if ( choice == 3) {
                System.out.println("=== Membership Summary ===");
                System.out.println("Basic: " + basicMonths + " months, Total = $" + basicTotal);
                System.out.println("Premium: " + premiumMonths + " months, Total = $" + premiumTotal);
                System.out.println("Vip: " + vipMonths + " months, Total = $" + vipTotal);
                System.out.println("----------------------------");
                System.out.println("Total Income = $" + (basicTotal + premiumTotal + vipTotal));
                System.out.println("Thank you for choosing FitLife Gym!");
                break;
            } else {
                System.out.println("Invalid Input. Please try again!");
            }

        }
    }
}

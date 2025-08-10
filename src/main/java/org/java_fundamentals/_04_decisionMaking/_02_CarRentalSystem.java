package org.java_fundamentals._04_decisionMaking;

import java.util.Scanner;

public class _02_CarRentalSystem {
    public static void main(String[] args) {
        System.out.println("=== Welcome to DriveEasy Rentals ===");
        System.out.println("1. View Car Prices");
        System.out.println("2. Rent a Car");
        System.out.println("3. Exit");

        Scanner input = new Scanner(System.in);
        System.out.print("Enter your choice: ");
        int choice = input.nextInt();
        input.nextLine();

        if (choice == 1) {
            System.out.println("Daily rental prices:\n" +
                    "  \n" +
                    "  Economy → $40/day\n" +
                    "  \n" +
                    "  SUV → $70/day\n" +
                    "  \n" +
                    "  Luxury → $120/day");

        } else if (choice == 2) {
            System.out.print("Enter car type (economy, suv, luxury): ");
            String carType = input.nextLine();

            double dailyPrice = 0;
            if (carType.equalsIgnoreCase("economy")){
                dailyPrice = 40;
            } else if (carType.equalsIgnoreCase("suv")) {
                dailyPrice = 70;
            } else if (carType.equalsIgnoreCase("luxury")) {
                dailyPrice = 120;
            } else {
                return;
            }

            System.out.print("Enter number of days: ");
            int days = input.nextInt();
            input.nextLine();

            double totalBeforeDiscount = dailyPrice * days;
            double discount = 0;

            if (days >= 10) {
                discount = 0.20 * totalBeforeDiscount;
            }
            System.out.print("Do you want insurance? (yes/no): ");
            String insurance = input.nextLine();

            double insuredAmount = 0;
            if (insurance.equalsIgnoreCase("yes")) {
                insuredAmount = 15 * days;
            }
            System.out.println("Total before discount: $" + totalBeforeDiscount);
            System.out.println("Discount applied: $" + discount);
            System.out.println("Insurance Amount: $" + insuredAmount);
            System.out.println("Final price: $" + (totalBeforeDiscount - discount + insuredAmount));



        } else if (choice == 3) {
            System.out.println("Thank you");
        } else {
            System.out.println("Invalid input and rerun the program.");
        }


    }
}

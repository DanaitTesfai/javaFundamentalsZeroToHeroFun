package org.java_fundamentals._05_looping._01_coding_challenges;

import java.util.Scanner;

public class _06_HotelBillingSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Hotel Billing System ===");
        System.out.print("How many guests today? ");
        int numberOfGuests = scanner.nextInt();
        scanner.nextLine();

        double individualTotal = 0;
        double totalIncome = 0;

        for(int i = 1 ; i<= numberOfGuests ; i++){
            System.out.println("--- Guest #"+ (i) + "---");

            System.out.print("Enter guest name: ");
            String name = scanner.nextLine();

            System.out.print("Enter number of nights: ");
            int numberOfNights = scanner.nextInt();

            System.out.print("Enter price per night: ");
            double pricePerNight = scanner.nextDouble();
            scanner.nextLine();

            individualTotal = numberOfNights * pricePerNight;
            totalIncome += individualTotal;

            System.out.println("--- BILL SUMMARY ---");
            System.out.println("Customer: " + name);
            System.out.println("Nights: " + numberOfNights);
            System.out.printf("Nightly Rate: $%.2f%n" ,pricePerNight);
            System.out.printf("Total amount: $%.2f%n" , individualTotal);

        }

        System.out.println("=== end of day report ===".toUpperCase());
        System.out.printf("Total income: $%.2f%n", totalIncome);

    }
}

package org.java_fundamentals._02_typecasting;

import java.util.Scanner;

public class _01_HotelBillingSystem {
    public static void main(String[] args) {
        System.out.println("=== Hotel Billing System ===");

        Scanner input = new Scanner(System.in);

        System.out.print("Enter guest name:");
        String name = input.nextLine();

        System.out.print("Enter number of nights:");
        int numberOfNights = input.nextInt();

        System.out.print("Enter price per night:");
        float pricePerNight = input.nextFloat();

        double total = numberOfNights * pricePerNight;  // basic casting

        System.out.println("--- BILL SUMMARY ---");
        System.out.println("Customer:" + name.toUpperCase());
        System.out.println("Nights:" + numberOfNights);
        System.out.println("Nightly Rate: $" + pricePerNight );
        System.out.println("Total amount: $" + total);


    }

}

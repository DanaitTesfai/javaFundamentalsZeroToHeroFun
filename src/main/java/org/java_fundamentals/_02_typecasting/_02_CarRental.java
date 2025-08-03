package org.java_fundamentals._02_typecasting;

import java.util.Scanner;

public class _02_CarRental {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== Car Rental Invoice Generator ===");

        System.out.print("Enter customer name: ");
        String name = input.nextLine();

        System.out.print("Enter number of rental days: ");
        int rentalDays = input.nextInt();

        System.out.print("Enter daily rental rate (whole number): ");
        int dailyRentalRate = input.nextInt();

        System.out.println("----- Invoice -----");
        System.out.println("Customer Name: " + name);
        System.out.println("Days Rented: " + rentalDays);
        System.out.println("Daily Rate: $" + dailyRentalRate);

        double total = rentalDays * dailyRentalRate;
        System.out.println("Total Amount Due: $" + total);


    }
}

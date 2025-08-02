package org.java_fundamentals._01_variables.live_coding;

import java.util.Scanner;

public class _05_HotelBooking {
    public static void main(String[] args ){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = input.nextLine();

        System.out.print("Number of nights: ");
        int numberOfNights = input.nextInt();

        System.out.print("Price per night :");
        double pricePerNight = input.nextDouble();

        System.out.print("Breakfast cost per night: ");
        double breakfastPrice = input.nextDouble();

        double totalCostRoom = numberOfNights * pricePerNight;
        System.out.println("Total room cost: " + totalCostRoom);

        double totalBreakfast = numberOfNights * breakfastPrice;
        System.out.println("Total breakfast cost: " + totalBreakfast);

        double total = totalCostRoom + totalBreakfast;
        System.out.println("Total: " + total);

    }

}


package org.java_fundamentals._01_variables.code_reading;

import java.util.Scanner;

public class HotelBookingSystem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("========== Welcome to Java Hotel ==========");

        // Guest info
        System.out.print("Enter guest name: ");
        String guestName = input.nextLine();

        // Room booking
        System.out.print("Enter number of nights: ");
        int nights = input.nextInt();

        System.out.print("Enter number of rooms: ");
        int rooms = input.nextInt();

        // Extras
        System.out.print("Do you want extra beds? (yes=1 / no=0): ");
        int extraBedsOption = input.nextInt();

        int extraBeds = 0;
        if (extraBedsOption == 1) {
            System.out.print("Enter number of extra beds: ");
            extraBeds = input.nextInt();
        }

        System.out.print("Do you want late checkout? (yes=1 / no=0): ");
        int lateCheckout = input.nextInt();

        // Pricing
        double roomPrice = 70.0;
        double bedPrice = 20.0;
        double lateCheckoutFee = 30.0;

        // Calculations
        double roomTotal = nights * rooms * roomPrice;
        double bedTotal = extraBeds * bedPrice;
        double total = roomTotal + bedTotal;

        if (lateCheckout == 1) {
            total += lateCheckoutFee;
        }

        // Bill summary
        System.out.println("\n========== BILL SUMMARY ==========");
        System.out.println("Guest: " + guestName);
        System.out.println("Rooms: " + rooms + " x " + nights + " nights = $" + roomTotal);
        System.out.println("Extra beds: " + extraBeds + " x $" + bedPrice + " = $" + bedTotal);
        if (lateCheckout == 1) {
            System.out.println("Late checkout fee: $" + lateCheckoutFee);
        }
        System.out.println("----------------------------------");
        System.out.println("Total amount to pay: $" + total);
        System.out.println("===================================");
        System.out.println("Thank you for booking with Java Hotel!");
    }
}

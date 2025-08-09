package org.java_fundamentals._03_Operators;

import java.util.Scanner;

public class _02_HotelRoomBooking {
    public static void main(String[] args) {
        double pricePerNight = 120;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of nights: ");
        int numberOfNights = input.nextInt();

        /*

        double totalBeforeDiscount = pricePerNight * numberOfNights;
        double discountTotal = numberOfNights > 3 ? 0.85 * totalBeforeDiscount : 0;


        System.out.println("Total before discount: $" + totalBeforeDiscount);
        System.out.println("Discount: " + (discountTotal > 0 ? "15%" : "0%" ));
        System.out.println("Total after discount: $"+ discountTotal);

        */

        double totalBeforeDiscount = pricePerNight * numberOfNights;
        double discount = numberOfNights > 3 ? 0.15 * totalBeforeDiscount : 0;


        System.out.println("Total before discount: $" + totalBeforeDiscount);
        System.out.println("Discount: " + (discount > 0 ? "15%" : "0%" ));
        System.out.println("Discount Amount: $" + discount);
        System.out.println("Total after discount: $"+ (totalBeforeDiscount - discount));







    }
}

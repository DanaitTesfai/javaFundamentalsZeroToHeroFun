package org.java_fundamentals._02_typecasting;

import java.util.Scanner;

public class _03_GymMembershipCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== Gym Membership Fee Calculator ===");
        System.out.print("Enter your name: ");
        String name  = input.nextLine();

        System.out.print("Enter monthly fee (in decimals): ");
        double monthlyFee = input.nextDouble();

        System.out.print("Enter number of months: ");
        int numberOfMonths = input.nextInt();

        System.out.println("--- Membership Summary ---");
        System.out.println("Member: " + name);

        double total = monthlyFee * numberOfMonths ;
        System.out.println("Exact total: $" + total);

        int total2 = (int)total;
        System.out.println("Rounded total for invoice: $" + total2);


    }
}

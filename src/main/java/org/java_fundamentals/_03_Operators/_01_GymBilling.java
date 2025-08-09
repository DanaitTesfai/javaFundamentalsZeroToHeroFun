package org.java_fundamentals._03_Operators;

import java.util.Scanner;

public class _01_GymBilling {
    public static void main(String[] args) {
        double monthlyFee = 30;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of months: ");
        int numberOfMonths = input.nextInt();

        double totalBeforeDis = monthlyFee * numberOfMonths;
        double discount = numberOfMonths > 6 ?  20 : 0;

        System.out.println("Total before discount: " + totalBeforeDis);
        System.out.println("Discount applied: " + discount);
        System.out.println("Final total: " + (totalBeforeDis - discount));




    }
}

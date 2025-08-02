package org.java_fundamentals._01_variables.live_coding;

import java.util.Scanner;

public class _04_CarRental {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter car model: ");
        String model = input.nextLine();

        System.out.print("Enter number of days: ");
        int days = input.nextInt();

        System.out.print("Enter daily price: ");
        double dailyPrice = input.nextDouble();

        double total = days * dailyPrice;

        System.out.println("Total cost: " + total);




    }
}

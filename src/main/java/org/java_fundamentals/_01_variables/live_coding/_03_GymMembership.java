package org.java_fundamentals._01_variables.live_coding;

import java.util.Scanner;

public class _03_GymMembership {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = input.nextLine();

        System.out.print("Enter number of months: ");
        int months = input.nextInt();

        System.out.print("Enter monthly fee: ");
        double monthlyFee = input.nextDouble();

        double total = months * monthlyFee;
        System.out.println("Total: " + total);

        System.out.println("Thank you for joining, " + name + "!");


    }
}

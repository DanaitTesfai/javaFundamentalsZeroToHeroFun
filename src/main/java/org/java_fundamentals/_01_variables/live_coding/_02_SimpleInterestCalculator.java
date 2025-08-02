package org.java_fundamentals._01_variables.live_coding;

import java.util.Scanner;

public class _02_SimpleInterestCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter principal amount: ");
        double principal = input.nextDouble();

        System.out.print("Enter rate of interest in (%): ");
        double interestRate = input.nextDouble();

        System.out.print("Enter time in years: ");
        int years = input.nextInt();

        double interest = (principal * interestRate * years ) / 100;
        System.out.print("Simple Interest: " + interest );


    }
}

package org.java_fundamentals._01_variables.code_reading;

import java.util.Scanner;

public class CafeBilling {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String welcomeMessage = "Welcome to Java Café!";
        System.out.println(welcomeMessage);

        System.out.print("Enter customer name: ");
        String customer = input.nextLine();

        System.out.print("Enter number of coffees: ");
        int coffeeQty = input.nextInt();

        System.out.print("Enter number of sandwiches: ");
        int sandwichQty = input.nextInt();

        double coffeePrice = 3.50;
        double sandwichPrice = 5.00;

        double coffeeTotal = coffeeQty * coffeePrice;
        double sandwichTotal = sandwichQty * sandwichPrice;

        double total = coffeeTotal + sandwichTotal;

        System.out.println("\n--- Bill Summary ---");
        System.out.println("Customer: " + customer);
        System.out.println("Coffees: " + coffeeQty + " x $" + coffeePrice + " = $" + coffeeTotal);
        System.out.println("Sandwiches: " + sandwichQty + " x $" + sandwichPrice + " = $" + sandwichTotal);
        System.out.println("Total Amount: $" + total);
        System.out.println("Thank you for visiting!");
    }
}
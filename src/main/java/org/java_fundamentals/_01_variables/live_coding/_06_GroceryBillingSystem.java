package org.java_fundamentals._01_variables.live_coding;

import java.util.Scanner;

public class _06_GroceryBillingSystem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter customer name: ");
        String name = input.nextLine();

        System.out.print("Item 1 price: ");
        double item1Price = input.nextDouble();

        System.out.print("quantity: ");
        int quantity1 = input.nextInt();

        System.out.print("Item 2 price: ");
        double item2Price = input.nextDouble();

        System.out.print("quantity: ");
        int quantity2 = input.nextInt();

        System.out.print("Item 3 price: ");
        double item3Price = input.nextDouble();

        System.out.print("quantity: ");
        int quantity3 = input.nextInt();

        double total = item1Price * quantity1 + item2Price * quantity2 + item3Price * quantity3;
        System.out.println("Total bill: " + total);

        System.out.println("Thank you for purchasing from us " + name);


    }
}

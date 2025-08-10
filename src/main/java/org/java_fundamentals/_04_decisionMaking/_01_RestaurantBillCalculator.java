package org.java_fundamentals._04_decisionMaking;

import java.util.Scanner;

public class _01_RestaurantBillCalculator {
    public static void main(String[] args) {
        System.out.println("=== Welcome to Golden Spoon ===");
        System.out.println("1. View Food Prices");
        System.out.println("2. Order Food");
        System.out.println("3. Exit");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();
        scanner.nextLine();


        if (choice == 1 ){
            System.out.println("Burger → $8\n ");
            System.out.println("Pizza → $12\n");
            System.out.println("Pasta → $10\n");
        } else if (choice == 2) {
            System.out.print("Enter food item (burger, pizza, pasta): ");
            String foodItem = scanner.nextLine();

            double price = 0;
            if (foodItem.equalsIgnoreCase("burger")) {
                price = 8;
            } else if (foodItem.equalsIgnoreCase("pizza")) {
                price = 12;
            } else if (foodItem.equalsIgnoreCase("pasta")) {
                price = 10;
            }else {
                return;
            }

            System.out.print("Enter quantity: ");
            int quantityItem = scanner.nextInt();
            scanner.nextLine();

            double totalBefore = price * quantityItem;
            double discount = 0;

            if (totalBefore >= 50) {
                discount = 0.10 * totalBefore;
            }

            System.out.print("Do you want service charge? (yes/no): ");
            String service = scanner.nextLine();

            if (service.equalsIgnoreCase("yes")){
                totalBefore += 5;
                System.out.println("I am inside service charge fee");
            }

            System.out.println("Total before discount: $" + totalBefore);
            System.out.println("Discount applied: $" + discount);
            System.out.println("Final bill: $" + (totalBefore - discount));

        } else if (choice == 3) {
            System.out.println("Thank you for visiting.");
            System.out.println("See you again.");
        } else {
            System.out.println("Invalid input.");
            System.out.println("Rerun the program to order food again.");
        }
    }
}

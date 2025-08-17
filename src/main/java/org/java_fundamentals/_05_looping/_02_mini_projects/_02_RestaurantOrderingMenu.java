package org.java_fundamentals._05_looping._02_mini_projects;

import java.util.Scanner;

public class _02_RestaurantOrderingMenu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Welcome to Java Dine ===");
        System.out.println("Profile: Waiter Order System");

        int choice = 0;
        while (true){
            System.out.println("1. View Menu");
            System.out.println("2. Place an Order");
            System.out.println("3. Exit");

            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            if (choice == 1) {
                System.out.println("--- Menu ---\n" +
                        "         Burger : $8\n" +
                        "         Pizza  : $15\n" +
                        "         Pasta  : $12");
            } else if (choice == 2) {
                System.out.print(" Enter item (burger/pizza/pasta): ");
                String food = scanner.nextLine();

                System.out.print("Enter quantity: ");
                int quantity = scanner.nextInt();

                double total = 0;
                if (food.equalsIgnoreCase("burger")){
                    total = quantity * 8;
                } else if (food.equalsIgnoreCase("pizza")) {
                    total = quantity * 15;
                } else if (food.equalsIgnoreCase("pasta")) {
                    total = quantity *12;
                }else {
                    System.out.println("Invalid Input. Please try again!");
                    continue;
                }

                System.out.println("You ordered: " + quantity + " " + food + "/s");
                System.out.println("Total price: $" + total);
            } else if (choice == 3) {
                System.out.println("Thank you for visiting Java Dine. Goodbye!");
                break;

            }else {
                System.out.println("Invalid Input. Please try again!");
            }
        }

    }
}

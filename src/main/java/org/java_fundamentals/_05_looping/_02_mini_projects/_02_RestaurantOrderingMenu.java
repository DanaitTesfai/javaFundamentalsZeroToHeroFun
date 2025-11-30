package org.java_fundamentals._05_looping._02_mini_projects;

import java.util.Scanner;

public class _02_RestaurantOrderingMenu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Welcome to Java Dine ===");
        System.out.println("Profile: Waiter Order System");

        int choice = 0;
        double totalIncome = 0;
        int burgerCount = 0 , pizzaCount = 0, pastaCount = 0;
        double burgerPrice = 8 , pizzaPrice = 15 , pastaPrice = 12;

        while (true){
            System.out.println("1. View EnrollmentController");
            System.out.println("2. Place an Order");
            System.out.println("3. Exit");

            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            if (choice == 1) {
                System.out.println("--- EnrollmentController ---\n" +
                        "         Burger : $"+burgerPrice+"\n" +
                        "         Pizza  : $"+pizzaPrice+"\n" +
                        "         Pasta  : $"+pastaPrice);
            } else if (choice == 2) {
                System.out.print(" Enter item (burger/pizza/pasta): ");
                String food = scanner.nextLine();

                System.out.print("Enter quantity: ");
                int quantity = scanner.nextInt();

                double total = 0;
                if (food.equalsIgnoreCase("burger")){
                    total = quantity * 8;
                    totalIncome += total;
                    burgerCount += quantity;
                } else if (food.equalsIgnoreCase("pizza")) {
                    total = quantity * 15;
                    totalIncome += total;
                    pizzaCount += quantity;
                } else if (food.equalsIgnoreCase("pasta")) {
                    total = quantity *12;
                    totalIncome += total;
                    pastaCount += quantity;
                }else {
                    System.out.println("Invalid Input. Please try again!");
                    continue;
                }

                System.out.println("You ordered: " + quantity + " " + food + "/s");
                System.out.println("Total price: $" + total);
            } else if (choice == 3) {
                System.out.println("=== Order Summary ===");
                System.out.println("Burger: " + burgerCount + " x $" + burgerPrice + " = $" + (burgerPrice * burgerCount));
                System.out.println("Pizza: " + pizzaCount + " x $" + pizzaPrice + " = $" + (pizzaPrice * pizzaCount));
                System.out.println("Pasta: " + pastaCount + " x $" + pastaPrice + " = $" + (pastaPrice * pastaCount));
                System.out.println("Total Income from Orders: $" + totalIncome);
                System.out.println("Thank you for visiting Java Dine. Goodbye!");
                break;

            }else {
                System.out.println("Invalid Input. Please try again!");
            }
        }

    }
}

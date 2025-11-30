package org.java_fundamentals._07_OOP._07_interface._09_megaMart;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Menu {
    ArrayList<Product> products = new ArrayList<>();

    public void displayMenu(Scanner sc) {
        while (true) {
            System.out.println("=== Product Management EnrollmentController ===");
            System.out.println("1. Add Product\n" +
                    "2. View Products\n" +
                    "3. Search Product by ID\n" +
                    "4. Exit");
            System.out.print("Choose option: ");
            int option = sc.nextInt();
            sc.nextLine();

            switch (option) {
                case 1:
                    addProduct(sc);
                    break;
                case 2:
                    viewProducts();
                    break;
                case 3:
                    searchProduct(sc);
                    break;
                case 4:
                    System.out.println("Exiting program...");
                    return;
                default:
                    System.out.println("Invalid input. Please try again.");
                    break;
            }
        }

    }


    private void addProduct(Scanner sc) {
        System.out.print("Enter Product Type: 1.Electronic 2.Grocery");
        int productType = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Product ID: ");
        String productId = sc.nextLine();

        System.out.print("Enter Product name: ");
        String name = sc.nextLine();

        System.out.print("Enter Base Price: ");
        double basePrice = sc.nextDouble();
        sc.nextLine();

        Product product;
        if (productType == 1) {
            System.out.print("Enter Warranty (years): ");
            int years = sc.nextInt();

            if (!Validation.isValidDaysOrYears(years)) {
                System.out.println("Invalid input.Years should be positive.");
                return;
            }

            product = new ElectronicProduct(productId, name, basePrice, years);

        } else if (productType == 2) {
            System.out.print("Enter expiry days: ");
            int days = sc.nextInt();

            if (!Validation.isValidDaysOrYears(days)) {
                System.out.println("Invalid input.Days should be positive.");
                return;
            }

            product = new GroceryProduct(productId, name, basePrice, days);
        } else {
            System.out.println("Invalid product type.");
            return;
        }
        if (products.contains(product)) {
            System.out.println("Product already exists.");
            return;
        }
        products.add(product);
        System.out.println("Product added successfully.");


    }

    private void viewProducts() {
        if (products.isEmpty()){
            System.out.println("There are no products.");
        }else {
            for (Product p: products){
                p.displayInfo();
            }
        }
    }

    private void searchProduct(Scanner sc) {
        System.out.print("Enter the product id you want to search: ");
        String name = sc.nextLine();

        for (Product p: products){
            if (name.equals(p.getProductId())){
                System.out.println("Product found:");
                p.displayInfo();
                return;
            }
        }
        System.out.println("Product not found.");
    }
}

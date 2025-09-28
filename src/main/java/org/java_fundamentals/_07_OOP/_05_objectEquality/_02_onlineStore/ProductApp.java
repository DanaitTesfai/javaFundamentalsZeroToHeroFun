package org.java_fundamentals._07_OOP._05_objectEquality._02_onlineStore;

import org.java_fundamentals._07_OOP._05_objectEquality._01_student.Student;

import java.time.format.SignStyle;
import java.util.ArrayList;
import java.util.Scanner;

public class ProductApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Product> products = new ArrayList<>();

        System.out.println("===== Online Store Login =====");

        String userN = "manager";
        String passW = "store123";
        String uName;
        String pWord;

        while (true){
            System.out.print("Enter username: ");
            uName = sc.nextLine();

            System.out.print("Enter password: ");
            pWord = sc.nextLine();


            if (uName.equals(userN) && pWord.equals(passW)){
                System.out.println("Login successful!");
                break;
            }else {
                System.out.print("Username or Password is incorrect.\nDo you want to continue? (1. yes / 2. no): ");
                int option = sc.nextInt();
                sc.nextLine();

                if (option == 1){
                    System.out.println("Trying again....");
                } else if (option == 2) {
                    System.out.println("See you next time.");
                    return;

                } else {
                    System.out.println("Invalid input.");
                }

            }
        }

        System.out.println("=== Online Store Menu ===");

        boolean exit = false;
        while (!exit){
            System.out.println("1. Add Product\n" +
                    "  2. View Products\n" +
                    "  3. Search Product by Name\n" +
                    "  4. Exit");
            System.out.print("Choose an option: ");
            int option = sc.nextInt();
            sc.nextLine();

            switch (option){
                case 1:
                    System.out.print("Enter Product ID: ");
                    String id = sc.nextLine();

                    System.out.print("Enter Product name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Price: ");
                    double price = sc.nextInt();
                    sc.nextLine();

                    Product newProduct = new Product(id, name, price);

                    if (products.contains(newProduct)){
                        System.out.println("Duplicate product! Cannot add.");
                    }else {
                        products.add(newProduct);
                        System.out.println("Product added successfully!");
                    }
                    break;

                case 2:
                    System.out.println("--- Product List ---");
                    if (products.isEmpty()){
                        System.out.println("There are no products currently.");
                    }else {
                        for (Product p : products){
                            System.out.println(p);
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter product name to search: ");
                    String searchName = sc.nextLine();

                    boolean isFound = false;
                    for (Product p : products){
                        if (p.getName().equals(searchName)){
                            System.out.println("Product found: " + p);
                            isFound = true;
                            break;
                        }
                    }
                    if (!isFound){
                        System.out.println("Product not found.");
                    }
                    break;


                case 4 :
                    System.out.println("Exiting system... Goodbye!");
                    exit = true;
                    break;

                default:
                    System.out.println("Invalid input. Please try again.");
            }

        }
    }
}

package org.java_fundamentals._07_OOP._06_inheritanceAndPolymorphism._04_carRentalSystem;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    ArrayList<Car> cars = new ArrayList<>();

    public void displayMenu(Scanner sc){
        while (true){
            System.out.println("=== Car Rental EnrollmentController ===\n" +
                    "1. Register Car\n" +
                    "2. View All Cars\n" +
                    "3. Search Car by ID\n" +
                    "4. Exit");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice){
                case 1:
                    registerCar(sc);
                    break;
                case 2:
                    viewCars();
                    break;
                case 3:
                    searchCar(sc);
                    break;
                case 4:
                    System.out.println("Goodbye!");
                    return;
                default:
                    System.out.println("Invalid input.");
                    break;
            }
        }
    }

    public void registerCar(Scanner sc){
        System.out.println("Choose car type:");
        System.out.println("1. Sedan\n" +
                "2. SUV");
        System.out.print("Enter you choice: ");
        int choice = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Car ID: ");
        String id = sc.nextLine();

        System.out.print("Enter Car Brand: ");
        String brand = sc.nextLine();

        System.out.print("Enter Car Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Car Price: ");
        double price = sc.nextDouble();

        if (!Validation.isValidId(id)){
            System.out.println("Invalid Id.");
            return;
        }

        if (!Validation.isValidName(brand)){
            System.out.println("Invalid Brand.");
            return;
        }

        if (!Validation.isValidName(name)){
            System.out.println("Invalid Name.");
            return;
        }

        if (!Validation.isValidPrice(price)){
            System.out.println("Invalid Price.");
            return;
        }

        Car car;
        if (choice == 1){
            System.out.print("Enter Trunk Size (in liters): ");
            double trunkSize = sc.nextDouble();

            car = new Sedan(name, brand, price, id, trunkSize);

        } else if (choice == 2) {
            System.out.print("Has Off-Road Capability? (true/false): ");
            boolean isOffRoad = sc.nextBoolean();

            car = new SUV(name, brand, price, id, isOffRoad);
        }else {
            System.out.println("Invalid input");
            return;
        }

        if (cars.contains(car)){
            System.out.println("Duplicate car detected! Registration not allowed.");

        }else {
            cars.add(car);
            System.out.println("Car registered successfully!");
        }


    }


    public void viewCars(){
        if (cars.isEmpty()){
            System.out.println("There are no registered cars yet.");
        }else {
            for (Car c: cars){
                c.displayInfo();
            }
        }
    }



    public void searchCar(Scanner input){
        System.out.print("Enter Car ID to search: ");
        String id = input.nextLine();

        for (Car c: cars){
            if (c.getCarId().equals(id)){
                System.out.println("Car found:");
                c.displayInfo();
                return;
            }
        }
        System.out.println("Car not found.");

    }






}

package org.java_fundamentals._05_looping._02_mini_projects;

import java.util.Scanner;

public class _04_carRentalSystem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== Welcome to EasyCar Rentals ===");

        double sedanPrice = 50, suvPrice = 80, luxuryPrice = 120;
        int sedanCount = 0, suvCount = 0, luxuryCount = 0;
        double sedanIncome = 0, suvIncome = 0, luxuryIncome = 0;


        while (true) {
            System.out.println("1. View Available Cars\n" +
                    " 2. Rent a Car\n" +
                    " 3. Exit and Show Summary");
            System.out.print("Enter choice: ");
            int choice = input.nextInt();
            input.nextLine();

            if (choice == 1) {
                System.out.println("Sedan: $50 per day\n" +
                        " SUV: $80 per day\n" +
                        " Luxury Car: $120 per day");
            } else if (choice == 2) {
                System.out.print("Enter car type (sedan/suv/luxury): ");
                String carType = input.nextLine();

                System.out.print("Enter number of cars: ");
                int numberOfCars = input.nextInt();

                System.out.print("Enter rental days: ");
                int rentalDays = input.nextInt();

                double cost = 0;

                if (carType.equalsIgnoreCase("sedan")) {
                    cost = sedanPrice * rentalDays * numberOfCars;
                    sedanCount += numberOfCars;
                    sedanIncome += cost;


                } else if (carType.equalsIgnoreCase("suv")) {
                    cost = suvPrice * rentalDays * numberOfCars;
                    if (rentalDays > 7) cost = cost - (cost * 0.1);   //same as cost *= 0.9
                    suvCount += numberOfCars;
                    suvIncome += cost;


                } else if (carType.equalsIgnoreCase("luxury")) {
                    cost = luxuryPrice * rentalDays * numberOfCars;
                    if (rentalDays > 7)
                        cost *= 0.85;    //  cost = cost - (cost * 0.15)=cost-0.15cost=cost(1-0.15)=0.85cost=cost * 0.85--->---cost*=0.85
                    luxuryCount += numberOfCars;
                    luxuryIncome += cost;


                } else {
                    System.out.println("Invalid input!");
                    continue;
                }
                System.out.println("Total Rental Cost: $" + cost);

            } else if (choice == 3) {
                System.out.println("=== Rental Summary ===");
                System.out.println("Sedans rented: " + sedanCount + ", Income: $" + sedanIncome);
                System.out.println("SUV rented: " + suvCount + ", Income: $" + suvIncome);
                System.out.println("Luxury rented: " + luxuryCount + ", Income: $" + luxuryIncome);
                System.out.println("Total Income = $" + (sedanIncome + suvIncome + luxuryIncome));
                System.out.println("Thank you for renting with us!");
                break;
            } else {
                System.out.println("Invalid input. Please try again");
            }
        }
    }
}

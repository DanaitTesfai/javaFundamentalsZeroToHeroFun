package org.java_fundamentals._06_arrays._02_projects;

import javax.xml.transform.Source;
import java.util.Scanner;

public class _01_HotelBookingSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] roomTypes = {"Standard", "Deluxe", "Suite"};
        double[] roomPrices = {40, 70, 150};

        int [] roomsCount = new int[3];
        double[] roomIncome = new double[3];

        System.out.println("==============================");
        System.out.println("Welcome to SunnyStay Hotel");
        System.out.println("==============================");

        while(true) {
            System.out.println("1. Book a Room\n" +
                    " 2. Show Summary Report\n" +
                    " 3. Exit");

            System.out.print("Enter your choice: ");
            int choice  = sc.nextInt();

            if (choice == 1 ) {
                System.out.println("Select Room Type: ");
                for(int i = 0 ; i < roomTypes.length ; i++){
                    System.out.println((i+1) + "." + roomTypes[i] + " ($" + roomPrices[i] + "/night)") ;

                }
                System.out.print("Enter your choice: ");
                int roomChoice = sc.nextInt();

                if(roomChoice<1 || roomChoice>3) {
                    System.out.println("Invalid input. Please try again.");
                    continue;
                }

                System.out.println("Enter number of rooms: ");
                int numberOfRooms = sc.nextInt();

                System.out.println("Enter number of nights: ");
                int numberOfNights = sc.nextInt();

                double total = roomPrices[roomChoice-1] * numberOfRooms * numberOfNights;

                if (roomChoice ==2 && numberOfNights > 5) {
                    total *= 0.9;
                } else if (roomChoice ==3 && numberOfNights > 5) {
                    total *= 0.8;
                }

                roomsCount[roomChoice-1]+= numberOfRooms;
                roomIncome[roomChoice-1]+= total;

                System.out.println("Booking successful! Total cost: $" + total);

            } else if (choice == 2) {
                System.out.println(" Summary Report:");
                double totalIncome = 0;
                for(int i = 0 ; i < roomTypes.length ; i++){
                    System.out.println(roomTypes[i] + " Rooms booked: " + roomsCount[i] + " | Income: $" + roomIncome[i]);
                    totalIncome += roomIncome[i];
                }

                System.out.println("----------------------------------------");
                System.out.println("Total Income: $" + totalIncome);

            } else if (choice == 3) {
                System.out.println("Exiting... Thank you for choosing SunnyStay Hotel!");
                break;
            }else {
                System.out.println("Invalid input. Please try again.");
            }

        }
    }
}

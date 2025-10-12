package org.java_fundamentals._07_OOP._06_inheritanceAndPolymorphism._05_hotelRoomBooking;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    ArrayList<Room> rooms = new ArrayList<>();

    public void displayMenu(Scanner input){
        while (true){
            System.out.println("=== Hotel Room Management ===\n" +
                    "1. Register Room\n" +
                    "2. View Rooms\n" +
                    "3. Search Room by ID\n" +
                    "4. Exit");
            System.out.print("Choose an option: ");
            int option = input.nextInt();
            input.nextLine();

            switch (option){
                case 1:
                    registerRoom(input);
                    break;
                case 2:
                    viewRooms();
                    break;
                case 3:
                    searchRoom(input);
                    break;
                case 4:
                    System.out.println("Exiting... Goodbye!");
                    return;
                default:
                    System.out.println("Invalid input. Please try again.");
                    break;
            }
        }
    }





    public void registerRoom(Scanner input){
        System.out.println("Select room type:");
        System.out.println("1. Standard Room\n" +
                "2. Deluxe Room");
        int choice = input.nextInt();
        input.nextLine();

        System.out.print("Enter Room ID: ");
        String roomId = input.nextLine();

        System.out.print("Enter Price per Night: ");
        double price = input.nextDouble();

        System.out.print("Is Available? (true/false): ");
        boolean isAvailable = input.nextBoolean();

        if (!Validation.isValidRoomId(roomId)){
            System.out.println("Invalid room Id.");
            return;
        }

        if (!Validation.isValidPrice(price)){
            System.out.println("Invalid price.");
            return;
        }

        if (choice ==1 ){
            System.out.print("Enter Bed Count: ");
            int bedCount = input.nextInt();

            Room standardRoom = new StandardRoom(roomId, price,isAvailable, bedCount);
            rooms.add(standardRoom);
            System.out.println("Room registered successfully!");

        } else if (choice == 2) {
            System.out.print("Has Jacuzzi? (true/false): ");
            boolean hasJacuzzi = input.nextBoolean();

            Room deluxeRoom = new DeluxeRoom(roomId, price, isAvailable,hasJacuzzi);
            rooms.add(deluxeRoom);
            System.out.println("Room registered successfully!");

        }else {
            System.out.println("Invalid input. ");
            return;
        }


    }




    public void viewRooms(){
        System.out.println("--- Room List ---");
        if (rooms.isEmpty()){
            System.out.println("There are no registered rooms.");
        }else {
            for (Room r: rooms){
                r.displayInfo();
            }
        }
    }




    public void searchRoom(Scanner input){
        System.out.print("Enter Room ID to search: ");
        String roomId = input.nextLine();

        for (Room r: rooms){
            if (r.getRoomId().equals(roomId)){
                System.out.println("Room found:");
                r.displayInfo();
                return;
            }
        }
        System.out.println("Room not found.");

    }



}

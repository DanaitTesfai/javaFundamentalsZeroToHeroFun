package org.java_fundamentals._07_OOP._08_abstractClass._02_HotelBookingSystem;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    ArrayList<Guest> guests = new ArrayList<>();

    public void displayMenu(Scanner sc) {
        while (true) {
            System.out.println("=== Guest Management Menu ===");
            System.out.println("1. Register Guest\n" +
                    "2. View All Guests\n" +
                    "3. Search Guest by ID\n" +
                    "4. Exit");
            System.out.print("Choose: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    registerGuest(sc);
                    break;
                case 2:
                    viewGuests();
                    break;
                case 3:
                    searchGuests(sc);
                    break;
                case 4:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid input. Please try again.");
                    break;
            }
        }


    }


    private void registerGuest(Scanner sc) {
        System.out.print("Select Guest Type: 1. Regular Guest  2. VIP Guest");
        int option = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Guest ID: ");
        String guestId = sc.nextLine();

        System.out.print("Enter name: ");
        String name = sc.nextLine();

        System.out.print("Enter Nights of Stay: ");
        int nights = sc.nextInt();

        System.out.print("Enter Cost Per Night: ");
        double costPerNight = sc.nextInt();

        if (!Validation.isValidId(guestId)) {
            System.out.println("Invalid id.");
            return;
        }

        if (!Validation.isNonEmpty(name)) {
            System.out.println("Invalid name");
            return;
        }

        if (!Validation.isPositiveInt(nights)) {
            System.out.println("Invalid number of nights.");
            return;
        }

        if (!Validation.isPositive(costPerNight)) {
            System.out.println("Invalid amount.");
            return;
        }

        Guest guest;
        if (option == 1) {
            guest = new RegularGuest(guestId, name, nights, costPerNight);
        } else if (option == 2) {
            System.out.print("Enter service charge: ");
            double serviceCharge = sc.nextDouble();

            if (!Validation.isPositive(serviceCharge)) {
                System.out.println("Invalid amount.");
                return;
            }
            guest = new VIPGuest(guestId, name, nights, costPerNight, serviceCharge);

        } else {
            System.out.println("Invalid input.");
            return;
        }

        if (guests.contains(guest)) {
            System.out.println("Guest already registered.");
            return;
        }
        guests.add(guest);
        System.out.println("Guest Registered Successfully!");


    }

    private void viewGuests() {
        if (guests.isEmpty()){
            System.out.println("There are no registered guests.");
        }else {
            for (Guest g: guests){
                g.displayInfo();
            }
        }
    }

    private void searchGuests(Scanner sc) {
        System.out.print("Enter the guest id you want to search: ");
        String guestIdToSearch = sc.nextLine();

        for (Guest g: guests){
            if (g.getGuestId().equals(guestIdToSearch)){
                System.out.println("Guest found");
                g.displayInfo();
                return;
            }
        }
        System.out.println("Guest not found.");

    }
}

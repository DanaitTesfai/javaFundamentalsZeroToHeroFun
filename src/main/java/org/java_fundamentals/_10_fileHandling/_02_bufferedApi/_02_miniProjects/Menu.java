package org.java_fundamentals._10_fileHandling._02_bufferedApi._02_miniProjects;

import java.util.Scanner;

public class Menu {

    public void mainMenu(Scanner sc, RentalSystem rs){
        while (true){
            System.out.println("==== RENTAL SYSTEM ====\n" +
                    "1. Register\n" +
                    "2. Login\n" +
                    "3. Exit");
            System.out.print("Choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice){
                case 1:
                    System.out.print("Enter username: ");
                    String username = sc.nextLine();

                    System.out.print("Enter password: ");
                    String password = sc.nextLine();

                    User u = new User(username, password);
                    rs.registerUser(u);

                    break;
                case 2:
                    System.out.print("Username: ");
                    String loginUsername = sc.nextLine();

                    System.out.print("Password: ");
                    String loginPassword = sc.nextLine();

                    User user = rs.loginUser(loginUsername,loginPassword);

                    if (user == null){
                        System.out.println("Invalid login.");
                        return;
                    } else if (user.getUsername().equalsIgnoreCase("admin")) {
                        adminMenu(sc,rs);
                    }else {
                        userMenu(sc,rs, user);
                    }

                    break;
                case 3:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid input. Please try again.");
            }
        }
    }


    public void adminMenu(Scanner sc, RentalSystem rs){
        while (true){
            System.out.println("==== ADMIN MENU ====\n" +
                    "1. Add Vehicle\n" +
                    "2. Delete Vehicle\n" +
                    "3. List Vehicles\n" +
                    "4. Search Vehicle\n" +
                    "5. Update Vehicle\n" +
                    "6. Logout");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice){
                case 1:
                    System.out.print("Vehicle ID: ");
                    String vid = sc.nextLine();

                    System.out.print("Model: ");
                    String model = sc.nextLine();

                    System.out.print("Type: ");
                    String type = sc.nextLine();

                    System.out.print("Price per day: ");
                    double pricePerDay = sc.nextDouble();

                    Vehicle vehicle = new Vehicle(vid, model, type,pricePerDay);

                    rs.addVehicle(vehicle);
                    break;
                case 2:
                    System.out.print("Vehicle ID: ");
                    String id = sc.nextLine();

                    rs.deleteVehicle(id);
                    break;
                case 3:
                    rs.showVehicles();
                    break;
                case 4:
                    searchVehicle(sc, rs);
                    break;
                case 5:
                    System.out.print("Enter vehicle ID to update: ");
                    String newId = sc.nextLine(); sc.nextLine();

                    System.out.print("Enter new model: ");
                    String newModel = sc.nextLine();

                    System.out.print("Enter new type: ");
                    String newType = sc.nextLine();

                    System.out.print("Enter new price per day: ");
                    double newPrice = sc.nextDouble(); sc.nextLine();

                    Vehicle updateVehicle = new Vehicle(newId,newModel, newType, newPrice);

                    rs.updateVehicle(updateVehicle);
                    break;
                case 6:
                    System.out.println("Logging out.");
                    return;
                default:
                    System.out.println("Invalid input. Please try again.");

            }
        }
    }

    private static void searchVehicle(Scanner sc, RentalSystem rs) {
        System.out.print("Enter keyword: ");
        String keyword = sc.nextLine();

        rs.searchVehicle(keyword);
    }


    public void userMenu(Scanner sc, RentalSystem rs, User user){
        while (true){
            System.out.println("==== USER MENU ====\n" +
                    "1. Rent Vehicle\n" +
                    "2. View My Rentals\n" +
                    "3. Search vehicle\n" +
                    "4. Return Vehicle\n" +
                    "5. Logout");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice){
                case 1:
                    System.out.println("Available Vehicles:");
                    rs.showVehicles();

                    System.out.print("Vehicle ID: ");
                    String vid = sc.nextLine();

                    System.out.print("Enter date (YYYY-MM-DD): ");
                    String date = sc.nextLine();

                    rs.rentVehicle(user, vid, date);
                    break;
                case 2:
                    user.showRentals();
                    break;
                case 3:
                    searchVehicle(sc, rs);
                    break;
                case 4:
                    rs.showRentedVehicles(user);
                    System.out.print("Enter vehicle id to return: ");
                    String retId = sc.nextLine();

                    rs.returnVehicle(user, retId);
                    break;

                case 5:
                    System.out.println("Logging out.");
                    return;
                default:
                    System.out.println("Invalid input. Please try again.");

            }
        }
    }
}

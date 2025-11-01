package org.java_fundamentals._07_OOP._09_realLifeProjects._02_royalStayHotel;

import org.java_fundamentals._07_OOP._07_interface._04_multipleInheritance.Swimmable;
import org.java_fundamentals._07_OOP._09_realLifeProjects._01_FitLifeGymManagementSystem.MemberManager;

import java.util.Scanner;

public class Menu {

    public void start(Scanner sc, UserManager um, GuestManager gm){
        System.out.println("===== RoyalStay System Login ===== ");
        System.out.print("Username: ");
        String username = sc.nextLine();

        System.out.print("Password: ");
        String password = sc.nextLine();

        User u = um.authenticate(username,password);

        if (u == null){
            System.out.println("Invalid username or password.");
            return;
        }

        if (u.isAdmin()){
            System.out.println("Welcome Admin!");
            adminMenu(sc, um, gm);
        }else {
            System.out.println("Welcome Staff!");
            staffMenu(sc,gm);
        }

    }


    public void adminMenu(Scanner sc, UserManager um, GuestManager gm){
        while (true){
            System.out.println("=== ADMIN MAIN MENU === \n" +
                    "   1. User Management \n" +
                    "   2. Guest Management \n" +
                    "   3. Exit");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice){
                case 1:
                    userManagement(sc,um);
                    break;
                case 2:
                    guestManagement(sc,gm);
                    break;
                case 3:
                    System.out.println("Exit.");
                    return;
                default:
                    System.out.println("Invalid input.");
            }
        }


    }


    public void userManagement(Scanner sc, UserManager um){
        while (true){
            System.out.println("User Management ");
            System.out.println("   1. Register New Staff User \n" +
                    "   2. View All Users \n" +
                    "   3. Deactivate User \n" +
                    "   4. Back");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice){
                case 1:
                    registerStaff(sc, um);
                    break;
                case 2:
                    viewUsers(um);
                    break;
                case 3:
                    deactivateUser(sc,um);
                    break;
                case 4:
                    System.out.println("Back to admin menu.");
                    return;
                default:
                    System.out.println("Invalid input.");
            }
        }

    }

    public void registerStaff(Scanner sc, UserManager um){
        System.out.print("Enter username: ");
        String username = sc.nextLine();

        System.out.print("Enter password: ");
        String password = sc.nextLine();

        if (username.isBlank() || password.isBlank()){
            System.out.println("Username and password cant be blank.");
            return;
        }

        User u = new User(username,password, "Staff", true);
        boolean ok = um.addUser(u);
        if (ok){
            System.out.println("Staff registered successfully.");
        }else {
            System.out.println("Duplicate username, registration failed.");
        }

    }

    public void viewUsers(UserManager um){
        um.listUsers();
    }

    public void deactivateUser(Scanner sc, UserManager um){
        System.out.print("Enter username to deactivate: ");
        String username =sc.nextLine();

        boolean ok = um.deactivateUser(username);

        System.out.println(ok ? "User deactivated successfully." : "User not found");

    }





    public void guestManagement(Scanner sc, GuestManager gm){
        while (true){
            System.out.println("Guest Management ");
            System.out.println("    1. Register New Guest (Reservation) \n" +
                    "   2. View All Guests \n" +
                    "   3. Search Guest by ID \n" +
                    "   4. Check-Out Guest (Bill) \n" +
                    "   5. Back");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice){
                case 1:
                    registerGuest(sc,gm);
                    break;
                case 2:
                    viewGuests(gm);
                    break;
                case 3:
                    searchGuest(sc,gm);
                    break;
                case 4:
                    checkOutGuest(sc,gm);
                    break;
                case 5:
                    System.out.println("Back to admin menu.");
                    return;
                default:
                    System.out.println("Invalid input.");
            }

        }

    }

    public void registerGuest(Scanner sc, GuestManager gm){
        System.out.print("Select Guest Type: 1. Regular  2. VIP ");
        int guestType = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Guest Id: ");
        String guestId = sc.nextLine();

        System.out.print("Enter name: ");
        String name = sc.nextLine();

        System.out.print("Enter nights: ");
        int nights = sc.nextInt();

        System.out.print("Enter cost per night: ");
        double costPerNight = sc.nextDouble();

        Guest guest = null;
        if (guestType == 1){
            System.out.print("Enter Room No: ");
            int roomNo = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter Status: ");
            String reservationStatus = sc.nextLine();

            guest = new RegularGuest(guestId,name,nights, roomNo, reservationStatus,costPerNight);
        } else if (guestType == 2) {
            System.out.print("Enter Room No: ");
            int roomNo = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter Status: ");
            String reservationStatus = sc.nextLine();

            System.out.print("Enter service charge: ");
            double serviceCharge = sc.nextDouble();

            System.out.print("Spa access: ");
            boolean spaAccess = sc.nextBoolean();

            System.out.print("Meal included: ");
            boolean mealIncluded = sc.nextBoolean();

            guest = new VipGuest(guestId,name, nights, roomNo,reservationStatus,costPerNight,serviceCharge,spaAccess,mealIncluded);


        }else {
            System.out.println("Invalid input.");
            return;
        }

        boolean ok = gm.addGuest(guest);
        System.out.println(ok ? "Guest Registered Successfully!" : "Guest already registered.");
    }

    public void viewGuests(GuestManager gm){
        gm.listGuests();

    }

    public void searchGuest(Scanner sc, GuestManager gm){
        System.out.print("Enter Guest Id: ");
        String guestId = sc.nextLine();

        Guest g = gm.findById(guestId);
        if (g == null){
            System.out.println("Guest not found.");
            return;
        }
        System.out.println("Guest found.");
        g.displayInfo();
    }

    public void checkOutGuest(Scanner sc, GuestManager gm){
        System.out.print("Enter Guest Id: ");
        String guestId = sc.nextLine();

        boolean ok = gm.checkout(guestId);
        if (!ok){
            System.out.println("Guest doesn't exist.");
        }
    }




    public void staffMenu(Scanner sc, GuestManager gm){
        while (true){
            System.out.println("STAFF (USER) MENU \n" +
                    "=== STAFF MAIN MENU === \n" +
                    "   1. Register Guest / Create Reservation \n" +
                    "   2. View Guest List \n" +
                    "   3. Search Guest by ID \n" +
                    "   4. Check-Out Guest (Generate Bill) \n" +
                    "   5. Exit");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice){
                case 1:
                    registerGuest(sc,gm);
                    break;
                case 2:
                    viewGuests(gm);
                    break;
                case 3:
                    searchGuest(sc,gm);
                    break;
                case 4:
                    checkOutGuest(sc,gm);
                    break;
                case 5:
                    System.out.println("Exit.");
                    return;
                default:
                    System.out.println("Invalid input.");
            }
        }


    }

}

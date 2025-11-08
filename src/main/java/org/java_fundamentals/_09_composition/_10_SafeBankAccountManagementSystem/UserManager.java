package org.java_fundamentals._09_composition._10_SafeBankAccountManagementSystem;

import java.util.ArrayList;
import java.util.Scanner;

public class UserManager {
    ArrayList<User> users = new ArrayList<>();

    public UserManager() {
        try {
            users.add(new Admin("admin", "1234"));
        } catch (InvalidInputException e) {
            System.out.println("Error seeding the datastore.");
            System.out.println(e.getMessage());
        }

    }

    public User authenticate(String username, String password) throws InvalidInputException {
        for (User u : users) {
            if (u.getUsername().equalsIgnoreCase(username) && u.getPassword().equals(password)) {
                if (!u.isApprovalState()) throw new InvalidInputException("Account not approved yet.");
                return u;
            }
        }
        throw new InvalidInputException("Invalid username or password.");
    }


    public void approveUser(String username) throws InvalidInputException{
        for (User u : users) {
            if (u.getUsername().equalsIgnoreCase(username) && !u.isAdmin()) {
                u.setApprovalState(true);
                System.out.println("✅ User approved.");
                return;
            }
        }
        throw new InvalidInputException("User not found.");

    }


    public void registerUser(String username, String password) throws InvalidInputException {
        Customer customer = new Customer(username, password);

        if (users.contains(customer))
            throw new InvalidInputException("Username already exists. Please try another username.");

        users.add(customer);
        System.out.println("Registration successful. Waiting for admin approval.");
    }


    public void viewUsers() {
        if (users.isEmpty()) {
            System.out.println("There are no users.");
        } else {
            for (User u : users) {
                u.displayInfo();
            }
        }

    }


    public Customer findCustomer(String username) {
        for (User u : users) {
            if (u instanceof Customer && u.getUsername().equalsIgnoreCase(username)) {
                return (Customer) u;
            }
        }
        return null;
    }


    public void viewPendingCustomers() {
        boolean exists = false;
        for (User u : users) {
            if (!u.isApprovalState() && !u.isAdmin()) {
                u.displayInfo();
                exists = true;
            }
        }
        if (!exists) {
            System.out.println("No pending accounts.");
        }
    }
}

package org.java_fundamentals._09_composition._10_SafeBankAccountManagementSystem;

import java.util.Scanner;

public class Menu {
    final Scanner sc = new Scanner(System.in);

    public void start(UserManager um){
        while (true){
            try{
                System.out.println("===== SAFE BANK SYSTEM =====\n" +
                        "        1. Register (Create Account)\n" +
                        "        2. Login\n" +
                        "        3. Exit");
                System.out.print("Choice: ");
                int choice = sc.nextInt();
                sc.nextLine();

                switch (choice){
                    case 1:
                        register(um);
                        break;
                    case 2:
                        login(um);
                        break;
                    case 3:
                        System.out.println("Exiting....");
                        return;
                    default:
                        System.out.println("Invalid input. Please try again.");
                }
            }catch (Exception e){
                System.out.println("Error: " + e.getMessage());
            }
        }

    }


    public void register(UserManager um) throws InvalidInputException{
        System.out.print("Username: ");
        String username = sc.nextLine();

        System.out.print("Password: ");
        String password = sc.nextLine();

        um.registerUser(username, password);

    }

    public void login(UserManager um)  throws InvalidInputException{
        System.out.print("Username: ");
        String username = sc.nextLine();

        System.out.print("Password: ");
        String password = sc.nextLine();

        User u = um.authenticate(username,password);

        if (u==null){
            System.out.println("User not found.");
            return;
        }
        if (u.isAdmin()){
            adminMenu(um);
        }else {
            customerMenu((Customer)u, um);
        }
    }

    public void adminMenu(UserManager um)  throws InvalidInputException{
        while (true){
            System.out.println("=== ADMIN MENU ===\n" +
                    "        1. Approve Customers\n" +
                    "        2. View User\n" +
                    "        3. View Users\n" +
                    "        4. View Pending Users\n" +
                    "        5. Logout");
            System.out.print("Choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice){
                case 1:
                    System.out.print("Enter username: ");
                    String username = sc.nextLine();

                    um.approveUser(username);
                    break;
                case 2:
                    System.out.print("Enter username: ");
                    Customer customer = um.findCustomer(sc.nextLine());

                    if (customer == null){
                        System.out.println("Customer not found.");
                    }else {
                        customer.displayInfo();
                    }
                    break;
                case 3:
                    um.viewUsers();
                    break;
                case 4:
                    um.viewPendingCustomers();
                    break;
                case 5:
                    System.out.println("Logging out...");
                    return;
                default:
                    System.out.println("Invalid input. Please try again.");

            }

        }
    }



    public void customerMenu(Customer customer, UserManager um){

            while (true){
                try {
                    System.out.println(" === CUSTOMER MENU ===\n" +
                            "        1. Deposit\n" +
                            "        2. Withdraw\n" +
                            "        3. Transfer\n" +
                            "        4. Check Balance\n" +
                            "        5. Logout");
                    System.out.print("Choice: ");
                    int choice = sc.nextInt();
                    sc.nextLine();

                    switch (choice){
                        case 1:
                            System.out.print("Enter amount: ");
                            double depositAmount = sc.nextDouble();

                            customer.getAccount().deposit(depositAmount);
                            break;
                        case 2:
                            System.out.print("Enter amount: ");
                            double withdrawalAmount = sc.nextDouble();

                            customer.getAccount().withdraw(withdrawalAmount);

                            break;
                        case 3:
                            System.out.print("Enter recipient username: ");
                            String recUsername = sc.nextLine();

                            Customer recCustomer = um.findCustomer(recUsername);

                            if (recCustomer == null || !recCustomer.isApprovalState()){
                                System.out.println("Recipient not valid.");
                                break;
                            }
                            System.out.println("Enter transfer amount: ");
                            double transAmount = sc.nextDouble();

                            customer.getAccount().transfer(recCustomer.getAccount(), transAmount);
                            break;
                        case 4:
                            System.out.println("The balance is $" + customer.getAccount().getBalance());
                            break;
                        case 5:
                            System.out.println("Logging out...");
                            return;
                        default:
                            System.out.println("Invalid input. Please try again.");

                    }
                }catch (InvalidInputException e){
                    System.out.println("Error: " + e.getMessage());
                }


            }


    }
}

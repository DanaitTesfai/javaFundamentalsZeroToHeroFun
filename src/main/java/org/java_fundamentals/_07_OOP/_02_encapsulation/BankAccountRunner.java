package org.java_fundamentals._07_OOP._02_encapsulation;

import java.util.Scanner;

public class BankAccountRunner {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your account number: ");
        String accountNumber = sc.nextLine();
        bankAccount.setAccountNumber(accountNumber);

        while (true) {
            System.out.println("==== Bank Menu ====\n" +
                    "1. Deposit\n" +
                    "2. Withdraw\n" +
                    "3. Check Balance\n" +
                    "4. Exit");

            System.out.print("Choose an option: ");
            int choice = sc.nextInt();

            if (choice == 1) {
                System.out.print("Enter deposit amount: ");
                double amount = sc.nextDouble();
                bankAccount.deposit(amount);

            } else if (choice == 2) {
                System.out.print("Enter withdrawal amount: ");
                double amount = sc.nextDouble();
                bankAccount.withdraw(amount);

            } else if (choice == 3) {
                System.out.println("Current Balance: $" + bankAccount.getBalance());

            } else if (choice == 4) {
                System.out.println("Exiting... Thank you!");
                break;

            } else {
                System.out.println("Invalid input. Please try again");
            }
        }

    }
}

package org.java_fundamentals._07_OOP._01_classedAndObjects._04_bankAccount;

public class BankAccount {
    String name;
    String accountNumber;
    double balance;

    public void deposit(double amount){
        balance += amount;
        System.out.println("Deposited $" + amount + " successfully.");
    }

    public void withdraw(double amount){
        if (balance < amount){
            System.out.println("Withdrawal of $" + amount + " failed.");
            System.out.println("Insufficient balance.");
            return;
        }
        balance -= amount;
        System.out.println("Withdrawal of $" + amount + " successful.");

        /*
             if (balance < amount){
                System.out.println("Withdrawal of $" + amount + " failed.");
                System.out.println("Insufficient balance.");

             } else {
                balance -= amount;
                System.out.println("Withdrawal of $" + amount + " successful.");
             }

         */
    }

    public void checkBalance(){
        System.out.println("Current balance: $" + balance);
    }

    public void displayAccountInfo(){
        System.out.println("Account Info:");
        System.out.println("Name: " + name);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: $" + balance);
    }



}

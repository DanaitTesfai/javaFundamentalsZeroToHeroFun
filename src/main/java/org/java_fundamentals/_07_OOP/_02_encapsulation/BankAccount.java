package org.java_fundamentals._07_OOP._02_encapsulation;

public class BankAccount {
    private String accountNumber;
    private double balance;

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance(){
        return balance;
    }


    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance){
        this.balance = balance;
    }

    public void deposit(double amount){
        if (amount >= 0){
            balance += amount;
            System.out.println("Deposited: $" + amount);
        }else {
            System.out.println("Add a valid amount.");
        }


    }

    public void withdraw(double amount){
        if (balance > amount){
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
        }else {
            System.out.println("Insufficient funds.");
        }
    }

}

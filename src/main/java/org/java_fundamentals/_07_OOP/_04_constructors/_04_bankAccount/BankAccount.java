package org.java_fundamentals._07_OOP._04_constructors._04_bankAccount;

public class BankAccount {
    private int accountNumber;
    private double balance;

    public BankAccount(){
        accountNumber = 0;
        balance = 0.0;
    }

    public BankAccount(int accountNumber, double balance){
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount){
        balance += amount;
    }

    public void withdraw(double amount){
        balance -= amount;
    }
}

package org.java_fundamentals._07_OOP._04_constructors._04_bankAccount;

public class BankAccount {
    private int accountNumber;
    private double balance;
    private String accountHolder;

    public BankAccount() {
    }

    public BankAccount(int accountNumber, double balance, String accountHolder) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.accountHolder = accountHolder;
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

    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public void deposit(double amount){
        if (amount > 0 ){
            balance += amount;
        }else {
            System.out.println("Enter valid amount.");
        }
    }

    public void withdraw(double amount){
        if (amount < balance){
            balance -= amount;
        }else {
            System.out.println("Insufficient funds.");
        }
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "accountNumber=" + accountNumber +
                ", balance=" + balance +
                ", accountHolder='" + accountHolder + '\'' +
                '}';
    }
}
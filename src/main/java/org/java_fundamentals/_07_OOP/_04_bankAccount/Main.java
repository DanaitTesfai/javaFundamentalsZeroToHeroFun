package org.java_fundamentals._07_OOP._04_bankAccount;

public class Main {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();

        String name = "John Smith";
        String accountNumber = "AC12345";
        double balance = 0.0;

        bankAccount.name = name;
        bankAccount.accountNumber = accountNumber;
        bankAccount.balance = 0.0;

        bankAccount.deposit(500);
        bankAccount.withdraw(200);
        bankAccount.checkBalance();
        bankAccount.displayAccountInfo();

    }
}

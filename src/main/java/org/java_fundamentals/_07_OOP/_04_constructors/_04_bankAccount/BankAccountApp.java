package org.java_fundamentals._07_OOP._04_constructors._04_bankAccount;

import java.util.ArrayList;
import java.util.Scanner;

public class BankAccountApp {
    public static void main(String[] args) {
        ArrayList<BankAccount> accounts = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        BankAccount account1 = new BankAccount(1234, 100000, "Nahom");
        BankAccount account2 = new BankAccount(4568, 6000, "Danait");

        accounts.add(account1);
        accounts.add(account2);

        for (BankAccount b : accounts){
            System.out.println(b);
        }

        System.out.print("Deposit: ");
        double amountD = sc.nextDouble();

        account1.deposit(5000);
        System.out.println(account1);

        System.out.println("Withdraw: ");
        double amountW = sc.nextDouble();

        account2.withdraw(500);
        System.out.println(account2);




    }
}

package org.java_fundamentals._07_OOP._07_interface._08_payment;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter amount: ");
        double amount = scanner.nextDouble();

        System.out.println("1. UPI 2. Card");
        System.out.print("Create Payment payment: ");
        int option = scanner.nextInt();

        Payment payment;
        if (option ==1){
            payment = new UpiPayment();
        } else if (option == 2) {
            payment = new CardPayment();
        }else {
            System.out.println("Invalid input.");
            return;
        }

        payment.pay(amount);


    }
}

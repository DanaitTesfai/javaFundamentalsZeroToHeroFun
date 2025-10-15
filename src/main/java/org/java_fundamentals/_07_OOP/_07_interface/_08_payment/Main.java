package org.java_fundamentals._07_OOP._07_interface._08_payment;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true){
            System.out.println("1.Pay");
            System.out.println("2.Exit.");
            System.out.print("Choose: ");
            int choice = scanner.nextInt();

            if (choice == 1){
                System.out.print("Enter amount: ");
                double amount = scanner.nextDouble();
                if (amount <= 0){
                    System.out.println("❌ Invalid amount. Please enter a positive amount.");
                    return;
                }

                System.out.println("Select Payment Method:");
                System.out.println("1\uFE0F⃣ UPI\n" +
                        "2\uFE0F⃣ Debit/Credit Card\n" +
                        "3\uFE0F⃣ Mobile Wallet\n" +
                        "4\uFE0F⃣ Net Banking");
                System.out.print("Enter choice: ");
                int option = scanner.nextInt();

                Payment payment;
                if (option ==1){
                    payment = new UpiPayment();
                } else if (option == 2) {
                    payment = new CardPayment();
                } else if (option ==3 ) {
                    payment = new MobileWallet();
                } else if (option == 4) {
                    payment = new NetBanking();
                } else {
                    System.out.println("❌ Invalid input.");
                    return;
                }

                payment.pay(amount);

            } else if (choice == 2) {
                System.out.println("Exiting......");
                break;
            }else {
                System.out.println("Invalid input.");
            }

        }
        


    }
}

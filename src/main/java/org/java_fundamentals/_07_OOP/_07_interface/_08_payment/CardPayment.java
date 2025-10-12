package org.java_fundamentals._07_OOP._07_interface._08_payment;

public class CardPayment implements Payment{

    @Override
    public void pay(double amount) {
        System.out.println("Paid " +amount + " via Credit Card");
    }
}

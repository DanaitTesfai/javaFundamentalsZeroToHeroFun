package org.java_fundamentals._07_OOP._07_interface._02_bank;

public class SBI implements Bank{
    public void printRate(){
        System.out.println("The interest rate is: " + RATE + "%");
    }
}

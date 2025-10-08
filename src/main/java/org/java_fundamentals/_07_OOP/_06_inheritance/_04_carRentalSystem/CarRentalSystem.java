package org.java_fundamentals._07_OOP._06_inheritance._04_carRentalSystem;

import java.util.Scanner;

public class CarRentalSystem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        if (Validation.login(input)){
            Menu menu = new Menu();
            menu.displayMenu(input);
        }else {
            System.out.println("Log in error. Exiting...");
        }
    }
}

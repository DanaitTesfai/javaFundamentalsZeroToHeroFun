package org.java_fundamentals._07_OOP._08_abstractClass._02_HotelBookingSystem;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        if (Validation.login(input)){
            Menu menu = new Menu();
            menu.displayMenu(input);
        }else {
            System.out.println("Unable to login.");
        }
    }
}

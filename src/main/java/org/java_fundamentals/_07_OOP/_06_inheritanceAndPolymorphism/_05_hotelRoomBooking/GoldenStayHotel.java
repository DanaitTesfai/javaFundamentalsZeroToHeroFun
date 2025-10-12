package org.java_fundamentals._07_OOP._06_inheritanceAndPolymorphism._05_hotelRoomBooking;

import java.util.Scanner;

public class GoldenStayHotel {
    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);

        if (Validation.login(input)){
            Menu menu = new Menu();
            menu.displayMenu(input);
        }else {
            System.out.println("Logging in problem.");
        }
    }
}

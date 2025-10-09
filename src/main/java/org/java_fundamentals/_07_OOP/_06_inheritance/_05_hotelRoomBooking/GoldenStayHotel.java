package org.java_fundamentals._07_OOP._06_inheritance._05_hotelRoomBooking;

import org.java_fundamentals._07_OOP._06_inheritance._04_carRentalSystem.Validation;

import java.util.Scanner;

public class GoldenStayHotel {
    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);

        if (org.java_fundamentals._07_OOP._06_inheritance._05_hotelRoomBooking.Validation.login(input)){
            Menu menu = new Menu();
            menu.displayMenu(input);
        }else {
            System.out.println("Logging in problem.");
        }
    }
}

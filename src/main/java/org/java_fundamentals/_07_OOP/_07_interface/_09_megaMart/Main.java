package org.java_fundamentals._07_OOP._07_interface._09_megaMart;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        if (Validation.login(scanner)){
            Menu menu = new Menu();
            menu.displayMenu(scanner);
        }else {
            System.out.println("Unable to login.");
        }
    }
}

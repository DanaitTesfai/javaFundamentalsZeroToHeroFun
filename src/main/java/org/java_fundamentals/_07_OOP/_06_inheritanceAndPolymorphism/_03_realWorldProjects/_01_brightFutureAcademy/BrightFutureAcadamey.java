package org.java_fundamentals._07_OOP._06_inheritanceAndPolymorphism._03_realWorldProjects._01_brightFutureAcademy;

import java.util.Scanner;

public class BrightFutureAcadamey {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        if (Validation.login(scanner)){
            Menu menu = new Menu();
            menu.displayMenu(scanner);
        }else {
            System.out.println("Exiting program.");
        }
    }
}

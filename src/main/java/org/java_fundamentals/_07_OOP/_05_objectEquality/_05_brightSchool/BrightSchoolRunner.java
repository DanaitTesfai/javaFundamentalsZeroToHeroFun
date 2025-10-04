package org.java_fundamentals._07_OOP._05_objectEquality._05_brightSchool;

import java.util.Scanner;

public class BrightSchoolRunner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean isLoggedIn = Validation.login(input);
        if (isLoggedIn){
            Menu menu = new Menu();
            menu.dispayMenu(input);
        }else {
            System.out.println("There is a log-in error. You can not proceed.");
        }
        input.close();

    }
}

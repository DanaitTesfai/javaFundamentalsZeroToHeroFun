package org.java_fundamentals._07_OOP._05_objectEquality._05_brightSchool;

import java.util.Scanner;

public class BrightSchoolRunner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean isLogedIn = Validation.login(input);
        if (isLogedIn){
            Menu menu = new Menu();
            menu.dispayMenu(input);
        }else {
            System.out.println("There is an error. You can not proceed.");
        }

    }
}

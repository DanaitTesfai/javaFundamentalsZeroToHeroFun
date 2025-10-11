package org.java_fundamentals._07_OOP._06_inheritance._06_gymMembershipSystem;

import java.util.Scanner;

public class GymMembershipSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        if (Validation.login(sc)){
            Menu.displayMenu(sc);
        }else {
            System.out.println("Logging in error.");
        }
    }
}

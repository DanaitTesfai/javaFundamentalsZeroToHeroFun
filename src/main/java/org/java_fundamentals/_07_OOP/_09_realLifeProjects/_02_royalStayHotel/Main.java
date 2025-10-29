package org.java_fundamentals._07_OOP._09_realLifeProjects._02_royalStayHotel;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        UserManager um = new UserManager();
        GuestManager gm = new GuestManager();

        Menu menu = new Menu();
        menu.start(sc,um,gm);
    }
}

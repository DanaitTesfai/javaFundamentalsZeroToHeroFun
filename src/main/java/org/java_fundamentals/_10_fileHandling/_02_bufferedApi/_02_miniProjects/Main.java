package org.java_fundamentals._10_fileHandling._02_bufferedApi._02_miniProjects;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        RentalSystem rs = new RentalSystem();
        rs.loadVehiclesFromFile();
        rs.loadUsersFromFile();

        Menu menu = new Menu();
        menu.mainMenu(sc,rs);
    }


}

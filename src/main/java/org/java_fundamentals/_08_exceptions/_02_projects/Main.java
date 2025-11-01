package org.java_fundamentals._08_exceptions._02_projects;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        UserManager um = new UserManager();
        StudentManager sm = new StudentManager();

        Menu menu = new Menu();
        menu.start(sc,um,sm);
    }
}

package org.java_fundamentals._07_OOP._09_realLifeProjects._01_FitLifeGymManagementSystem;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        UserManager userManager = new UserManager();
        MemberManager memberManager = new MemberManager();

        Menu menu = new Menu();
        menu.start(sc, userManager, memberManager);

    }
}

package org.java_fundamentals._09_composition._10_SafeBankAccountManagementSystem;

public class Main {
    public static void main(String[] args) {
        UserManager um = new UserManager();

        Menu menu = new Menu();
        menu.start(um);
    }
}

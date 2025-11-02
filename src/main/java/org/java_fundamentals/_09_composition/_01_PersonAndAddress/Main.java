package org.java_fundamentals._09_composition._01_PersonAndAddress;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter name: ");
        String name = sc.nextLine();

        System.out.print("Enter city: ");
        String city = sc.nextLine();

        System.out.print("Enter country: ");
        String country = sc.nextLine();

        Address address = new Address(city, country);

        Person person = new Person(name, address);

        person.displayInfo();
    }
}

package org.java_fundamentals._07_OOP._02_encapsulation;

import java.util.Scanner;

public class StudentRunner {
    public static void main(String[] args) {
        Student student1 = new Student();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter student name: ");
        String name = scanner.nextLine();
        student1.setName(name);

        System.out.print("Enter student age: ");
        int age = scanner.nextInt();
        student1.setAge(age);

        student1.displayInfo();


    }
}

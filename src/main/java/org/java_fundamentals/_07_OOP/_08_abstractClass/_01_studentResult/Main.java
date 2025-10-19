package org.java_fundamentals._07_OOP._08_abstractClass._01_studentResult;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Name: ");
        String name = input.nextLine();

        System.out.print("Enter Roll No: ");
        int rollNo = input.nextInt();

        System.out.print("Enter Marks: ");
        double marks = input.nextDouble();
        input.nextLine();

        System.out.print("Student Type(School or College: ");
        String studentType = input.nextLine();

        Student student ;
        if (studentType.equalsIgnoreCase("School")){
            student = new SchoolStudent(name, rollNo, marks);

        } else if (studentType.equalsIgnoreCase("College")) {
            student = new CollegeStudent(name, rollNo, marks);

        }else {
            System.out.println("Invalid input.");
            return;
        }

        student.printDetails();


    }
}

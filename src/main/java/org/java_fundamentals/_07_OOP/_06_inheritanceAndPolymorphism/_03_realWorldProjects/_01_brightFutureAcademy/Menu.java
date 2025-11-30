package org.java_fundamentals._07_OOP._06_inheritanceAndPolymorphism._03_realWorldProjects._01_brightFutureAcademy;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    ArrayList<Student> students = new ArrayList<>();

    public void displayMenu(Scanner scanner){


        while (true){
            System.out.println("=== Student Management EnrollmentController ===\n" +
                    "1. Register Student\n" +
                    "2. View All Students\n" +
                    "3. Search Student by ID\n" +
                    "4. Exit");
            System.out.print("Choose an option: ");
            int option = scanner.nextInt();
            scanner.nextLine();

            switch (option){
                case 1:
                    register(scanner);
                    break;
                case 2:
                    viewAll();
                    break;
                case 3:
                    searchById(scanner);
                    break;
                case 4:
                    System.out.println("Exiting system... Goodbye!");
                    return;
                default:
                    System.out.println("Invalid input.Please try again.");
            }
        }
    }


    public void register(Scanner scanner){
        System.out.println("Select student type:");
        System.out.println("1. Undergraduate\n" +
                "2. Graduate");
        System.out.print("Your choice: ");
        int choice = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter Student ID: ");
        String  studentId = scanner.nextLine();

        System.out.print("Enter Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Age: ");
        int age = scanner.nextInt();
        scanner.nextLine();

        if (!Validation.isValidId(studentId)){
            System.out.println("Invalid Id. (letters or numbers only)");
            return;
        }

        if (!Validation.isValidName(name)){
            System.out.println("Invalid name. ");
            return;
        }

        if (!Validation.isValidAge(age)){
            System.out.println("Invalid age.");
            return;
        }

        Student student;
        if (choice == 1){
            System.out.print("Enter major: ");
            String major = scanner.nextLine();
            if (!Validation.isNonEmpty(major)){
                System.out.println("Invalid major.");
                return;
            }

            student = new UnderGradStudent(name, age, studentId, major);
        } else if (choice ==2) {
            System.out.print("Enter Thesis Title: ");
            String thesis = scanner.nextLine();
            if (!Validation.isNonEmpty(thesis)){
                System.out.println("Invalid thesis.");
                return;
            }
            student= new GradStudent(name, age, studentId,thesis);


        }else {
            System.out.println("Invalid choice.");
            return;
        }

        if (students.contains(student)){
            System.out.println("Duplicate student detected! Registration not allowed.");
        }else {
            students.add(student);
            System.out.println("Student registered successfully!");
        }


    }






    public void viewAll(){
        System.out.println("--- Student List ---l");
        if (students.isEmpty()){
            System.out.println("No registered students yet.");
        }else{
            for (Student s: students){
                s.displayInfo();
            }
        }





    }

    public void searchById(Scanner scanner){
        System.out.print("Enter Student ID to search: ");
        String studentId = scanner.nextLine();

        for (Student s: students){
            if (s.getStudentId().equalsIgnoreCase(studentId)){
                System.out.println("Student found: ");
                s.displayInfo();
                return;
            }
        }
        System.out.println("Student not found.");
    }
}

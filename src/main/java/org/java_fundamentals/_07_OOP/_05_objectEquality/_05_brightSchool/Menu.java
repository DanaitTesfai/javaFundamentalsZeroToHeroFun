package org.java_fundamentals._07_OOP._05_objectEquality._05_brightSchool;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    private ArrayList<Student> students = new ArrayList<>();

    public void displayMenu(Scanner scanner) {
        boolean running = true;

        while (running) {
            System.out.println("=== Student Management EnrollmentController ===\n" +
                    "    1. Register Student\n" +
                    "    2. View All Students\n" +
                    "    3. Search Student by ID\n" +
                    "    4. Exit");
            System.out.print("Choose an option: ");
            int option = scanner.nextInt();
            scanner.nextLine();

            switch (option){
                case 1:
                    addStudent(scanner);
                    break;
                case 2:
                    viewStudents();
                    break;
                case 3:
                    searchStudent(scanner);
                    break;
                case 4:
                    System.out.println("Exiting system... Goodbye!");
                    running = false;
                    break;
                default:
                    System.out.println("Invalid input. Please try again.");
                    break;
            }
        }
    }

    private void addStudent(Scanner scanner) {
        System.out.print("Enter Student ID: ");
        String id = scanner.nextLine();

        System.out.print("Enter Student name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Student age: ");
        int age = scanner.nextInt();
        scanner.nextLine();

        if (!Validation.isValidId(id)){
            System.out.println("Invalid Id. Please use numbers and letters only.");
            return;
        }
        if (!Validation.isValidName(name)){
            System.out.println("Invalid name.");
            return;
        }
        if (!Validation.isValidAge(age)){
            System.out.println("Invalid age.");
            return;
        }

        Student student = new Student(id, name, age);

        if (students.contains(student)){
            System.out.println("Duplicate student detected! Registration not allowed.");
        }else {
            students.add(student);
            System.out.println("Student registered successfully!");
        }


    }

    public void viewStudents(){
        System.out.println("--- Student List ---");
        if (students.isEmpty()){
            System.out.println("No registered students yet.");
        }else {
            for (Student s : students){
                s.displayInfo();
            }
        }
    }

    public void searchStudent(Scanner scanner){
        System.out.print("Enter Student ID to search: ");
        String id = scanner.nextLine();

        for (Student s : students){
            if (s.getStudentId().equals(id)){
                System.out.println("Student found: " + s);
                return;
            }
        }
        System.out.println("Student not found.");
    }
}

package org.java_fundamentals._12_dataStructures._03_miniProjects._01_trainingInstuite.view;

import org.java_fundamentals._12_dataStructures._03_miniProjects._01_trainingInstuite.controller.StudentController;

import java.util.Scanner;

public class StudentView {
    Scanner sc = new Scanner(System.in);
    StudentController studentController;

    public StudentView(StudentController studentController){
        this.studentController = studentController;
    }


    public void start(){
        while (true){
            System.out.println("===============================\n" +
                    " STUDENT MANAGEMENT SYSTEM\n" +
                    "===============================\n" +
                    "1. Add Student\n" +
                    "2. View Students\n" +
                    "0. Exit");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();

            switch (choice){
                case 1:
                    System.out.println("Enter Student ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.println("Enter Student Name: ");
                    String name = sc.nextLine();

                    System.out.println("Enter Course: ");
                    String course = sc.nextLine();

                    studentController.addStudent(id, name, course);

                    break;
                case 2:
                    studentController.viewStudents();
                    break;
                case 0:
                    System.out.println("Exiting....");
                    return;
                default:
                    System.out.println("Invalid input. Please try again.");
            }
        }
    }
}

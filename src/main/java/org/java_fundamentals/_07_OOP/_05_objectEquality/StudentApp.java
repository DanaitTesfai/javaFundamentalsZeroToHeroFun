package org.java_fundamentals._07_OOP._05_objectEquality;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentApp {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        Scanner sc = new Scanner(System.in);


        String userN = "admin";
        String passW = "1234";
        String uName;
        String pWord;

        System.out.println("===== School Admin Login =====");


        while (true){
            System.out.print("Enter username: ");
            uName = sc.nextLine();

            System.out.print("Enter password: ");
            pWord = sc.nextLine();

            if (uName.equals(userN) && pWord.equals(passW)){
                System.out.println("Login successful!");
                break;
            }else {
                System.out.print("Username or Password is incorrect.\nDo you want to continue? (1. yes / 2. no): ");
                int option = sc.nextInt();
                sc.nextLine();

                if (option == 1){
                    System.out.println("Trying again....");
                } else if (option == 2) {
                    System.out.println("See you next time.");
                    return;

                } else {
                    System.out.println("Invalid input.");
                }

            }

        }

        System.out.println("=== Student Management Menu ===");

        boolean running = true;
        while (running){
            System.out.println("1. Register Student\n" +
                    "2. View Students\n" +
                    "3. Search Student by ID\n" +
                    "4. Exit");
            System.out.print("Choose an option: ");
            int option = sc.nextInt();

            switch (option){
                case 1:
                    System.out.print("Enter Student ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Grade: ");
                    int grade = sc.nextInt();

                    Student newStudent = new Student(id, name, grade);

                    if (students.contains(newStudent)){
                        System.out.println("Duplicate student! Registration not allowed.");
                    }else {
                        students.add(newStudent);
                        System.out.println("Student registered successfully!");
                    }
                    break;

                case 2:
                    System.out.println("--- Student List ---");
                    if (students.isEmpty()){
                        System.out.println("There are no registered students currently.");
                    }else {
                        for (Student s : students){
                            System.out.println(s);
                        }
                    }
                    break;

                case 3:
                    System.out.println("Enter Student ID to search: ");
                    int searchId = sc.nextInt();

                    boolean isFound = false;
                    for (Student s : students){
                        if (s.getStudentId() == searchId){
                            System.out.println("Student found: " + s);
                            isFound = true;
                            break;
                        }
                    }
                    if (!isFound){
                        System.out.println("Student not found.");
                    }
                    break;


                case 4 :
                    System.out.println("Exiting system... Goodbye!");
                    running = false;
                    break;

                default:
                    System.out.println("Invalid input. Please try again.");
            }









        }



    }
}

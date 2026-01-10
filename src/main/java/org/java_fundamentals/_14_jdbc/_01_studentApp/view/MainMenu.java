package org.java_fundamentals._14_jdbc._01_studentApp.view;

import org.java_fundamentals._14_jdbc._01_studentApp.controller.StudentController;
import org.java_fundamentals._14_jdbc._01_studentApp.model.Student;

import java.sql.Timestamp;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class MainMenu {
    StudentController studentController = new StudentController();
    Scanner sc = new Scanner(System.in);

    public void start(){
        while (true){
            printMenu();
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1 -> addStudentUI();
                case 2 -> viewAllUI();
                case 3 -> findByIdUI();
                case 4 -> updateUI();
                case 5 -> deleteUI();
                case 0 -> {
                    System.out.println("Bye!");
                    return;
                }
                default -> System.out.println("Invalid choice!");
            }
        }
    }

    private void deleteUI() {
        System.out.print("Id: ");
        int id = sc.nextInt();
        sc.nextLine();

        boolean isDeleted = studentController.deleteStudentById(id);
        System.out.println(isDeleted ? "Student deleted." : "Student deleting failed.");
    }

    private void updateUI() {
        System.out.print("Id: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Name: ");
        String name = sc.nextLine().trim();

        System.out.print("Email: ");
        String email = sc.nextLine().trim();

        System.out.print("Phone: ");
        String phone = sc.nextLine().trim();

        boolean isUpdated = studentController.updateStudent(id,name, email, phone);
        System.out.println(isUpdated ? "Student updated." : "Student updating failed.");
    }

    private void findByIdUI() {
        System.out.print("Id: ");
        int id = sc.nextInt();
        sc.nextLine();
        Optional<Student> student = studentController.findStudentById(id);
        if (student.isPresent()){
            System.out.println(student.get());
        }else {
            System.out.println("Student not found.");
        }
    }

    private void viewAllUI() {
        List<Student> students = studentController.listStudents();
        if (students.isEmpty()){
            System.out.println("There are no students to display.");
            return;
        }
        for (Student s : students) {
            System.out.println(s);
        }
    }

    private void addStudentUI() {
        System.out.print("Name: ");
        String name = sc.nextLine().trim();

        System.out.print("Email: ");
        String email = sc.nextLine().trim();

        System.out.print("Phone: ");
        String phone = sc.nextLine().trim();

        Timestamp now = new Timestamp(System.currentTimeMillis());
        Student student = new Student(name,email, phone, now.toLocalDateTime());
        boolean isCreated = studentController.createStudent(student);
        System.out.println(isCreated ? "✅ Student added." : "❌ Failed to add student.");

    }


    private void printMenu(){
        System.out.println("\n===== Student Register =====");
        System.out.println("1. Add Student");
        System.out.println("2. View All Students");
        System.out.println("3. Find Student By ID");
        System.out.println("4. Update Student (Email/Phone)");
        System.out.println("5. Delete Student");
        System.out.println("0. Exit");
    }
}

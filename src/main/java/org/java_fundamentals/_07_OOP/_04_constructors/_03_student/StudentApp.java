package org.java_fundamentals._07_OOP._04_constructors._03_student;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentApp {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        Scanner input = new Scanner(System .in);

        Student stu1 = new Student("Alice", 10, 5 );
        Student stu2 = new Student("John", 9, 4 );
        Student stu3 = new Student("Sam", 8, 3 );

        students.add(stu1);
        students.add(stu2);
        students.add(stu3);

        for (int i = 0 ; i < students.size(); i++){
            System.out.println(students.get(i));
        }

        System.out.println();

        for (Student s : students){
            System.out.println(s);
        }

        System.out.println();

        System.out.println("Enter a student name to search: ");
        String newStudent = input.nextLine();

    }
}

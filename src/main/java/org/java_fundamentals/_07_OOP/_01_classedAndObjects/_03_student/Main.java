package org.java_fundamentals._07_OOP._01_classedAndObjects._03_student;

public class Main {
    public static void main(String[] args) {
        Student student = new Student();

        System.out.println("Default settings.");
        student.study();
        student.attendClass();
        student.takeExam();
        student.displayStudentInfo();

        System.out.println();


        String name = "Alice";
        String studentId = "ST123";
        int gradeLevel = 2;
        double gpa = 3.5;

        System.out.println("Still default settings.");
        student.study();
        student.attendClass();
        student.takeExam();
        student.displayStudentInfo();
        System.out.println();

        System.out.println("Non-default settings.");
        student.name = name;
        student.studentId = studentId;
        student.gradeLevel = gradeLevel;
        student.gpa = gpa;

        student.study();
        student.attendClass();
        student.takeExam();
        student.displayStudentInfo();

    }
}

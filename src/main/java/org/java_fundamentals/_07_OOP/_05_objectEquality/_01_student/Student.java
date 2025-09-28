package org.java_fundamentals._07_OOP._05_objectEquality._01_student;

import java.util.Objects;

public class Student {
    private int studentId;
    private String name;
    private int grade;

    public Student(int studentId, String name, int grade) {
        this.studentId = studentId;
        this.name = name;
        this.grade = grade;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return studentId == student.studentId;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(studentId);
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Id: " + studentId + ", Name: " + name + ", Grade: " + grade;
    }
}


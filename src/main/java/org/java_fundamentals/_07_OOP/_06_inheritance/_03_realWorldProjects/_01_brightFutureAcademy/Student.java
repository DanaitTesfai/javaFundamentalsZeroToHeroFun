package org.java_fundamentals._07_OOP._06_inheritance._03_realWorldProjects._01_brightFutureAcademy;

import java.util.Objects;

public class Student extends Person{
    private String studentId;

    public Student(String name, int age, String studentId) {
        super(name, age);
        this.studentId = studentId;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }


    public void displayInfo(){
        System.out.println("ID: " + studentId + " | Name: " + getName()+ " | Age: " + getAge() );
    }


/*
    Student s1 = new Student("S001", "Alice", 20);
    Student s2 = new Student("S001", "Alice", 20);
    by default without overriding s1.equals(S2) returns false
    but in reality they belong to the same person and false is returned bc
    the default implementation of the equals operation inside the base/super class
    Object works based on memory address

    but we want to return true if both s1 and s2 have the same Id and to do
    so we have to override the default implementation

    Here s1 represents the current object reference by this keyword and s2 is represented by Object o
    s1.equals(null)
    s1.equals(s2)

 */
    @Override
    public boolean equals(Object o) {
        if (o == null || this.getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return this.studentId != null && student.studentId != null && this.studentId.equalsIgnoreCase(student.studentId);
    }

    @Override
    public int hashCode() {
        return (studentId == null ? 0 : studentId.toLowerCase().hashCode());
    }
}

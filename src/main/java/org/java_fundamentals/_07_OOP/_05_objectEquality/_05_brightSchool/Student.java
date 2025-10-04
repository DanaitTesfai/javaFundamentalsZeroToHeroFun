package org.java_fundamentals._07_OOP._05_objectEquality._05_brightSchool;

import java.util.Objects;

public class Student {
    private String studentId;
    private String name;
    private int age;

    public Student(String studentId, String name, int age) {
        this.studentId = studentId;
        this.name = name;
        this.age = age;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0 && age <= 120){
            this.age = age;
        } else {
            System.out.println("Age should be greater than 0 and less than or equal 120.");
        }

    }

    public void displayInfo(){
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "ID: " + studentId + " | Name: " + name + " | Age: " + age;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(studentId, student.studentId);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(studentId);
    }

}

package org.java_fundamentals._08_exceptions._02_projects;

import java.util.Objects;

abstract public class Student implements Displayable, Billable {
    private String studentId;
    private String name;
    private int age;
    private int courseDuration;
    private String status;

    public Student(String studentId, String name, int age, int courseDuration, String status) {
        this.studentId = studentId;
        this.name = name;
        this.age = age;
        this.courseDuration = courseDuration;
        this.status = status;
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
        this.age = age;
    }

    public int getCourseDuration() {
        return courseDuration;
    }

    public void setCourseDuration(int courseDuration) {
        this.courseDuration = courseDuration;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
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

    public abstract double calculateFee();

    @Override
    public void displayInfo() {
        System.out.println("Student Id: " + studentId + ", Name: " + name + ", Age: " + age + ", Duration: " + courseDuration + ",Status: " + status);
    }
}

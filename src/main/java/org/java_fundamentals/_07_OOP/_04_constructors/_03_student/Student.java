package org.java_fundamentals._07_OOP._04_constructors._03_student;

public class Student {
    private String name;
    private int age;
    private int grade;

    public Student() {
        name = "Unknown";
        age = 0;
        grade = 0;
    }

    public Student(String name, int age, int grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
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

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public void displayInfo() {
        System.out.println(this);
    }
    public String toString(){
        return "Name: " + name + ", Age: " + age + ", Grade: " + grade;
    }
}

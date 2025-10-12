package org.java_fundamentals._07_OOP._06_inheritanceAndPolymorphism._01_singleInheritance;

public class PersonRunner {
    public static void main(String[] args) {
        Student s1 = new Student();

        s1.name="Alice";
        s1.age = 20;
        s1.studentId= "1234";
        s1.displayInfo();
    }
}

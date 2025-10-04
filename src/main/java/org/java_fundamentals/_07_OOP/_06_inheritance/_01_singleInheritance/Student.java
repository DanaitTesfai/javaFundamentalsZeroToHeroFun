package org.java_fundamentals._07_OOP._06_inheritance._01_singleInheritance;

public class Student extends Person{
    String studentId;

    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Student Id: " + studentId);
    }
}

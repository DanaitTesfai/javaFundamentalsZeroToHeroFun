package org.java_fundamentals._07_OOP._06_inheritanceAndPolymorphism._03_realWorldProjects._01_brightFutureAcademy;

public class UnderGradStudent extends  Student{
    private String major;

    public UnderGradStudent(String name, int age, String studentId, String major) {
        super(name, age, studentId);
        this.major = major;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    @Override
    public void displayInfo() {
        System.out.println("UNDERGRAD | ID: " + getStudentId() + " | Name: " + getName()+ " | Age: " + getAge() );

    }
}

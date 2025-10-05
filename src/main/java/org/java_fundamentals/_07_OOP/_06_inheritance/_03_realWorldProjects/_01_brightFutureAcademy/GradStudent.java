package org.java_fundamentals._07_OOP._06_inheritance._03_realWorldProjects._01_brightFutureAcademy;

public class GradStudent extends Student{
    private String thesisTitle;

    public GradStudent(String name, int age, String studentId, String thesisTitle) {
        super(name, age, studentId);
        this.thesisTitle = thesisTitle;
    }

    public String getThesisTitle() {
        return thesisTitle;
    }

    public void setThesisTitle(String thesisTitle) {
        this.thesisTitle = thesisTitle;
    }

    @Override
    public void displayInfo() {
        System.out.println("GRAD      |  ID: " + getStudentId() + " | Name: " + getName()+ " | Age: " + getAge() );
    }
}

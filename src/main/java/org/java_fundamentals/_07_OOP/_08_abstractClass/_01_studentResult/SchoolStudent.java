package org.java_fundamentals._07_OOP._08_abstractClass._01_studentResult;

public class SchoolStudent extends Student {
    public SchoolStudent(String name, int rollNo, double marks) {
        super(name, rollNo, marks);
    }

    @Override
    public void printDetails() {
        System.out.println("Name: " + name + "\nRoll No: " + rollNo + "\nResult: " + getResult());
    }

    @Override
    public String getResult() {
        return marks >= 50 ? "Pass" : "Fail";
    }
}

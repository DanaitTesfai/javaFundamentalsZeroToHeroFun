package org.java_fundamentals._07_OOP._08_abstractClass._01_studentResult;

abstract class Student {
    protected String name;
    protected int rollNo;
    protected double marks;

    public Student(String name, int rollNo, double marks) {
        this.name = name;
        this.rollNo = rollNo;
        this.marks = marks;
    }

    public abstract String  getResult();
}

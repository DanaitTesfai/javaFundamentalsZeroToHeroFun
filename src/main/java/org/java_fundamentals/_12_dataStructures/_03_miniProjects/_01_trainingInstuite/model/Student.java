package org.java_fundamentals._12_dataStructures._03_miniProjects._01_trainingInstuite.model;

public class Student extends Person{
    private String course;

    public Student(int id, String name,String course) {
        super(id, name);
        this.course = course;
    }


    @Override
    public String getRole(){
        return "Student";
    }

    @Override
    public String toString() {
        return id + "," + name + "," + course;
    }
}

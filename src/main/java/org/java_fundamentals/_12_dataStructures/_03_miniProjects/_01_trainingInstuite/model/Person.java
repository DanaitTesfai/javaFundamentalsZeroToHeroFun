package org.java_fundamentals._12_dataStructures._03_miniProjects._01_trainingInstuite.model;

abstract public class Person {
    protected int id;
    protected String name;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public abstract String getRole();


}

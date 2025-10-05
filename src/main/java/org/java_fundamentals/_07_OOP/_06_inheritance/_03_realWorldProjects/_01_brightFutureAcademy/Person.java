package org.java_fundamentals._07_OOP._06_inheritance._03_realWorldProjects._01_brightFutureAcademy;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
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
        if (age >= 18 && age <= 120){
            this.age = age;
        }else {
            System.out.println("Age must be between 18 and 120.");
            this.age = 18;
        }
    }


}

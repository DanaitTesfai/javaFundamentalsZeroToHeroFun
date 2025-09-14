package org.java_fundamentals._07_OOP._02_encapsulation;

public class Student {
    private String name;
    private int age;

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public int getAge(){
        return age;
    }
    public void setAge(int age){
        if (age > 0){
            this.age = age;
        }else {
            System.out.println("Age must be positive!");
        }

    }


    public void displayInfo(){
        System.out.println("--- Student Profile ---");
        System.out.println("Student Name: " + name);
        System.out.println("Student Age: " + age);
    }



}

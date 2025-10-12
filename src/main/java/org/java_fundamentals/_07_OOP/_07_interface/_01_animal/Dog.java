package org.java_fundamentals._07_OOP._07_interface._01_animal;

public class Dog implements Animal{
    @Override
    public void makeSound() {
        System.out.println("Dog barks");
    }
}

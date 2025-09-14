package org.java_fundamentals._07_OOP._01_classedAndObjects._01_car;

public class Car {
    String brand;
    String model;
    int year;
    double price;

    public void startEngine(){
        System.out.println(brand + " engine started.");
    }

    public void stopEngine(){
        System.out.println(brand + " engine stopped.");
    }

    public void accelerate(){
        System.out.println(brand + " is accelerating.");
    }

    public void brake(){
        System.out.println(brand + " is braking.");
    }

    public void displayCarInfo(){
        System.out.println("Car Info:");
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Price: $" + price);

    }
}

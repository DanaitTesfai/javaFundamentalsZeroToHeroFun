package org.java_fundamentals._07_OOP._01_car;

public class Main {
    public static void main(String[] args) {
        Car toyota = new Car();

        toyota.brand = "Toyota";
        toyota.model = "Corolla";
        toyota.year = 2022;
        toyota.price = 25000;


        toyota.startEngine();
        toyota.accelerate();
        toyota.brake();
        toyota.stopEngine();
        toyota.displayCarInfo();

    }
}

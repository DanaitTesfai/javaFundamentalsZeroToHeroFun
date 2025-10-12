package org.java_fundamentals._07_OOP._07_interface._03_vehicle;

public class Car implements Vehicle{
    public static void main(String[] args) {
        Car car = new Car();
        car.start();
        car.stop();


    }

    @Override
    public void start() {
        System.out.println("Car started.");
    }
}

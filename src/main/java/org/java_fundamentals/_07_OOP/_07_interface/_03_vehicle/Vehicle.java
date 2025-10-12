package org.java_fundamentals._07_OOP._07_interface._03_vehicle;

public interface Vehicle {
    void start();

    default void stop() {
        System.out.println("Vehicle stopped.");
    }



}

package org.java_fundamentals._07_OOP._06_inheritance._04_carRentalSystem;

import java.util.Objects;

public class Car extends Vehicle{
    private String carId;

    public Car(String name, String brand, double price, String carId) {
        super(name, brand, price);
        this.carId = carId;
    }

    public String getCarId() {
        return carId;
    }

    public void setCarId(String carId) {
        this.carId = carId;
    }

    @Override
    public void displayInfo() {
        System.out.println("ID: " + carId + " | Brand: " + getBrand() + " | Name: " + getName() + " | Price: $" + getPrice());
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(carId, car.carId);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(carId);
    }
}

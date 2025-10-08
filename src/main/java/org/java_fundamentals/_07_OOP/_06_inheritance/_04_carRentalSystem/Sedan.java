package org.java_fundamentals._07_OOP._06_inheritance._04_carRentalSystem;

public class Sedan extends Car{
    private double trunkSize;

    public Sedan(String name, String brand, double price, String carId, double trunkSize) {
        super(name, brand, price, carId);
        this.trunkSize = trunkSize;
    }

    public double getTrunkSize() {
        return trunkSize;
    }

    public void setTrunkSize(double trunkSize) {
        this.trunkSize = trunkSize;
    }

    @Override
    public void displayInfo() {
        System.out.println("SEDAN | ID: " + getCarId() + " | Brand: " + getBrand() + " | Name: " + getName() + " | Price: $" + getPrice() + " | Trunk Size: " + trunkSize + "L");
    }
}

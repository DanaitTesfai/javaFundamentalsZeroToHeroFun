package org.java_fundamentals._07_OOP._06_inheritance._04_carRentalSystem;

public class SUV extends Car{
    private boolean offRoad;

    public SUV(String name, String brand, double price, String carId, boolean offRoad) {
        super(name, brand, price, carId);
        this.offRoad = offRoad;
    }

    public boolean isOffRoad() {
        return offRoad;
    }

    public void setOffRoad(boolean offRoad) {
        this.offRoad = offRoad;
    }

    @Override
    public void displayInfo() {
        System.out.println("SUV   | ID: " + getCarId() + " | Brand: " + getBrand() + " | Name: " + getName() + " | Price: $" + getPrice() + " | Off-Road: " + (offRoad ? "Yes" : "No"));
    }
}

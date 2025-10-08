package org.java_fundamentals._07_OOP._06_inheritance._04_carRentalSystem;

public class Vehicle {
    private String name;
    private String brand;
    private double price;

    public Vehicle(String name, String brand, double price) {
        this.name = name;
        this.brand = brand;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


    public void displayInfo(){
        System.out.println("Brand: " + brand + " | Name: " + name + " | Price: $" + price);
    }
}

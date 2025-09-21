package org.java_fundamentals._07_OOP._04_constructors;

public class Car {
    private String brand;
    private String model;
    private int year;

    public Car(){
        this.brand = "no brand";
        this.model = "no model";
        this.year = 0;
    }

    public Car(String brand,String model,int year){
        this.brand =  brand;
        this.model = model;
        this.year = year;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
    public void displayInfo(){
        System.out.println("Brand: " + brand +", Model: " + model+ ", Year: "+ year);
    }


}

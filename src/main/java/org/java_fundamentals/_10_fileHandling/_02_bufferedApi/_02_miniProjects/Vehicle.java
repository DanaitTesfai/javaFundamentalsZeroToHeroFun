package org.java_fundamentals._10_fileHandling._02_bufferedApi._02_miniProjects;

import java.util.Objects;

public class Vehicle {
    private String id;
    private String model;
    private String type;
    private double pricePerDay;


    public Vehicle(String id, String model, String type, double pricePerDay) {
        this.id = id;
        this.model = model;
        this.type = type;
        this.pricePerDay = pricePerDay;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getPricePerDay() {
        return pricePerDay;
    }

    public void setPricePerDay(double pricePerDay) {
        this.pricePerDay = pricePerDay;
    }


    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Vehicle vehicle = (Vehicle) o;
        return Objects.equals(id, vehicle.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    public void displayInfo(){
        System.out.println(this);
    }

    @Override
    public String toString() {
        return id + " - " + model + " (" + type + ") - $" + pricePerDay + "/day";
    }
}

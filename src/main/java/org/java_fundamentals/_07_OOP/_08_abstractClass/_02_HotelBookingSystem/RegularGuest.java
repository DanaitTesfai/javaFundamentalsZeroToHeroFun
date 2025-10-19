package org.java_fundamentals._07_OOP._08_abstractClass._02_HotelBookingSystem;

public class RegularGuest extends Guest{
    private double costPerNight;

    public RegularGuest(String guestId, String name, int nights,double costPerNight) {
        super(guestId, name, nights);
        setCostPerNight(costPerNight);
    }

    public double getCostPerNight() {
        return costPerNight;
    }

    public void setCostPerNight(double costPerNight) {
        this.costPerNight = costPerNight > 0 ? costPerNight : 100;
    }

    @Override
    public double calculateBill() {
        return costPerNight*getNights();
    }

    @Override
    public void displayInfo() {
        System.out.println("REGULAR | ID: " + getGuestId() +" | Name: " + getName() + " | Nights: " + getNights() + " | Total Bill: $" + calculateBill());
    }
}

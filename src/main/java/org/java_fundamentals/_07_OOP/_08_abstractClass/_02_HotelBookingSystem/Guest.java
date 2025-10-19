package org.java_fundamentals._07_OOP._08_abstractClass._02_HotelBookingSystem;

import java.util.Objects;

abstract public class Guest implements Displayable, Billable{
    private String guestId;
    private String name;
    private int nights;

    public Guest(String guestId, String name, int nights) {
        setGuestId(guestId);
        setName(name);
        setNights(nights);
    }

    public String getGuestId() {
        return guestId;
    }

    public void setGuestId(String guestId) {
        this.guestId =  guestId != null && guestId.matches("[A-Za-z0-9]+") ? guestId : "Unknown";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name != null && !name.trim().isEmpty()? name : "Guest";

    }

    public int getNights() {
        return nights;
    }

    public void setNights(int nights) {
        this.nights = nights > 0 ? nights : 1;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Guest guest = (Guest) o;
        return Objects.equals(guestId, guest.guestId);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(guestId);
    }

    abstract public double calculateBill();

    @Override
    public void displayInfo() {
        System.out.println("ID: " + guestId +" | Name: " + name + " | Nights: " +
                nights + " | Total Bill: $" + calculateBill());
    }
}

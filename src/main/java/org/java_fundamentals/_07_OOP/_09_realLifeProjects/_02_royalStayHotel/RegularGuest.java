package org.java_fundamentals._07_OOP._09_realLifeProjects._02_royalStayHotel;

public class RegularGuest extends Guest{
    private double costPerNight;

    public RegularGuest(String guestId, String name, int nights, int roomNo, String reservationStatus, double costPerNight) {
        super(guestId, name, nights, roomNo, reservationStatus);
        setCostPerNight(costPerNight);
    }

    public double getCostPerNight() {
        return costPerNight;
    }

    public void setCostPerNight(double costPerNight) {
        this.costPerNight = costPerNight > 0 ? costPerNight : 50;
    }

    @Override
    public double calculateBill() {
        return costPerNight * getNights();
    }

    @Override
    public void displayInfo() {
        System.out.println("Regular  |  Guest Id: " + getGuestId() + ", Name: " + getName() + ", Nights: " + getNights() + ", Room No: " + getRoomNo() + ", Status: " + getReservationStatus() + ", Cost per night: " + costPerNight + ", Total: " + calculateBill());
    }
}

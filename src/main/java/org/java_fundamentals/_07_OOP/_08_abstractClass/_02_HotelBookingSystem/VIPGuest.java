package org.java_fundamentals._07_OOP._08_abstractClass._02_HotelBookingSystem;

public class VIPGuest extends Guest{
    private double costPerNight;
    private double serviceCharge;

    public VIPGuest(String guestId, String name, int nights, double costPerNight, double serviceCharge) {
        super(guestId, name, nights);
        setCostPerNight(costPerNight);
        setServiceCharge(serviceCharge);
    }

    public double getCostPerNight() {
        return costPerNight;
    }

    public void setCostPerNight(double costPerNight) {
        this.costPerNight = costPerNight > 0 ? costPerNight : 100;
    }

    public double getServiceCharge() {
        return serviceCharge;
    }

    public void setServiceCharge(double serviceCharge) {
        this.serviceCharge = serviceCharge > 0 ? serviceCharge : 10;
    }

    @Override
    public double calculateBill() {
        return (costPerNight*getNights()+serviceCharge);
    }

    @Override
    public void displayInfo() {
        System.out.print("VIP | ");
        super.displayInfo();
    }
}

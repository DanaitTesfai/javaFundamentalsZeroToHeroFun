package org.java_fundamentals._07_OOP._09_realLifeProjects._02_royalStayHotel;

public class VipGuest extends Guest{
    private double costPerNight;
    private double serviceCharge;
    private boolean spaAccess;
    private boolean mealsIncluded;

    public VipGuest(String guestId, String name, int nights, int roomNo, String reservationStatus,
                    double costPerNight, double serviceCharge, boolean spaAccess, boolean mealsIncluded) {
        super(guestId, name, nights, roomNo, reservationStatus);
        setCostPerNight(costPerNight);
        setServiceCharge(serviceCharge);
        this.spaAccess = spaAccess;
        this.mealsIncluded = mealsIncluded;
    }

    public double getCostPerNight() {
        return costPerNight;
    }

    public void setCostPerNight(double costPerNight) {
        this.costPerNight = costPerNight > 0 ? costPerNight : 50;
    }

    public double getServiceCharge() {
        return serviceCharge;
    }

    public void setServiceCharge(double serviceCharge) {
        this.serviceCharge = serviceCharge > 0 ? serviceCharge : 20;
    }

    public boolean isSpaAccess() {
        return spaAccess;
    }

    public void setSpaAccess(boolean spaAccess) {
        this.spaAccess = spaAccess;
    }

    public boolean isMealsIncluded() {
        return mealsIncluded;
    }

    public void setMealsIncluded(boolean mealsIncluded) {
        this.mealsIncluded = mealsIncluded;
    }

    @Override
    public double calculateBill() {
        return (costPerNight * getNights()) + serviceCharge ;
    }

    @Override
    public void displayInfo() {
        System.out.println("VIP  |  Guest Id: " + getGuestId() + ", Name: " + getName() + ", Nights: " + getNights() +
                ", Room No: " + getRoomNo() + ", Status: " + getReservationStatus() + ", Cost per night: " + costPerNight + ", Total: " + calculateBill());
    }
}

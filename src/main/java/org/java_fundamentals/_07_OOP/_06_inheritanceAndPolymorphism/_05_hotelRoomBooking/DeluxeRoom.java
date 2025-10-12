package org.java_fundamentals._07_OOP._06_inheritanceAndPolymorphism._05_hotelRoomBooking;

public class DeluxeRoom extends Room{
    private boolean hasJacuzzi;

    public DeluxeRoom(String roomId, double pricePerNight, boolean isAvailable, boolean hasJacuzzi) {
        super(roomId, pricePerNight, isAvailable);
        this.hasJacuzzi = hasJacuzzi;
    }

    public boolean isHasJacuzzi() {
        return hasJacuzzi;
    }

    public void setHasJacuzzi(boolean hasJacuzzi) {
        this.hasJacuzzi = hasJacuzzi;
    }

    @Override
    public void displayInfo() {
        System.out.println("DELUXE ROOM  | ID: " + getRoomId() + " | Price: $" + getPricePerNight() +" | Jacuzzi: " + (hasJacuzzi ? "Yes" : "No")   +  " | Available: " + isAvailable() );
    }
}

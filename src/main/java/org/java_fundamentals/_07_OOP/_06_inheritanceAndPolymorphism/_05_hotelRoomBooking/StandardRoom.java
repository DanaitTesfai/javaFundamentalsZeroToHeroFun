package org.java_fundamentals._07_OOP._06_inheritanceAndPolymorphism._05_hotelRoomBooking;

public class StandardRoom extends Room{
    private int bedCount;

    public StandardRoom(String roomId, double pricePerNight, boolean isAvailable, int bedCount) {
        super(roomId, pricePerNight, isAvailable);
        this.bedCount = bedCount;
    }

    public int getBedCount() {
        return bedCount;
    }

    public void setBedCount(int bedCount) {
        this.bedCount = bedCount;
    }

    @Override
    public void displayInfo() {
        System.out.println("STANDARD ROOM | ID: " + getRoomId() + " | Price: $" + getPricePerNight() +" | Beds: " + bedCount  +  " | Available: " + isAvailable());
    }
}

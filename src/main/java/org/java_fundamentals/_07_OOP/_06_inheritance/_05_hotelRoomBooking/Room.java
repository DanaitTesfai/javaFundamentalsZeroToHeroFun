package org.java_fundamentals._07_OOP._06_inheritance._05_hotelRoomBooking;

public class Room {
    private String roomId;
    private double pricePerNight;
    private boolean isAvailable;

    public Room(String roomId, double pricePerNight, boolean isAvailable) {
        this.roomId = roomId;
        this.pricePerNight = pricePerNight;
        this.isAvailable = isAvailable;
    }

    public String getRoomId() {
        return roomId;
    }

    public void setRoomId(String roomId) {
        this.roomId = roomId;
    }

    public double getPricePerNight() {
        return pricePerNight;
    }

    public void setPricePerNight(double pricePerNight) {
        this.pricePerNight = pricePerNight;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public void displayInfo(){
        System.out.println("ID: " + roomId + " | Price: $" + pricePerNight + " | Available: " + isAvailable);
    }
}

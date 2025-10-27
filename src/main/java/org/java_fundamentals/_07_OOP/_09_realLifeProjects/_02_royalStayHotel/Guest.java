package org.java_fundamentals._07_OOP._09_realLifeProjects._02_royalStayHotel;

import java.util.Objects;

abstract public class Guest implements Displayable, Billable {
    private String guestId;
    private String name;
    private int nights;
    private int roomNo;
    private String reservationStatus;

    public Guest(String guestId, String name, int nights, int roomNo, String reservationStatus) {
        setGuestId(guestId);
        setName(name);
        setNights(nights);
        setRoomNo(roomNo);
        setReservationStatus(reservationStatus);
    }

    public String getGuestId() {
        return guestId;
    }

    public void setGuestId(String guestId) {
        this.guestId = guestId != null && guestId.matches("[A-Za-z0-9]+") ? guestId : "Unknown";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name != null && !name.trim().isEmpty() ? name : "Unknown";
    }

    public int getNights() {
        return nights;
    }

    public void setNights(int nights) {
        this.nights = nights > 0 ? nights : 1;
    }

    public int getRoomNo() {
        return roomNo;
    }

    public void setRoomNo(int roomNo) {
        this.roomNo = roomNo > 0 ? roomNo : 1;
    }

    public String getReservationStatus() {
        return reservationStatus;
    }

    public void setReservationStatus(String reservationStatus) {
        this.reservationStatus = reservationStatus.equalsIgnoreCase("Reserved") ||
                reservationStatus.equalsIgnoreCase("Checked-In") || reservationStatus.equalsIgnoreCase("Checked-Out") ? reservationStatus : "Unknown";
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

    public abstract double calculateBill();


    @Override
    public void displayInfo() {
        System.out.println("Guest Id: " + guestId + ", Name: " + name + ", Nights: " + nights + ", Room No: " + roomNo + ", Status: " + reservationStatus);
    }
}

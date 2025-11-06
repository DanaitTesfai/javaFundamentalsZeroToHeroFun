package org.java_fundamentals._09_composition._03_houseAndRooms;

public class Room {
    private String roomType;

    public Room(String roomType) {
        this.roomType = roomType;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public void displayInfo(){
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "House has: \n - " + roomType;
    }
}

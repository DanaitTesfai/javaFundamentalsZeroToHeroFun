package org.java_fundamentals._09_composition._03_houseAndRooms;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter room type: ");
        String roomType = sc.nextLine();

        Room room = new Room(roomType);

        House house = new House();

        if (house.rooms.contains(room)){
            System.out.println("Room added already.");
        }else {
            house.rooms.add(room);
        }

        if (house.rooms.isEmpty()){
            System.out.println("There are no rooms.");
            return;
        }
        for (Room r : house.rooms){
            r.displayInfo();
        }



    }
}

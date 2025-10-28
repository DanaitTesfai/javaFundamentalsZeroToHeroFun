package org.java_fundamentals._07_OOP._09_realLifeProjects._02_royalStayHotel;

import java.util.ArrayList;

public class GuestManager {
    ArrayList<Guest> guests = new ArrayList<>();

    public boolean addGuest(Guest g){
        if (guests.contains(g)){
            return false;
        }else {
            guests.add(g);
            return true;
        }
    }


    public void listGuests(){
        if (guests.isEmpty()){
            System.out.println("There are no registered guests.");
        }else {
            for (Guest g: guests){
                g.displayInfo();
            }
        }
    }


    public Guest findById(String guestId){
        for (Guest g: guests){
            if (g.getGuestId().equalsIgnoreCase(guestId)){
                return g;
            }
        }
        return null;
    }




    public boolean checkout(String guestId){
        Guest g = findById(guestId);

        if (g == null){
            return false;
        }

        if (g.getReservationStatus().equalsIgnoreCase("Reserved")){
            double bill = g.calculateBill();
            g.setReservationStatus("Checked-In");
            System.out.println("Your bill is $" + bill + ", " + g.getName());
            System.out.println("You are checked in.");
            return true;
        }

        System.out.println("You are checked in already.");
        return true;
    }


}

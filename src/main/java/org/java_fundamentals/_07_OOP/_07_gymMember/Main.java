package org.java_fundamentals._07_OOP._07_gymMember;

public class Main {
    public static void main(String[] args) {
        GymMember gymMember  = new GymMember();

        gymMember.memberName = "John";
        gymMember.membershipId = "GYM123";
        gymMember.membershipType = "Annual";
        gymMember.weight = 60 ;

        gymMember.checkIn();
        gymMember.workout();
        gymMember.updateWeight(15.5);
        gymMember.displayMemberInfo();
    }
}

package org.java_fundamentals._07_OOP._01_classedAndObjects._07_gymMember;

public class GymMember {
    String memberName;
    String membershipId;
    String membershipType;
    double weight;

    public void workout(){
        System.out.println(memberName+ " is working out.");
    }

    public void checkIn(){
        System.out.println(memberName+ " has checked in.");
    }

    public void updateWeight(double newWeight){
        weight += newWeight;
        System.out.println("Weight updated successfully.");
    }

    public void displayMemberInfo(){
        System.out.println("Member Info:");
        System.out.println("Name: " + memberName);
        System.out.println("Membership ID: " + membershipId);
        System.out.println("Type: " + membershipType);
        System.out.println("Weight: " + weight + " kg");
    }
}

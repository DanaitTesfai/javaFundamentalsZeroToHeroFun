package org.java_fundamentals._07_OOP._04_constructors._05_gymMembership;

public class GymMembership {
    private String name;
    private String membershipType;
    private double weight;

    public GymMembership() {
    }

    public GymMembership(String name, String membershipType, double weight) {
        this.name = name;
        this.membershipType = membershipType;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMembershipType() {
        return membershipType;
    }

    public void setMembershipType(String membershipType) {
        this.membershipType = membershipType;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "GymMembership{" +
                "name='" + name + '\'' +
                ", membershipType='" + membershipType + '\'' +
                ", weight=" + weight +
                '}';
    }
}

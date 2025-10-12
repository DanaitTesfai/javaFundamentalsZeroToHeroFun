package org.java_fundamentals._07_OOP._06_inheritanceAndPolymorphism._06_gymMembershipSystem;

public class RegularMember extends Member {
    private int membershipMonths;

    public RegularMember(String memberId, String name, int age, double membershipFee, int membershipMonths) {
        super(memberId, name, age, membershipFee);
        this.membershipMonths = membershipMonths > 0 ? membershipMonths: 1 ;
    }

    public int getMembershipMonths() {
        return membershipMonths;
    }

    public void setMembershipMonths(int membershipMonths) {
        this.membershipMonths = membershipMonths;
    }

    @Override
    public void displayInfo() {
        double total = membershipMonths * getMembershipFee();
        System.out.println("REGULAR | ID: " + getMemberId() + " | Name: " + getName() + " | Age: " + getAge() + " | Months: " + membershipMonths + " | Total Fee: $" + total);
    }
}

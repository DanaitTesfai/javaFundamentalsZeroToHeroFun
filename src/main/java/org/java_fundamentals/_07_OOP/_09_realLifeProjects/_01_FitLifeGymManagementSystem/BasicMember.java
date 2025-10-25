package org.java_fundamentals._07_OOP._09_realLifeProjects._01_FitLifeGymManagementSystem;

public class BasicMember extends Member{
    private double monthlyFee;

    public BasicMember(String memberId, String name, int age, int monthsSubscribed, String membershipStatus, double monthlyFee) {
        super(memberId, name, age, monthsSubscribed, membershipStatus);
        setMonthlyFee(monthlyFee);
    }

    public double getMonthlyFee() {
        return monthlyFee;
    }

    public void setMonthlyFee(double monthlyFee) {
        this.monthlyFee = monthlyFee > 0 ? monthlyFee : 0.0;
    }

    @Override
    public double calculateBill() {
        return monthlyFee * getMonthsSubscribed();
    }

    @Override
    public void displayInfo() {
        System.out.println("Basic  |  Id: "+ getMemberId() + ", Name: " + getName() + ", Age: " + getAge() +
                ", Months subscribed: " + getMonthsSubscribed() + ", Membership Status: " + getMembershipStatus() + ", Monthly Fee: +" + monthlyFee + ", Bill: " + calculateBill());
    }
}

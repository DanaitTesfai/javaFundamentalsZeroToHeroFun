package org.java_fundamentals._07_OOP._09_realLifeProjects._01_FitLifeGymManagementSystem;

import java.util.Objects;

abstract public class Member implements Displayable,Billable{
    private String memberId;
    private String name;
    private int age;
    private int monthsSubscribed;
    private String membershipStatus;

    public Member(String memberId, String name, int age, int monthsSubscribed, String membershipStatus) {
        setMemberId(memberId);
        setName(name);
        setAge(age);
        setMonthsSubscribed(monthsSubscribed);
        setMembershipStatus(membershipStatus);
    }

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId != null && memberId.matches("[A-Za-z0-9]+") ? memberId : "Unknown";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name != null && !name.trim().isEmpty() ? name : "Unknown";
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age > 10 && age <= 120 ? age : 10;
    }

    public int getMonthsSubscribed() {
        return monthsSubscribed;
    }

    public void setMonthsSubscribed(int monthsSubscribed) {
        this.monthsSubscribed = monthsSubscribed > 0 ? monthsSubscribed : 1;
    }


    public String getMembershipStatus() {
        return membershipStatus;
    }

    public void setMembershipStatus(String membershipStatus) {
        this.membershipStatus = membershipStatus == null || membershipStatus.isEmpty() ? "Active" : membershipStatus;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Member member = (Member) o;
        return Objects.equals(memberId, member.memberId);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(memberId);
    }


    public abstract double calculateBill();

    @Override
    public void displayInfo() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Id: "+ memberId + ", Name: " + name + ", Age: " + age + ", Months subscribed: " + monthsSubscribed + ", Membership Status: " + membershipStatus;
    }
}

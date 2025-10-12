package org.java_fundamentals._07_OOP._06_inheritanceAndPolymorphism._06_gymMembershipSystem;

import java.util.Objects;

public class Member {
    private String memberId;
    private String name;
    private int age;
    private double membershipFee;

    public Member(String memberId, String name, int age, double membershipFee) {
        this.memberId = memberId;
        this.name = name;
        this.age = age;
        this.membershipFee = membershipFee;
    }

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getMembershipFee() {
        return membershipFee;
    }

    public void setMembershipFee(double membershipFee) {
        this.membershipFee = membershipFee;
    }

    public void displayInfo(){
        System.out.println("ID: " + memberId + " | Name: " + name + " | Age: " + age + " | Total Fee: $" + membershipFee);
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
}

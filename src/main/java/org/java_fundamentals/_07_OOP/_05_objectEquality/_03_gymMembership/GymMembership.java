package org.java_fundamentals._07_OOP._05_objectEquality._03_gymMembership;

import java.util.Objects;

public class GymMembership {
    private String memberId;
    private String name;
    private String membershipType;

    public GymMembership(String memberId, String name, String membershipType) {
        this.memberId = memberId;
        this.name = name;
        this.membershipType = membershipType;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        GymMembership that = (GymMembership) o;
        return Objects.equals(memberId, that.memberId);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(memberId);
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

    public String getMembershipType() {
        return membershipType;
    }

    public void setMembershipType(String membershipType) {
        this.membershipType = membershipType;
    }

    @Override
    public String toString() {
        return "GymMembership{" +
                "memberId='" + memberId + '\'' +
                ", name='" + name + '\'' +
                ", membershipType='" + membershipType + '\'' +
                '}';
    }
}

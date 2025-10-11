package org.java_fundamentals._07_OOP._06_inheritance._06_gymMembershipSystem;

public class PremiumMember extends Member{
    private boolean hasTrainer;
    private boolean hasClasses;

    public PremiumMember(String memberId, String name, int age, double membershipFee, boolean hasTrainer, boolean hasClasses) {
        super(memberId, name, age, membershipFee * 1.2);
        this.hasTrainer = hasTrainer;
        this.hasClasses = hasClasses;
    }

    public boolean isHasTrainer() {
        return hasTrainer;
    }

    public void setHasTrainer(boolean hasTrainer) {
        this.hasTrainer = hasTrainer;
    }

    public boolean isHasClasses() {
        return hasClasses;
    }

    public void setHasClasses(boolean hasClasses) {
        this.hasClasses = hasClasses;
    }

    @Override
    public void displayInfo() {
        System.out.println("PREMIUM | ID: " + getMemberId() + " | Name: " + getName() + " | Age: " + getAge() + " | Personal Trainer: " + (hasTrainer ? "Yes" : "No")+ " | Classes: " + (hasClasses ? "Yes" : "No") + " | Monthly Fee: $" + getMembershipFee());
    }
}

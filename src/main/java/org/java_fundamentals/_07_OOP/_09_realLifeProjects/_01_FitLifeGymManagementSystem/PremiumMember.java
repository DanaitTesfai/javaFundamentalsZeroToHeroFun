package org.java_fundamentals._07_OOP._09_realLifeProjects._01_FitLifeGymManagementSystem;

public class PremiumMember extends Member{
    private double monthlyFee;
    private double trainerFee;
    private double dietPlanFee;

    public PremiumMember(String memberId, String name, int age, int monthsSubscribed, double monthlyFee, double trainerFee, double dietPlanFee) {
        super(memberId, name, age, monthsSubscribed);
        setMonthlyFee(monthlyFee);
        setTrainerFee(trainerFee);
        setDietPlanFee(dietPlanFee);
    }

    public double getMonthlyFee() {
        return monthlyFee;
    }

    public void setMonthlyFee(double monthlyFee) {
        this.monthlyFee = monthlyFee > 0 ? monthlyFee : 0.0;;
    }

    public double getTrainerFee() {
        return trainerFee;
    }

    public void setTrainerFee(double trainerFee) {
        this.trainerFee = trainerFee > 0 ? trainerFee : 0.0;;
    }

    public double getDietPlanFee() {
        return dietPlanFee;
    }

    public void setDietPlanFee(double dietPlanFee) {
        this.dietPlanFee = dietPlanFee > 0 ? dietPlanFee : 0.0;;
    }

    @Override
    public double calculateBill() {
        return (monthlyFee * getMonthsSubscribed()) + trainerFee + dietPlanFee;
    }

    @Override
    public void displayInfo() {
        System.out.println("Id: "+ getMemberId() + ", Name: " + getName() + ", Age: " + getAge() +
                ", Months subscribed: " + getMonthsSubscribed() + ", Monthly Fee: +" + monthlyFee + ", Bill: " + calculateBill());
    }
}

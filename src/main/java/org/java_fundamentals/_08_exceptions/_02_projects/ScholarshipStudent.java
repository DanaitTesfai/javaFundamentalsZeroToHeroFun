package org.java_fundamentals._08_exceptions._02_projects;

public class ScholarshipStudent extends Student{
    private double monthlyFee;
    private int discountPercentage;

    public ScholarshipStudent(String studentId, String name, int age, int courseDuration, String status, double monthlyFee, int discountPercentage) {
        super(studentId, name, age, courseDuration, status);
        this.monthlyFee = monthlyFee;
        this.discountPercentage = discountPercentage;
    }

    public double getMonthlyFee() {
        return monthlyFee;
    }

    public void setMonthlyFee(double monthlyFee) {
        this.monthlyFee = monthlyFee;
    }

    public int getDiscountPercentage() {
        return discountPercentage;
    }

    public void setDiscountPercentage(int discountPercentage) {
        this.discountPercentage = discountPercentage;
    }

    @Override
    public double calculateFee() {
        return (monthlyFee * getCourseDuration()) * (1 - discountPercentage / 100.0);
    }

    @Override
    public void displayInfo() {
        System.out.println("ScholarShip  |  Student Id: " + getStudentId() + ", Name: " + getName() + ", Age: " + getAge() + ", Duration: " + getCourseDuration() + ",Status: " + getStatus() + ", Monthly Fee: " + monthlyFee + ", Discount: %" + discountPercentage + ", Total Bill: " + calculateFee());
    }
}

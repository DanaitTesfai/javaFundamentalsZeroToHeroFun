package org.java_fundamentals._08_exceptions._02_projects;

public class ScholarshipStudent extends Student{
    private double monthlyFee;
    private double discountPercentage;

    public ScholarshipStudent(String studentId, String name, int age, int courseDuration, String status, double monthlyFee, double discountPercentage) throws InvalidInputException{
        super(studentId, name, age, courseDuration, status);
        setMonthlyFee(monthlyFee);
        setDiscountPercentage(discountPercentage);
    }

    public double getMonthlyFee() {
        return monthlyFee;
    }

    public void setMonthlyFee(double monthlyFee) throws InvalidInputException{
        if (monthlyFee > 0){
            this.monthlyFee = monthlyFee;
        }else {
            throw new InvalidInputException("Monthly Fee must be greater than 0.");
        }
    }

    public double getDiscountPercentage() {
        return discountPercentage;
    }

    public void setDiscountPercentage(double discountPercentage) throws InvalidInputException{
        if (discountPercentage > 0 && discountPercentage < 100) {
            this.discountPercentage = discountPercentage;
        }else {
            throw new InvalidInputException("Discount percentage must be greater than 0.");
        }

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

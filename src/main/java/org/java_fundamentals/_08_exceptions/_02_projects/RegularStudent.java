package org.java_fundamentals._08_exceptions._02_projects;

public class RegularStudent extends Student{
    private double monthlyFee;

    public RegularStudent(String studentId, String name, int age, int courseDuration, String status, double monthlyFee) throws InvalidInputException{
        super(studentId, name, age, courseDuration, status);
        setMonthlyFee(monthlyFee);
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

    @Override
    public double calculateFee() {
        return monthlyFee * getCourseDuration();
    }

    @Override
    public void displayInfo() {
        System.out.println("Regular  |  Student Id: " + getStudentId() + ", Name: " + getName() + ", Age: " + getAge() + ", Duration: " + getCourseDuration() + ", Status: " + getStatus() + ", Monthly Fee: " + monthlyFee + ", Total Bill: " + calculateFee());
    }
}

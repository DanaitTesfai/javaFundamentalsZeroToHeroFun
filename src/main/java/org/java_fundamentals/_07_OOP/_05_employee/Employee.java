package org.java_fundamentals._07_OOP._05_employee;

public class Employee {

    String name;
    String employeeId;
    String department;
    double salary;

    public void work() {
        System.out.println(name + " is working in " + department);
    }

    public void takeBreak() {
        System.out.println(name + " is taking a break ");
    }

    public void increaseSalary(double amount) {
        salary += amount;
        System.out.println("Salary increased by $" + amount);
    }

    public void displayEmployeeInfo() {
        System.out.println("Employee Info:");
        System.out.println("Name: " + name);
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Department: " + department);
        System.out.println("Salary: $" + salary);
    }
}




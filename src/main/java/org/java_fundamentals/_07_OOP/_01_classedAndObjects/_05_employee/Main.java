package org.java_fundamentals._07_OOP._01_classedAndObjects._05_employee;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee();

        String name = "Alice";
        String employeeId = "EMP001";
        String department = "HR";
        double salary = 50000;

        employee.name = name;
        employee.employeeId = employeeId;
        employee.department = "HR";
        employee.salary = salary;

        employee.work();
        employee.takeBreak();
        employee.increaseSalary(1000);
        employee.displayEmployeeInfo();

    }
}

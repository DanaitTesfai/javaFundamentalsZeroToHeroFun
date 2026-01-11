package org.java_fundamentals._14_jdbc._02_employeeApp.controller;

import org.java_fundamentals._14_jdbc._02_employeeApp.model.Employee;
import org.java_fundamentals._14_jdbc._02_employeeApp.service.EmployeeService;

import java.util.List;
import java.util.Optional;

public class EmployeeController {
    private final EmployeeService employeeService = new EmployeeService();

    public boolean add(Employee e) {
        return employeeService.addEmployee(e);

    }

    public List<Employee> all() {
        return employeeService.getAll();

    }


    public Optional<Employee> byId(int id){
        return employeeService.getById(id);
    }

    public List<Employee> byDepartmentId(int departmentId){
        return employeeService.getByDepartmentId(departmentId);
    }

    public boolean updateFullName(int id, String newName){
        return employeeService.updateFullName(id, newName);
    }

    public boolean transfer(int employeeId, int newDepartmentId){
        return employeeService.transfer(employeeId, newDepartmentId);
    }

    public boolean delete(int id){
        return employeeService.deleteById(id);
    }


}

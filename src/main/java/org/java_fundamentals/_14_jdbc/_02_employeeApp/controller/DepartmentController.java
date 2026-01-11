package org.java_fundamentals._14_jdbc._02_employeeApp.controller;

import org.java_fundamentals._14_jdbc._02_employeeApp.model.Department;
import org.java_fundamentals._14_jdbc._02_employeeApp.service.DepartmentService;

import java.util.List;
import java.util.Optional;

public class DepartmentController {
    private final DepartmentService departmentService = new DepartmentService();


    public boolean add(Department d){
        return departmentService.addDepartment(d);
    }

    public List<Department> all(){
        return departmentService.getAll();
    }

    public Optional<Department> byId(int id){
        return departmentService.getById(id);
    }

    public boolean updateLocation(int id, String newLocation){
        return departmentService.updateLocation(id,newLocation);
    }

    public boolean delete(int id){
        return departmentService.deleteById(id);
    }
}

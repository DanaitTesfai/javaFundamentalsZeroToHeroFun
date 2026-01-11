package org.java_fundamentals._14_jdbc._02_employeeApp.dao;

import org.java_fundamentals._14_jdbc._02_employeeApp.model.Employee;

import java.util.List;
import java.util.Optional;

public interface EmployeeDAO {
    boolean save(Employee e);
    List<Employee> findAll();
    Optional<Employee> findById(int id);
    List<Employee> findByDepartmentId(int departmentId);
    boolean updateFullName(int id, String newName);
    boolean transfer(int employeeId, int newDepartmentId);
    boolean deleteById(int id);
}

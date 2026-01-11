package org.java_fundamentals._14_jdbc._02_employeeApp.dao;

import org.java_fundamentals._14_jdbc._02_employeeApp.model.Department;

import java.util.List;
import java.util.Optional;

public interface DepartmentDAO {
    boolean save(Department d);
    List<Department> findAll();
    Optional<Department> findById(int id);
    boolean updateLocation(int id, String newLocation);
    boolean deleteById(int id);
}

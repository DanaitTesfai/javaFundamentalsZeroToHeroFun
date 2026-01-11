package org.java_fundamentals._14_jdbc._02_employeeApp.dao;

import org.java_fundamentals._14_jdbc._02_employeeApp.model.DepartmentSummary;
import org.java_fundamentals._14_jdbc._02_employeeApp.model.EmployeeWithDepartment;

import java.util.List;

public interface ReportDAO {
    List<EmployeeWithDepartment> employeesWithDepartment();
    List<DepartmentSummary> departmentEmployeeCounts();
}

package org.java_fundamentals._14_jdbc._02_employeeApp.controller;

import org.java_fundamentals._14_jdbc._02_employeeApp.model.DepartmentSummary;
import org.java_fundamentals._14_jdbc._02_employeeApp.model.EmployeeWithDepartment;
import org.java_fundamentals._14_jdbc._02_employeeApp.service.ReportService;

import java.util.List;

public class ReportController {
    private final ReportService reportService = new ReportService();


    public List<EmployeeWithDepartment> employeesWithDepartment(){
        return reportService.employeesWithDepartment();
    }


    public List<DepartmentSummary> departmentEmployeeCounts(){
        return reportService.departmentEmployeeCounts();
    }
}

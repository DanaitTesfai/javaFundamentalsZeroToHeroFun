package org.java_fundamentals._14_jdbc._02_employeeApp.service;

import org.java_fundamentals._14_jdbc._02_employeeApp.dao.ReportDAO;
import org.java_fundamentals._14_jdbc._02_employeeApp.dao.impl.ReportDAOImpl;
import org.java_fundamentals._14_jdbc._02_employeeApp.model.DepartmentSummary;
import org.java_fundamentals._14_jdbc._02_employeeApp.model.EmployeeWithDepartment;

import java.util.List;

public class ReportService {
    private final ReportDAO reportDAO = new ReportDAOImpl();

    public List<EmployeeWithDepartment> employeesWithDepartment(){
        return reportDAO.employeesWithDepartment();
    }

    public List<DepartmentSummary> departmentEmployeeCounts(){
        return reportDAO.departmentEmployeeCounts();
    }
}

package org.java_fundamentals._14_jdbc._02_employeeApp.dao.impl;

import org.java_fundamentals._14_jdbc._02_employeeApp.dao.ReportDAO;
import org.java_fundamentals._14_jdbc._02_employeeApp.model.DepartmentSummary;
import org.java_fundamentals._14_jdbc._02_employeeApp.model.Employee;
import org.java_fundamentals._14_jdbc._02_employeeApp.model.EmployeeWithDepartment;
import org.java_fundamentals._14_jdbc._02_employeeApp.util.DBConnection;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ReportDAOImpl implements ReportDAO {

    @Override
    public List<EmployeeWithDepartment> employeesWithDepartment() {
        List<EmployeeWithDepartment> employeeWithDepartments = new ArrayList<>();
        String sql = """
                 SELECT e.id, e.employee_fullname AS fullname, e.email, d.department_name, d.location\s
                 FROM employees e
                 INNER JOIN departments d
                 ON e.department_id = d.department_id
                 ORDER BY d.department_name, e.employee_fullname
                """;
        try (
                Connection connection = DBConnection.getConnection();
                PreparedStatement preparedStatement = connection.prepareStatement(sql);
        ) {
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                EmployeeWithDepartment employeeWithDepartment = mapRowToEmployeeWithDepartment(rs);
                employeeWithDepartments.add(employeeWithDepartment);
            }

        } catch (SQLException | IOException e) {
            System.out.println("Error listing employees with departments: " + e.getMessage());
        }
        return employeeWithDepartments;
    }

    @Override
    public List<DepartmentSummary> departmentEmployeeCounts() {
        List<DepartmentSummary> departmentSummaries = new ArrayList<>();
        String sql = """
                SELECT  d.department_id, d.department_name, COUNT(e.id) AS emp_count
                 FROM departments d
                 LEFT JOIN employees e
                 ON d.department_id = e.department_id
                 GROUP BY d.department_id, d.department_name
                 ORDER BY emp_count DESC, d.department_name;
                """;
        try (
                Connection connection = DBConnection.getConnection();
                PreparedStatement preparedStatement = connection.prepareStatement(sql);
        ) {
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()){
                DepartmentSummary departmentSummary = mapRowToDepartmentSummary(rs);
                departmentSummaries.add(departmentSummary);
            }
        } catch (SQLException | IOException e) {
            System.out.println("Error listing department summary: " + e.getMessage());
        }
        return departmentSummaries;
    }

    private DepartmentSummary mapRowToDepartmentSummary(ResultSet rs) throws SQLException {
        DepartmentSummary departmentSummary = new DepartmentSummary();
        departmentSummary.setDepartmentId(rs.getInt("department_id"));
        departmentSummary.setDepartmentName(rs.getString("department_name"));
        departmentSummary.setEmployeeCount(rs.getInt("emp_count"));

        return departmentSummary;
    }

    public EmployeeWithDepartment mapRowToEmployeeWithDepartment(ResultSet rs) throws SQLException {
        EmployeeWithDepartment employeeWithDepartment = new EmployeeWithDepartment();

        employeeWithDepartment.setEmployeeId(rs.getInt("id"));
        employeeWithDepartment.setFullName(rs.getString("fullname"));
        employeeWithDepartment.setEmail(rs.getString("email"));
        employeeWithDepartment.setDepartmentName(rs.getString("department_name"));
        employeeWithDepartment.setLocation(rs.getString("location"));


        return employeeWithDepartment;

    }
}

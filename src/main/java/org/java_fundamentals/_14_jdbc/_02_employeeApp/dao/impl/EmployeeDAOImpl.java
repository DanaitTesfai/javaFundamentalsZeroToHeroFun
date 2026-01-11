package org.java_fundamentals._14_jdbc._02_employeeApp.dao.impl;

import org.java_fundamentals._14_jdbc._02_employeeApp.dao.EmployeeDAO;
import org.java_fundamentals._14_jdbc._02_employeeApp.model.Department;
import org.java_fundamentals._14_jdbc._02_employeeApp.model.Employee;
import org.java_fundamentals._14_jdbc._02_employeeApp.util.DBConnection;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class EmployeeDAOImpl implements EmployeeDAO {

    @Override
    public boolean save(Employee e) {
        String sql = "INSERT INTO employees(employee_fullname, email, department_id, created_at) values(?,?,?,?)";
        try (
                Connection connection = DBConnection.getConnection();
                PreparedStatement preparedStatement = connection.prepareStatement(sql);
        ) {
            preparedStatement.setString(1, e.getFullName());
            preparedStatement.setString(2, e.getEmail());
            preparedStatement.setInt(3, e.getDepartmentId());
            preparedStatement.setTimestamp(4, e.getCreatedAt());

            int rows = preparedStatement.executeUpdate();

            return rows == 1;


        } catch (SQLException | IOException ex) {
            System.out.println("Error saving to database: " + ex.getMessage());
        }
        return false;
    }

    @Override
    public List<Employee> findAll() {
        List<Employee> employees = new ArrayList<>();
        String sql = "SELECT * FROM employees";
        try (
                Connection connection = DBConnection.getConnection();
                PreparedStatement preparedStatement = connection.prepareStatement(sql);
        ) {
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                Employee employee = mapRow(rs);
                employees.add(employee);
            }

        } catch (SQLException | IOException e) {
            System.out.println("Error finding all departments:" + e.getMessage());
        }
        return employees;
    }

    @Override
    public Optional<Employee> findById(int id) {
        String sql = "SELECT * FROM employees WHERE id = ?";
        try (
                Connection connection = DBConnection.getConnection();
                PreparedStatement preparedStatement = connection.prepareStatement(sql);
        ) {
            preparedStatement.setInt(1, id);
            ResultSet rs = preparedStatement.executeQuery();
            if (rs.next()) {
                Employee employee = mapRow(rs);
                return Optional.of(employee);
            }

        } catch (SQLException | IOException e) {
            System.out.println("Error finding a department: " + e.getMessage());
        }
        return Optional.empty();
    }

    @Override
    public List<Employee> findByDepartmentId(int departmentId) {
        List<Employee> employees = new ArrayList<>();
        String sql = """
                SELECT id, employee_fullname, email, department_id, created_at
                FROM employees
                WHERE department_id = ?
                ORDER BY employee_fullname
                """;
        try (
                Connection connection = DBConnection.getConnection();
                PreparedStatement preparedStatement = connection.prepareStatement(sql);
        ) {
            preparedStatement.setInt(1, departmentId);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                Employee employee = mapRow(rs);
                employees.add(employee);
            }

        } catch (SQLException | IOException e) {
            System.out.println("Error finding a department: " + e.getMessage());
        }
        return employees;
    }

    @Override
    public boolean updateFullName(int id, String newName) {
        String sql = "UPDATE employees SET employee_fullname = ? WHERE id = ?";
        try (
                Connection connection = DBConnection.getConnection();
                PreparedStatement preparedStatement = connection.prepareStatement(sql);
        ) {
            preparedStatement.setString(1, newName);
            preparedStatement.setInt(2, id);
            int rows = preparedStatement.executeUpdate();
            return rows == 1;

        } catch (SQLException | IOException e) {
            System.out.println("Error updating fullname: " + e.getMessage());
        }
        return false;
    }

    @Override
    public boolean transfer(int employeeId, int newDepartmentId) {
        String sql = "UPDATE employees SET department_id = ? WHERE id = ?";
        try (
                Connection connection = DBConnection.getConnection();
                PreparedStatement preparedStatement = connection.prepareStatement(sql);
        ) {
            preparedStatement.setInt(1, newDepartmentId);
            preparedStatement.setInt(2, employeeId);
            int rows = preparedStatement.executeUpdate();
            return rows == 1;

        } catch (SQLException | IOException e) {
            System.out.println("Error updating fullname: " + e.getMessage());
        }
        return false;
    }

    @Override
    public boolean deleteById(int id) {
        String sql = "DELETE * FROM employees WHERE id = ?";
        try (
                Connection connection = DBConnection.getConnection();
                PreparedStatement preparedStatement = connection.prepareStatement(sql);
        ) {
            preparedStatement.setInt(1, id);
            int rows = preparedStatement.executeUpdate();
            return rows == 1;


        } catch (SQLException | IOException e) {
            System.out.println("Error deleting a department: " + e.getMessage());
        }
        return false;
    }

    public Employee mapRow(ResultSet rs) throws SQLException {
        Employee employee = new Employee(
                rs.getInt("id"),
                rs.getString("employee_fullname"),
                rs.getString("email"),
                rs.getInt("department_id"),
                rs.getTimestamp("created_at")
        );
        return employee;

    }
}

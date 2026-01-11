package org.java_fundamentals._14_jdbc._02_employeeApp.dao.impl;

import com.mysql.cj.xdevapi.PreparableStatement;
import org.java_fundamentals._14_jdbc._02_employeeApp.dao.DepartmentDAO;
import org.java_fundamentals._14_jdbc._02_employeeApp.model.Department;
import org.java_fundamentals._14_jdbc._02_employeeApp.util.DBConnection;

import java.io.IOException;
import java.net.ConnectException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class DepartmentDAOImpl implements DepartmentDAO {

    @Override
    public boolean save(Department d) {
        String sql = "INSERT INTO departments(department_name, location) values(?,?)";
        try (
                Connection connection = DBConnection.getConnection();
                PreparedStatement preparedStatement = connection.prepareStatement(sql);
        ) {
            preparedStatement.setString(1, d.getName());
            preparedStatement.setString(2, d.getLocation());

            int rows = preparedStatement.executeUpdate();

            return rows == 1;


        } catch (SQLException | IOException e) {
            System.out.println("Error saving to database: " + e.getMessage());
        }
        return false;
    }

    @Override
    public List<Department> findAll() {
        List<Department> departments = new ArrayList<>();
        String sql = "SELECT * FROM departments";
        try (
                Connection connection = DBConnection.getConnection();
                PreparedStatement preparedStatement = connection.prepareStatement(sql);
        ) {
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                Department department = mapRow(rs);
                departments.add(department);
            }

        } catch (SQLException | IOException e) {
            System.out.println("Error finding all departments:" + e.getMessage());
        }
        return departments;
    }

    @Override
    public Optional<Department> findById(int id) {
        String sql = "SELECT * FROM departments WHERE department_id = ?";
        try (
                Connection connection = DBConnection.getConnection();
                PreparedStatement preparedStatement = connection.prepareStatement(sql);
        ) {
            preparedStatement.setInt(1, id);
            ResultSet rs = preparedStatement.executeQuery();
            if (rs.next()) {
                Department department = mapRow(rs);
                return Optional.of(department);
            }

        } catch (SQLException | IOException e) {
            System.out.println("Error finding a department: " + e.getMessage());
        }


        return Optional.empty();
    }

    @Override
    public boolean updateLocation(int id, String newLocation) {
        String sql = "UPDATE departments SET location = ? WHERE department_id = ?";
        try (
                Connection connection = DBConnection.getConnection();
                PreparedStatement preparedStatement = connection.prepareStatement(sql);
        ) {
            preparedStatement.setString(1, newLocation);
            preparedStatement.setInt(2, id);
            int rows = preparedStatement.executeUpdate();
            return rows == 1;

        } catch (SQLException | IOException e) {
            System.out.println("Error updating department: " + e.getMessage());
        }

        return false;
    }

    @Override
    public boolean deleteById(int id) {
        String sql = "DELETE * FROM departments WHERE department_id = ?";
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


    public Department mapRow(ResultSet rs) throws SQLException {
        Department department = new Department(
                rs.getInt("department_id"),
                rs.getString("department_name"),
                rs.getString("location")
        );
        return department;

    }

    /*
    Mapping in programming means associating data from one structure or type to another,
    often transforming it, like linking database rows to objects (ORM) or applying a
    function to every item in a list (functional map()), allowing for data conversion,
    integration, and processing between different systems or representations,
    from database records to application objects or from a list of numbers to a list
    of their squares. It's a fundamental concept for data integration, transformation,
    and abstraction, reducing manual coding.
     */
}

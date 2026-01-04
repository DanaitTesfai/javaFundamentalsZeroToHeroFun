package org.java_fundamentals._14_jdbc._studentApp.dao;

import org.java_fundamentals._14_jdbc._studentApp.model.Student;
import org.java_fundamentals._14_jdbc._studentApp.util.DBConnection;

import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class StudentDAOImpl implements StudentDAO{

    @Override
    public boolean save(Student student) {
        String sql = "INSERT INTO students(name, email, phone_number) VALUES(?,?,?)";

        try(
                Connection conn = DBConnection.getConnection();
                PreparedStatement stmt = conn.prepareStatement(sql);
                ){
            stmt.setString(1, student.getName());
            stmt.setString(2, student.getEmail());
            stmt.setString(3, student.getPhoneNumber());

            // rows affected: executeUpdate returns the number of rows affected by the SQL statement, 1 or 0
            // if successful, it returns 1, otherwise 0
            int rows = stmt.executeUpdate();
            return rows == 1;
            /*
                if (rows == 1) return true;
                else return false;
             */

        }catch (SQLException | IOException e){
            System.out.println("Database Error while saving student: " + e.getMessage());
            return false;
        }

    }

    @Override
    public List<Student> findAll() {
        List<Student> students = new ArrayList<>();
        String sql = "SELECT * FROM students";
        try(
                Connection conn = DBConnection.getConnection();
                PreparedStatement stmt = conn.prepareStatement(sql);
        ){
            ResultSet rs = stmt.executeQuery();
            while(rs.next()){
                Student student = mapRow(rs);
                students.add(student);

            }

        }catch (SQLException | IOException e){
            System.out.println("Database Error reading all: " + e.getMessage());
        }

        return students;
    }


    @Override
    public Optional<Student> findById(int id) {
        String sql = "SELECT * FROM students WHERE student_id = ?";
        try(
                Connection conn =  DBConnection.getConnection();
                PreparedStatement stmt = conn.prepareStatement(sql)
                ){
            stmt.setInt(1, id);
            try{
                ResultSet rs = stmt.executeQuery();
                if(rs.next()){
                    Student student = mapRow(rs);
                    return Optional.of(student);

                }
            }catch (SQLException e){
                System.out.println("Database error reading students: " + e.getMessage());
            }

        }catch (SQLException | IOException e){
            System.out.println("Database error reading students: " + e.getMessage());
        }
        return Optional.empty();
    }

    @Override
    public boolean updateStudent(int id, String newName, String newEmail, String newPhone) {
        String sql = "UPDATE students SET name = ?, email = ?, phone_number= ? WHERE student_id = ?";
        try(
              Connection conn = DBConnection.getConnection();
              PreparedStatement stmt = conn.prepareStatement(sql);
                ){
            stmt.setString(1,newName);
            stmt.setString(2,newEmail);
            stmt.setString(3,newPhone);
            stmt.setInt(4,id);

            int rows = stmt.executeUpdate();
            return rows == 1;

        }catch (SQLException | IOException e){
            System.out.println("Database error updating student: " + e.getMessage());
        }
        return false;
    }

    @Override
    public boolean deleteStudentById(int id) {
        String sql = "DELETE FROM students WHERE student_id = ?";
        try(
                Connection conn = DBConnection.getConnection();
                PreparedStatement stmt = conn.prepareStatement(sql);
                ){
            stmt.setInt(1,id);

            int rows = stmt.executeUpdate();
            return rows == 1;
        }catch (SQLException | IOException e){
            System.out.println("Database error deleting a student: " + e.getMessage());
        }
        return false;
    }




    private static Student mapRow(ResultSet rs) throws SQLException {
        Student student = new Student();
        student.setId(rs.getInt("student_id"));
        student.setName(rs.getString("name"));
        student.setEmail(rs.getString("email"));
        student.setPhoneNumber(rs.getString("phone_number"));

        Timestamp ts = rs.getTimestamp("created_at");
        if (ts != null){
            student.setCreatedAt(ts.toLocalDateTime());
        }
        return student;
    }
}

package org.java_fundamentals._14_jdbc._studentApp;

import org.java_fundamentals._14_jdbc._studentApp.model.Student;
import org.java_fundamentals._14_jdbc._studentApp.service.StudentServiceImpl;

import java.io.IOException;
import java.sql.SQLException;
import java.sql.Timestamp;

public class App {
    public static void main(String[] args) throws SQLException, IOException {

        StudentServiceImpl studentService = new StudentServiceImpl();
        Timestamp now = new Timestamp(System.currentTimeMillis());
        Student student = new Student("Alice", "Alice@gmail.com", "23456", now.toLocalDateTime());
        boolean isAdded = studentService.addStudent(student);
        if (isAdded){
            System.out.println("Student added successfully.");
        }else {
            System.out.println("insert failed.");
        }

    }
}

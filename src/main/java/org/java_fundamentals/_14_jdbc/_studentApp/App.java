package org.java_fundamentals._14_jdbc._studentApp;

import org.java_fundamentals._14_jdbc._studentApp.dao.StudentDAO;
import org.java_fundamentals._14_jdbc._studentApp.dao.StudentDAOImpl;
import org.java_fundamentals._14_jdbc._studentApp.model.Student;
import org.java_fundamentals._14_jdbc._studentApp.util.DBConnection;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Optional;

public class App {
    public static void main(String[] args) throws SQLException, IOException {
        StudentDAO studentDAO = new StudentDAOImpl();
        int id = 3;

        boolean isDeleted = studentDAO.deleteStudentById(id);
        if(isDeleted){
            System.out.println("Student deleted successfully.");
        }else {
            System.out.println("delete failed.");
        }

    }
}

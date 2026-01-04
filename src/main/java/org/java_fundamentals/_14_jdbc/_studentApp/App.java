package org.java_fundamentals._14_jdbc._studentApp;

import org.java_fundamentals._14_jdbc._studentApp.util.DBConnection;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

public class App {
    public static void main(String[] args) throws SQLException, IOException {
        System.out.println("Checking connection.");
        Connection connection = DBConnection.getConnection();
        System.out.println("Connection status: " + connection.toString());
    }
}

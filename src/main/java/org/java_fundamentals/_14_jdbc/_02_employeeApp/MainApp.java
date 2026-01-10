package org.java_fundamentals._14_jdbc._02_employeeApp;

import org.java_fundamentals._14_jdbc._02_employeeApp.util.DBConnection;

import java.io.IOException;
import java.sql.SQLException;

public class MainApp {
    public static void main(String[] args) throws SQLException, IOException {
        DBConnection.getConnection();
    }
}

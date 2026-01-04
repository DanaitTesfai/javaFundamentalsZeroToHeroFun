package org.java_fundamentals._14_jdbc._studentApp.util;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DBConnection {
    public static Connection getConnection() throws SQLException, IOException {
        // Implementation for establishing a database connection
        Properties props = new Properties();
        // Load properties from a file or other source
        InputStream input = DBConnection.class.getClassLoader().getResourceAsStream("db.properties");
        props.load(input);

        String url = props.getProperty("db.url");
        String username = props.getProperty("db.username");
        String password = props.getProperty("db.password");

        System.out.println("Connecting to database...");
        System.out.println("url: " + url);
        System.out.println("username: " + username);

        return DriverManager.getConnection(url, username, password);

    }

}

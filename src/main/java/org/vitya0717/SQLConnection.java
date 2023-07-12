package org.vitya0717;

import java.sql.Connection;
import java.sql.DriverManager;

public class SQLConnection {
    public static Connection connection;

    public SQLConnection(String url, String username, String password) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(url, username, password);
            System.out.println("Successfully connected to the database!");
        } catch (Exception e) {
            System.out.println("Connection failed to the database!");
            e.printStackTrace();
        }
    }

    public Connection createConnection() {
        return connection;
    }
}

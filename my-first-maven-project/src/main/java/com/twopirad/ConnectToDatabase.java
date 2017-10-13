package com.twopirad;

import java.sql.*;

public class ConnectToDatabase {

    private final String url = "jdbc:mysql://localhost:3306/sales";
    private final String username = "root";
    private final String password = "3037542";
    private Connection connection;

    public Connection getConnection() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(url, username, password);
        } catch (Exception e) {
            System.out.println(e);
        }
        return connection;
    }
}

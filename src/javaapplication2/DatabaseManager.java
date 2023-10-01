/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication2;

import java.sql.SQLException;
import java.sql.DriverManager;
import java.sql.Connection;

public class DatabaseManager
{
 private static final String dbUrl = "your database url";
    private static final String dbUser = "your database username";
    private static final String dbPassword = "Your database password";
    
    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(dbUrl, dbUser, dbPassword);
    }
}

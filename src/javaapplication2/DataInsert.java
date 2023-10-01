/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication2;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author emir1
 */
public class DataInsert {

    public boolean insertData(String field1, String field2, String field3) {
        String sql = "INSERT INTO Employees (FirstName, LastName, Salary) VALUES (?, ?, ? )";

        try (Connection con = DatabaseManager.getConnection();
             PreparedStatement pst = con.prepareStatement(sql)) {

            pst.setString(1, field1);
            pst.setString(2, field2);
            pst.setString(3, field3);
            int rowsAffected = pst.executeUpdate();

            return rowsAffected > 0;
        } catch (SQLException exception) {
            System.err.println("Error: " + exception.getMessage());
            return false;
        }
    }
}
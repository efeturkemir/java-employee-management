/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication2;


import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DataUpdate {


    public boolean updateData(int id, String newFirstName, String newLastName, String newSalary) {
        String sql = "UPDATE Employees SET FirstName = ?, LastName = ?, Salary = ? WHERE EmployeeID = ?";
        try (Connection con = DatabaseManager.getConnection();
             PreparedStatement pst = con.prepareStatement(sql)) {

            pst.setString(1, newFirstName);
            pst.setString(2, newLastName);
            pst.setString(3, newSalary);
            pst.setInt(4, id);

            int rowsAffected = pst.executeUpdate();

            // Check if the update was successful
            return rowsAffected > 0;
        } catch (SQLException e) {
            System.out.print(e);
            return false;
        }
    }
}
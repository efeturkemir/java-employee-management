/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication2;

/**
 *
 * @author emir1
 */
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DataDelete {

    public boolean delete(int id) {
        String sql = "DELETE FROM Employees WHERE EmployeeID = ?";
        try (Connection con = DatabaseManager.getConnection(); PreparedStatement pst = con.prepareStatement(sql)) {

            pst.setInt(1, id);

            int rowsAffected = pst.executeUpdate();
            return rowsAffected > 0;
        } catch (SQLException e) {
            System.out.print(e);
            return false;
        }
    }
}

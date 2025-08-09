package com.wipro.jdbcdemo.jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Employee {
	public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/wiprojdbc";
        String username = "root";  
        String password = "Akank@2891";

    
        String query = "INSERT INTO employee (emp_name, department) VALUES (?, ?)";
        Connection conn = null;
        PreparedStatement stmt = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(url, username, password);
            stmt = conn.prepareStatement(query);
            stmt.setString(1, "Akanksha");  
            stmt.setString(2, "IT Department");  
            int rowsAffected = stmt.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("Employee record inserted successfully.");
            } else {
                System.out.println("Failed to insert employee record.");
            }

        } catch (ClassNotFoundException e) {
            System.out.println("JDBC Driver not found: " + e.getMessage());
        } catch (SQLException e) {
            System.out.println("SQL Error: " + e.getMessage());
        } finally {
            
            try {
                if (stmt != null) stmt.close();
                if (conn != null) conn.close();
            } catch (SQLException e) {
                System.out.println("Error closing resources: " + e.getMessage());
            }
        }
    }

}

package com.wipro.jdbcdemo.jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class EmpAverageSal {
	
	    public static void main(String[] args) {
	
	        String url = "jdbc:mysql://localhost:3306/wiprojdbc";
	        String user = "root";  
	        String password = "Akank@2891";  

	      
	        String insertQuery = "INSERT INTO employee1 (name, age, salary) VALUES (?, ?, ?)";
	        String selectQuery = "SELECT AVG(salary) AS average_salary FROM employee1 WHERE age > 30 AND salary > 50000";

	        try (Connection conn = DriverManager.getConnection(url, user, password);
	             PreparedStatement insertStmt = conn.prepareStatement(insertQuery)) {
	            insertStmt.setString(1, "John");
	            insertStmt.setInt(2, 25);
	            insertStmt.setDouble(3, 40000);
	            insertStmt.executeUpdate();

	            insertStmt.setString(1, "Alice");
	            insertStmt.setInt(2, 35);
	            insertStmt.setDouble(3, 60000);
	            insertStmt.executeUpdate();

	            insertStmt.setString(1, "Bob");
	            insertStmt.setInt(2, 40);
	            insertStmt.setDouble(3, 70000);
	            insertStmt.executeUpdate();

	            insertStmt.setString(1, "Charlie");
	            insertStmt.setInt(2, 20);
	            insertStmt.setDouble(3, 30000);
	            insertStmt.executeUpdate();

	            insertStmt.setString(1, "David");
	            insertStmt.setInt(2, 38);
	            insertStmt.setDouble(3, 55000);
	            insertStmt.executeUpdate();

	            System.out.println("Data inserted successfully.");

	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	        try (Connection conn = DriverManager.getConnection(url, user, password);
	             Statement stmt = conn.createStatement();
	             ResultSet rs = stmt.executeQuery(selectQuery)) {

	            if (rs.next()) {
	                double averageSalary = rs.getDouble("average_salary");
	                System.out.println("Average Salary of employees older than 30 and with salary > 50000: " + averageSalary);
	            } else {
	                System.out.println("No employees found matching the criteria.");
	            }

	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	    }
	}

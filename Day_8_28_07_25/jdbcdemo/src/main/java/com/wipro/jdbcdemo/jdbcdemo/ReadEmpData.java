package com.wipro.jdbcdemo.jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ReadEmpData {
		    public static void readEmployeeData(int empId) {
	
	        String url = "jdbc:mysql://localhost:3306/wiprojdbc"; 
	        String username = "root"; 
	        String password = "Akank@2891"; 
	
	        String query = "SELECT id, emp_name, department FROM employee WHERE id = ?";
	        Connection conn = null;
	        PreparedStatement pstmt = null;
	        ResultSet rs = null;

	        try {
	         
	            conn = DriverManager.getConnection(url, username, password);
	            pstmt = conn.prepareStatement(query);
	            pstmt.setInt(1, empId);  
	            rs = pstmt.executeQuery();
	            if (rs.next()) {
	                int id = rs.getInt("id");
	                String empName = rs.getString("emp_name");
	                String department = rs.getString("department");
	                System.out.println("ID: " + id + ", Name: " + empName + ", Department: " + department);
	            } else {
	                System.out.println("Employee with ID " + empId + " not found.");
	            }
	        } catch (SQLException e) {
	           
	            System.out.println("SQL Error: " + e.getMessage());
	        } finally {
	            try {
	                if (rs != null) rs.close();
	                if (pstmt != null) pstmt.close();
	                if (conn != null) conn.close();
	            } catch (SQLException e) {
	                System.out.println("Error closing resources: " + e.getMessage());
	            }
	        }
	    }

	    public static void main(String[] args) {
	        readEmployeeData(3);  
	    }
	}



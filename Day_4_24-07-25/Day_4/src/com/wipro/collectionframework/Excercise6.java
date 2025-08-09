package com.wipro.collectionframework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Excercise6 {
	 public static void main(String[] args) {
		 Employee e1 = new Employee("E001", "Akanksha", 30, 75000.00);
		 Employee e2 = new Employee("E002", "Bob", 25, 60000.00);
		 Employee e3 = new Employee("E003", "Vasu", 35, 90000.00);
		 Employee e4 = new Employee("E004", "David", 28, 75000.00);
	        List<Employee> employees = new ArrayList<>();
	        employees.add(e1);
	        employees.add(e2);
	        employees.add(e3);
	        employees.add(e4); 
	        
	        Collections.sort(employees);

	        System.out.println("Employees after sorting by salary (descending):");
	        System.out.println(employees);
	    }
}
	



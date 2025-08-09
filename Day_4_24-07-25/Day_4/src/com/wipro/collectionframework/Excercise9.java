package com.wipro.collectionframework;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class Excercise9 {

	public static void main(String[] args) {
		List<Employee> employees = new CopyOnWriteArrayList<>();
		Employee e1 = new Employee("E001", "Akanksha", 30, 75000.00);
		 Employee e2 = new Employee("E002", "Bob", 25, 950000.00);
		 Employee e3 = new Employee("E003", "Vasu", 35, 90000.00);
		 Employee e4 = new Employee("E004", "David", 28, 75000.00);
	       
	        employees.add(e1);
	        employees.add(e2);
	        employees.add(e3);
	        employees.add(e4);
	        
	        System.out.println("Original Employee List:");
	        for (Employee emp : employees) {
	            System.out.println(emp);
	        }
	        for(Employee emp : employees)
	        {
	        	if(emp.empSalary>80000)
	        	{
	        		employees.remove(emp);
	        	}
	        }
	        System.out.println("\nEmployee List after removal:");
	        for (Employee emp : employees) {
	            System.out.println(emp);
	        }

	}

}

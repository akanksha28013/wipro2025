package com.wipro.annonymous;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Excercise11 {
	 public static void main(String[] args) {
	      
		 List<Employee> employees = new ArrayList<>();
	        employees.add(new Employee(1, "Akanksha", 50000));
	        employees.add(new Employee(2, "Vasu", 75000));
	        employees.add(new Employee(3, "Charlie", 60000));
	        employees.add(new Employee(4, "Omii", 80000));
	        Comparator<Employee> sortBySalary = (o1, o2) -> Double.compare(o1.getSalary(), o2.getSalary());
	        Collections.sort(employees, sortBySalary);
	        System.out.println(employees);
	        
}
}
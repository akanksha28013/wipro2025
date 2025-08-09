package com.wipro.springdemo.bean;

public class College {
	
	String collegeName;
	
	Department department;
	
	
 public College(String collegeName, Department department) {
		super();
		this.collegeName = collegeName;
		this.department = department;
	}

 String getCollegeName() {
		return collegeName;
	}

	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return "College [collegeName=" + collegeName + ", department=" + department + "]";
	}
	
	

}

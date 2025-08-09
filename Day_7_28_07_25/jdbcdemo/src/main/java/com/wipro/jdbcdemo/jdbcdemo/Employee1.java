package com.wipro.jdbcdemo.jdbcdemo;

public class Employee1 {
	private String name;
    private int age;
    private double salary;
    public Employee1(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }

}

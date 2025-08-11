package com.wipro.relationdemo.service;


import java.util.List;

import com.wipro.relationdemo.entity.Employee;

public interface EmployeeService {
    Employee save(Employee employee);
    List<Employee> findAll();
    
}
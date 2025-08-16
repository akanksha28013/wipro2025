package com.wipro.employee_mgmt.service;

import java.util.List;

import com.wipro.employee_mgmt.entity.Employee;

public interface EmployeeService {
	Employee save(Employee employee);
    Employee findById(Long id);
    List<Employee> findByName(String name);
    Employee update(Long id, Employee employee);
    void delete(Long id);

}

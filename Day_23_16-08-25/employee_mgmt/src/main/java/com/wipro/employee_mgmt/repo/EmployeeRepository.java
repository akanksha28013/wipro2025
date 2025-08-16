package com.wipro.employee_mgmt.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wipro.employee_mgmt.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    List<Employee> findByNameContainingIgnoreCase(String name);
}

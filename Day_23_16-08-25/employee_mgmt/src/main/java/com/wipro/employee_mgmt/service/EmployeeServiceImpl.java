package com.wipro.employee_mgmt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wipro.employee_mgmt.entity.Employee;
import com.wipro.employee_mgmt.exception.ResourceNotFoundException;
import com.wipro.employee_mgmt.repo.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository repository;

    @Override
    public Employee save(Employee employee) {
        return repository.save(employee);
    }

    @Override
    public Employee findById(Long id) {
        return repository.findById(id)
            .orElseThrow(() -> new ResourceNotFoundException("Employee not found"));
    }

    @Override
    public List<Employee> findByName(String name) {
        return repository.findByNameContainingIgnoreCase(name);
    }

    @Override
    public Employee update(Long id, Employee updatedEmployee) {
        Employee existing = findById(id);
        existing.setName(updatedEmployee.getName());
        existing.setType(updatedEmployee.getType());
        existing.setAddress(updatedEmployee.getAddress());
        existing.setDepartment(updatedEmployee.getDepartment());
        return repository.save(existing);
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }
}

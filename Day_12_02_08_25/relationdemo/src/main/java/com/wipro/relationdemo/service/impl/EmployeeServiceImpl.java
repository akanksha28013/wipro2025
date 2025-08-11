package com.wipro.relationdemo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wipro.relationdemo.entity.Employee;
import com.wipro.relationdemo.repo.EmployeeRepo;
import com.wipro.relationdemo.service.EmployeeService;

import lombok.RequiredArgsConstructor;


@Service
@RequiredArgsConstructor
public class EmployeeServiceImpl implements EmployeeService{
	@Autowired
	EmployeeRepo employeeRepo;
	@Override
	public Employee save(Employee employee) {
		
		return employeeRepo.save(employee);
	}

	@Override
	public List<Employee> findAll() {
		
		return employeeRepo.findAll();
	}

	

}

package com.wipro.relationdemo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wipro.relationdemo.entity.Department;

@Repository
public interface DepartmentRepo extends JpaRepository<Department, Integer>{

}

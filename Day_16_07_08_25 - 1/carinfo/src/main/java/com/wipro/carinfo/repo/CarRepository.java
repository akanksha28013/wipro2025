package com.wipro.carinfo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wipro.carinfo.Entity.Car;

public interface CarRepository extends JpaRepository<Car, Integer> {
}
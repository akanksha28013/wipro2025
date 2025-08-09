package com.wipro.firstmvcdemo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wipro.firstmvcdemo.repo.CarRepo;
import com.wipro.firstmvcdemo.service.CarService;

@Service
public class CarServiceImpl implements CarService{
	@Autowired
	CarRepo carRepo;
	
	@Override
	public List<String> getCarList() {
		 
		return carRepo.getCarList();
	}

}

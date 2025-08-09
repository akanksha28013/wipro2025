package com.wipro.firstmvcdemo.repo;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public class CarRepo {
	public List<String> getCarList() {		
		List<String> carList= Arrays.asList("Mercedes","Maruti Suzuki","BMW","Supra");
		return carList;
	}

	

}

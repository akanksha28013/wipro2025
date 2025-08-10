package com.wipro.carinfo.service;

import java.util.List;

import com.wipro.carinfo.Entity.Car;

public interface CarService {
	Car createCar(Car car);

    Car getCarById(int id);

    Car updateCar(int id, Car carDetails);

    void deleteCar(int id);

    List<Car> getAllCars();

}

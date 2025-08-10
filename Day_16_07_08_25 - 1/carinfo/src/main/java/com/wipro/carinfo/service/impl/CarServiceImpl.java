package com.wipro.carinfo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wipro.carinfo.Entity.Car;
import com.wipro.carinfo.repo.CarRegDetailRepo;
import com.wipro.carinfo.repo.CarRepository;
import com.wipro.carinfo.service.CarService;

import java.util.List;
import java.util.Optional;

@Service
public class CarServiceImpl implements CarService {

    @Autowired
     CarRepository carRepository;

    @Autowired
     CarRegDetailRepo regDetailRepo;

    @Override
    public Car createCar(Car car) {
    
        return carRepository.save(car);
    }

    @Override
    public Car getCarById(int id) {
    
        return carRepository.findById(id).orElseThrow(() -> new RuntimeException("Car not found"));
    }

    @Override
    public Car updateCar(int id, Car carDetails) {
    
        Car car = carRepository.findById(id).orElseThrow(() -> new RuntimeException("Car not found"));

 
        car.setMake(carDetails.getMake());
        car.setRegDetail(carDetails.getRegDetail());

             return carRepository.save(car);
    }

    @Override
    public void deleteCar(int id) {
     
        Car car = carRepository.findById(id).orElseThrow(() -> new RuntimeException("Car not found"));
        carRepository.delete(car);
    }

    @Override
    public List<Car> getAllCars() {
      
        return carRepository.findAll();
    }
}

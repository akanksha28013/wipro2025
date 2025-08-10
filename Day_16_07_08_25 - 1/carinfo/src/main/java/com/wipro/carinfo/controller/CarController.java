package com.wipro.carinfo.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;
import com.wipro.carinfo.Entity.Car;
import com.wipro.carinfo.service.CarService;

@RestController
@RequestMapping("/car")
public class CarController {

    @Autowired
     CarService carService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Car createCar(@RequestBody Car car) {
        return carService.createCar(car);
    }

    @GetMapping("/{id}")
    public Car getCar(@PathVariable int id) {
        return carService.getCarById(id);
    }

    @PutMapping("/{id}")
    public Car updateCar(@PathVariable int id, @RequestBody Car carDetails) {
        return carService.updateCar(id, carDetails);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteCar(@PathVariable int id) {
        carService.deleteCar(id);
    }

    @GetMapping
    public List<Car> getAllCars() {
        return carService.getAllCars();
    }}

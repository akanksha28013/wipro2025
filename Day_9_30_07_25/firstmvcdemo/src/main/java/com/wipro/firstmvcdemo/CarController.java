package com.wipro.firstmvcdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.wipro.firstmvcdemo.service.CarService;


@Controller
@RequestMapping("/car")
public class CarController {
	@Autowired
	CarService carService;
	
	@GetMapping("/list")
	String showCarList(Model model)
	{ 
		model.addAttribute("carList", carService.getCarList());
		return "carlist";
		
	}


}

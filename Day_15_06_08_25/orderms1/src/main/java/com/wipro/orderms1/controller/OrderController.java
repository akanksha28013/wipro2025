package com.wipro.orderms1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wipro.orderms1.entity.Order;

import com.wipro.orderms1.service.OrderService;

@RestController
@RequestMapping("/orders")

public class OrderController {

		
		@Autowired
		OrderService orderService;
		
		@PostMapping
		void save(@RequestBody Order order)
		{
			
			orderService.save(order);
			
			
		}

		@GetMapping
		List<Order> findAll()
		{
			return orderService.findAll();
		}
}
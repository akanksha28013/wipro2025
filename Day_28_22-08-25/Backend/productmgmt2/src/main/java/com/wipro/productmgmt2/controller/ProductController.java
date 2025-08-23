package com.wipro.productmgmt2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wipro.productmgmt2.entity.Product;
import com.wipro.productmgmt2.service.ProductService;


@RestController
@RequestMapping("/product")
public class ProductController {
	@Autowired
	ProductService productServie;
	
	@GetMapping
	List<Product> findAll()
	{
		return productServie.findAll();
	}
	@GetMapping("/{id}")
	Product findById(@PathVariable int id)
	{
		return productServie.findById(id);
	}
	@DeleteMapping("/{id}")
	void deleteById(@PathVariable int id)
	{
		productServie.deleteById(id);
	}
	@PostMapping
	void save(@RequestBody Product product)
	{
		productServie.save(product);
		
	}
	
	@PutMapping
	void update(@RequestBody Product product)
	{
		productServie.save(product);
		
	}

}


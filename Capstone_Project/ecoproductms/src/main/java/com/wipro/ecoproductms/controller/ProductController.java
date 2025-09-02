package com.wipro.ecoproductms.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.wipro.ecoproductms.entity.Product;
import com.wipro.ecoproductms.service.ProductService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

import java.util.List;

@RestController
@RequestMapping("/product")
@Tag(name = "Product Management", description = "Endpoints for managing products (Admin only for add/update/delete)")
public class ProductController {

    @Autowired
    private ProductService productService;

    
    @PostMapping
    @Operation(summary = "Add a new product (Admin only)")
    public void save(@RequestBody Product product) {
        productService.save(product);
    }

    
    @PutMapping
    @Operation(summary = "Update an existing product (Admin only)")
    public void update(@RequestBody Product product) {
        productService.save(product);
    }

    
    @DeleteMapping("/{id}")
    @Operation(summary = "Delete a product by ID (Admin only)")
    public void deleteById(@PathVariable int id) {
        productService.deleteById(id);
    }

    
    @GetMapping
    @Operation(summary = "Get list of all products (Available to all users)")
    public List<Product> findAll() {
        return productService.findAll();
    }

    
    @GetMapping("/{id}")
    @Operation(summary = "Get product details by ID (Available to all users)")
    public Product findById(@PathVariable int id) {
        return productService.findById(id);
    }
    
    @PutMapping("/updateStock/{id}")
    public String updateStock(@PathVariable int id, @RequestParam int newQty) {
        productService.updateStock(id, newQty);
        return "✅ Stock updated successfully!";
    }
}

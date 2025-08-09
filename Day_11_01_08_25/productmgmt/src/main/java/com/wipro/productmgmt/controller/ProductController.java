package com.wipro.productmgmt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.wipro.productmgmt.entity.Product;
import com.wipro.productmgmt.service.ProductService;

@RestController
@RequestMapping("/api/products")
public class ProductController {

    @Autowired
    private ProductService productService;

    @PostMapping
    public ResponseEntity<String> saveProduct(@RequestBody Product product) {
        productService.save(product);
        return ResponseEntity.ok("Product saved successfully.");
    }

    @GetMapping
    public List<Product> getAllProducts() {
        return productService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Product> getProductById(@PathVariable int id) {
        Product product = productService.findById(id);
        if (product != null) {
            return ResponseEntity.ok(product);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    
    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteProduct(@PathVariable int id) {
        productService.deleteById(id);
        return ResponseEntity.ok("Product deleted successfully.");
    }

    
    @GetMapping("/filter/type")
    public List<Product> getProductsByMake(@RequestParam String type) {
        return productService.findByProductMakeOrderByProductNameDesc(type);
    }

        @GetMapping("/page")
    public Page<Product> getPaginatedProducts(@RequestParam(defaultValue = "0") int page,
                                              @RequestParam(defaultValue = "5") int size) {
        Pageable pageable = PageRequest.of(page, size);
        return productService.findAll(pageable);
    }
}

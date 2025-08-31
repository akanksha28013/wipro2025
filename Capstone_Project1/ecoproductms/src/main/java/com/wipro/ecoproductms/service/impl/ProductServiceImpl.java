package com.wipro.ecoproductms.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import com.wipro.ecoproductms.entity.Product;
import com.wipro.ecoproductms.repo.ProductRepo;
import com.wipro.ecoproductms.service.ProductService;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {

    private final ProductRepo productRepo;

    @Override
    public List<Product> findAll() {
        return productRepo.findAll();
    }

    @Override
    public Product findById(int id) {
        return productRepo.findById(id).orElse(null);
    }

    @Override
    public void deleteById(int id) {
        productRepo.deleteById(id);
    }

    @Override
    public void save(Product product) {
        productRepo.save(product);
    }
    
    @Override
    public void updateStock(int productId, int newQty) {
        Product product = productRepo.findById(productId)
                .orElseThrow(() -> new RuntimeException("Product not found"));

        product.setAvailableQty(newQty);  
        productRepo.save(product);
    }

}
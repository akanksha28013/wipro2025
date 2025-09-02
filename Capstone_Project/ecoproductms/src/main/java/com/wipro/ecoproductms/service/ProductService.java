package com.wipro.ecoproductms.service;

import java.util.List;

import com.wipro.ecoproductms.dto.OrderDto;
import com.wipro.ecoproductms.entity.Product;
import java.util.List;

public interface ProductService {
    List<Product> findAll();
    Product findById(int id);
    void deleteById(int id);
    void save(Product product);
    void updateStock(int productId, int newQty);
	void decreaseStock(int productId, int qty);
	void increaseStock(int productId, int qty);

}
package com.wipro.productmgmt2.service;

import java.util.List;
import com.wipro.productmgmt2.entity.Product;

public interface ProductService {
	List<Product> findAll();
	Product findById(int id);
	void save(Product product);
	void deleteById(int id);
}

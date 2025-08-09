package com.wipro.productmgmt.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wipro.productmgmt.entity.Product;

public interface ProductRepo extends JpaRepository<Product, Integer> {

    
	List<Product> findByProductMakeOrderByProductNameDesc(String productType);

	
}

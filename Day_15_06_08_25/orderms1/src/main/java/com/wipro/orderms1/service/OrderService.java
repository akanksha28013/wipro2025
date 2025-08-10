package com.wipro.orderms1.service;
import java.util.List;

import com.wipro.orderms1.entity.Order;


public interface OrderService {
	void save(Order order);
	List<Order> findAll();
}


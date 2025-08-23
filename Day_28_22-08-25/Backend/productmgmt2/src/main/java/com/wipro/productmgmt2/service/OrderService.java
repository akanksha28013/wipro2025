package com.wipro.productmgmt2.service;

import java.util.List;

import com.wipro.productmgmt2.entity.Order;

public interface OrderService {
    Order placeOrder(int productId, int qty);
    List<Order> getAllOrders();
}
package com.wipro.ecoorderms.service;

import java.util.List;
import com.wipro.ecoorderms.entity.Order;

public interface OrderService {
    Order createOrder(int userId);
    Order cancelOrder(int orderId);
    List<Order> getAllOrders();
    List<Order> getOrdersByUser(int userId);
    Order getOrderById(int orderId);
}
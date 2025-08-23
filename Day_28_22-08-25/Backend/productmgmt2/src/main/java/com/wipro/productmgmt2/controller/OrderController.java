package com.wipro.productmgmt2.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.wipro.productmgmt2.entity.Order;
import com.wipro.productmgmt2.service.OrderService;

@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @PostMapping("/place")
    public Order placeOrder(@RequestBody Map<String, Integer> request) {
        int productId = request.get("productId");
        int qty = request.get("qty");
        return orderService.placeOrder(productId, qty);
    }

  
    @GetMapping("/history")
    public List<Order> getOrders() {
        return orderService.getAllOrders();
    }
}
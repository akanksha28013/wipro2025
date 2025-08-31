package com.wipro.ecoorderms.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import com.wipro.ecoorderms.dto.ResponseMessage;
import com.wipro.ecoorderms.entity.Order;
import com.wipro.ecoorderms.service.OrderService;

import java.util.List;

@RestController
@RequestMapping("/order")
@RequiredArgsConstructor
public class OrderController {

    private final OrderService orderService;

    @PostMapping
    public ResponseMessage createOrder(@RequestParam int userId) {
        Order order = orderService.createOrder(userId);
        return new ResponseMessage("✅ Order placed successfully!", order);
    }

    @PutMapping("/{orderId}")
    public ResponseMessage cancelOrder(@PathVariable int orderId) {
        Order order = orderService.cancelOrder(orderId);
        return new ResponseMessage("❌ Order cancelled successfully!", order);
    }

    @GetMapping
    public ResponseMessage getAllOrders() {
        List<Order> orders = orderService.getAllOrders();
        return new ResponseMessage("📦 All orders fetched successfully!", orders);
    }

    @GetMapping("/{userId}")
    public ResponseMessage getOrdersByUser(@PathVariable int userId) {
        List<Order> orders = orderService.getOrdersByUser(userId);
        return new ResponseMessage("📦 Orders for user fetched successfully!", orders);
    }

    @GetMapping("/detail/{orderId}")
    public ResponseMessage getOrderById(@PathVariable int orderId) {
        Order order = orderService.getOrderById(orderId);
        return new ResponseMessage("📦 Order detail fetched successfully!", order);
    }
}

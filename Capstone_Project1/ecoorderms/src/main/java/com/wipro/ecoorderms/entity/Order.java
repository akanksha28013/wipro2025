package com.wipro.ecoorderms.entity;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

@Entity
@Data
@Table(name = "orders")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int orderId;

    private int userId;

    // productId -> quantity
    @ElementCollection
    @CollectionTable(name = "order_products", joinColumns = @JoinColumn(name = "order_id"))
    @MapKeyColumn(name = "product_id")
    @Column(name = "quantity")
    private Map<Integer, Integer> productQuantityMap = new HashMap<>();

    private double totalAmount;
    private String orderStatus; // NEW, CANCELLED, COMPLETED
    private LocalDateTime orderDate;
}
package com.wipro.ecoorderms.entity;

import jakarta.persistence.*;
import lombok.Data;
import java.util.HashMap;
import java.util.Map;

@Entity
@Data
@Table(name = "cart")
public class Cart {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private int userId;

    // productId -> quantity
    @ElementCollection
    @CollectionTable(name = "cart_products", joinColumns = @JoinColumn(name = "cart_id"))
    @MapKeyColumn(name = "product_id")
    @Column(name = "quantity")
    private Map<Integer, Integer> prodDetails = new HashMap<>();

    private int totalQty;
    private double totalPrice;
}
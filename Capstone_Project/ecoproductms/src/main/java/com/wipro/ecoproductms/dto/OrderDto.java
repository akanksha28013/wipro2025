package com.wipro.ecoproductms.dto;

import java.time.LocalDateTime;
import java.util.Map;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderDto {
    private int id;                          
    private int userId;                      
    private Map<Integer, Integer> productQuantityMap; 
    private double totalAmount;              
    private String orderStatus;              
    private LocalDateTime orderDate;         
}
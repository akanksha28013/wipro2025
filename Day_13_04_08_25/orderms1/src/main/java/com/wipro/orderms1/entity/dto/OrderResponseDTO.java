package com.wipro.orderms1.entity.dto;

import com.wipro.orderms1.entity.Order;

import jakarta.persistence.Column;
import lombok.Data;

@Data
public class OrderResponseDTO {
	Order order;
	Payment payment;
}

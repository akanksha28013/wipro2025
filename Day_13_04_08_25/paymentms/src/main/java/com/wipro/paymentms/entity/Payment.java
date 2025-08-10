package com.wipro.paymentms.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "payment")
@Data
public class Payment {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int id;
	
	@Column(name="order_id")
	int orderId;
		 
	@Column(name="payment_status")
String paymentStatus;
	
	@Column(name="payment_amount")
	double paymentAmount;
	    
}

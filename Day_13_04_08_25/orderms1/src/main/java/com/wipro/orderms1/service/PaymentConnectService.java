package com.wipro.orderms1.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.wipro.orderms1.entity.dto.Payment;

@FeignClient(name="paymentms")
public interface PaymentConnectService {
	
	@PostMapping("/payment")
	ResponseEntity<Payment> savePaymentData(@RequestBody Payment payment);
	
	
 
}
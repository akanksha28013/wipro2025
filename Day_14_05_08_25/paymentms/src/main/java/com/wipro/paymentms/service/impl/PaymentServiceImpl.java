package com.wipro.paymentms.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.wipro.paymentms.entity.Payment;
import com.wipro.paymentms.repo.PaymentRepo;
import com.wipro.paymentms.service.PaymentService;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;

@Service
public class PaymentServiceImpl implements PaymentService {

    @Autowired
    private PaymentRepo paymentRepo;


    @Override
    @CircuitBreaker(name = "payment-cb", fallbackMethod = "handleFallBack")
    public void save(Payment payment) {
       
        paymentRepo.save(payment); 
    }

    public void handleFallBack(Payment payment, Throwable t) {
        System.out.println("-- Circuit Breaker Triggered: System is down --");
        payment.setPaymentStatus("C"); 
        paymentRepo.save(payment); 
    }

    @Override
    public List<Payment> findAll() {
        return paymentRepo.findAll();
    }
    
}

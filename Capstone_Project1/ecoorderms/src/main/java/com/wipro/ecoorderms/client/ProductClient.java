package com.wipro.ecoorderms.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import com.wipro.ecoorderms.dto.ProductDto;

@FeignClient(name = "ECOPRODUCTMS")
public interface ProductClient {

    @GetMapping("product/{id}")
    ProductDto getProductById(@PathVariable("id") int id);

    @PutMapping("product/updateStock/{id}")
    void updateStock(@PathVariable("id") int productId, @RequestParam int newQty);
}
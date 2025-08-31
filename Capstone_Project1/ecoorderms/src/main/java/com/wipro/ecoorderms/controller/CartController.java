package com.wipro.ecoorderms.controller;


import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import com.wipro.ecoorderms.dto.ResponseMessage;
import com.wipro.ecoorderms.entity.Cart;
import com.wipro.ecoorderms.service.CartService;

@RestController
@RequestMapping("/cart")
@RequiredArgsConstructor
public class CartController {

    private final CartService cartService;

    @PostMapping("/addProd")
    public ResponseMessage addProductToCart(@RequestParam int userId, @RequestParam int productId, @RequestParam int qty) {
        Cart cart = cartService.addProductToCart(userId, productId, qty);
        return new ResponseMessage("✅ Product added to cart successfully!", cart);
    }

    @DeleteMapping("/deleteProd/{cartId}")
    public ResponseMessage deleteProductFromCart(@PathVariable int cartId) {
        cartService.deleteProductFromCart(cartId);
        return new ResponseMessage("🗑️ Product removed from cart successfully!", null);
    }

    @PutMapping("/update")
    public ResponseMessage updateProductQty(@RequestParam int userId, @RequestParam int productId, @RequestParam int qty) {
        Cart cart = cartService.updateProductQty(userId, productId, qty);
        return new ResponseMessage("✏️ Cart updated successfully!", cart);
    }

    @GetMapping("/{userId}")
    public ResponseMessage viewCart(@PathVariable int userId) {
        Cart cart = cartService.viewCart(userId);
        return new ResponseMessage("🛒 Cart fetched successfully!", cart);
    }
}

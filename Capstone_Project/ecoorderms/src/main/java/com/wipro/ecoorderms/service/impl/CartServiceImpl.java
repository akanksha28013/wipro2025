package com.wipro.ecoorderms.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import com.wipro.ecoorderms.client.ProductClient;
import com.wipro.ecoorderms.dto.ProductDto;
import com.wipro.ecoorderms.entity.Cart;
import com.wipro.ecoorderms.repo.CartRepo;
import com.wipro.ecoorderms.service.CartService;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CartServiceImpl implements CartService {

    private final CartRepo cartRepo;
    private final ProductClient productClient; 

    @Override
    public Cart addProductToCart(int userId, int productId, int qty) {
    
        ProductDto product = productClient.getProductById(productId);

        if (product.getAvailableQty() < qty) {
            throw new RuntimeException("❌ Not enough stock for product: " + product.getProdName());
        }

       
        Optional<Cart> cartOpt = cartRepo.findByUserId(userId);
        Cart cart = cartOpt.orElseGet(() -> {
            Cart newCart = new Cart();
            newCart.setUserId(userId);
            return newCart;
        });

    
        int existingQty = cart.getProdDetails().getOrDefault(productId, 0);
        cart.getProdDetails().put(productId, existingQty + qty);

    
        cart.setTotalQty(cart.getProdDetails().values().stream().mapToInt(i -> i).sum());
        double newTotalPrice = cart.getProdDetails().entrySet().stream()
                .mapToDouble(e -> {
                    ProductDto prod = productClient.getProductById(e.getKey());
                    return prod.getPrice() * e.getValue();
                })
                .sum();
        cart.setTotalPrice(newTotalPrice);

        return cartRepo.save(cart);
    }

    @Override
    public void deleteProductFromCart(int cartId) {
        cartRepo.deleteById(cartId);
    }

    @Override
    public Cart updateProductQty(int userId, int productId, int qty) {
        Cart cart = cartRepo.findByUserId(userId).orElseThrow(
                () -> new RuntimeException("Cart not found for user " + userId));

        if (qty <= 0) {
            cart.getProdDetails().remove(productId);
        } else {
            cart.getProdDetails().put(productId, qty);
        }

       
        cart.setTotalQty(cart.getProdDetails().values().stream().mapToInt(i -> i).sum());
        double newTotalPrice = cart.getProdDetails().entrySet().stream()
                .mapToDouble(e -> {
                    ProductDto prod = productClient.getProductById(e.getKey());
                    return prod.getPrice() * e.getValue();
                })
                .sum();
        cart.setTotalPrice(newTotalPrice);

        return cartRepo.save(cart);
    }

    @Override
    public Cart viewCart(int userId) {
        return cartRepo.findByUserId(userId)
                .orElseThrow(() -> new RuntimeException("Cart not found for user " + userId));
    }
}
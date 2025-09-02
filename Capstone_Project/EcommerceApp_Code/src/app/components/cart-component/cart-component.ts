import { Component, OnInit } from '@angular/core';
import { CartService } from '../../services/cart-service';
import { OrderService } from '../../services/order-service';
import { AuthService } from '../../services/auth-service';
import { CommonModule } from '@angular/common';
import { MatButtonModule } from '@angular/material/button';

@Component({
  selector: 'app-cart-component',
  imports: [CommonModule, MatButtonModule],
  templateUrl: './cart-component.html',
  styleUrl: './cart-component.css'
})
export class CartComponent implements OnInit {
  cartItems: any[] = [];
  total: number = 0;
  errorMsg = '';

  constructor(private cartService: CartService, private orderService: OrderService) {}

  ngOnInit(): void {
    this.loadCart();
  }

  loadCart() {
    this.cartService.getCart().subscribe({
      next: (res: any) => {
        console.log('🛒 Cart response:', res);
        this.cartItems = res.data?.items ?? [];
        this.total = this.cartItems.reduce(
          (sum, item) => sum + (item.product.price * item.qty), 0
        );
      },
      error: (err) => {
        console.error('❌ Failed to load cart:', err);
        this.errorMsg = 'Failed to load cart';
      }
    });
  }

  updateQty(productId: number, qty: number) {
    this.cartService.updateQty(productId, qty).subscribe({
      next: () => this.loadCart(),
      error: (err) => console.error('❌ Failed to update qty:', err)
    });
  }

  removeItem(cartId: number) {
    this.cartService.removeFromCart(cartId).subscribe({
      next: () => this.loadCart(),
      error: (err) => console.error('❌ Failed to remove item:', err)
    });
  }

  checkout() {
    this.orderService.createOrder().subscribe({
      next: (res) => {
        console.log('✅ Order placed:', res);
        this.cartItems = [];
        this.total = 0;
      },
      error: (err) => console.error('❌ Failed to checkout:', err)
    });
  }
}
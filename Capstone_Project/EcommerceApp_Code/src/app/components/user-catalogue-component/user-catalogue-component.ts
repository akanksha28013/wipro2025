import { Component, OnInit } from '@angular/core';
import { IProduct } from '../../models/iproduct';

import { CartService } from '../../services/cart-service';
import { ProductService } from '../../services/product-service';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'app-user-catalogue-component',
  imports: [FormsModule,CommonModule],
  templateUrl: './user-catalogue-component.html',
  styleUrl: './user-catalogue-component.css'
})
export class UserCatalogueComponent implements OnInit {
  products: IProduct[] = [];
  errorMsg = '';

  constructor(
    private productService: ProductService,
    private cartService: CartService
  ) {}

  ngOnInit(): void {
    this.loadProducts();
  }

 
  loadProducts() {
    this.productService.getProducts().subscribe({
      next: (data: IProduct[]) => {
        console.log('🛍️ Products loaded:', data);
        this.products = data;
      },
      error: (err) => {
        console.error('❌ Failed to load products:', err);
        this.errorMsg = 'Failed to load products';
      }
    });
  }

  addToCart(productId: number) {
    this.cartService.addToCart(productId, 1).subscribe({
      next: () => console.log(`✅ Product ${productId} added to cart`),
      error: (err) => console.error('❌ Add to cart failed:', err)
    });
  }
}

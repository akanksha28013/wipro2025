import { Component, OnInit } from '@angular/core';
import { IOrder } from '../../models/iorder';
import { AuthService } from '../../services/auth-service';
import { OrderService } from '../../services/order-service';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-order-history-component',
  imports: [CommonModule,FormsModule],
  templateUrl: './order-history-component.html',
  styleUrl: './order-history-component.css'
})

export class OrderHistoryComponent implements OnInit {
  orders: any[] = [];
  loading = true;
  errorMsg = '';

  constructor(private orderService: OrderService) {}

  ngOnInit(): void {
    this.loadOrders();
  }

  loadOrders() {
    this.orderService.getUserOrders().subscribe({
      next: (res: any) => {
        this.orders = res.data ?? [];
        this.loading = false;
      },
      error: (err) => {
        console.error('❌ Failed to fetch orders:', err);
        this.errorMsg = 'Failed to fetch orders';
        this.loading = false;
      }
    });
  }

  cancelOrder(orderId: number) {
    this.orderService.cancelOrder(orderId).subscribe({
      next: () => this.loadOrders(),
      error: (err) => console.error('❌ Failed to cancel order:', err)
    });
  }
}
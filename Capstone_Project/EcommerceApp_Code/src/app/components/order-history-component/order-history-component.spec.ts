import { Component, OnInit } from '@angular/core';
import { AuthService } from '../../services/auth-service';
import { OrderService } from '../../services/order-service';
import { IOrder } from '../../models/iorder';
import { CommonModule } from '@angular/common';
import { MatButtonModule } from '@angular/material/button';

@Component({
  selector: 'app-order-history-component',
  imports: [CommonModule, MatButtonModule],
  templateUrl: './order-history-component.html',
  styleUrl: './order-history-component.css'
})
export class OrderHistoryComponent implements OnInit {
  orders: IOrder[] = [];

  constructor(private orderService: OrderService, private auth: AuthService) {}

  ngOnInit() {
    const user = this.auth.getCurrentUser();
    console.log("🛒 Current logged in user:", user);

    if (user && user.id) { // use numeric id
      this.orderService.getOrdersByUser(user.id).subscribe({
        next: (res: any) => {
          console.log("✅ Orders fetched:", res);
          this.orders = res.data || [];
        },
        error: (err) => {
          console.error("❌ Failed to fetch orders:", err);
        }
      });
    } else {
      alert("Please login to view your order history.");
    }
  }
}

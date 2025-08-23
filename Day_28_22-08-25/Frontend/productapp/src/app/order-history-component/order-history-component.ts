import { Component, OnInit } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';
import { OrderService } from '../order-service';

@Component({
  selector: 'app-order-history-component',
  imports: [CommonModule, FormsModule],
  templateUrl: './order-history-component.html',
  styleUrl: './order-history-component.css'
})
export class OrderHistoryComponent implements OnInit {
orders: any[] = [];

  constructor(private orderService: OrderService) {}

  ngOnInit() {
    this.orderService.getOrderHistory().subscribe(data => this.orders = data);
  }
}

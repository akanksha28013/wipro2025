import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { environment } from '../environments/environments';
import { AuthService } from './auth-service';

@Injectable({
  providedIn: 'root'
})
export class OrderService {
  private api = environment.api + '/order';

  constructor(private http: HttpClient, private auth: AuthService) {}

  private getUserId(): string {
    const user = this.auth.getCurrentUser();
    return user?.userId ?? '';
  }

  createOrder(): Observable<any> {
    return this.http.post(`${this.api}?userId=${this.getUserId()}`, {});
  }

  cancelOrder(orderId: number): Observable<any> {
    return this.http.put(`${this.api}/${orderId}`, {});
  }

  getUserOrders(): Observable<any> {
    return this.http.get(`${this.api}/${this.getUserId()}`);
  }
}
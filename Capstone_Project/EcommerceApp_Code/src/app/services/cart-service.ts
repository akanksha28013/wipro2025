import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { environment } from '../environments/environments';
import { AuthService } from './auth-service';

@Injectable({
  providedIn: 'root'
})
export class CartService {
  private api = environment.api + '/cart';

  constructor(private http: HttpClient, private auth: AuthService) {}

  private getUserId(): string {
    const user = this.auth.getCurrentUser();
    return user?.userId ?? '';   
  }

  addToCart(productId: number, qty: number): Observable<any> {
    return this.http.post(
      `${this.api}/addProd?userId=${this.getUserId()}&productId=${productId}&qty=${qty}`,
      {}
    );
  }

  getCart(): Observable<any> {
    return this.http.get(`${this.api}/${this.getUserId()}`);
  }

  updateQty(productId: number, qty: number): Observable<any> {
    return this.http.put(
      `${this.api}/update?userId=${this.getUserId()}&productId=${productId}&qty=${qty}`,
      {}
    );
  }

  removeFromCart(cartId: number): Observable<any> {
    return this.http.delete(`${this.api}/deleteProd/${cartId}`);
  }
}
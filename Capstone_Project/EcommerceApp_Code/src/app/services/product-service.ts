import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { environment } from '../environments/environments';
import { IProduct } from '../models/iproduct';

@Injectable({
  providedIn: 'root'
})
export class ProductService {
  private api = `${environment.api}/product`;  

  constructor(private http: HttpClient) {}

  getProducts(): Observable<IProduct[]> {
    return this.http.get<IProduct[]>(this.api);
  }

  getProductById(id: number): Observable<IProduct> {
    return this.http.get<IProduct>(`${this.api}/${id}`);
  }

  addProduct(product: IProduct) {
    return this.http.post(this.api, product);
  }

  updateProduct(product: IProduct) {
    return this.http.put(this.api, product);
  }

  deleteProduct(id: number) {
    return this.http.delete(`${this.api}/${id}`);
  }
}

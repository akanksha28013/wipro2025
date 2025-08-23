import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Product } from './product';

@Injectable({
  providedIn: 'root'
})
export class Productservice {
  constructor(private http:HttpClient) { }

  getProducts():Observable<Product[]>  {
    let url:string="http://localhost:9000/product"
    return this.http.get<Product[]>(url);
  }

  addProduct(product: Product): Observable<Product> {
    let url:string="http://localhost:9000/product"
    return this.http.post<Product>(url, product);
  }
  deleteProduct(id: string): Observable<void> {
    let url:string=`http://localhost:9000/product/${id}`;
    return this.http.delete<void>(url);
  }

  findProduct(id: string): Observable<Product> {
    let url:string=`http://localhost:9000/product/${id}`;
    return this.http.get<Product>(url);
  }

  saveProduct(product: Product): Observable<Product> {
    let url:string=`http://localhost:9000/product`;
    return this.http.put<Product>(url, product);

}
}

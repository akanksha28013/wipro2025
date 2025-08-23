import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { Productservice } from '../productservice';
import { Router } from '@angular/router';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'app-productadd',
  imports: [FormsModule,CommonModule],
  templateUrl: './productadd.html',
  styleUrl: './productadd.css'
})
export class Productadd {
   constructor(private productService:Productservice,private router:Router) { }
  productName:string = '';
  productCategory:string = '';
  productPrice=0
  productQty: number = 0

 submit() {
    console.log('Adding product:', this.productName, this.productCategory, this.productPrice);

    this.productService.addProduct({
      name: this.productName,
      category: this.productCategory,
      price: this.productPrice,
      qty: this.productQty
    }).subscribe(response => {
      console.log('Product added successfully:', response);

      this.productName = '';
      this.productCategory = '';
      this.productPrice = 0;
      this.productQty=0;

      this.router.navigate(['/productlist']);
    }, error => {
      console.error('Error adding product:', error);
    });
  }
}
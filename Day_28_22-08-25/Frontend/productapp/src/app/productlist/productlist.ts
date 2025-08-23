import { Component } from '@angular/core';
import { Router, RouterLink } from '@angular/router';
import { Productservice } from '../productservice';
import { Product } from '../product';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'app-productlist',
  imports: [RouterLink,CommonModule],
  templateUrl: './productlist.html',
  styleUrl: './productlist.css'
})
export class Productlist {
  constructor(private productService:Productservice,private router:Router) { }

  products: Product[] = [];


  ngOnInit() {
    console.log("==> Productlist Component Initialized");
    this.productService.getProducts().subscribe((data: Product[]) => {
      this.products = data;
      console.log('Products fetched successfully:', data);
    }, (error) => {
      console.error('Error fetching Product:', error);
    });

}

  addProduct() {
    this.router.navigate(['/productadd']);
    // Logic to navigate to the user add page
  }

}

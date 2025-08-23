import { Component, OnInit } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { ActivatedRoute, Router } from '@angular/router';
import { Productservice } from '../productservice';
import { Product } from '../product';

@Component({
  selector: 'app-productedit',
  imports: [FormsModule],
  templateUrl: './productedit.html',
  styleUrl: './productedit.css'
})
export class Productedit implements OnInit{
  constructor(
    private activatedRoute: ActivatedRoute,
    private productService: Productservice,
    private router: Router
  ) {}

  id: string | null = null;
  product: Product = {
  id: 0,
  name: '',
  category: '',
  price: 0,
  qty: 0
};


  ngOnInit() {
    console.log("==> Productedit Component Initialized");
    this.id = this.activatedRoute.snapshot.paramMap.get('id');
    if (this.id) {
      this.productService.findProduct(this.id).subscribe(product => {
        console.log(product);
        this.product = product;
      });
    }
  }

  save() {
    this.productService.saveProduct(this.product).subscribe({
      next: (product) => {
        console.log('Product saved successfully:', product);
        this.router.navigate(['/productlist']); 
      },
      error: (error) => {
        console.error('Error saving product:', error);
      }
    });
  }

}

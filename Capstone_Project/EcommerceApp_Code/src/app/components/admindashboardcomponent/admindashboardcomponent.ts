import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, ReactiveFormsModule, Validators } from '@angular/forms';
import { ProductService } from '../../services/product-service';
import { AuthService } from '../../services/auth-service';
import { IProduct } from '../../models/iproduct';
import { CommonModule, DatePipe } from '@angular/common';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-admindashboard',
  templateUrl: './admindashboardcomponent.html',
  imports: [CommonModule, ReactiveFormsModule, FormsModule, DatePipe],
  styleUrls: ['./admindashboardcomponent.css']
})
export class Admindashboardcomponent implements OnInit {
  productForm!: FormGroup;
  products: IProduct[] = [];
  filteredProducts: IProduct[] = [];
  categories: string[] = ['Electronics', 'Clothing', 'Books', 'Home Appliances', 'Sports'];
  selectedCategory = '';
  searchTerm = '';
  editingProductId: number | null = null;
  errorMsg = '';

  constructor(
    private fb: FormBuilder,
    private productService: ProductService,
    private auth: AuthService
  ) {}

  ngOnInit(): void {
    this.productForm = this.fb.group({
      prodName: ['', Validators.required],
      prodDesc: ['', Validators.required],
      prodCat: ['', Validators.required],
      make: ['', Validators.required],
      availableQty: [0, Validators.required],
      price: [0, Validators.required],
      uom: ['', Validators.required],
      prodRating: [0, Validators.required],
      imageURL: ['', Validators.required],
      dateOfManufacture: ['', Validators.required]
    });

    this.loadProducts();
  }

  loadProducts() {
    this.productService.getProducts().subscribe({
      next: (data) => {
        this.products = data;
        this.filterProducts();
      },
      error: () => (this.errorMsg = 'Failed to load products')
    });
  }

  filterProducts() {
    this.filteredProducts = this.products.filter((p) => {
      const matchesName = p.prodName.toLowerCase().includes(this.searchTerm.toLowerCase());
      const matchesCategory = this.selectedCategory ? p.prodCat === this.selectedCategory : true;
      return matchesName && matchesCategory;
    });
  }

  saveProduct() {
    const productData = this.productForm.value;

    if (this.editingProductId) {
      const updatedProduct = { ...productData, id: this.editingProductId };
      this.productService.updateProduct(updatedProduct).subscribe({
        next: () => {
          this.loadProducts();
          this.cancelEdit();
        },
        error: (err) => console.error('❌ Failed to update product:', err)
      });
    } else {
      this.productService.addProduct(productData).subscribe({
        next: () => {
          this.loadProducts();
          this.productForm.reset();
        },
        error: (err) => console.error('❌ Failed to add product:', err)
      });
    }
  }

  editProduct(product: IProduct) {
    this.editingProductId = product.id!;
    this.productForm.patchValue(product);
  }

  cancelEdit() {
    this.editingProductId = null;
    this.productForm.reset();
  }

  deleteProduct(id: number) {
    this.productService.deleteProduct(id).subscribe({
      next: () => this.loadProducts(),
      error: (err) => console.error('❌ Failed to delete product:', err)
    });
  }

  logout() {
    this.auth.logout();
  }
}

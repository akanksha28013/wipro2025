import { Component } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { Productservice } from '../productservice';

@Component({
  selector: 'app-productdelete',
  imports: [],
  templateUrl: './productdelete.html',
  styleUrl: './productdelete.css'
})
export class Productdelete {
  id:string | null = null;
  constructor(private activeRoute:ActivatedRoute,private productService:Productservice,private router:Router) {
   }
   ngOnInit() {
         this.id = this.activeRoute.snapshot.paramMap.get('id');
         console.log("Product to be deleted has id:", this.id);
         this.productService.deleteProduct(this.id!).subscribe(response => {
           console.log('Product deleted successfully');
           this.router.navigate(['/productlist']); // Navigate to the user list after deletion
           // Logic to navigate back to user list or show a success message
         }  , error => {
           console.error('Error deleting product:', error);
           // Logic to handle error, e.g., show an error message
         }  );
   }

}

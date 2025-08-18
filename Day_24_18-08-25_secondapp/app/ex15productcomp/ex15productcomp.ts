import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-ex15productcomp',
  imports: [FormsModule],
  templateUrl: './ex15productcomp.html',
  styleUrl: './ex15productcomp.css'
})
export class Ex15productcomp {
   book = { 
    title: 'Wings of Fire', 
    imageUrl: "https://universitiespress.com/covers/9788173711466.jpg", 
    description: 'The Wings of Fire is one such autobiography by visionary scientist Dr. APJ Abdul Kalam, who from very humble beginnings rose to be the President of India.' 
  };

  books = new Array(20).fill(this.book); 

}

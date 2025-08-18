import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-switchcomp',
  imports: [FormsModule],
  templateUrl: './switchcomp.html',
  styleUrl: './switchcomp.css'
})
export class Switchcomp {
  //Excercise-13
//  Color = 'black';

//Excercise - 14
searchText = '';
  names = ['Jayanta', 'Jayaram', 'Akanksha', 'Amit', 'Karan', 'Sunil'];
}

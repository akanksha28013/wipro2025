import { Component, EventEmitter, Input, Output } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { Fruit } from '../fruit';

@Component({
  selector: 'app-displaylistcomp',
  imports: [],
  templateUrl: './displaylistcomp.html',
  styleUrl: './displaylistcomp.css'
})
export class Displaylistcomp {

  //Excercise - 6
  @Input() fruit:Fruit={
    fruitCode:'',
    name:'',
    image:'',
    description:''
  }
  //Excercise - 7
  @Output() btnClick = new EventEmitter<string>();
 
  onClick(fruitCode:string) {
    console.log("Clicked-"+fruitCode);
    this.btnClick.emit(fruitCode);
 
}
} 

//Excercise - 5
  // @Input() name:string='';
  // @Input() image:string='';
  // @Input() description='';

  //Excercise - 4
// fruits = [
//     {
//       name: 'Apple',
//       image: 'https://upload.wikimedia.org/wikipedia/commons/1/15/Red_Apple.jpg',
//       description: 'Apples are sweet, edible fruits produced by an apple tree.'
//     },
//     {
//       name: 'Banana',
//       image: 'https://upload.wikimedia.org/wikipedia/commons/8/8a/Banana-Single.jpg',
//       description: 'Bananas are elongated, edible fruits produced by various flowering plants.'
//     },
//     {
//       name: 'Orange',
//       image: 'https://upload.wikimedia.org/wikipedia/commons/c/c4/Orange-Fruit-Pieces.jpg',
//       description: 'Oranges are round citrus fruits with a tough bright orange rind.'
//     },
//     {
//       name: 'Strawberry',
//       image: 'https://clv.h-cdn.co/assets/15/22/2048x2048/square-1432664914-strawberry-facts1.jpg',
//       description: 'Strawberries are juicy red fruits that grow on small plants.'
//     },
//     {
//       name: 'Grapes',
//       image: 'https://images.pexels.com/photos/60021/grapes-wine-fruit-vines-60021.jpeg?cs=srgb&dl=pexels-pixabay-60021.jpg&fm=jpg',
//       description: 'Grapes are small, round, and often eaten as a snack or used to make wine.'
//     },
//     {
//       name: 'Pineapple',
//       image: 'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTG7SxOWYbcQgZG35EOPOKfLRL_GoY_F-QwFA&s',
//       description: 'Pineapples are tropical fruits with a tough skin and sweet, juicy flesh.'
//     }
//   ];


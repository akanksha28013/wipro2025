import { Component } from '@angular/core';
import { Displaylistcomp } from '../displaylistcomp/displaylistcomp';
import { Fruit } from '../fruit';

@Component({
  selector: 'app-homecomp',
  imports: [Displaylistcomp],
  templateUrl: './homecomp.html',
  styleUrl: './homecomp.css'
})
export class Homecomp {
  remove(fruitCode:string) {
  console.log("Remove button clicked-"+fruitCode);
  this.fruits= this.fruits.filter(fruit => fruit.fruitCode !== fruitCode);
}
fruits :Fruit[]= [
    {
      fruitCode:'F121',
      name: 'Apple',
      image: 'https://upload.wikimedia.org/wikipedia/commons/1/15/Red_Apple.jpg',
      description: 'Apples are sweet, edible fruits produced by an apple tree.'
    },
    {
      fruitCode:'F124',
      name: 'Banana',
      image: 'https://upload.wikimedia.org/wikipedia/commons/8/8a/Banana-Single.jpg',
      description: 'Bananas are elongated, edible fruits produced by various flowering plants.'
    },
    {
      fruitCode:'F128',
      name: 'Orange',
      image: 'https://upload.wikimedia.org/wikipedia/commons/c/c4/Orange-Fruit-Pieces.jpg',
      description: 'Oranges are round citrus fruits with a tough bright orange rind.'
    },
    {
      fruitCode:'F323',
      name: 'Strawberry',
      image: 'https://clv.h-cdn.co/assets/15/22/2048x2048/square-1432664914-strawberry-facts1.jpg',
      description: 'Strawberries are juicy red fruits that grow on small plants.'
    },
    {
      fruitCode:'F921',
      name: 'Grapes',
      image: 'https://images.pexels.com/photos/60021/grapes-wine-fruit-vines-60021.jpeg?cs=srgb&dl=pexels-pixabay-60021.jpg&fm=jpg',
      description: 'Grapes are small, round, and often eaten as a snack or used to make wine.'
    },
    {
      fruitCode:'F674',
      name: 'Pineapple',
      image: 'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTG7SxOWYbcQgZG35EOPOKfLRL_GoY_F-QwFA&s',
      description: 'Pineapples are tropical fruits with a tough skin and sweet, juicy flesh.'
    }
  ];
}

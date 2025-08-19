import { NgClass, NgStyle } from '@angular/common';
import { Component } from '@angular/core';

@Component({
  selector: 'app-ex4comp',
  imports: [NgClass,NgStyle],
  templateUrl: './ex4comp.html',
  styleUrl: './ex4comp.css'
})
export class Ex4comp {
  flag1:boolean=false;
  flag2:boolean=true;

  color1="purple";
  bgColor ="lightblue";
  fontSize = 10;
  textalign ="center";


  // getNgClass(){
  //   return{
  //     'app1':this.flag1,
  //     'app2':this.flag2
  //   };
  // }
}

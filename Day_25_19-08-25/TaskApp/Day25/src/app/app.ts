import { NgClass } from '@angular/common';
import { Component, signal } from '@angular/core';
import { RouterOutlet } from '@angular/router';

@Component({
  selector: 'app-root',
  imports: [NgClass],
  templateUrl: './app.html',
  styleUrl: './app.css'
})
export class App {
  protected readonly title = signal('day25');
  flag1:boolean=true;
  flag2:boolean=true;
  getNgClass(){
    return{
      'app1':this.flag1,
      'app2':this.flag2
    };
  }
}

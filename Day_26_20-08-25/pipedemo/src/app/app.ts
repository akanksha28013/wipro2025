
import { DatePipe, TitleCasePipe } from '@angular/common';
import { Component, Pipe, signal } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { CentigradeToFahrenheitPipe } from './centigrade-to-fahrenheit-pipe';
import { Highlighstrikethru } from './highlighstrikethru';


@Component({
  selector: 'app-root',
  imports: [FormsModule,DatePipe,CentigradeToFahrenheitPipe,Highlighstrikethru],
  templateUrl: './app.html',
  styleUrl: './app.css'
})
export class App {
  protected readonly title = signal('pipedemo');
  // Ex-1
  userInput: string = '';

  //Ex-2
  selectedDate: string = '';

  // Example 3
  temperature: number = 0;


}

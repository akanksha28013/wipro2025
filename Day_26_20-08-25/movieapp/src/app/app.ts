import { Component, signal } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { MovieComponent } from './movie-component/movie-component';

@Component({
  selector: 'app-root',
  imports: [MovieComponent],
  templateUrl: './app.html',
  styleUrl: './app.css'
})
export class App {
  protected readonly title = signal('movieapp');
}

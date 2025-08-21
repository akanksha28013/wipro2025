import { Component, signal } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { VehicleComp } from './vehicle-comp/vehicle-comp';

@Component({
  selector: 'app-root',
  imports: [VehicleComp],
  templateUrl: './app.html',
  styleUrl: './app.css'
})
export class App {
  protected readonly title = signal('vehicle');
}

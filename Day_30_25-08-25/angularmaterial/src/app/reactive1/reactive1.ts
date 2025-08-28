import { CommonModule } from '@angular/common';
import { Component } from '@angular/core';
import { FormBuilder, FormGroup, ReactiveFormsModule, Validators } from '@angular/forms';
import { MatButtonModule } from '@angular/material/button';
import { MatNativeDateModule } from '@angular/material/core';
import { MatDatepickerModule } from '@angular/material/datepicker';
import { MatFormFieldModule } from '@angular/material/form-field';
import { MatInputModule } from '@angular/material/input';
import { MatSelectModule } from '@angular/material/select';

@Component({
  selector: 'app-reactive1',
  standalone: true,
  imports: [
    CommonModule,
    ReactiveFormsModule,
    MatFormFieldModule,
    MatInputModule,
    MatDatepickerModule,
    MatNativeDateModule,
    MatSelectModule,
    MatButtonModule
  ],
  templateUrl: './reactive1.html',
  styleUrls: ['./reactive1.css'] 
})
export class Reactive1 {
  today = new Date();
  fg: FormGroup;

  subjects = ['Computer Science', 'Electronics', 'Mechanical', 'Civil', 'Mathematics', 'Physics', 'Chemistry'];

  constructor(private fb: FormBuilder) {
    this.fg = this.fb.group({
      name: ['', Validators.required],
      email: ['', [Validators.required, Validators.email]],
      dob: [null, Validators.required],
      subject: ['', Validators.required],
    });
  }

  onSubmit() {
    if (this.fg.valid) {
      console.log(this.fg.value);
      alert('Submitted!');
    } else {

      this.fg.markAllAsTouched();
    }
  }
}

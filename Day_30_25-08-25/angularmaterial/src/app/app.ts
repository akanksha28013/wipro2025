import {ChangeDetectionStrategy, Component, computed, inject, signal} from '@angular/core';
import {FormBuilder, Validators, FormsModule, ReactiveFormsModule, FormControl} from '@angular/forms';
import {MatInputModule} from '@angular/material/input';
import {MatFormFieldModule} from '@angular/material/form-field';
import {MatStepperModule} from '@angular/material/stepper';
import {MatButtonModule} from '@angular/material/button';
import { MatListModule } from '@angular/material/list';

@Component({
  selector: 'app-root',
  imports: [MatListModule,FormsModule,
    ReactiveFormsModule,
    MatStepperModule,
    MatFormFieldModule,
    MatInputModule,
    MatButtonModule],
  templateUrl: './app.html',
  styleUrl: './app.css',
  changeDetection : ChangeDetectionStrategy.OnPush,
})
export class App {
  protected readonly title = signal('angularmaterial');
  // cities: string[] = [
  //   'Mumbai', 'Pune', 'Delhi', 'Bengaluru', 'Chennai',
  //   'Hyderabad', 'Kolkata', 'Jaipur', 'Ahmedabad', 'Surat'
  // ];
//   private _formBuilder = inject(FormBuilder);
// private fb = inject(FormBuilder);

//  nameForm = this.fb.group({
//     name: ['', Validators.required]
//   });

//   ageForm = this.fb.group({
//     age: ['', [Validators.required, Validators.min(1)]]
//   });

//   emailForm = this.fb.group({
//     email: ['', [Validators.required, Validators.email]]
//   });

//   onSubmit() {
//     console.log('Form Data:', {
//       ...this.nameForm.value,
//       ...this.ageForm.value,
//       ...this.emailForm.value
//     });
//     alert(`Form submitted successfully! ✅
// Name: ${this.nameForm.value.name}
// Age: ${this.ageForm.value.age}
// Email: ${this.emailForm.value.email}`);
//   }

textControl = new FormControl('');
  reversedChars = computed(() => {
    const value = this.textControl.value ?? '';
    return value.split('').reverse();
  });
}



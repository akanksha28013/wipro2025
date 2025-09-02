import { Component, OnInit } from '@angular/core';
import { UserService } from '../../services/user-service';
import { IUser } from '../../models/iuser';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import {  MatFormFieldModule, MatLabel } from '@angular/material/form-field';
import { MatInputModule } from '@angular/material/input';

@Component({
  selector: 'app-profile-component',
  imports: [FormsModule,MatLabel,MatFormFieldModule,ReactiveFormsModule,MatInputModule],
  templateUrl: './profile-component.html',
  styleUrl: './profile-component.css'
})
export class ProfileComponent implements OnInit {
  user: IUser= { userId: '', firstName: '', lastName: '', password: '', userType: 1 };

  constructor(private userService: UserService) {}

  ngOnInit(): void {
    this.user = JSON.parse(localStorage.getItem('user') || '{}');
  }

  updateProfile() {
    this.userService.updateUser(this.user).subscribe(() => {
      alert('Profile updated successfully');
      localStorage.setItem('user', JSON.stringify(this.user));
    });
  }
}

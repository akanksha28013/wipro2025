import { Component } from '@angular/core';
import { Router } from '@angular/router';
import { AuthService } from '../../services/auth-service';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'app-login-component',
  imports: [FormsModule, CommonModule, ReactiveFormsModule],
  templateUrl: './login-component.html',
  styleUrl: './login-component.css'
})
export class LoginComponent {
  userId = '';
  password = '';
  errorMsg = '';

  constructor(private auth: AuthService, private router: Router) {}

  login() {
    console.log('📝 Login form submitted with:', { userId: this.userId, password: this.password });

    this.auth.login({ userId: this.userId, password: this.password }).subscribe({
      next: (res) => {
        if (res.token) {
          const decoded = this.auth.getDecodedToken();
          console.log('📜 Full decoded token payload:', decoded);

          if (this.auth.isAdmin()) {
            console.log('👑 User is ADMIN → Redirecting to Admin Dashboard');
            this.router.navigate(['/admin']);
          } else {
            console.log('🛒 User is CUSTOMER → Redirecting to Catalogue');
            this.router.navigate(['/catalogue']);
          }
        } else {
          this.errorMsg = res.message || 'Login failed, please try again.';
        }
      },
      error: (err) => {
        console.error('❌ Login failed (HTTP error):', err);
        this.errorMsg = 'Invalid credentials';
      }
    });
  }
}

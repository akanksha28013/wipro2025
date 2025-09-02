import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable, tap } from 'rxjs';
import { environment } from '../environments/environments';
import {jwtDecode} from 'jwt-decode';

@Injectable({
  providedIn: 'root'
})
export class AuthService {
  private api = environment.api+'/user';

  constructor(private http: HttpClient) {}

  login(credentials: { userId: string; password: string }): Observable<any> {
    console.log('🔑 Sending login request:', credentials);

    return this.http.post(`${this.api}/login`, credentials).pipe(
      tap((res: any) => {
        console.log('✅ Login response from backend:', res);

        if (res && res.token) {
          localStorage.setItem('user', JSON.stringify(res));
          console.log('💾 Saved user to localStorage:', res);
        } else {
          console.warn('⚠️ No token in response');
        }
      })
    );
  }

  
  logout(): void {
    console.log('🚪 Logging out, clearing localStorage');
    localStorage.removeItem('user');
  }

  
  getCurrentUser(): any {
    const userData = localStorage.getItem('user');
    console.log('📦 Reading user from localStorage:', userData);
    return userData ? JSON.parse(userData) : null;
  }


  getToken(): string | null {
    const user = this.getCurrentUser();
    return user?.token ?? null;
  }

  getDecodedToken(): any {
    const token = this.getToken();
    if (!token) return null;
    try {
      return jwtDecode(token);
    } catch (e) {
      console.error('❌ Failed to decode JWT:', e);
      return null;
    }
  }

  
  isLoggedIn(): boolean {
    return !!this.getToken();
  }

  
  isAdmin(): boolean {
    const decoded = this.getDecodedToken();
    console.log('👮 Checking admin role:', decoded);
    return decoded?.role === 'ADMIN';
  }
}

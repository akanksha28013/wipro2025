import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { environment } from '../environments/environments';
import { IUser } from '../models/iuser';

@Injectable({
  providedIn: 'root'
})
export class UserService {
  private api = environment.api+'/users';

  constructor(private http: HttpClient) {}

  updateUser(user: IUser): Observable<IUser> {
    return this.http.put<IUser>(`${this.api}`, user);
  }

  getUserById(id: number): Observable<IUser> {
    return this.http.get<IUser>(`${this.api}/${id}`);
  }
}



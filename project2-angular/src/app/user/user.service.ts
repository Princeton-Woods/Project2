import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { User } from './user';
import { environment } from 'src/environments/environment';

@Injectable({
  providedIn: 'root'
})
export class UserService {
  private apiServerUrl = environment.apiBaseUrl;

  constructor(private http: HttpClient) { }

  public getUsers(): Observable<any> {
    return this.http.get<any>(`${this.apiServerUrl}/user`)
  }
  public addUser(user: User): Observable<User> {
    return this.http.post<User>(`${this.apiServerUrl}/user/add`, user)
  }
  public getUserById(id: number): Observable<User> {
    return this.http.get<User>(`${this.apiServerUrl}/user/${id}`)
  }
  public updateUsers(id: number, user: User): Observable<any> {
    return this.http.put<any>(`${this.apiServerUrl}/user/update/${id}`, user)
  }
  public userExists(username: string, password: string): Observable<boolean> {
    return this.http.get<boolean>(`${this.apiServerUrl}/user/${username}/${password}`)
  }
}

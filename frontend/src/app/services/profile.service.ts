import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class ProfileService {

  private baseUrl = 'http://localhost:8080/perfil';

  constructor(private http: HttpClient) { }

  getUser(user: string): Observable<any> {
    return this.http.get(`${this.baseUrl}/${user}`);
  }

}

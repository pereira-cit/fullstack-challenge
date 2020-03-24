import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class RepoService {

  private baseUrl = 'http://localhost:8080/repo';

  constructor(private http: HttpClient) { }

  getRepos(user: string): Observable<any> {
    return this.http.get(`${this.baseUrl}/${user}`);
  }

}

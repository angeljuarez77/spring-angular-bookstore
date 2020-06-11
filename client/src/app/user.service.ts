import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from "@angular/common/http";
import { User } from "./user"; // hopefully going to be used later
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class UserService {
  private userUrl = "http://localhost:8181/user"
  httpOptions = {
    headers: new HttpHeaders({
      'Content-Type': 'application/json',
      'Access-Control-Allow-Origin': '*'
    })
  }

  constructor(private http: HttpClient) { }

  getUsers() {
    return this.http.get(this.userUrl);
  }

  signUp(user: User): Observable<User> {
    return this.http.post<User>(this.userUrl + "/signup", user, this.httpOptions);
  }
}

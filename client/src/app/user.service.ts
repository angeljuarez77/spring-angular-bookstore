import { Injectable } from '@angular/core';
import { HttpClient } from "@angular/common/http";
import { User } from "../user"; // hopefully going to be used later

@Injectable({
  providedIn: 'root'
})
export class UserService {
  private userUrl = "http://localhost:8181/user"

  constructor(private http: HttpClient) { }

  getUsers() {
    return this.http.get(this.userUrl);
  }
}

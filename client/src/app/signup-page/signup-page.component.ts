import { Component, OnInit } from '@angular/core';
import { User } from "../user";
import { UserService } from "../user.service";

@Component({
  selector: 'app-signup-page',
  templateUrl: './signup-page.component.html',
  styleUrls: ['./signup-page.component.css']
})
export class SignupPageComponent implements OnInit {

  constructor(private userService: UserService) { }

  ngOnInit(): void {
  }

  user: User = {
    username: '',
    password: '',
  };

  signUp(username, password):void {
    if(!username || !password) { return; }
    console.log({ username, password });
    this.userService.signUp({username, password} as User)
      .subscribe(user => {
        this.user = user
      });
  }
}

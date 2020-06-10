import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { RouterModule, Routes } from "@angular/router";
import { LoginPageComponent } from "../login-page/login-page.component";
import { SignupPageComponent } from "../signup-page/signup-page.component";

const routes: Routes = [
  { path: 'signup', component: SignupPageComponent },
  { path: 'login', component: LoginPageComponent },
]

@NgModule({
  declarations: [],
  imports: [ RouterModule.forRoot(routes) ],
  exports: [ RouterModule ]
})
export class AppRoutingModule { }

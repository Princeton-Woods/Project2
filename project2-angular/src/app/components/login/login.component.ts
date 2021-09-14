import { Component, OnInit } from '@angular/core';
import { Validators, FormBuilder, FormGroup } from '@angular/forms';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {
  loginForm: FormGroup;

  constructor(public formBuilder: FormBuilder) {
    this.loginForm = formBuilder.group({
      gradientFormEmailEx: ['', [Validators.required, Validators.email]],
      gradientFormPasswordEx: ['', Validators.required],
    })
  }

  ngOnInit(): void {
  }

    //show hide div variables
    userlogin = true;
    userregister = false;
    //Buttons clicks functionalities 
    user_register()
    {
      this.userlogin = false;
      this.userregister = true;
    }
    user_login()
    {
      this.userlogin = true;
      this.userregister = false;
    }
}

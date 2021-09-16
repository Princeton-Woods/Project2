import { Component, OnInit } from '@angular/core';
import { UserService } from 'src/app/user/user.service';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {
  public result = false;

  constructor(private userService: UserService) { }

  ngOnInit(): void {
  }

  public userExists(username: string, password: string): boolean {
    this.userService.userExists(username, password).subscribe(
      (response: boolean) => {
        this.result = response;
      }
    )
    return this.result;
  }

  onClick(username: string, password: string) {
    
    this.result = this.userExists(username, password)

    setTimeout(() => {
      if (this.result == false){
        alert("Invalid Login")
      }
      else
        alert("Successfull Login")
    }, 500);

  }
  

}

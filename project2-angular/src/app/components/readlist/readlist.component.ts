import { Component, OnInit } from '@angular/core';
import { ReadlistService } from 'src/app/services/readlist.service';
import { IReadlist } from 'src/app/models/readlist.model';
import { UserService } from 'src/app/user/user.service';
import { User } from 'src/app/user/user';
import { Observable } from 'rxjs';

@Component({
  selector: 'app-readlist',
  templateUrl: './readlist.component.html',
  styleUrls: ['./readlist.component.css']
})
export class ReadlistComponent implements OnInit {
  readlists: IReadlist[] = [];
  userLoggedIn: boolean = false;
  userHasReadlist: boolean = false;
  userId: number = 0;
  currentUser: User = {
    userId: 0,
    firstName : "test",
    lastName: "user",
    mobile: "",
    email: "",
    username: "",
    password: ""
  };


  constructor(private readlistService: ReadlistService, private userService: UserService) { }

  ngOnInit(): void {
    this.userLoggedIn = false;
    this.userHasReadlist = false;
    this.userId = this.userService.getCurrentUser().userId;
    this.currentUser = this.userService.getCurrentUser();

    if (this.userId != 0) {
      this.userLoggedIn = true;
    }
    
    this.readlistService.getReadlistById(this.userId).subscribe(data => {
      this.readlists = data;
      if (data.length != 0) {
        this.userHasReadlist = true;
      }
    })
  }

  public removeBook(data: IReadlist) {
    this.readlistService.deleteReadlistEntry(data.readListId)
      .subscribe(() => location.reload());
  }
}

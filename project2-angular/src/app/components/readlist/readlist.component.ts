import { Component, OnInit } from '@angular/core';
import { ReadlistService } from 'src/app/services/readlist.service';
import { IReadlist } from 'src/app/models/readlist.model';

@Component({
  selector: 'app-readlist',
  templateUrl: './readlist.component.html',
  styleUrls: ['./readlist.component.css']
})
export class ReadlistComponent implements OnInit {
  readlists: IReadlist[] = [];

  constructor(private readlistService: ReadlistService) { }

  ngOnInit(): void {
    this.readlistService.getReadlistById().subscribe(data => {
      this.readlists = data;
    })
  }

  public removeBook(data: IReadlist) {
    this.readlistService.deleteReadlistEntry(data.readListId);
    location.reload();
  }

  // public addBook(data: Ibook) {

  // }
}

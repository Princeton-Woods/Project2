import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { BooksService } from 'src/app/services/books.service';

@Component({
  selector: 'app-book-detail',
  templateUrl: './book-detail.component.html',
  styleUrls: ['./book-detail.component.css']
})
export class BookDetailComponent implements OnInit {

  public bookISBN: any;
  public bookTitle: any;
  public bookAuthor: any;
  public bookSummary: any;
  public bookImage: any;
  public bookPrice: any;
  public book: any;
  

  constructor(private bookService: BooksService, private route: ActivatedRoute) { 
    let isbn = this.route.snapshot.paramMap.get('ISBN');
    let bookString = JSON.stringify(this.bookService.getBookByISBN(isbn));
    let bookJSON = JSON.parse(bookString);

    this.bookISBN = isbn; 
    this.book = bookJSON;
    this.bookTitle = bookJSON.title;

    console.log(this.book.title);

  }

  ngOnInit(): void {
    
  }

}

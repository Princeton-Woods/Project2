import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { BooksService } from 'src/app/services/books.service';
import { ReadlistService } from 'src/app/services/readlist.service';

@Component({
  selector: 'app-book-detail',
  templateUrl: './book-detail.component.html',
  styleUrls: ['./book-detail.component.css']
})
export class BookDetailComponent implements OnInit {
  public allBooks: any;
  public currentBook: any;

  public bookISBN: any;
  public bookTitle: any;
  public bookAuthor: any;
  public bookSummary: any;
  public bookImage: any;
  public bookPrice: any;
  public book: any;
  

  

  constructor(private bookService: BooksService, private route: ActivatedRoute, private readlistService: ReadlistService) { 

    let isbn = this.route.snapshot.paramMap.get('ISBN');

    this.bookService.getAllBooks().subscribe((data) => {
      this.allBooks = data;
      for (let i = 0; i < this.allBooks.length; i++) {
        

        if (this.allBooks[i].isbn == isbn) {
          
          this.currentBook = this.allBooks[i];
          console.log(this.allBooks[i].isbn);
          console.log(this.currentBook);
        }
      }
    });



    // this.bookISBN = isbn; 
    // this.book = bookJSON;
    // this.bookTitle = bookJSON.title;

    // console.log(this.currentBook.isbn);

  }

  ngOnInit(): void {

  }

  public addBook(book: any) {
    let books = []; 

    this.bookService.getAllBooks().subscribe((data) => {
      let isbn = this.route.snapshot.paramMap.get('ISBN');
      books = data;
      for (let i = 0; i <books.length; i++){
        if (books[i].isbn == isbn){
          this.currentBook = books[i];
          this.readlistService.addReadlistEntry(this.currentBook);
        }
      }
    });
  }
}

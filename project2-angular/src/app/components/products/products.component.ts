import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { BooksService } from 'src/app/services/books.service';
import { DataService } from 'src/app/services/data.service';


@Component({
  selector: 'app-products',
  templateUrl: './products.component.html',
  styleUrls: ['./products.component.css']
})
export class ProductsComponent implements OnInit {

  public isbn: any;
  public title: any;
  public author: any;
  public summary: any;
  public image: any;
  public books: any;


  constructor(private bookService: BooksService, private router: Router) { 



  }

    onButtonClick(book: any){
    this.router.navigate(['/products', book.ISBN])
  }

  ngOnInit(): void {
    this.books = this.bookService.getBooks() 
  }

}

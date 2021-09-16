import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class DataService {

  private ENDPOINTS = {

    BOOKS_URL: 'https://bookstore.docs.apiary.io/#reference/books/databooks/get'

  }


  constructor(private http: HttpClient) {}

  


}

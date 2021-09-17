package com.revature.project2spring.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.revature.project2spring.entities.Book;
import com.revature.project2spring.services.BookService;


@RestController
public class BookController {
	
	@Autowired
	BookService service;
	
	@GetMapping("/books")
	@CrossOrigin(origins = "http://localhost:4200")
	public List<Book> getBooks(){
		return service.getBooks();
	}
}


package com.revature.project2spring.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.revature.project2spring.entities.Book;

@Service
public interface BookService {
	List<Book> getAllBook();
	List<Book> getAllBookByBookTitleContaining(String title);
	
}

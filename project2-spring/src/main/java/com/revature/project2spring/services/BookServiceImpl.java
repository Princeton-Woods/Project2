package com.revature.project2spring.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.project2spring.entities.Book;
import com.revature.project2spring.repositories.BookRepository;

@Service
public class BookServiceImpl implements BookService{
	@Autowired
	private BookRepository repository;
	
	@Override
	public List<Book> getAllBook() {
		return repository.findAll();
	}

	@Override
	public List<Book> getAllBookByBookTitleContaining(String title) {
		return repository.findAllBookByTitleContaining(title);
	}
}

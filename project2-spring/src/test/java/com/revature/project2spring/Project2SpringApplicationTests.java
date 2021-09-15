package com.revature.project2spring;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.revature.project2spring.entities.Book;
import com.revature.project2spring.entities.ReadList;
import com.revature.project2spring.entities.User;
import com.revature.project2spring.repositories.BookRepository;
import com.revature.project2spring.repositories.ReadListRepository;
import com.revature.project2spring.services.UserService;

@SpringBootTest
class Project2SpringApplicationTests {

	@Autowired
	UserService userService;

	@Autowired
	BookRepository bookRepo;

	@Autowired
	ReadListRepository rlRepo;

//	@Test
//	public void testAddUser() {
//		User user = User.builder()
//				.email("t@gmail.com")
//				.firstName("Mary")
//				.lastName("Jane")
//				.username("TesterMaryJane123")
//				.password("password")
//				.mobile("999-999-9999")
//				.build();
//		userService.saveUser(user);
//	}

//	@Test
//	public void testAddBooks()	{
//		Book book = Book.builder()
//				.isbn(9781841499789L)
//				.title("Bloodfire Quest")
//				.author("Terry Brooks")
//				.summary("The adventure that started in Wards of Faerie takes a thrilling new turn, in the second novel of New York Times bestselling author Terry Brooks")
//				.image("http://s.s-bol.com/imgbase0/imagebase/large/FC/7/0/0/7/9200000009027007.jpg")
//				.price(24.5)
//				.build();
//		
//		Book book2 = Book.builder()
//				.isbn(9780751548525L)
//				.title("Safe Haven")
//				.author("Nicholas Sparks")
//				.summary("Love hurts. There is nothing as painful as heartbreak. But in order to learn to love again you must learn to trust again. ")
//				.image("http://s.s-bol.com/imgbase0/imagebase/large/FC/0/5/2/3/9200000010683250.jpg")
//				.price(33.8)
//				.build();
//		
//		bookRepo.save(book);
//		bookRepo.save(book2);
//	}
	
	@Test
	public void testAddReadListEntry()	{
		User user = userService.getUserById(1);
		Book book = bookRepo.getById(9781841499789L);
		Book book2 = bookRepo.getById(9780751548525L);
		
		ReadList list = ReadList.builder()
				.user(user)
				.book(book)
				.build();
		rlRepo.save(list);
		
		ReadList list2 = ReadList.builder()
				.user(user)
				.book(book2)
				.build();
		rlRepo.save(list2);
	}

}

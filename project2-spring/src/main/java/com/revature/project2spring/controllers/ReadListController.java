package com.revature.project2spring.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.revature.project2spring.entities.ReadList;
import com.revature.project2spring.services.ReadListService;

@RestController
public class ReadListController {
	
	@Autowired
	ReadListService service;
	
	@PostMapping("/readlist")
	@CrossOrigin(origins = "http://localhost:4200")
	public ReadList saveReadList(@RequestBody ReadList list) {
		return service.saveReadList(list);
	}
	
	@GetMapping("/readlist")
	@CrossOrigin(origins = "http://localhost:4200")
	public List<ReadList> getAllReadLists(){
		return service.getAllReadList();
	}
	
	@GetMapping("/readlist/{userId}")
	@CrossOrigin(origins = "http://localhost:4200")
	public List<ReadList> getAllReadListsByUserId(@PathVariable("userId") int userId){
		return service.getAllReadListByUserId(userId);
	}
	
	@DeleteMapping("/readlist/{id}")
	@CrossOrigin(origins = "http://localhost:4200")
	public ReadList deleteReadListById(@PathVariable("id") long readListId)	{
		return service.deleteReadList(readListId);
	}
}

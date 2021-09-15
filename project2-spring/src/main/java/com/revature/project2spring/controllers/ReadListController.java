package com.revature.project2spring.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
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
	
	@PostMapping("/list")
	public ReadList saveReadList(@RequestBody ReadList list) {
		return service.saveReadList(list);
	}
	
	@GetMapping("/list")
	public List<ReadList> getAllReadLists(){
		return service.getAllReadList();
	}
	
	@DeleteMapping("/list/{id}")
	public ReadList deleteReadListById(@PathVariable("id") long readListId)	{
		return service.deleteReadList(readListId);
	}
	
	@GetMapping("/list/{id}")
	public List<ReadList> getAllReadListsByUserId(@PathVariable("id") long userId)	{
		return service.getAllReadListByUserUserId(userId);
	}
	
}

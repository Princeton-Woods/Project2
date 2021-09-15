package com.revature.project2spring.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.revature.project2spring.entities.User;
import com.revature.project2spring.services.UserService;

@RestController
public class UserController {
	
	@Autowired
	UserService service;
	
	@GetMapping("/user")
	public List<User> getAllUsers()	{
		return service.getAllUsers();
	}
	
	@PostMapping("/user")
	public User saveUser(@RequestBody User user)	{
		return service.saveUser(user);
	}
	
	@GetMapping("/user/{id}")
	public User getUserById(@PathVariable("id") long userId)	{
		return service.getUserById(userId);
	}
	
	@PutMapping("user/{id}")
	public User updateUser(@PathVariable("id") long userId, @RequestBody User user)	{
		return service.updateUser(userId, user);
	}
}

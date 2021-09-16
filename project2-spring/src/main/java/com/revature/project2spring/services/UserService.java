package com.revature.project2spring.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.revature.project2spring.entities.User;

@Service
public interface UserService {
	User saveUser(User user);
	List<User> getAllUsers();
	User getUserById(long userId);
	User updateUser(long userId, User user);
	Boolean userExists(String username, String password);
	User getUserByUsernameAndPassword(String username, String password);
}

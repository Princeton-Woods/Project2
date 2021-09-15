package com.revature.project2spring.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.project2spring.entities.User;
import com.revature.project2spring.repositories.UserRepository;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserRepository repository;

	@Override
	public User saveUser(User user) {
		return repository.save(user);
	}

	@Override
	public List<User> getAllUsers() {
		return repository.findAll();
	}

	@Override
	public User getUserById(long userId) {
		Optional<User> user = repository.findById(userId);
		if(!user.isPresent())	{
			
		}
		return user.get();
	}

	@Override
	public User updateUser(long userId, User user) {
		User userDB = repository.getById(userId);
		userDB.setFirstName(user.getFirstName());
		userDB.setLastName(user.getLastName());
		userDB.setEmail(user.getEmail());
		userDB.setMobile(user.getMobile());
		userDB.setUsername(user.getUsername());
		userDB.setPassword(user.getPassword());
		return repository.save(userDB);
	}
	
	
}

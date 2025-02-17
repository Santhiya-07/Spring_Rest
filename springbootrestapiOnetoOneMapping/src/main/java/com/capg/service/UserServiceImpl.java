package com.capg.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capg.entity.User;
import com.capg.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	UserRepository userRepository;

	@Override
	public User addUser(User user) {
		
		return userRepository.save(user);
	}

	@Override
	public List<User> getAllUser() {
		
		return userRepository.findAll();
	}

	@Override
	public User getUserById(Long id) {
		
		return userRepository.findById(id).get();
	}

	@Override
	public User createUser(User user) {
		
		return userRepository.save(user);
	}

	@Override
	public User updateUserById(long id, User user) {
		User input=userRepository.findById(id).orElseThrow(()->new RuntimeException("User not found"));
		input.setName(user.getName());
		input.setEmail(user.getEmail());
		input.setAddress(user.getAddress());
		
		return userRepository.save(user);
	}

	@Override
	public String deleteUserById(long id) {
		
		userRepository.deleteById(id);
		return "successfully deleted";
	}
	
	
	
	
	

}

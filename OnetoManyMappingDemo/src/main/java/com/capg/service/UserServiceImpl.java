package com.capg.service;

import java.util.List;


import org.springframework.stereotype.Service;

import com.capg.entity.User;
import com.capg.repository.UserRepository;
@Service
public class UserServiceImpl implements UserService{
	UserRepository userRepository;

	@Override
	public List<User> getAllUser() {
		
		return userRepository.findAll();
	}

	@Override
	public User getUserById(Long Id) {
		
		return userRepository.findById(Id).orElseThrow(()-> new RuntimeException("id not found"));
	}

	

	@Override
	public User updateUser(Long id, User user) {
		User input=userRepository.findById(id).orElseThrow(()->new RuntimeException("User not found"));
		input.setName(user.getName());
		input.setEmail(user.getEmail());
		input.setOrders(user.getOrders());
		
		return userRepository.save(user);
	}

	@Override
	public String deleteUserById(Long id) {
		
		userRepository.deleteById(id);
		return "deleted successfully";
	}

	@Override
	public User addAllUser(User user) {
		
		return userRepository.save(user);
	}

}

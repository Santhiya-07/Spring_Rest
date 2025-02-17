package com.capg.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capg.entity.User;
import com.capg.repository.UserRepository;
import com.capg.service.UserService;

@RestController
@RequestMapping("/api/v1")
public class UserController {
	@Autowired
	UserService userService;
	
	@PostMapping("/addUser")
	public User addUser(@RequestBody User user) {
		return userService.addUser(user);
		}
	@GetMapping("/getalUser")
	public List<User> getAllUser(){
		return userService.getAllUser();
		
	}
	@GetMapping("/getUserById/{id}")
	public User getUserById(@PathVariable long id) {
		return userService.getUserById(id);
	}
	@PostMapping("/createUser")
	public User createUser(@RequestBody User user) {
		return userService.createUser(user);
	}
	@PutMapping("/update/{id}")
	public User updateById(@PathVariable long id,@RequestBody User user) {
		return userService.updateUserById(id, user);
	}
	@DeleteMapping("/delete/{id}")
	public String deleteById(@PathVariable long id) {
		return userService.deleteUserById(id);
	}
	
	

}

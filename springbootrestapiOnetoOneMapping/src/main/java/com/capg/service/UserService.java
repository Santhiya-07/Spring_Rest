package com.capg.service;

import java.util.List;
import java.util.Optional;

import com.capg.entity.User;

public interface UserService {
	User addUser(User user);
	List<User>getAllUser();
	User getUserById(Long id);
	User createUser(User user);
	User updateUserById(long id,User user);
	String deleteUserById(long id);
	

}

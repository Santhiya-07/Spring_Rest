package com.capg.service;

import java.util.List;
import java.util.Optional;

import com.capg.entity.User;

public interface UserService {
	User addAllUser(User user);
	List<User>getAllUser();
	User getUserById(Long Id);
	
	User updateUser(Long id, User user);
	String deleteUserById(Long id);
	

}

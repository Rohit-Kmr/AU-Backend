package com.Accolite.AU.Service;

import java.util.List;

import com.Accolite.AU.model.User;

public interface IUserService {
	
	List<User> getAllUsers();
	
	User getUserByEmail(String email);
	//boolean UserExists(String email);
	/*
	 * void addUser(String id);
	 * void updateUser(String id); 
	 * void deleteUser(String id);
	 */

}

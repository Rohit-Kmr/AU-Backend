package com.Accolite.AU.DAO;

import java.util.List;

import com.Accolite.AU.model.User;

public interface IUserDAO {
	
	List<User> getAllUsers();
	
	User getUserByEmail(String email);
	//boolean UserExists(String email);
	/*
	 * void addUser(String id);
	 * void updateUser(String id); 
	 * void deleteUser(String id);
	 */
}

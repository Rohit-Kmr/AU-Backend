package com.Accolite.AU.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;

import com.Accolite.AU.DAO.IUserDAO;
import com.Accolite.AU.model.User;

@Service
@ComponentScan(basePackages="com.Accolite.AU.DAO")
public class UserService implements IUserService{
	
	@Autowired
	private IUserDAO userDAO;

	@Override
	public List<User> getAllUsers() {
		return userDAO.getAllUsers();
	}

	@Override
	public User getUserByEmail(String email) {
		User user=userDAO.getUserByEmail(email);
		//System.out.println(user);
		return user;
	}
/*
	@Override
	public boolean UserExists(String email) {
		
		return userDAO.UserExists(email);
	}
	*/

}

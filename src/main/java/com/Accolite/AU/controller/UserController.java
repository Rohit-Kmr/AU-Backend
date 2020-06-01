package com.Accolite.AU.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Accolite.AU.model.User;
import com.Accolite.AU.repository.UserRepository;

@RestController
@CrossOrigin(origins="http://localhost:4200")
@RequestMapping("/Users")
public class UserController {
	
	@Autowired
	UserRepository userRepo;
	
	@GetMapping("/getUser")
	public Iterable<User> getAllUser(){
		return userRepo.findAll();
	}
	
	@GetMapping("/getUser/{id}")
	public Optional<User> getUser(@PathVariable("id") String id){
		return userRepo.findById(id);
	}
}

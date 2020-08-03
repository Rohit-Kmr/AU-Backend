package com.Accolite.AU.controller;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Accolite.AU.Service.IUserService;
import com.Accolite.AU.model.User;

@RestController
@CrossOrigin(origins="http://localhost:4200")
@RequestMapping("/Users")
public class UserController {
	

	   Logger log=LogManager.getLogger(UserController.class);
	
	   @Autowired
	   private IUserService userService;
		
		@GetMapping("/getUser")
		public ResponseEntity<List<User>> getAllUser(){
			log.info("Get user Called");
			List<User> list=userService.getAllUsers();
			return new ResponseEntity<List<User>>(list,HttpStatus.OK);
		}
		
		@GetMapping("/getUser/{id}")
		public ResponseEntity<User> getUser(@PathVariable("id") String id){
			log.info("Get user Called using email "+id);
			User user=null;
			user=userService.getUserByEmail(id);
			return new ResponseEntity<User>(user,HttpStatus.OK);
		}
}

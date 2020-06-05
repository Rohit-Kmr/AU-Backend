package com.Accolite.AU.Service;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class UserServiceTest {
	
	@Autowired
	UserService tester;

	@Test
	void testGetAllUsers() {
		assertEquals(3,tester.getAllUsers().size());
	}

	@Test
	void testGetUserByEmail() {
		assertNotNull(tester.getUserByEmail("kmr.rht.97@gmail.com"));
	}

}

package com.Accolite.AU.DAO;


import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class UserDAOTest {
	
	@Autowired
	UserDAO tester;
	
	@Test
	public void test() throws Exception {
		
		assertEquals(3,tester.getAllUsers().size());
		assertEquals("EMP01",tester.getUserByEmail("kmr.rht.97@gmail.com").getUserId());
		
	}

}

package com.Accolite.AU.model;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;



public class UserTest {
	
	User tester=new User();
	
	@Test
	public void testUserId(){
		
		tester.setUserId("user_id");
		assertEquals("user_id",tester.getUserId());
	}
	@Test
	public void testEmail(){
		tester.setEmail("somethin@email.com");
		assertEquals("somethin@email.com",tester.getEmail());
	}
	@Test
	public void testType(){	
		tester.setType("types");
		assertEquals("types",tester.getType());
	}
	@Test
	public void testName(){	
		tester.setName("somename");
		assertEquals("somename",tester.getName());
	}

}

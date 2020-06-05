package com.Accolite.AU.Cotroller;

import static org.junit.Assert.assertEquals;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.web.context.WebApplicationContext;

import com.Accolite.AU.Service.IUserService;
import com.Accolite.AU.controller.UserController;

@RunWith(SpringRunner.class)
@WebMvcTest(UserController.class)
class UserControllerTest {
	
	@Autowired
	private MockMvc mockMvc;
	
	@MockBean
	IUserService UserService;
	
	@Autowired
	WebApplicationContext applicationContext;
	
	@Test
	void testGetAllUser() throws Exception{
		MvcResult mvcResult=mockMvc.perform(get("/Users/getUser").accept(MediaType.APPLICATION_JSON_VALUE)).andReturn();
		
		assertEquals(200,mvcResult.getResponse().getStatus());
	}

	@Test
	void testGetUser() throws Exception{
		MvcResult mvcResult=mockMvc.perform(get("/Users/getUser/{mail}",1).accept(MediaType.APPLICATION_JSON_VALUE).param("mail", "kmr.rht.97@gmail.com")).andReturn();
		
		assertEquals(200,mvcResult.getResponse().getStatus());
	}

}

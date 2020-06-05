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

import com.Accolite.AU.Service.IAcademicService;
import com.Accolite.AU.controller.AcademicController;

@RunWith(SpringRunner.class)
@WebMvcTest(AcademicController.class)
class AcademicControllerTest {
	
	@Autowired
	private MockMvc mockMvc;
	
	@MockBean
	IAcademicService academicService;

	
	@Autowired
	WebApplicationContext applicationContext;
	
	@Test
	void testGetAllAcademicDetails() throws Exception{
		MvcResult mvcResult=mockMvc.perform(get("/Academic/getDetails").accept(MediaType.APPLICATION_JSON_VALUE)).andReturn();
		
		assertEquals(200,mvcResult.getResponse().getStatus());
	}

	@Test
	void testGetAcademicDetailByCourse() throws Exception{
		MvcResult mvcResult=mockMvc.perform(get("/Academic/getDetails/{id}",1).accept(MediaType.APPLICATION_JSON_VALUE).param("id", "AU0120")).andReturn();
		
		assertEquals(200,mvcResult.getResponse().getStatus());
	}

}

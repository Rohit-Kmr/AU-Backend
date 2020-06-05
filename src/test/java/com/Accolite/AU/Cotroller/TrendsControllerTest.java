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

import com.Accolite.AU.Service.ITrendsService;
import com.Accolite.AU.controller.TrendsController;

@RunWith(SpringRunner.class)
@WebMvcTest(TrendsController.class)
class TrendsControllerTest {

	@Autowired
	private MockMvc mockMvc;
	
	@MockBean
	ITrendsService academicService;
	
	@Test
	void testGetAllTrends() throws Exception{
		MvcResult mvcResult=mockMvc.perform(get("/Trends/getAll").accept(MediaType.APPLICATION_JSON_VALUE)).andReturn();
		
		assertEquals(200,mvcResult.getResponse().getStatus());
	}

}

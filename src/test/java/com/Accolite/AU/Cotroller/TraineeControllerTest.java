package com.Accolite.AU.Cotroller;

import static org.junit.Assert.assertEquals;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.delete;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.put;

import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import com.Accolite.AU.Service.ITraineeService;
import com.Accolite.AU.controller.TraineeController;
import com.Accolite.AU.model.Trainee;
import com.fasterxml.jackson.databind.ObjectMapper;


@RunWith(SpringRunner.class)
@WebMvcTest(TraineeController.class)
class TraineeControllerTest {

	@Autowired
	private MockMvc mockMvc;
	
	@MockBean
	ITraineeService TraineeService;

	@Autowired
	WebApplicationContext applicationContext;
	
	ObjectMapper mapper=new ObjectMapper();
	
	@Test
	void testGetAllTrainee() throws Exception {
		MvcResult mvcResult=mockMvc.perform(get("/Trainee/getTrainee").accept(MediaType.APPLICATION_JSON_VALUE)).andReturn();
		
		assertEquals(200,mvcResult.getResponse().getStatus());
	}

	@Test
	void testAddAcademicDetail() throws Exception {
		MvcResult mvcResult=mockMvc.perform(post("/Trainee/addTrainee/{id}",1).content(mapper.writeValueAsString(new Trainee("test",90,80,70,"testid","test"))).param("id","test")).andReturn();
		
		assertEquals(201,mvcResult.getResponse().getStatus());
	}
	
	@Test
	void testUpdateAcademicDetail() throws Exception {
		MvcResult mvcResult=mockMvc.perform(put("/Trainee/updateTrainee/{id}",1).content(mapper.writeValueAsString(new Trainee("test1",90,80,70,"testid","test"))).param("id","test")).andReturn();
		
		assertEquals(200,mvcResult.getResponse().getStatus());
	}
	
	@Test
	void testGetTraineeByAssessmentId() throws Exception{
		MvcResult mvcResult=mockMvc.perform(get("/Trainee/getTrainee/{id}",1).accept(MediaType.APPLICATION_JSON_VALUE).param("id","test")).andReturn();
		
		assertEquals(200,mvcResult.getResponse().getStatus());
	}

	@Test
	void testDeleteTraineeByAssessmentId() throws Exception{
		mockMvc.perform(delete("/Trainee/deleteTrainee/{id}/{userid}",2).param("id","test").param("userid","test")).andReturn();
	}

}

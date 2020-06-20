package com.Accolite.AU.Cotroller;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.delete;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.put;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.ArgumentMatchers;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.web.context.WebApplicationContext;

import com.Accolite.AU.Service.IAssessmentService;
import com.Accolite.AU.controller.AssessmentController;
import com.Accolite.AU.model.Assessment;
import com.fasterxml.jackson.databind.ObjectMapper;

@RunWith(SpringRunner.class)
@WebMvcTest(AssessmentController.class)
class AssessmentControllerTest {

	@Autowired
	private MockMvc mockMvc;
	
	@MockBean
	IAssessmentService AssessmentService;

	@Autowired
	WebApplicationContext applicationContext;
	
	ObjectMapper mapper=new ObjectMapper();
	
	@Test
	void testGetAllAssessment() throws Exception {
		MvcResult mvcResult=mockMvc.perform(get("/Assessment/getAssessment").accept(MediaType.APPLICATION_JSON_VALUE)).andReturn();
		
		assertEquals(200,mvcResult.getResponse().getStatus());
	}
	
	@Test
	void testGetAssessmentByAssessmentId() throws Exception{
		MvcResult mvcResult=mockMvc.perform(get("/Assessment/getAssessment/{id}",1).accept(MediaType.APPLICATION_JSON_VALUE).param("id","test")).andReturn();
		
		assertEquals(200,mvcResult.getResponse().getStatus());
	}
	
/*
	@Test
	void testAddAcademicDetail() throws Exception {
	//	Mockito.when(AssessmentService.addAssessment(ArgumentMatchers.any(String.class), ArgumentMatchers.any(Assessment.class))).thenReturn(new Assessment("test",90,80,70,"testid","test"));
		
		
		MvcResult mvcResult=mockMvc.perform(post("/Assessment/addAssessment/{id}",1).content(mapper.writeValueAsString(new Assessment("test",90,80,70,"testid","test"))).param("id","test")).andReturn();
		
		assertEquals(201,mvcResult.getResponse().getStatus());
	}
	
	@Test
	void testUpdateAcademicDetail() throws Exception {
		MvcResult mvcResult=mockMvc.perform(put("/Assessment/updateAssessment/{id}",1).content(mapper.writeValueAsString(new Assessment("test1",90,80,70,"testid","test"))).param("id","test")).andReturn();
		
		assertEquals(200,mvcResult.getResponse().getStatus());
	}

	@Test
	void testDeleteAssessmentByAssessmentId() throws Exception{
		mockMvc.perform(delete("/Assessment/deleteAssessment/{id}/{userid}",2).param("id","test").param("userid","test")).andReturn();
	}
*/
}

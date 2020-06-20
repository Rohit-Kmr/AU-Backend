package com.Accolite.AU.Service;

import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.Accolite.AU.model.Trainee;

@SpringBootTest
class TraineeServiceTest {

	@Autowired
	TraineeService tester;
	
	@Test
	void testGetAllTrainee() {
		assertEquals(8,tester.getAllTrainee().size());
	}

	@Test
	void testAddTrainee() {
		tester.addTrainee("test",new Trainee("Test",(float)95.3,(float)92.3,(float)91.2,"TS00","TAS01"));
	}
	
	@Test
	void testUpdateTrainee() {
		tester.updateTrainee("test",new Trainee("Test2",(float)95.3,(float)92.3,(float)91.2,"TS00","TAS01"));
	}

	@Test
	void testGetTraineeByAssessmentId() {
		assertNotNull(tester.getTraineeByAssessmentId("TAS01"));
	}
	
	@Test
	void testDeleteTraineeByAssessmentId() {
		tester.deleteTraineeByAssessmentId("test","TAS01");
	}

}

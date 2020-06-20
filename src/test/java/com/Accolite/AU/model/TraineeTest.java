package com.Accolite.AU.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TraineeTest {

	@Test
	public void test() {
		Trainee tester= new Trainee();
		
		tester.setAssessment_id("id1");
		assertEquals("id1",tester.getAssessment_id());
		
		tester.setTrainee_id("id2");
		assertEquals("id2",tester.getTrainee_id());
		
		tester.setTrainee_name("somename");
		assertEquals("somename",tester.getTrainee_name());
		
		tester.setPercentage1((float) 20.34);
		assertEquals((float)20.34,(float)tester.getPercentage1());
		
		tester.setPercentage2((float) 78.34);
		assertEquals((float)78.34,(float)tester.getPercentage2());
		
		tester.setPercentage3((float) 56.62);
		assertEquals((float)56.62,(float)tester.getPercentage3());
		
	}

}

package com.Accolite.AU.model;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class AcademicTest {
	
	Academic tester=new Academic();
	
	@Test
	public void Candidatetest() {
		
		tester.setCandidateId("id1");
		assertEquals("id1",tester.getCandidateId());
	
		tester.setCandidateId("");
		assertEquals("",tester.getCandidateId());
	}
	
	@Test
	public void Coursetest() {
		tester.setCourseId("id2");
		assertEquals("id2",tester.getCourseId());
	
		tester.setCourseId("");
		assertEquals("",tester.getCourseId());
	}
	
	@Test
	public void Feedbacktest() {
		
		tester.setFeedback("something");
		assertEquals("something",tester.getFeedback());
		
		tester.setFeedback("");
		assertEquals("",tester.getFeedback());
	}

}

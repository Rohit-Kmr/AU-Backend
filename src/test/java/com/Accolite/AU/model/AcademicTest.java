package com.Accolite.AU.model;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class AcademicTest {
	
	Academic tester=new Academic();
	
	@Test
	public void Candidatetest() {
		
		tester.setCandidate_id("id1");
		assertEquals("id1",tester.getCandidate_id());
	
		tester.setCandidate_id("");
		assertEquals("",tester.getCandidate_id());
	}
	
	public void Coursetest() {
		tester.setCourse_id("id2");
		assertEquals("id2",tester.getCourse_id());
	
		tester.setCourse_id("");
		assertEquals("",tester.getCourse_id());
	}
		
	public void Feedbacktest() {
		
		tester.setFeedback("something");
		assertEquals("something",tester.getFeedback());
		
		tester.setFeedback("");
		assertEquals("",tester.getFeedback());
	}

}

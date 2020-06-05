package com.Accolite.AU.model;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class AcademicTest {
	
	@Test
	public void test() {
		
		Academic tester=new Academic();
		
		tester.setCandidate_id("id1");
		assertEquals("id1",tester.getCandidate_id());
		
		tester.setCourse_id("id2");
		assertEquals("id2",tester.getCourse_id());
		
		tester.setFeedback("something");
		assertEquals("something",tester.getFeedback());
	}

}

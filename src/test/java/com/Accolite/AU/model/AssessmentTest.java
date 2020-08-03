package com.Accolite.AU.model;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class AssessmentTest {
	
	@Test
	public void test() {
		
		Assessment tester =new Assessment();
		
		tester.setAssessmentId("id1");
		assertEquals("id1",tester.getAssessmentId());
		
		tester.setCourseId("id2");
		assertEquals("id2",tester.getCourseId());
		
		tester.setAssessmentType("somename");
		assertEquals("somename",tester.getAssessmentType());
		
		tester.setAssessmentName("Test name");
		assertEquals("Test name",tester.getAssessmentName());
		
		tester.setWeightage1((float) 20.34);
		assertEquals((float)20.34,(float)tester.getWeightage1());
		
		tester.setWeightage2((float) 78.34);
		assertEquals((float)78.34,(float)tester.getWeightage2());
		
		tester.setWeightage3((float) 56.62);
		assertEquals((float)56.62,(float)tester.getWeightage3());
		
	}

}

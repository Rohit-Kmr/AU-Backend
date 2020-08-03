package com.Accolite.AU.model;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CourseTest {
	
	@Test
	public void test() {
		Course tester = new Course();
		
		tester.setCourseDesc("description");
		assertEquals("description",tester.getCourseDesc());
		
		tester.setCourseName("Test name");
		assertEquals("Test name",tester.getCourseName());
		
		tester.setCourseId("id1");
		assertEquals("id1",tester.getCourseId());
		
		tester.setPrerequisite("something");
		assertEquals("something",tester.getPrerequisite());
		
		tester.setSkills("someskill");
		assertEquals("someskill",tester.getSkills());
		
		tester.setTrainerId("id2");
		assertEquals("id2",tester.getTrainerId());
		
		tester.setTrainerName("somename");
		assertEquals("somename",tester.getTrainerName());
	}

}

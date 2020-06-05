package com.Accolite.AU.model;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CourseTest {
	
	@Test
	public void test() {
		Course tester = new Course();
		
		tester.setCourseDesc("description");
		assertEquals("description",tester.getCourse_desc());
		
		tester.setCourseId("id1");
		assertEquals("id1",tester.getCourseId());
		
		tester.setPrerequisite("something");
		assertEquals("something",tester.getPrerequisite());
		
		tester.setSkills("someskill");
		assertEquals("someskill",tester.getSkills());
		
		tester.setTrainer_id("id2");
		assertEquals("id2",tester.getTrainer_id());
		
		tester.setTrainer_name("somename");
		assertEquals("somename",tester.getTrainer_name());
	}

}

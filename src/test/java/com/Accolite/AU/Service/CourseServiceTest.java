package com.Accolite.AU.Service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class CourseServiceTest {
	@Autowired
	CourseService tester;
	
	@Test
	void testGetAllCourse() {
		assertEquals(2,tester.getAllCourse().size());
	}

	@Test
	void testGetCourseByid() {
		assertNotNull(tester.getCourseByid("AU0120"));
	}

}



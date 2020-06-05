package com.Accolite.AU.DAO;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CourseDAOTest {

	@Autowired
	CourseDAO tester;
	
	@Test
	void testGetAllCourse() {
		assertEquals(2,tester.getAllCourse().size());
	}

	@Test
	void testGetCourseByid() {
		assertNotNull(tester.getCourseByid("AU0120"));
	}

}

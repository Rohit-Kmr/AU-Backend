package com.Accolite.AU.Service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class AcademicServiceTest {
	
	@Autowired
	AcademicService tester;
	
	@Test
	void testGetAllAcademic() {
		assertEquals(4,tester.getAllAcademic().size());
	}

	@Test
	void testGetAcademicByCourseid() {
		assertNotNull(tester.getAcademicByCourseid("AU0120"));
	}

}

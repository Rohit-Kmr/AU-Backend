package com.Accolite.AU.DAO;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class AcademicDAOTest {

	@Autowired
	AcademicDAO tester;
	
	@Test
	void testGetAllAcademic() {
		assertEquals(4,tester.getAllAcademic().size());
	}

	@Test
	void testGetAcademicByCourseid() {
		assertNotNull(tester.getAcademicByCourseid("AU0120"));
	}

}

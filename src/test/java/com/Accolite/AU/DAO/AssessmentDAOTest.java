package com.Accolite.AU.DAO;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.Accolite.AU.model.Assessment;

@SpringBootTest
class AssessmentDAOTest {

	@Autowired
	AssessmentDAO tester;
	
	@Test
	void testGetAllAssessment() {
		assertEquals(2,tester.getAllAssessment().size());
	}

	@Test
	void testAddAssessment() {
		tester.addAssessment("test",new Assessment("Type1",(float) 60.25,(float)57,(float) 75,"TU01","TAS00"));
	}
	
	@Test
	void testUpdateAssessment() {
		tester.updateAssessment("test",new Assessment("Type2",(float) 60.25,(float)57,(float) 75,"TU01","TAS00"));
	}
	
	@Test
	void testGetAssessmentById() {
		assertNotNull(tester.getAssessmentById("TAS00"));
	}
	
	@Test
	void testDeleteAssessment() {
		tester.deleteByAssessmentId("test","TAS00");
	}

}

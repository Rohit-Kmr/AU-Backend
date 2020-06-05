package com.Accolite.AU.DAO;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class TrendsDAOTest {

	@Autowired
	ITrendsDAO tester;
	
	@Test
	void testGetAllTrends() {
		assertEquals(3,tester.getAllTrends().size());
	}

}

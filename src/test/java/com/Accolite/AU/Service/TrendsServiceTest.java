package com.Accolite.AU.Service;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class TrendsServiceTest {

	@Autowired
	ITrendsService tester;
	
	@Test
	void testGetAllTrends() {
		assertEquals(3,tester.getAllTrends().size());
	}
}

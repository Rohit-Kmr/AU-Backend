package com.Accolite.AU.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TrendsTest {

	Trends tester=new Trends();
	@Test
	void testGetYear() {
		tester.setYear("2019");
		assertEquals("2019",tester.getYear());
	}

	@Test
	void testGetTotal_courses() {
		tester.setTotal_courses(42);
		assertEquals(42,tester.getTotal_courses());
	}

	@Test
	void testGetTotal_assessments() {

		tester.setTotal_assessments(22);
		assertEquals(22,tester.getTotal_assessments());
	}

	@Test
	void testGetAvarage_score() {

		tester.setAvarage_score(42);
		assertEquals(32,tester.getAvarage_score());
	}

}

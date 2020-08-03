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
		tester.setTotalCourses(42);
		assertEquals(42,tester.getTotalCourses());
	}

	@Test
	void testGetTotal_assessments() {

		tester.setTotalAssessments(22);
		assertEquals(22,tester.getTotalAssessments());
	}

	@Test
	void testGetAvarage_score() {

		tester.setAverageScore(42);
		assertEquals(42,tester.getAverageScore());
	}

}

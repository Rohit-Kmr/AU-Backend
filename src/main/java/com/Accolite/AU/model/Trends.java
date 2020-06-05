package com.Accolite.AU.model;

public class Trends {
	
	String year;
	int total_courses;
	int total_assessments;
	int avarage_score;
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public int getTotal_courses() {
		return total_courses;
	}
	public void setTotal_courses(int total_courses) {
		this.total_courses = total_courses;
	}
	public int getTotal_assessments() {
		return total_assessments;
	}
	public void setTotal_assessments(int total_assessments) {
		this.total_assessments = total_assessments;
	}
	public int getAvarage_score() {
		return avarage_score;
	}
	public void setAvarage_score(int avarage_score) {
		this.avarage_score = avarage_score;
	}
	public Trends(String year, int total_courses, int total_assessments, int avarage_score) {
		super();
		this.year = year;
		this.total_courses = total_courses;
		this.total_assessments = total_assessments;
		this.avarage_score = avarage_score;
	}
	public Trends() {
		super();
	}

}

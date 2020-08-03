package com.Accolite.AU.model;

public class Trends {
	
	String year;
	int totalCourses;
	int totalAssessments;
	int averageScore;
	
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	
	public int getTotalCourses() {
		return totalCourses;
	}
	public void setTotalCourses(int totalCourses) {
		this.totalCourses = totalCourses;
	}
	public int getTotalAssessments() {
		return totalAssessments;
	}
	public void setTotalAssessments(int totalAssessments) {
		this.totalAssessments = totalAssessments;
	}
	public int getAverageScore() {
		return averageScore;
	}
	public void setAverageScore(int avarageScore) {
		this.averageScore = avarageScore;
	}
	
	public Trends(String year, int totalCourses, int totalAssessments, int avarageScore) {
		super();
		this.year = year;
		this.totalCourses = totalCourses;
		this.totalAssessments = totalAssessments;
		this.averageScore = avarageScore;
	}
	public Trends() {
		super();
	}

}

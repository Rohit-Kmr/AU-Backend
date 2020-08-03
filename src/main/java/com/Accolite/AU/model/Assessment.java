package com.Accolite.AU.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Assessment {
	
	String assessmentType;
	Float weightage1;
	Float weightage2;
	Float weightage3;
	String courseId;
	String assessmentName;
	
	String assessmentId;

	public String getAssessmentType() {
		return assessmentType;
	}

	public void setAssessmentType(String assessmentType) {
		this.assessmentType = assessmentType;
	}

	public Float getWeightage1() {
		return weightage1;
	}

	public void setWeightage1(Float weightage1) {
		this.weightage1 = weightage1;
	}

	public Float getWeightage2() {
		return weightage2;
	}

	public void setWeightage2(Float weightage2) {
		this.weightage2 = weightage2;
	}

	public Float getWeightage3() {
		return weightage3;
	}

	public void setWeightage3(Float weightage3) {
		this.weightage3 = weightage3;
	}

	public String getCourseId() {
		return courseId;
	}

	public void setCourseId(String courseId) {
		this.courseId = courseId;
	}

	public String getAssessmentName() {
		return assessmentName;
	}

	public void setAssessmentName(String assessmentName) {
		this.assessmentName = assessmentName;
	}

	public String getAssessmentId() {
		return assessmentId;
	}

	public void setAssessmentId(String assessmentId) {
		this.assessmentId = assessmentId;
	}

	public Assessment(String assessmentType, Float weightage1, Float weightage2, Float weightage3, String courseId,
			String assessmentName, String assessmentId) {
		super();
		this.assessmentType = assessmentType;
		this.courseId = courseId;
		this.assessmentName = assessmentName;
		this.assessmentId = assessmentId;
		this.weightage1 = weightage1;
		this.weightage2 = weightage2;
		this.weightage3 = weightage3;
	}

	public Assessment() {
		super();
	}
}

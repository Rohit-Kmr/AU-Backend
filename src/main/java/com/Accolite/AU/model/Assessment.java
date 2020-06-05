package com.Accolite.AU.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Assessment {
	
	String Assessment_type;
	Float weightage1;
	Float weightage2;
	Float weightage3;
	String course_id;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="assessment_id")
	String assessment_id;

	public Assessment() {
		super();
	}

	public Assessment(String assessment_type, float weightage1, float weightage2, float weightage3, String course_id,
			String assessment_id) {
		super();
		Assessment_type = assessment_type;
		this.weightage1 = weightage1;
		this.weightage2 = weightage2;
		this.weightage3 = weightage3;
		this.course_id = course_id;
		this.assessment_id = assessment_id;
	}

	public String getAssessment_type() {
		return Assessment_type;
	}

	public void setAssessment_type(String assessment_type) {
		Assessment_type = assessment_type;
	}

	public float getWeightage1() {
		return weightage1;
	}

	public void setWeightage1(float weightage1) {
		this.weightage1 = weightage1;
	}

	public float getWeightage2() {
		return weightage2;
	}

	public void setWeightage2(float weightage2) {
		this.weightage2 = weightage2;
	}

	public float getWeightage3() {
		return weightage3;
	}

	public void setWeightage3(float weightage3) {
		this.weightage3 = weightage3;
	}

	public String getCourse_id() {
		return course_id;
	}

	public void setCourse_id(String course_id) {
		this.course_id = course_id;
	}

	public String getAssessment_id() {
		return assessment_id;
	}

	public void setAssessment_id(String assessment_id) {
		this.assessment_id = assessment_id;
	}

	@Override
	public String toString() {
		return "Assessment [Assessment_type=" + Assessment_type + ", weightage1=" + weightage1 + ", weightage2="
				+ weightage2 + ", weightage3=" + weightage3 + ", course_id=" + course_id + ", assessment_id="
				+ assessment_id + "]";
	}


}

package com.Accolite.AU.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.IdClass;

public class Academic {
	
	private String feedback;
	private String candidateId;
	private String courseId;
	

	public String getFeedback() {
		return feedback;
	}

	public void setFeedback(String feedback) {
		this.feedback = feedback;
	}
	
	public String getCandidateId() {
		return candidateId;
	}

	public void setCandidateId(String candidateId) {
		this.candidateId = candidateId;
	}

	public String getCourseId() {
		return courseId;
	}

	public void setCourseId(String courseId) {
		this.courseId = courseId;
	}

	
	public Academic(String feedback, String candidateId, String courseId) {
		super();
		this.feedback = feedback;
		this.candidateId = candidateId;
		this.courseId = courseId;
	}

	public Academic() {
		super();
	}

}

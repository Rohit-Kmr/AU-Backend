package com.Accolite.AU.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.IdClass;

@Entity
@IdClass(AcademicKey.class)
public class Academic {
	
	String feedback;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="candidate_id")
	String candidate_id;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="course_id")
	String course_id;
	

	public String getFeedback() {
		return feedback;
	}

	public void setFeedback(String feedback) {
		this.feedback = feedback;
	}

	public String getCandidate_id() {
		return candidate_id;
	}

	public void setCandidate_id(String candidate_id) {
		this.candidate_id = candidate_id;
	}

	public String getCourse_id() {
		return course_id;
	}

	public void setCourse_id(String course_id) {
		this.course_id = course_id;
	}

	public Academic(String feedback, String candidate_id, String course_id) {
		super();
		this.feedback = feedback;
		this.candidate_id = candidate_id;
		this.course_id = course_id;
	}

	public Academic() {
		super();
	}

}

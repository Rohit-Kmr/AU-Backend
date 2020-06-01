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
	
	
	float score;
	String feedback;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="candidate_id")
	String candidate_id;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="course_id")
	String course_id;
	
	
	
	public float getScore() {
		return score;
	}

	public void setScore(float score) {
		this.score = score;
	}

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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((candidate_id == null) ? 0 : candidate_id.hashCode());
		result = prime * result + ((course_id == null) ? 0 : course_id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Academic other = (Academic) obj;
		if (candidate_id == null) {
			if (other.candidate_id != null)
				return false;
		} else if (!candidate_id.equals(other.candidate_id))
			return false;
		if (course_id == null) {
			if (other.course_id != null)
				return false;
		} else if (!course_id.equals(other.course_id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Academic [score=" + score + ", feedback=" + feedback + ", candidate_id=" + candidate_id + ", course_id="
				+ course_id + "]";
	}
}

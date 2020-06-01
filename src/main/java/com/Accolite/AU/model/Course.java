package com.Accolite.AU.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Course {
	
	String courseDesc;
	String trainer_id;
	String skills;
	String prerequisite;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="course_id")
	String course_id;
	
	public Course() {
		super();
	}
	public Course(String course_id, String courseDesc, String trainer_id, String skills, String prerequisite) {
		super();
		this.course_id = course_id;
		this.courseDesc = courseDesc;
		this.trainer_id = trainer_id;
		this.skills = skills;
		this.prerequisite = prerequisite;
	}
	
	public String getId() {
		return course_id;
	}
	public void setId(String course_id) {
		this.course_id = course_id;
	}
	public String getCourseDesc() {
		return courseDesc;
	}
	public void setCourseDesc(String courseDesc) {
		this.courseDesc = courseDesc;
	}
	public String getTrainer_id() {
		return trainer_id;
	}
	public void setTrainer_id(String trainer_id) {
		this.trainer_id = trainer_id;
	}
	public String getSkills() {
		return skills;
	}
	public void setSkills(String skills) {
		this.skills = skills;
	}
	public String getPrerequisite() {
		return prerequisite;
	}
	public void setPrerequisites(String prerequisite) {
		this.prerequisite = prerequisite;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
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
		Course other = (Course) obj;
		if (course_id == null) {
			if (other.course_id != null)
				return false;
		} else if (!course_id.equals(other.course_id))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Course [id=" + course_id + ", courseDesc=" + courseDesc + ", trainer_id=" + trainer_id + ", skills=" + skills
				+ ", prerequisite=" + prerequisite + "]";
	}

}

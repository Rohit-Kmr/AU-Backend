package com.Accolite.AU.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Course {
	
	String course_desc;
	String trainer_id;
	String skills;
	String prerequisite;
	String trainer_name;
	
	@Id
	@Column(name="course_id")
	String course_id;
	
	public Course() {
		super();
	}
	public Course(String course_id, String course_desc, String trainer_id, String skills, String prerequisite,String trainer_name) {
		super();
		this.course_id = course_id;
		this.course_desc = course_desc;
		this.trainer_id = trainer_id;
		this.skills = skills;
		this.prerequisite = prerequisite;
		this.trainer_name=trainer_name;
	}
	public String getTrainer_name() {
		return trainer_name;
	}
	public void setTrainer_name(String trainer_name) {
		this.trainer_name = trainer_name;
	}
	public String getCourseId() {
		return course_id;
	}
	public void setCourseId(String course_id) {
		this.course_id = course_id;
	}
	public String getCourse_desc() {
		return course_desc;
	}
	public void setCourseDesc(String course_desc) {
		this.course_desc = course_desc;
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
	public void setPrerequisite(String prerequisite) {
		this.prerequisite = prerequisite;
	}

}

package com.Accolite.AU.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

public class Course {
	
	private String courseDesc;
	private String trainerId;
	private String skills;
	private String prerequisite;
	private String trainerName;
	private String courseName;
	private String courseId;
	
	public Course() {
		super();
	}

	public Course(String courseDesc, String trainerId, String skills, String prerequisite, String trainerName,
			String courseName, String courseId) {
		super();
		this.courseDesc = courseDesc;
		this.trainerId = trainerId;
		this.skills = skills;
		this.prerequisite = prerequisite;
		this.trainerName = trainerName;
		this.courseName = courseName;
		this.courseId = courseId;
	}

	
	
	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String getCourseDesc() {
		return courseDesc;
	}

	public void setCourseDesc(String courseDesc) {
		this.courseDesc = courseDesc;
	}

	public String getTrainerId() {
		return trainerId;
	}

	public void setTrainerId(String trainerId) {
		this.trainerId = trainerId;
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

	public String getTrainerName() {
		return trainerName;
	}

	public void setTrainerName(String trainerName) {
		this.trainerName = trainerName;
	}

	public String getCourseId() {
		return courseId;
	}

	public void setCourseId(String courseId) {
		this.courseId = courseId;
	}
	
}

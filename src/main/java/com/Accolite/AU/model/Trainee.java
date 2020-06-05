package com.Accolite.AU.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.IdClass;

@Entity
@IdClass(TraineeKey.class)
public class Trainee {
	
	String trainee_name;
	Float percentage1;
	Float percentage2;
	Float percentage3;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="trainee_id")
	String trainee_id;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="assessment_id")
	String assessment_id;

	public Trainee() {
		super();
	}

	public Trainee(String trainee_name, float percentage1, float percentage2, float percentage3, String trainee_id,
			String assessment_id) {
		super();
		this.trainee_name = trainee_name;
		this.percentage1 = percentage1;
		this.percentage2 = percentage2;
		this.percentage3 = percentage3;
		this.trainee_id = trainee_id;
		this.assessment_id = assessment_id;
	}

	public String getTrainee_name() {
		return trainee_name;
	}

	public void setTrainee_name(String trainee_name) {
		this.trainee_name = trainee_name;
	}

	public float getPercentage1() {
		return percentage1;
	}

	public void setPercentage1(float percentage1) {
		this.percentage1 = percentage1;
	}

	public float getPercentage2() {
		return percentage2;
	}

	public void setPercentage2(float percentage2) {
		this.percentage2 = percentage2;
	}

	public float getPercentage3() {
		return percentage3;
	}

	public void setPercentage3(float percentage3) {
		this.percentage3 = percentage3;
	}

	public String getTrainee_id() {
		return trainee_id;
	}

	public void setTrainee_id(String trainee_id) {
		this.trainee_id = trainee_id;
	}

	public String getAssessment_id() {
		return assessment_id;
	}

	public void setAssessment_id(String assessment_id) {
		this.assessment_id = assessment_id;
	}

}

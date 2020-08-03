package com.Accolite.AU.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.IdClass;

public class Trainee {
	
	String traineeName;
	Float percentage1;
	Float percentage2;
	Float percentage3;

	String traineeId;
	String assessmentId;

	public Trainee() {
		super();
	}

	public String getTraineeName() {
		return traineeName;
	}

	public void setTraineeName(String traineeName) {
		this.traineeName = traineeName;
	}

	public Float getPercentage1() {
		return percentage1;
	}

	public void setPercentage1(Float percentage1) {
		this.percentage1 = percentage1;
	}

	public Float getPercentage2() {
		return percentage2;
	}

	public void setPercentage2(Float percentage2) {
		this.percentage2 = percentage2;
	}

	public Float getPercentage3() {
		return percentage3;
	}

	public void setPercentage3(Float percentage3) {
		this.percentage3 = percentage3;
	}

	public String getTraineeId() {
		return traineeId;
	}

	public void setTraineeId(String traineeId) {
		this.traineeId = traineeId;
	}

	public String getAssessmentId() {
		return assessmentId;
	}

	public void setAssessmentId(String assessmentId) {
		this.assessmentId = assessmentId;
	}

	public Trainee(String traineeName, Float percentage1, Float percentage2, Float percentage3, String traineeId,
			String assessmentId) {
		super();
		this.traineeName = traineeName;
		this.percentage1 = percentage1;
		this.percentage2 = percentage2;
		this.percentage3 = percentage3;
		this.traineeId = traineeId;
		this.assessmentId = assessmentId;
	}


}

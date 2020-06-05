package com.Accolite.AU.Service;

import java.util.List;

import com.Accolite.AU.model.Assessment;

public interface IAssessmentService {

	List<Assessment> getAllAssessment();
	
	Assessment getAssessmentById(String assessment_id);
	void addAssessment(String userid,Assessment assessment);
	void updateAssessment(String userid,Assessment assessment); 
	void deleteByAssessmentId(String userid,String assessment_id);
}
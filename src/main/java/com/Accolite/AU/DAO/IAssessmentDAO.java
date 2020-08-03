package com.Accolite.AU.DAO;

import java.util.List;

import com.Accolite.AU.model.Assessment;

public interface IAssessmentDAO {

	List<Assessment> getAllAssessment();
	
	Assessment getAssessmentById(String assessmentId);
	//boolean AssessmentExists(String assessment_id);
	void addAssessment(String userid,Assessment assessment);
	void updateAssessment(String userid,Assessment assessment); 
	void deleteByAssessmentId(String userid,String assessmentId);
}

package com.Accolite.AU.Service;

import java.util.List;

import com.Accolite.AU.model.Trainee;

public interface ITraineeService {
	
	List<Trainee> getAllTrainee();
	
	List<Trainee> getTraineeByAssessmentId(String assessment_id);
	void addTrainee(String userid,Trainee trainee);
	void updateTrainee(String userid,Trainee trainee); 
	void deleteTraineeByAssessmentId(String userid,String assessment_id);

}

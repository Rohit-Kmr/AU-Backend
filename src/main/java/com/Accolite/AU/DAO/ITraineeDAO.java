package com.Accolite.AU.DAO;

import java.util.List;

import com.Accolite.AU.model.Trainee;

public interface ITraineeDAO {
	
	List<Trainee> getAllTrainee();
	
	List<Trainee> getTraineeByAssessmentId(String assessmentId);
	//boolean TraineeExists(String assessment_id,String trainee_id);
	void addTrainee(String userid,Trainee trainee);
	void updateTrainee(String userid,Trainee trainee); 
	void deleteTraineeByAssessmentId(String userid,String assessmentId);

}

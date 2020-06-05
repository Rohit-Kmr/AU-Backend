package com.Accolite.AU.DAO;

import java.util.List;

import com.Accolite.AU.model.Trainee;

public interface ITraineeDAO {
	
	List<Trainee> getAllTrainee();
	
	List<Trainee> getTraineeByAssessmentId(String assessment_id);
	//boolean TraineeExists(String assessment_id,String trainee_id);
	void addTrainee(String userid,Trainee trainee);
	void updateTrainee(String userid,Trainee trainee); 
	void deleteTraineeByAssessmentId(String userid,String assessment_id);

}

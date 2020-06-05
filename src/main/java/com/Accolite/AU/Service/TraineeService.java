package com.Accolite.AU.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Accolite.AU.DAO.ITraineeDAO;
import com.Accolite.AU.model.Trainee;

@Service
public class TraineeService implements ITraineeService {

	@Autowired
	ITraineeDAO traineeDAO;
	
	@Override
	public List<Trainee> getAllTrainee() {
		return traineeDAO.getAllTrainee();
	}

	@Override
	public List<Trainee> getTraineeByAssessmentId(String assessment_id) {
		return traineeDAO.getTraineeByAssessmentId(assessment_id);
	}

	@Override
	public void addTrainee(String userid,Trainee trainee) {
		traineeDAO.addTrainee(userid,trainee);
		
	}

	@Override
	public void updateTrainee(String userid,Trainee trainee) {
		traineeDAO.updateTrainee(userid,trainee);
		
	}

	@Override
	public void deleteTraineeByAssessmentId(String userid,String assessment_id) {
		traineeDAO.deleteTraineeByAssessmentId(userid,assessment_id);
		
	}

}

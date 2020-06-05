package com.Accolite.AU.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Accolite.AU.DAO.IAssessmentDAO;
import com.Accolite.AU.model.Assessment;

@Service
public class AssessmentService implements IAssessmentService {
	
	@Autowired
	IAssessmentDAO assessmentDAO;

	@Override
	public List<Assessment> getAllAssessment() {
		return assessmentDAO.getAllAssessment();
	}

	@Override
	public Assessment getAssessmentById(String assessment_id) {
		return assessmentDAO.getAssessmentById(assessment_id);
	}

	@Override
	public void addAssessment(String userid,Assessment assessment) {
		assessmentDAO.addAssessment(userid,assessment);
		
	}

	@Override
	public void updateAssessment(String userid,Assessment assessment) {
		assessmentDAO.updateAssessment(userid,assessment);
		
	}

	@Override
	public void deleteByAssessmentId(String userid,String assessment_id) {
		assessmentDAO.deleteByAssessmentId(userid,assessment_id);
		
	}

}

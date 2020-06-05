package com.Accolite.AU.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Accolite.AU.DAO.IAcademicDAO;
import com.Accolite.AU.model.Academic;

@Service
public class AcademicService implements IAcademicService{
	
	@Autowired
	IAcademicDAO academicDAO;

	@Override
	public List<Academic> getAllAcademic() {
		return academicDAO.getAllAcademic();
	}

	@Override
	public List<Academic> getAcademicByCourseid(String id) {
		return academicDAO.getAcademicByCourseid(id);
	}

/*	@Override
	public List<Academic> getAcademicByCandidateid(String id) {
		return academicDAO.getAcademicByCandidateid(id);
	}

	@Override
	public void addAcademic(Academic academic) {
		academicDAO.addAcademic(academic);
		
	}

	@Override
	public void updateAcademic(Academic academic) {
		academicDAO.updateAcademic(academic);
		
	}

	@Override
	public void deleteAcademicByCourseId(String id) {
		academicDAO.deleteAcademicByCourseId(id);
		
	}*/

}

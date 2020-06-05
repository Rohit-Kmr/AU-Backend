package com.Accolite.AU.DAO;

import java.util.List;

import com.Accolite.AU.model.Academic;

public interface IAcademicDAO {

	List<Academic> getAllAcademic();
	
	List<Academic> getAcademicByCourseid(String id);
	//List<Academic> getAcademicByCandidateid(String id);
	//boolean AcademicExists(String course_id,String candidate_id);
	//void addAcademic(Academic academic);
	//void updateAcademic(Academic academic); 
	//void deleteAcademicByCourseId(String id);
}

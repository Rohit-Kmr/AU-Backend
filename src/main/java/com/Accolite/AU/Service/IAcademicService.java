package com.Accolite.AU.Service;

import java.util.List;

import com.Accolite.AU.model.Academic;

public interface IAcademicService {
	
	List<Academic> getAllAcademic();

	List<Academic> getAcademicByCourseid(String id);
	//List<Academic> getAcademicByCandidateid(String id);
	//void addAcademic(Academic academic);
	//void updateAcademic(Academic academic); 
	//void deleteAcademicByCourseId(String id);

}

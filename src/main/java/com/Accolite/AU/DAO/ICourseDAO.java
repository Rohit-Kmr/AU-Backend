package com.Accolite.AU.DAO;

import java.util.List;

import com.Accolite.AU.model.Course;

public interface ICourseDAO {
	
	List<Course> getAllCourse();
	
	Course getCourseByid(String id);
	//boolean CourseExists(String id);
	//void addCourse(Course course);
	//void updateCourse(Course course); 
	//void deleteCourse(String id);

}

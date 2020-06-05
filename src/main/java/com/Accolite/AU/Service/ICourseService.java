package com.Accolite.AU.Service;

import java.util.List;

import com.Accolite.AU.model.Course;

public interface ICourseService {
	
	List<Course> getAllCourse();
	
	Course getCourseByid(String id);
	//void addCourse(Course course);
	//void updateCourse(Course course); 
	//void deleteCourse(String id);

}

package com.Accolite.AU.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Accolite.AU.DAO.ICourseDAO;
import com.Accolite.AU.model.Course;

@Service
public class CourseService implements ICourseService{
	
	@Autowired
	ICourseDAO courseDAO;

	@Override
	public List<Course> getAllCourse() {
		return courseDAO.getAllCourse();
	}

	@Override
	public Course getCourseByid(String id) {
		Course course=courseDAO.getCourseByid(id);
		return course;
	}

	/*	@Override
	public void addCourse(Course course) {
		courseDAO.addCourse(course);
		if (articleDAO.articleExists(article.getTitle(), article.getCategory())) {
	          return false;
          } else {
	          articleDAO.addArticle(article);
	          return true;
          }
	}

	@Override
	public void updateCourse(Course course) {
		courseDAO.updateCourse(course);
		
	}

	@Override
	public void deleteCourse(String id) {
		courseDAO.deleteCourse(id);
		
	}
	*/

}

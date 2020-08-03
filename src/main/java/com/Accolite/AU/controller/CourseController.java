package com.Accolite.AU.controller;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import com.Accolite.AU.Service.ICourseService;
import com.Accolite.AU.model.Course;

@RestController
@CrossOrigin
//@CrossOrigin(origins="http://localhost:4200")
@RequestMapping("/Courses")
public class CourseController {

	Logger log=LogManager.getLogger(CourseController.class);
	
	@Autowired
	private ICourseService courseService;
	
	@GetMapping("/getCourses")
	public ResponseEntity<List<Course>> getAllCourses(){
		log.info("Get course Called");
		List<Course> list=courseService.getAllCourse();
		return new ResponseEntity<List<Course>>(list,HttpStatus.OK);
	}
	
	@GetMapping("/getCourses/{id}")
	public ResponseEntity<Course> getCourse(@PathVariable("id") String id){
		log.info("Get course Called with id "+id);
		Course course=courseService.getCourseByid(id);
		return new ResponseEntity<Course>(course,HttpStatus.OK);
	}
	
}

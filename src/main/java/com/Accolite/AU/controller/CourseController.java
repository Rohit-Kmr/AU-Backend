package com.Accolite.AU.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Accolite.AU.model.Course;
import com.Accolite.AU.repository.CourseRepository;

@RestController
@CrossOrigin(origins="http://localhost:4200")
@RequestMapping("/Courses")
public class CourseController {
	
	@Autowired
	CourseRepository courseRepo;
	
	@GetMapping("/getCourses")
	public Iterable<Course> getAllCourses(){
		return courseRepo.findAll();
	}
	
	@GetMapping("/getCourses/{id}")
	public Optional<Course> getCourse(@PathVariable("id") String id){
		return courseRepo.findById(id);
	}
	
	@PutMapping("/updateCourse/{id}")
	public void updateCourse(@PathVariable("id") String id,@RequestBody Course course){
		courseRepo.deleteById(id);
		courseRepo.save(course);
	}
	
	@PostMapping("/addCourses")
	public void addCourse(@RequestBody Course course){
		courseRepo.save(course);
	}
	
	@DeleteMapping("/deleteCourses/id")
	public void deleteCourse(@PathVariable("id") String id){
		courseRepo.deleteById(id);;
	}
}

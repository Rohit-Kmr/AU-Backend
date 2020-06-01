package com.Accolite.AU.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.Accolite.AU.model.Course;

@Repository
public interface CourseRepository extends CrudRepository<Course,String>{

}

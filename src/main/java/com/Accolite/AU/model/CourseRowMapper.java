package com.Accolite.AU.model;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class CourseRowMapper implements RowMapper<Course>{

	@Override
	public Course mapRow(ResultSet rs, int rowNum) throws SQLException {
		Course course=new Course();
		course.setCourseId(rs.getString("courseId"));
		course.setCourseDesc(rs.getString("courseDesc"));
		course.setTrainerId(rs.getString("trainerId"));
		course.setSkills(rs.getString("skills"));
		course.setPrerequisite(rs.getString("prerequisite"));
		course.setTrainerName(rs.getString("trainerName"));
		course.setCourseName(rs.getString("courseName"));
		return course;
	}

}

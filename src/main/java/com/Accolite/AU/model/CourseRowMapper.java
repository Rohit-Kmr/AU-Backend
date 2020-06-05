package com.Accolite.AU.model;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class CourseRowMapper implements RowMapper<Course>{

	@Override
	public Course mapRow(ResultSet rs, int rowNum) throws SQLException {
		Course course=new Course();
		course.setCourseId(rs.getString("course_id"));
		course.setCourseDesc(rs.getString("course_desc"));
		course.setTrainer_id(rs.getString("trainer_id"));
		course.setSkills(rs.getString("skills"));
		course.setPrerequisite(rs.getString("prerequisite"));
		course.setTrainer_name(rs.getString("trainer_name"));
		return course;
	}

}

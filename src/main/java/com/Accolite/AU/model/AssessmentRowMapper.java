package com.Accolite.AU.model;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class AssessmentRowMapper implements RowMapper<Assessment>{

	@Override
	public Assessment mapRow(ResultSet rs, int rowNum) throws SQLException {
		Assessment assessment=new Assessment();
		assessment.setAssessment_id(rs.getString("Assessment_id"));
		assessment.setAssessment_type(rs.getString("assessment_type"));
		assessment.setCourse_id(rs.getString("course_id"));
		assessment.setWeightage1(rs.getFloat("weightage1"));
		assessment.setWeightage2(rs.getFloat("weightage2"));
		assessment.setWeightage3(rs.getFloat("weightage3"));
		return assessment;
	}

}

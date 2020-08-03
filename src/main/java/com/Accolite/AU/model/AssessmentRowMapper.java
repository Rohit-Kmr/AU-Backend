package com.Accolite.AU.model;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class AssessmentRowMapper implements RowMapper<Assessment>{

	@Override
	public Assessment mapRow(ResultSet rs, int rowNum) throws SQLException {
		Assessment assessment=new Assessment();
		assessment.setAssessmentId(rs.getString("assessmentId"));
		assessment.setAssessmentType(rs.getString("assessmentType"));
		assessment.setCourseId(rs.getString("courseId"));
		assessment.setWeightage1(rs.getFloat("weightage1"));
		assessment.setWeightage2(rs.getFloat("weightage2"));
		assessment.setWeightage3(rs.getFloat("weightage3"));
		assessment.setAssessmentName(rs.getString("assessmentName"));
		return assessment;
	}

}

package com.Accolite.AU.model;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class AcademicRowMapper implements RowMapper<Academic>{

	@Override
	public Academic mapRow(ResultSet rs, int rowNum) throws SQLException {
		Academic academic=new Academic();
		academic.setCandidateId(rs.getString("candidateId"));
		academic.setCourseId(rs.getString("courseId"));
		academic.setFeedback(rs.getString("feedback"));
		return academic;
	}

}

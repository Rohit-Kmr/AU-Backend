package com.Accolite.AU.model;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class TrendsRowMapper implements RowMapper<Trends> {

	@Override
	public Trends mapRow(ResultSet rs, int rowNum) throws SQLException {
		Trends trends=new Trends();
		trends.setYear(rs.getString("year"));
		trends.setTotalCourses(rs.getInt("totalCourses"));
		trends.setTotalAssessments(rs.getInt("totalAssessments"));
		trends.setAverageScore(rs.getInt("averageScore"));
		return trends;
	}

}

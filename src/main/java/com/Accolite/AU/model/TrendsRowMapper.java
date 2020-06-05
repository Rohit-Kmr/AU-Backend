package com.Accolite.AU.model;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class TrendsRowMapper implements RowMapper<Trends> {

	@Override
	public Trends mapRow(ResultSet rs, int rowNum) throws SQLException {
		Trends trends=new Trends();
		trends.setYear(rs.getString("year"));
		trends.setTotal_courses(rs.getInt("total_courses"));
		trends.setTotal_assessments(rs.getInt("total_assessments"));
		trends.setAvarage_score(rs.getInt("avarage_score"));
		return trends;
	}

}

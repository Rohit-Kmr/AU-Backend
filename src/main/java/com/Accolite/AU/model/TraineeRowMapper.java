package com.Accolite.AU.model;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class TraineeRowMapper implements RowMapper<Trainee>{

	@Override
	public Trainee mapRow(ResultSet rs, int rowNum) throws SQLException {
		Trainee trainee=new Trainee();
		trainee.setAssessment_id(rs.getString("assessment_id"));
		trainee.setTrainee_id(rs.getString("trainee_id"));
		trainee.setTrainee_name(rs.getString("trainee_name"));
		trainee.setPercentage1(rs.getFloat("percentage1"));
		trainee.setPercentage2(rs.getFloat("percentage2"));
		trainee.setPercentage3(rs.getFloat("percentage3"));
		return trainee;
	}

}

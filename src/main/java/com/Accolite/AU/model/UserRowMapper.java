package com.Accolite.AU.model;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.Accolite.AU.model.User;

public class UserRowMapper implements RowMapper<User> {

	@Override
	public User mapRow(ResultSet rs, int rowNum) throws SQLException {
		User user=new User();
		user.setUserId(rs.getString("userId"));
		user.setEmail(rs.getString("email"));
		user.setName(rs.getString("name"));
		user.setType(rs.getString("type"));
		return user;
	}

}

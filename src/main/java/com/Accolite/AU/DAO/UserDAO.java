package com.Accolite.AU.DAO;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.Accolite.AU.model.User;
import com.Accolite.AU.model.UserRowMapper;

@Transactional
@Repository
public class UserDAO implements IUserDAO {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public List<User> getAllUsers() {
		String sql="SELECT * FROM user";
		RowMapper<User> rowMapper=new UserRowMapper();
		return this.jdbcTemplate.query(sql, rowMapper);
	}

	@Override
	public User getUserByEmail(String email) {
		String sql="SELECT user_id, name, type, email FROM user WHERE email=?";
		RowMapper<User> rowMapper=new BeanPropertyRowMapper<User>(User.class);
		User user= jdbcTemplate.queryForObject(sql, rowMapper,email);
		return user;
	}

/*	@Override
	public boolean UserExists(String email) {
		String sql="SELECT count(*) FROM user WHERE email=?";
		int count= jdbcTemplate.queryForObject(sql, Integer.class,email);
		if(count==0) {
			return false;
		}
		else {
			return true;
		}
			
	}*/

}

package com.Accolite.AU.DAO;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.Accolite.AU.model.Trends;
import com.Accolite.AU.model.TrendsRowMapper;

@Transactional
@Repository
public class TrendsDAO implements ITrendsDAO{
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public List<Trends> getAllTrends() {
		String sql="SELECT * FROM trends";
		RowMapper<Trends> rowMapper=new TrendsRowMapper();
		return this.jdbcTemplate.query(sql, rowMapper);
	}

}

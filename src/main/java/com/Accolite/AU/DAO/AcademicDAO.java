package com.Accolite.AU.DAO;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.Accolite.AU.model.Academic;
import com.Accolite.AU.model.AcademicRowMapper;

@Transactional
@Repository
public class AcademicDAO implements IAcademicDAO{

	@Autowired
	JdbcTemplate jdbcTemplate;
	
	@Override
	public List<Academic> getAllAcademic(){
		String sql="SELECT * FROM academic";
		RowMapper<Academic> rowMapper=new AcademicRowMapper();
		return this.jdbcTemplate.query(sql, rowMapper);
	}

	@Override
	public List<Academic> getAcademicByCourseid(String id) {
		String sql="SELECT * FROM academic WHERE course_id=? ";
		RowMapper<Academic> rowMapper=new AcademicRowMapper();
		return jdbcTemplate.query(sql, rowMapper,id);
	}

/*	@Override
	public List<Academic> getAcademicByCandidateid(String id) {
		String sql="SELECT * FROM academic WHERE candidate_id=?";
		RowMapper<Academic> rowMapper=new AcademicRowMapper();
		return jdbcTemplate.query(sql, rowMapper,id);
	}

	
	@Override
	public void addAcademic(Academic academic) {
		String sql = "INSERT INTO Academic (candidate_id,course_id,feedback) values (?, ?, ?)";
		jdbcTemplate.update(sql, academic.getCandidate_id(), academic.getCourse_id(),academic.getFeedback());
		
		//Fetch article id
//		sql = "SELECT articleId FROM articles WHERE title = ? and category=?";
//		int articleId = jdbcTemplate.queryForObject(sql, Integer.class, article.getTitle(), article.getCategory());
		
		//Set article id 
//		article.setArticleId(articleId);
		
		
	}

	@Override
	public void updateAcademic(Academic academic) {
		String sql = "UPDATE Academic SET feedback=? WHERE candidate_id=? AND course_Id=?";
		jdbcTemplate.update(sql,academic.getFeedback(),academic.getCandidate_id(),academic.getCourse_id());
	}

/*	@Override
	public boolean AcademicExists(String course_id, String candidate_id) {
		String sql="SELECT count(*) FROM academic WHERE course_id=? AND candidate_id=?";
		int count= jdbcTemplate.queryForObject(sql, Integer.class,course_id,candidate_id);
		if(count==0) {
			return false;
		}
		else {
			return true;
		}
	}

	@Override
	public void deleteAcademicByCourseId(String id) {
		String sql = "DELETE FROM Academic WHERE course_Id=?";
		jdbcTemplate.update(sql, id);
		
	}*/

}

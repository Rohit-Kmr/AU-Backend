package com.Accolite.AU.DAO;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.Accolite.AU.model.Assessment;
import com.Accolite.AU.model.AssessmentRowMapper;

@Transactional
@Repository
public class AssessmentDAO implements IAssessmentDAO{

	@Autowired
	JdbcTemplate jdbcTemplate;
	
	@Override
	public List<Assessment> getAllAssessment() {
		String sql="SELECT assessment_id, course_id, assessment_type, weightage1, IFNULL(weightage2,0) as weightage2 , IFNULL(weightage3,0) as weightage3 FROM assessment";
		RowMapper<Assessment> rowMapper=new AssessmentRowMapper();
		return this.jdbcTemplate.query(sql, rowMapper);
	}

	@Override
	public Assessment getAssessmentById(String assessment_id) {
		String sql="SELECT assessment_id, course_id, assessment_type, weightage1, IFNULL(weightage2,0) as weightage2 , IFNULL(weightage3,0) as weightage3 FROM assessment WHERE assessment_id=?";
		RowMapper<Assessment> rowMapper=new BeanPropertyRowMapper<Assessment>(Assessment.class);
		return this.jdbcTemplate.queryForObject(sql, rowMapper,assessment_id);
	}

/*	@Override
	public boolean AssessmentExists(String assessment_id) {
		String sql="SELECT count(*) FROM assessment WHERE assessment_id=?";
		int count=this.jdbcTemplate.queryForObject(sql, Integer.class,assessment_id);
		if(count==0) {
			return false;
		}
		else {
			return true;
		}
	}
	*/
	

	@Override
	public void addAssessment(String userid,Assessment assessment) {
		String sql_log = "INSERT INTO assessment_log (timestamps,operation,userid,assessment_id, course_id, assessment_type, weightage1, weightage2, weightage3) VALUES (NOW(),'POST',?,?,?,?,?,?,?)";
		jdbcTemplate.update(sql_log,userid,assessment.getAssessment_id(),assessment.getCourse_id(),assessment.getAssessment_type(),assessment.getWeightage1(),assessment.getWeightage2(),assessment.getWeightage3());		
		
		
		String sql = "INSERT INTO assessment (assessment_id, course_id, assessment_type, weightage1, weightage2, weightage3) values (?,?,?,?,?,?)";
		jdbcTemplate.update(sql,assessment.getAssessment_id(),assessment.getCourse_id(),assessment.getAssessment_type(),assessment.getWeightage1(),assessment.getWeightage2(),assessment.getWeightage3());		
	}

	@Override
	public void updateAssessment(String userid,Assessment assessment) {
		String sql_log = "INSERT INTO assessment_log (timestamps,operation,userid,assessment_id, course_id, assessment_type, weightage1, weightage2, weightage3) VALUES (NOW(),'PUT',?,?,?,?,?,?,?)";
		jdbcTemplate.update(sql_log,userid,assessment.getAssessment_id(),assessment.getCourse_id(),assessment.getAssessment_type(),assessment.getWeightage1(),assessment.getWeightage2(),assessment.getWeightage3());	
		
		String sql = "UPDATE assessment SET assessment_type=?, weightage1=?, weightage2=?, weightage3=? WHERE assessment_id=? AND course_id=?";
		jdbcTemplate.update(sql,assessment.getAssessment_type(),assessment.getWeightage1(),assessment.getWeightage2(),assessment.getWeightage3(),assessment.getAssessment_id(),assessment.getCourse_id());		
	}

	@Override
	public void deleteByAssessmentId(String userid,String assessment_id) {
		String sql_log = "INSERT INTO assessment_log (timestamps,operation,userid,assessment_id) VALUES (NOW(),'DELETE',?,?)";
		jdbcTemplate.update(sql_log,userid,assessment_id);	
		
		String sql="DELETE FROM assessment WHERE assessment_id=?";
		jdbcTemplate.update(sql,assessment_id);
	}

}

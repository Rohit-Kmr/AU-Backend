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


@Repository
public class AssessmentDAO implements IAssessmentDAO{

	@Autowired
	JdbcTemplate jdbcTemplate;
	
	@Override
	public List<Assessment> getAllAssessment() {
		String sql="SELECT assessmentId, courseId,assessmentName, assessmentType, weightage1, IFNULL(weightage2,0) as weightage2 , IFNULL(weightage3,0) as weightage3 FROM assessments";
		RowMapper<Assessment> rowMapper=new AssessmentRowMapper();
		return this.jdbcTemplate.query(sql, rowMapper);
	}

	@Override
	public Assessment getAssessmentById(String assessmentId) {
		String sql="SELECT assessmentId, courseId,assessmentName, assessmentType, weightage1, IFNULL(weightage2,0) as weightage2 , IFNULL(weightage3,0) as weightage3 FROM assessments WHERE assessmentId=?";
		RowMapper<Assessment> rowMapper=new BeanPropertyRowMapper<Assessment>(Assessment.class);
		return this.jdbcTemplate.queryForObject(sql, rowMapper,assessmentId);
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
		String sql_log = "INSERT INTO assessment_log (timestamps,operation,userid,assessmentId, courseId,assessmentName, assessmentType, weightage1, weightage2, weightage3) VALUES (NOW(),'POST',?,?,?,?,?,?,?,?)";
		jdbcTemplate.update(sql_log,userid,assessment.getAssessmentId(),assessment.getCourseId(),assessment.getAssessmentName(),assessment.getAssessmentType(),assessment.getWeightage1(),assessment.getWeightage2(),assessment.getWeightage3());		

		
		String sql = "INSERT INTO assessments (assessmentId, courseId,assessmentName, assessmentType, weightage1, weightage2, weightage3) values (?,?,?,?,?,?,?)";
		jdbcTemplate.update(sql,assessment.getAssessmentId(),assessment.getCourseId(),assessment.getAssessmentName(),assessment.getAssessmentType(),assessment.getWeightage1(),assessment.getWeightage2(),assessment.getWeightage3());		
	}

	@Override
	public void updateAssessment(String userid,Assessment assessment) {
		String sql_log = "INSERT INTO assessment_log (timestamps,operation,userid,assessmentId, courseId,assessmentName, assessmentType, weightage1, weightage2, weightage3) VALUES (NOW(),'PUT',?,?,?,?,?,?,?,?)";
		jdbcTemplate.update(sql_log,userid,assessment.getAssessmentId(),assessment.getCourseId(),assessment.getAssessmentName(),assessment.getAssessmentType(),assessment.getWeightage1(),assessment.getWeightage2(),assessment.getWeightage3());	
		
		String sql = "UPDATE assessments SET assessmentName=?, assessmentType=?, weightage1=?, weightage2=?, weightage3=? WHERE assessmentId=? AND courseId=?";
		jdbcTemplate.update(sql,assessment.getAssessmentName(),assessment.getAssessmentType(),assessment.getWeightage1(),assessment.getWeightage2(),assessment.getWeightage3(),assessment.getAssessmentId(),assessment.getCourseId());		
	}

	@Override
	public void deleteByAssessmentId(String userid,String assessmentId) {
		String sql_log = "INSERT INTO assessment_log (timestamps,operation,userid,assessmentId) VALUES (NOW(),'DELETE',?,?)";
		jdbcTemplate.update(sql_log,userid,assessmentId);	
		
		String sql="DELETE FROM assessments WHERE assessmentId=?";
		jdbcTemplate.update(sql,assessmentId);
	}

}

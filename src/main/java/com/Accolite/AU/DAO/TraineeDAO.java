package com.Accolite.AU.DAO;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.Accolite.AU.model.Trainee;
import com.Accolite.AU.model.TraineeRowMapper;

@Transactional
@Repository
public class TraineeDAO implements ITraineeDAO{

	@Autowired
	JdbcTemplate jdbcTemplate;
	
	@Override
	public List<Trainee> getAllTrainee() {
		String sql="SELECT assessment_id, trainee_id, trainee_name, percentage1, IFNULL(percentage2,0) as percentage2, IFNULL(percentage3,0) as percentage3 FROM trainee";
		RowMapper<Trainee> rowMapper=new TraineeRowMapper();
		return this.jdbcTemplate.query(sql, rowMapper);
	}

	@Override
	public List<Trainee> getTraineeByAssessmentId(String assessment_id) {
		String sql="SELECT  assessment_id, trainee_id, trainee_name, percentage1, IFNULL(percentage2,0) as percentage2, IFNULL(percentage3,0) as percentage3 FROM trainee WHERE assessment_id=?";
		RowMapper<Trainee> rowMapper=new TraineeRowMapper();
		return this.jdbcTemplate.query(sql, rowMapper,assessment_id);
	}

	/*@Override
	public boolean TraineeExists(String assessment_id, String trainee_id) {
		String sql="SELECT count(*) FROM trainee WHERE assessment_id=? AND trainee_id=?";
		int count=this.jdbcTemplate.queryForObject(sql, Integer.class,assessment_id,trainee_id);
		if(count==0) {
			return false;
		}
		else {
			return true;
		}
	}
	*/
	

	@Override
	public void addTrainee(String userid,Trainee trainee) {
		String sql_log = "INSERT INTO  trainee_log (timestamps,operation,userid,assessment_id, trainee_id, trainee_name, percentage1, percentage2, percentage3) VALUES (NOW(),'POST',?,?,?,?,?,?,?)";
		jdbcTemplate.update(sql_log,userid,trainee.getAssessment_id(),trainee.getTrainee_id(),trainee.getTrainee_name(),trainee.getPercentage1(),trainee.getPercentage2(),trainee.getPercentage3());		

		String sql = "INSERT INTO  trainee (assessment_id, trainee_id, trainee_name, percentage1, percentage2, percentage3) VALUES (?,?,?,?,?,?)";
		jdbcTemplate.update(sql,trainee.getAssessment_id(),trainee.getTrainee_id(),trainee.getTrainee_name(),trainee.getPercentage1(),trainee.getPercentage2(),trainee.getPercentage3());		
	
	}

	@Override
	public void updateTrainee(String userid,Trainee trainee) {
		String sql_log = "INSERT INTO  trainee_log (timestamps,operation,userid,assessment_id, trainee_id, trainee_name, percentage1, percentage2, percentage3) VALUES (NOW(),'PUT',?,?,?,?,?,?,?)";
		jdbcTemplate.update(sql_log,userid,trainee.getAssessment_id(),trainee.getTrainee_id(),trainee.getTrainee_name(),trainee.getPercentage1(),trainee.getPercentage2(),trainee.getPercentage3());		

		
		String sql = "UPDATE Trainee SET trainee_name=?, percentage1=?, percentage2=?, percentage3=? WHERE assessment_id=? AND trainee_id=?";
		jdbcTemplate.update(sql,trainee.getTrainee_name(),trainee.getPercentage1(),trainee.getPercentage2(),trainee.getPercentage3(),trainee.getAssessment_id(),trainee.getTrainee_id());		
		
	}

	@Override
	public void deleteTraineeByAssessmentId(String userid,String assessment_id) {
		String sql_log = "INSERT INTO  trainee_log (timestamps,operation,userid,assessment_id) VALUES (NOW(),'DELETE',?,?)";
		jdbcTemplate.update(sql_log,userid,assessment_id);		

		
		String sql="DELETE FROM trainee WHERE assessment_id=?";
		jdbcTemplate.update(sql,assessment_id);
	}

}

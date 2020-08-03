package com.Accolite.AU.DAO;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.Accolite.AU.model.Trainee;
import com.Accolite.AU.model.TraineeRowMapper;


@Repository
public class TraineeDAO implements ITraineeDAO{

	@Autowired
	JdbcTemplate jdbcTemplate;
	
	@Override
	public List<Trainee> getAllTrainee() {
		String sql="SELECT assessmentId, traineeId, traineeName, percentage1, IFNULL(percentage2,0) as percentage2, IFNULL(percentage3,0) as percentage3 FROM trainees";
		RowMapper<Trainee> rowMapper=new TraineeRowMapper();
		return this.jdbcTemplate.query(sql, rowMapper);
	}

	@Override
	public List<Trainee> getTraineeByAssessmentId(String assessment_id) {
		String sql="SELECT  assessmentId, traineeId, traineeName, percentage1, IFNULL(percentage2,0) as percentage2, IFNULL(percentage3,0) as percentage3 FROM trainees WHERE assessmentId=?";
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
		String sql_log = "INSERT INTO  trainee_log (timestamps,operation,userid,assessmentId, traineeId, traineeName, percentage1, percentage2, percentage3) VALUES (NOW(),'POST',?,?,?,?,?,?,?)";
		jdbcTemplate.update(sql_log,userid,trainee.getAssessmentId(),trainee.getTraineeId(),trainee.getTraineeName(),trainee.getPercentage1(),trainee.getPercentage2(),trainee.getPercentage3());		

		String sql = "INSERT INTO  trainees (assessmentId, traineeId, traineeName, percentage1, percentage2, percentage3) VALUES (?,?,?,?,?,?)";
		jdbcTemplate.update(sql,trainee.getAssessmentId(),trainee.getTraineeId(),trainee.getTraineeName(),trainee.getPercentage1(),trainee.getPercentage2(),trainee.getPercentage3());		
	
	}

	@Override
	public void updateTrainee(String userid,Trainee trainee) {
		String sql_log = "INSERT INTO  trainee_log (timestamps,operation,userid,assessmentId, traineeId, traineeName, percentage1, percentage2, percentage3) VALUES (NOW(),'PUT',?,?,?,?,?,?,?)";
		jdbcTemplate.update(sql_log,userid,trainee.getAssessmentId(),trainee.getTraineeId(),trainee.getTraineeName(),trainee.getPercentage1(),trainee.getPercentage2(),trainee.getPercentage3());		

		
		String sql = "UPDATE trainees SET traineeName=?, percentage1=?, percentage2=?, percentage3=? WHERE assessmentId=? AND traineeId=?";
		jdbcTemplate.update(sql,trainee.getTraineeName(),trainee.getPercentage1(),trainee.getPercentage2(),trainee.getPercentage3(),trainee.getAssessmentId(),trainee.getTraineeId());		
		
	}

	@Override
	public void deleteTraineeByAssessmentId(String userid,String assessmentId) {
		String sql_log = "INSERT INTO  trainee_log (timestamps,operation,userid,assessmentId) VALUES (NOW(),'DELETE',?,?)";
		jdbcTemplate.update(sql_log,userid,assessmentId);		

		
		String sql="DELETE FROM trainees WHERE assessmentId=?";
		jdbcTemplate.update(sql,assessmentId);
	}

}

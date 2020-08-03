package com.Accolite.AU.DAO;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.Accolite.AU.model.Course;
import com.Accolite.AU.model.CourseRowMapper;


@Repository
public class CourseDAO implements ICourseDAO {
	
	@Autowired
	JdbcTemplate jdbcTemplate;

	@Override
	public List<Course> getAllCourse() {
		String sql="SELECT courseId,courseName,courseDesc,trainerId,skills,prerequisite,trainerName FROM course";
		RowMapper<Course> rowMapper=new CourseRowMapper();
		return this.jdbcTemplate.query(sql, rowMapper);
	}

	@Override
	public Course getCourseByid(String id) {
		String sql="SELECT courseId,courseName,courseDesc,trainerId,skills,prerequisite,trainerName FROM course WHERE courseId=?";
		RowMapper<Course> rowMapper=new BeanPropertyRowMapper<Course>(Course.class);
		Course course= jdbcTemplate.queryForObject(sql, rowMapper,id);
		return course;
	}

/*	@Override
	public boolean CourseExists(String id) {
		String sql="SELECT count(*) FROM course WHERE course_id=?";
		int count= jdbcTemplate.queryForObject(sql, Integer.class,id);
		if(count==0) {
			return false;
		}
		else {
			return true;
		}
	}

	@Override
	public void addCourse(Course course) {
		String sql = "INSERT INTO course (course_id,course_desc,Trainer_id,skills,prerequisite,trainer_name) values (?, ?, ?, ?, ?,?)";
		jdbcTemplate.update(sql, course.getCourseId(), course.getCourse_desc(), course.getTrainer_id(),course.getSkills(),course.getPrerequisite(),course.getTrainer_name());
		
		//Fetch article id
//		sql = "SELECT articleId FROM articles WHERE title = ? and category=?";
//		int articleId = jdbcTemplate.queryForObject(sql, Integer.class, article.getTitle(), article.getCategory());
		
		//Set article id 
//		article.setArticleId(articleId);
		
	}

	@Override
	public void updateCourse(Course course) {
		String sql = "UPDATE course SET course_desc=?, Trainer_id=?,skills=?,prerequisite=?,trainer_name=? WHERE course_Id=?";
		jdbcTemplate.update(sql, course.getCourse_desc(), course.getTrainer_id(),course.getSkills(),course.getPrerequisite(),course.getTrainer_name(),course.getCourseId());
	}

	@Override
	public void deleteCourse(String id) {
		String sql = "DELETE FROM course WHERE course_Id=?";
		jdbcTemplate.update(sql, id);
	}*/

}

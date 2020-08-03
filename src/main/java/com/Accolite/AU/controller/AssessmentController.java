package com.Accolite.AU.controller;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Accolite.AU.Service.IAssessmentService;
import com.Accolite.AU.model.Assessment;

@RestController
@CrossOrigin("*")
@RequestMapping("/Assessment")
public class AssessmentController {
	@Autowired
	IAssessmentService assessmentService;
	
	Logger log=LogManager.getLogger(AssessmentController.class);
	
	@GetMapping("/getAssessment")
	public ResponseEntity<List<Assessment>> getAllAssessment(){
		log.info("Get Assessment Called");
		List<Assessment> list=assessmentService.getAllAssessment();
		return new ResponseEntity<List<Assessment>>(list,HttpStatus.OK);
	}
	
	@GetMapping("/getAssessment/{id}")
	public ResponseEntity<Assessment> getAssessmentByAssessmentId(@PathVariable("id") String id){
		log.info("Get Assessment called with id "+id);
		Assessment assessment=assessmentService.getAssessmentById(id);
		return new ResponseEntity<Assessment>(assessment,HttpStatus.OK);
	}
	
	@PutMapping("/updateAssessment/{id}")
	public ResponseEntity<Assessment> updateAssessment(@PathVariable("id") String id,@RequestBody Assessment assessment){
		log.info("Update Assessment called by "+id);
		assessmentService.updateAssessment(id,assessment);
		return new ResponseEntity<Assessment>(assessment,HttpStatus.OK);
	}
	
	@PostMapping("/addAssessment/{id}")
	public ResponseEntity<Void> addAssessment(@PathVariable("id") String id,@RequestBody Assessment assessment){
		log.info("Add Assessment called by "+id);
		assessmentService.addAssessment(id,assessment);
		return new ResponseEntity<Void>(HttpStatus.CREATED);
	}
	
	@DeleteMapping("/deleteAssessment/{id}/{userid}")
	public void deleteAssessmentByAssessmentId(@PathVariable("userid") String userid,@PathVariable("id") String id) {
		log.info("Delete Assessment called by "+id);
		assessmentService.deleteByAssessmentId(userid,id);
	}
}

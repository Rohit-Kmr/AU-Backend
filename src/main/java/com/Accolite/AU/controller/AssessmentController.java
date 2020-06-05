package com.Accolite.AU.controller;

import java.util.List;

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
@CrossOrigin
@RequestMapping("/Assessment")
public class AssessmentController {
	@Autowired
	IAssessmentService assessmentService;
	
	@GetMapping("/getAssessment")
	public ResponseEntity<List<Assessment>> getAllAssessment(){
		List<Assessment> list=assessmentService.getAllAssessment();
		return new ResponseEntity<List<Assessment>>(list,HttpStatus.OK);
	}
	
	@GetMapping("/getAssessment/{id}")
	public ResponseEntity<Assessment> getAssessmentByAssessmentId(@PathVariable("id") String id){
		Assessment assessment=assessmentService.getAssessmentById(id);
		return new ResponseEntity<Assessment>(assessment,HttpStatus.OK);
	}
	
	@PutMapping("/updateAssessment/{id}")
	public ResponseEntity<Assessment> updateAcademicDetail(@PathVariable("id") String id,@RequestBody Assessment assessment){
		assessmentService.updateAssessment(id,assessment);
		return new ResponseEntity<Assessment>(assessment,HttpStatus.OK);
	}
	
	@PostMapping("/addAssessment/{id}")
	public ResponseEntity<Void> addAcademicDetail(@PathVariable("id") String id,@RequestBody Assessment assessment){
		assessmentService.addAssessment(id,assessment);
		return new ResponseEntity<Void>(HttpStatus.CREATED);
	}
	
	@DeleteMapping("/deleteAssessment/{id}/{userid}")
	public void deleteAssessmentByAssessmentId(@PathVariable("userid") String userid,@PathVariable("id") String id) {
		assessmentService.deleteByAssessmentId(userid,id);
	}
}

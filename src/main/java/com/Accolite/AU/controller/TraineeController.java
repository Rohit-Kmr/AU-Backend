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
import org.springframework.web.util.UriComponentsBuilder;

import com.Accolite.AU.Service.ITraineeService;
import com.Accolite.AU.model.Academic;
import com.Accolite.AU.model.Trainee;

@RestController
@CrossOrigin
@RequestMapping("/Trainee")
public class TraineeController {
	
	@Autowired
	ITraineeService traineeService;
	
	@GetMapping("/getTrainee")
	public ResponseEntity<List<Trainee>> getAllTrainee(){
		List<Trainee> list=traineeService.getAllTrainee();
		return new ResponseEntity<List<Trainee>>(list,HttpStatus.OK);
	}
	
	@GetMapping("/getTrainee/{id}")
	public ResponseEntity<List<Trainee>> getTraineeByAssessmentId(@PathVariable("id") String id){
		List<Trainee> list=traineeService.getTraineeByAssessmentId(id);
		return new ResponseEntity<List<Trainee>>(list,HttpStatus.OK);
	}
	
	@PutMapping("/updateTrainee/{id}")
	public ResponseEntity<Trainee> updateAcademicDetail(@PathVariable("id") String id,@RequestBody Trainee trainee){
		traineeService.updateTrainee(id,trainee);
		return new ResponseEntity<Trainee>(trainee,HttpStatus.OK);
	}
	
	@PostMapping("/addTrainee/{id}")
	public ResponseEntity<Void> addAcademicDetail(@PathVariable("id") String id,@RequestBody Trainee trainee){
		traineeService.addTrainee(id,trainee);
		return new ResponseEntity<Void>(HttpStatus.CREATED);
	}
	
	@DeleteMapping("/deleteTrainee/{id}/{userid}")
	public void deleteTraineeByAssessmentId(@PathVariable("userid") String userid,@PathVariable("id") String id) {
		traineeService.deleteTraineeByAssessmentId(userid,id);
	}
}

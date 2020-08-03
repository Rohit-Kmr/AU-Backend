package com.Accolite.AU.controller;

import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
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
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import com.Accolite.AU.Service.IAcademicService;
import com.Accolite.AU.model.Academic;


@RestController
@CrossOrigin
@RequestMapping("/Academic")
public class AcademicController {
	
	Logger log=LogManager.getLogger(AcademicController.class);
	
	@Autowired
	IAcademicService academicService;
	
	@GetMapping("/getDetails")
	public ResponseEntity<List<Academic>> getAllAcademicDetails(){

		log.info("Get Academic Called");
		List<Academic> list=academicService.getAllAcademic();
		return new ResponseEntity<List<Academic>>(list,HttpStatus.OK);
	}
	
	@GetMapping("/getDetails/{id}")
	public ResponseEntity<List<Academic>> getAcademicDetailByCourse(@PathVariable("id") String id){

		log.info("Get Academic Called with id "+id);
		List<Academic> list=academicService.getAcademicByCourseid(id);
		return new ResponseEntity<List<Academic>>(list,HttpStatus.OK);
	}
	
/*	@GetMapping("/getDetailsByCandidate/{id}")
	public ResponseEntity<List<Academic>> getAcademicDetailByCandidate(@PathVariable("id") String id){
		List<Academic> list=academicService.getAcademicByCandidateid(id);
		return new ResponseEntity<List<Academic>>(list,HttpStatus.OK);
	}
	
	@PutMapping("/updateDetails")
	public ResponseEntity<Academic> updateAcademicDetail(@RequestBody Academic academic){
		academicService.updateAcademic(academic);
		return new ResponseEntity<Academic>(academic,HttpStatus.OK);
	}
	
	@PostMapping("/addDetails")
	public ResponseEntity<Void> addAcademicDetail(@RequestBody Academic academic,UriComponentsBuilder builder){
		academicService.addAcademic(academic);
		return new ResponseEntity<Void>(HttpStatus.CREATED);
	}
	
	@DeleteMapping("/deleteDetails/{id}")
	public void deleteAcademicDetail(@PathVariable("id") String id){
		academicService.deleteAcademicByCourseId(id);
	}
	*/
}

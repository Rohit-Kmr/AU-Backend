package com.Accolite.AU.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Accolite.AU.model.Academic;
import com.Accolite.AU.repository.AcademicRepository;


@RestController
@CrossOrigin(origins="http://localhost:4200")
@RequestMapping("/Academic")
public class AcademicController {
	
	@Autowired
	AcademicRepository academicRepo;
	
	@GetMapping("/getDetails")
	public Iterable<Academic> getAllAcademicDetails(){
		return academicRepo.findAll();
	}
	
	@GetMapping("/getDetails/{id}")
	public Optional<Academic> getAcademicDetail(@PathVariable("id") String id){
		return academicRepo.findById(id);
	}
	
	@PutMapping("/updateDetails/{id}")
	public void updateAcademicDetail(@PathVariable("id") String id,@RequestBody Academic course){
		academicRepo.deleteById(id);
		academicRepo.save(course);
	}
	
	@PostMapping("/addDetails")
	public void addAcademicDetail(@RequestBody Academic course){
		academicRepo.save(course);
	}
	
	@DeleteMapping("/deleteDetails/id")
	public void deleteAcademicDetail(@PathVariable("id") String id){
		academicRepo.deleteById(id);;
	}

}

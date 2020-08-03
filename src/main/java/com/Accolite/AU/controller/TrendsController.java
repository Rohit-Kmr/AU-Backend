package com.Accolite.AU.controller;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Accolite.AU.Service.ITrendsService;
import com.Accolite.AU.model.Trends;

@RestController
@CrossOrigin
@RequestMapping("/Trends")
public class TrendsController {
	

	Logger log=LogManager.getLogger(TrendsController.class);
	
	@Autowired
	ITrendsService trendsService;
	
	@GetMapping("/getAll")
	public ResponseEntity<List<Trends>> getAllTrends(){
		log.info("Get trends Called");
		List<Trends> list=trendsService.getAllTrends();
		return new ResponseEntity<List<Trends>>(list,HttpStatus.OK);
	}

}

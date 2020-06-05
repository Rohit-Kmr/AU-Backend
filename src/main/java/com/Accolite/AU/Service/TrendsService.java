package com.Accolite.AU.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Accolite.AU.DAO.ITrendsDAO;
import com.Accolite.AU.model.Trends;

@Service
public class TrendsService implements ITrendsService {

	@Autowired
	ITrendsDAO trendsDAO;
	
	@Override
	public List<Trends> getAllTrends() {
		return trendsDAO.getAllTrends();
	}

}

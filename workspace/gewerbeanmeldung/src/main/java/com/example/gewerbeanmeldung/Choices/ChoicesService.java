package com.example.gewerbeanmeldung.Choices;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ChoicesService {

	@Autowired
	private ChoicesRepository choiceRepo;
	
/*	//Gets a frageart by it's ID
		public Choices getFrageartById(Integer id) {
			return frageartRepo.findById(id).orElse(null);
		}
	
	//Update a question by its id
		public String updateFrageart(Frageart frageart, Integer id) {
			try {
				Frageart qa = getFrageartById(id);
				id = qa.getId();
		    	qa = frageart;
		    	qa.setId(id);
		    	frageartRepo.save(qa);
			}catch(Exception e) {
				return "Failed!";
			}
	    	return "successfully edited";
			
		}*/
		
	//Get all choices of Frageart	
}

package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import com.example.demo.model.UserVaccinationDetails;
import com.example.demo.model.VaccinationDetails;
import com.example.demo.repository.VaccinationRepository;

@Service
public class VaccinationService {

	@Autowired
	private VaccinationRepository vaccinationRepository;
	
	public void insertUserVaccinationDetails(VaccinationDetails vaccinationDeatil) {
		
		UserVaccinationDetails userDetails = vaccinationRepository.findByUserId(vaccinationDeatil.getUserId());
		if(!ObjectUtils.isEmpty(userDetails)) {
			
		}
		//vaccinationRepository.save(vaccinationDeatil);
		
	}

	
}

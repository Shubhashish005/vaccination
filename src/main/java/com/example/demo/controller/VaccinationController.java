package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.UserVaccinationDetails;
import com.example.demo.model.VaccinationDetails;
import com.example.demo.service.VaccinationService;

@RestController
@RequestMapping("/vaccine")
public class VaccinationController {
	
	@Autowired
	private VaccinationService vaccinationService;
	
	@PostMapping
	public UserVaccinationDetails insertUserVaccinationDetails(@RequestBody VaccinationDetails vaccinationDeatil) {
	
		vaccinationService.insertUserVaccinationDetails(vaccinationDeatil);
		
		return null;
	}
	
	@GetMapping("/dosageHistory/{userId}")
	public UserVaccinationDetails getDosageHistoryByIndividual(@PathVariable("userId") String userId) {
	
		
		
		return null;
	}
	
	@PostMapping
	public UserVaccinationDetails getVaccinationSummaryByRegion(@PathVariable("region") String region) {
	
		
		
		return null;
	}

}

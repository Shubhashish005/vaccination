package com.example.demo.model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Builder;
import lombok.Data;

@Entity
@Data
@Builder
public class UserVaccinationDetails {

	@Id
	@GeneratedValue
	private Integer id;
	private String username;
	private List<VaccinationDetails> vaccinationDetails;
}

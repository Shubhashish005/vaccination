package com.example.demo.model;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class VaccinationDetails {
	
	@Id
	@GeneratedValue
	private int id;
	
	private String userId;
	private Integer vaccinationId;
	private String region;
	private Date vaccinationDate;
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getUserId() {
		return userId;
	}
	
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	public Integer getVaccinationId() {
		return vaccinationId;
	}
	
	public void setVaccinationId(Integer vaccinationId) {
		this.vaccinationId = vaccinationId;
	}
	
	public String getRegion() {
		return region;
	}
	
	public void setRegion(String region) {
		this.region = region;
	}
	
	public Date getVaccinationDate() {
		return vaccinationDate;
	}
	
	public void setVaccinationDate(Date vaccinationDate) {
		this.vaccinationDate = vaccinationDate;
	}
	
	
}

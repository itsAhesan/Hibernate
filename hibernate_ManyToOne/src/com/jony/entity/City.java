package com.jony.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Data;

@Entity
@Data
public class City {

	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private int cityId;
	private String cityName;
	
	@ManyToOne(cascade= CascadeType.ALL)
	@JoinColumn(referencedColumnName="countryId")
	private Country country;
	
	
	
}

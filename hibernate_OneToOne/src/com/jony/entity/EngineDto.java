package com.jony.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;

@Entity
@Data
public class EngineDto {
	
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Id
	private int eid;
	private String ename;
	
	
	
	
	
}

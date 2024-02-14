package com.jony.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class CarDto {

	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Id
	private int cid;
	private String cname;
	@OneToOne(cascade= CascadeType.ALL)
	private EngineDto engineDto;
	
	
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public EngineDto getEngineDto() {
		return engineDto;
	}
	public void setEngineDto(EngineDto engineDto) {
		this.engineDto = engineDto;
	}
	
	
	
	
	
}

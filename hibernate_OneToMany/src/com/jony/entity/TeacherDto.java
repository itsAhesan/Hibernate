package com.jony.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import lombok.Data;
@Data
@Entity

public class TeacherDto {
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private int tid;
	
	@Column(name="teacherName")
	private String tname;
	
	
	@OneToMany(cascade= CascadeType.ALL)
	@JoinColumn(referencedColumnName= "tid")
	private List<StudentDto> listStudentDtos;
	
	
	
}

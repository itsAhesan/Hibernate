package com.jony.Dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.jony.entity.StudentDto;
import com.jony.entity.TeacherDto;

public class OneToManyDao {

	public static void main(String[] args) {
		Configuration con = new Configuration();
		con.configure();

		SessionFactory sessionFactory = con.buildSessionFactory();
		Session session = sessionFactory.openSession();
		
		Transaction transaction = session.beginTransaction();
		
		/*StudentDto s1= new StudentDto();
		s1.setSname("Jony");
	
		StudentDto s2= new StudentDto();
		s2.setSname("Rahat");
		
		StudentDto s3= new StudentDto();
		s3.setSname("Arun");
		
		StudentDto s4= new StudentDto();
		s4.setSname("Zaid");
		
		List<StudentDto> liStudentDtos= new ArrayList<StudentDto>();
		liStudentDtos.add(s1);
		liStudentDtos.add(s2);
		liStudentDtos.add(s3);
		liStudentDtos.add(s4);
		
		TeacherDto teacherDto = new TeacherDto();
		teacherDto.setTname("Azam Sir");
		
		teacherDto.setListStudentDtos(liStudentDtos);
		session.save(teacherDto);*/
		
		TeacherDto teacherDto = session.load(TeacherDto.class, 1);
		System.out.println(teacherDto.getTname());
		
		List<StudentDto> listStudentDtos = teacherDto.getListStudentDtos();
		
		for (StudentDto studentDto : listStudentDtos) {
			System.out.println(studentDto.getSname());
		}
		
		transaction.commit();
		
	}

}

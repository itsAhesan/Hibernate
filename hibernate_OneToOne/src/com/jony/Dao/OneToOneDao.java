package com.jony.Dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.jony.entity.CarDto;
import com.jony.entity.EngineDto;

public class OneToOneDao {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure();
		
		SessionFactory sessionFactory = cfg.buildSessionFactory();
		Session session = sessionFactory.openSession();
		
		Transaction transaction = session.beginTransaction();
		
		EngineDto engineDto= new EngineDto();
		engineDto.setEname("Diseal Engine");
		
		CarDto carDto = new CarDto();
		carDto.setCname("BMW");
		
		carDto.setEngineDto(engineDto);
		
		session.save(carDto);
		transaction.commit();
		
		
	}

}

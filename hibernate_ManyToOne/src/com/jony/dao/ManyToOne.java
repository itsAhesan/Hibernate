package com.jony.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.jony.entity.City;
import com.jony.entity.Country;

public class ManyToOne {

	public static void main(String[] args) {
		Configuration con = new Configuration();
		con.configure();

		SessionFactory sessionFactory = con.buildSessionFactory();
		Session session = sessionFactory.openSession();
		
		Transaction transaction = session.beginTransaction();
		
		Country country= new Country();
		country.setCountryName("India");
		
		City city1 = new City();
		city1.setCityName("Delhi");
		city1.setCountry(country);
		
		City city2 = new City();
		city2.setCityName("Kolkata");
		city2.setCountry(country);
		
		City city3 = new City();
		city3.setCityName("Mumbai");
		city3.setCountry(country);
		
		session.save(city1);
		session.save(city2);
		session.save(city3);
		
		transaction.commit();
		
		
		

	}

}

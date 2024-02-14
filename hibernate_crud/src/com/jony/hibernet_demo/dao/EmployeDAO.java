package com.jony.hibernet_demo.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.jony.hibernet_demo.entity.EmployeeDTO;

public class EmployeDAO {

	public static void main(String[] args) {
		Configuration cfg= new Configuration();
		cfg.configure();
		
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		
		//   EmployeeDTO dto= new EmployeeDTO();
		
		/* ======  Insert Operation =======
		dto.setId(103);
		dto.setName("JK");
		dto.setDesignation("School");
		dto.setSalary(3000.00);
		session.save(dto);*/
		
		//=====Update Operation========
		/*EmployeeDTO dto= session.load(EmployeeDTO.class, 101);
		dto.setName("Ahesan");
		dto.setDesignation("Pro");
		dto.setSalary(6000.00);
		session.update(dto);
		System.out.println("Data Updated");*/
		
		//=======Delete Operation=======
	/*	EmployeeDTO dto = session.load(EmployeeDTO.class, 103);
		session.remove(dto);
		System.out.println("Delete Data");*/
		
		//======Read Operation=======
		EmployeeDTO dto = session.load(EmployeeDTO.class, 101);
		System.out.println(dto.getId()+" "+dto.getName()+" "+dto.getDesignation()+" "+dto.getSalary());
		
		
		
		Transaction transaction = session.beginTransaction();
		transaction.commit();
		
		session.close();
		
		
		

	}

}

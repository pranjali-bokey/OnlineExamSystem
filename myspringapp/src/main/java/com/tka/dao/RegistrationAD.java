package com.tka.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;

import com.tka.entity.RegistrationE;

public class RegistrationAD {
	@Autowired
	SessionFactory factory;

	public void saveToDB(RegistrationE user)
	{
		Session session=factory.openSession();
		
		Transaction tx=session.beginTransaction();
			
			session.save(user);
		
		tx.commit();

	}
}

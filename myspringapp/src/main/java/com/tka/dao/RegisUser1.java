package com.tka.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import com.tka.entity.*;
public class RegisUser1 {
	@Autowired
SessionFactory factory;
	public void SaveData(User1 user)

{
		Session s=factory.openSession();
		s.save(user);
		s.beginTransaction().commit();
		
		}
}

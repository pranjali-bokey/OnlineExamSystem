package com.tka.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.tka.entity.*;
@Repository
public class LoginUser {
	@Autowired
SessionFactory factory;
	public String getPssword(String uname)
	{
		Session s=factory.openSession();
		User1 userfromdb=s.get(User1.class, uname);
		if(userfromdb==null)
		{
			return null;
		}
		else 
		{
			return userfromdb.getUpassword();
		}
	}
}

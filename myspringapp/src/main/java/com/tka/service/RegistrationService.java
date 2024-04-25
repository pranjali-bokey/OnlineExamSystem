 package com.tka.service;
 import org.springframework.beans.factory.annotation.Autowired;
 import org.springframework.stereotype.Service;

 import com.tka.dao.RegistrationDAO;


import com.tka.entity.*;
@Service
public class RegistrationService {

	@Autowired
	RegistrationDAO dao;
	
	public void saveToDB(User user)
	{
		dao.saveToDB(user);
	}
	


}



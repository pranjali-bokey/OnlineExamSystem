package com.tka.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.tka.dao.RegistrationDAO;
import com.tka.entity.User;

public class RegistrationAS {
	@Autowired
	RegistrationDAO dao;
	
	public void saveToDB(User user)
	{
		dao.saveToDB(user);
	}
	
}

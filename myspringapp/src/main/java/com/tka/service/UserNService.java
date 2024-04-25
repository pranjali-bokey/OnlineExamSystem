package com.tka.service;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.tka.dao.UserNRep;
import com.tka.entity.UserN;



@Service
@Transactional
public class UserNService {

	public UserNRep userRep ;
	public void userRep(UserNRep userRep)
	{
		this.userRep=userRep;
	}
	
	public void saveMyUser(UserN user)
	{
		userRep.save(user);
	}
	
}

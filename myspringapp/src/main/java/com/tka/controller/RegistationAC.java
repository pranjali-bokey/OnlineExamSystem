package com.tka.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tka.entity.User;
import com.tka.service.RegistrationService;

public class RegistationAC {
	@Autowired
	RegistrationService service;
	
	@RequestMapping("saveToDB")
	public ResponseEntity<Boolean> saveToDB(@RequestBody User user)
	{
		
		System.out.println(user);
		
		service.saveToDB(user);
		
		return new ResponseEntity<Boolean>(true,HttpStatus.CREATED);
		
	}
}

package com.tka.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.tka.entity.UserN;
import com.tka.service.UserNService;

@RestController
public class UserNRest {
@Autowired
	private UserNService userSer;
	
	
	
	
	@GetMapping("/User.Save")
	public String SaveUserN(@RequestParam int id,@RequestParam String username,@RequestParam String firstname,@RequestParam String lastname,
			@RequestParam int age,@RequestParam String password)
	{
		UserN user=new UserN(id,username,firstname,lastname,age,password);
		userSer.saveMyUser(user);
		return "Save UserN";
	}
}

package com.tka.controller;

import java.util.List;
import com.tka.entity.*;import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
public class JosnController {
	@Autowired
	SessionFactory factory;

	
	@PostMapping("saveUser")
	public String saveUser(@RequestBody User user)
	{
		Session session=factory.openSession();
		
		Transaction tx=session.beginTransaction();
		
				session.save(user);
				
		tx.commit();
		
		return "record saved";
	}
	
	
	
	
	@PutMapping("updateUser")
	public String updateUser(@RequestBody User user)
	{
		Session session=factory.openSession();
		
		Transaction tx=session.beginTransaction();
		
				session.update(user);
				
		tx.commit();
		
		return "record updated";
	}
	

	
	@DeleteMapping("deleteUser/{username}")
	public String deleteUser(@PathVariable String username)
	{
	
		Session session=factory.openSession();
	
		User userfromdb=session.load(User.class, username);
		
		Transaction tx=session.beginTransaction();
		
				session.delete(userfromdb);
				
		tx.commit();
		
		return "record deleted";
	}
	
	
	@GetMapping("getAllUsers")
	public List<User> getAllUsers()
	{
		Session session=factory.openSession();
		
		return session.createCriteria(User.class).list();
		
	}
	

	
	@GetMapping("getUser/{username}")
	public User getUser(@PathVariable String username)
	{
		Session session=factory.openSession();
		
		return session.get(User.class, username);
	}
	
}



package com.tka.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tka.entity.User;

@RestController
@CrossOrigin("http://localhost:4200")

public class UserController {

	int a;
	
	List<User> list=new ArrayList<>();

	UserController()
	{
		a=30; 
	}
	
@PostConstruct
public void init()
{
	list=getAllUsers();
	System.out.println(list);
}

	
@PreDestroy
void destroy()
{
	System.out.println("Object destroyed");
}

    @Autowired
	SessionFactory factory;
		
	// {"username":"akash3","password":"akash","mobno":1234,"emailid":"hh@jk"}
	
	@PostMapping("saveUser")
	public ResponseEntity<Boolean> saveUser(@RequestBody User user)
	{
		try
		{
				Session session=factory.openSession();
		
				Transaction tx=session.beginTransaction();
		
				session.save(user);
				
				tx.commit();
		
				ResponseEntity<Boolean> responseEntity=new ResponseEntity<Boolean>(true,HttpStatus.CREATED);
		
				return responseEntity;
		}
		catch(Exception e)
		{
			ResponseEntity<Boolean> responseEntity=new ResponseEntity<Boolean>(false,HttpStatus.INTERNAL_SERVER_ERROR);
			
			return responseEntity;
	
		}
	}
	
	
	// {"username":"akash3","password":"akash","mobno":1234,"emailid":"hh@jk"}
	

	@PutMapping("updateUser")
	public ResponseEntity<Boolean> updateUser(@RequestBody User user)
	{
		try
		{
				Session session=factory.openSession();
		
				Transaction tx=session.beginTransaction();
		
				session.update(user);
				
				tx.commit();
		
				ResponseEntity<Boolean> responseEntity=new ResponseEntity<Boolean>(true,HttpStatus.CREATED);
		
				return responseEntity;
		}
		catch(Exception e)
		{
			ResponseEntity<Boolean> responseEntity=new ResponseEntity<Boolean>(false,HttpStatus.INTERNAL_SERVER_ERROR);
			
			return responseEntity;
	
		}
	}
	
	
	//localhost:8080/deleteUser/akash
	
	@DeleteMapping("deleteUser/{username}")
	public ResponseEntity<Boolean> deleteUser(@PathVariable String username)
	{
	
		try
		{
			Session session=factory.openSession();
	
			User userfromdb=session.load(User.class, username);
		
			Transaction tx=session.beginTransaction();
			
				session.delete(userfromdb);
				
				tx.commit();
		
				ResponseEntity<Boolean> responseEntity=new ResponseEntity<Boolean>(true,HttpStatus.CREATED);
				
				return responseEntity;
		
		}
		
		catch(Exception e)
		{
			ResponseEntity<Boolean> responseEntity=new ResponseEntity<Boolean>(false,HttpStatus.INTERNAL_SERVER_ERROR);
			
			return responseEntity;
	
		}
	}
	
	
	@GetMapping("getAllUsers")
	public List<User> getAllUsers()
	{
		Session session=factory.openSession();
		
		return session.createCriteria(User.class).list();
		
	}
	
	
	// localhost:8080/getUser/akash
	
	@GetMapping("getUser/{username}")
	public ResponseEntity<User> getUser(@PathVariable String username)
	{
		Session session=factory.openSession();
		
		User user=session.get(User.class, username);
		
		ResponseEntity<User> responseEntity=new ResponseEntity<User>(user,HttpStatus.OK);
		
return responseEntity;
	}
	
}


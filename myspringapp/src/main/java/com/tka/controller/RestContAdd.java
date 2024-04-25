package com.tka.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class RestContAdd {
	@RequestMapping("add/{a}/{b}")
	public String add(@PathVariable Integer a, @PathVariable Integer b)
	{
		System.out.println(a +" "+b);
		return a+b+" ";
	}
	
	@RequestMapping("addition")
public String addition(@RequestParam Integer no1, @RequestParam Integer no2)
{
	System.out.println(no1 +" "+no2);
	return no1+no2+" ";
}
}



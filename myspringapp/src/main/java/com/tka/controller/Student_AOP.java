package com.tka.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Student_AOP {
@RequestMapping("/hello")
public String get()
{
	System.out.println("AOP");
	return "hello1";
}
}

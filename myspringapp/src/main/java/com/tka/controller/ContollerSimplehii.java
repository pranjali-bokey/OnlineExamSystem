package com.tka.controller;
import java.util.ArrayList;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ContollerSimplehii {
	@RequestMapping("hi")
public ModelAndView hi()
{
	ArrayList<String> array=new ArrayList<>();
	array.add("Concept of Java");
	array.add("Collection Framework");
	array.add("Exception handling");
	array.add("MultiThreading");
	ModelAndView mav=new  ModelAndView();
	mav.setViewName("hi");
	mav.addObject("Data",array);
	return mav;
	
}
}

package com.tka.controller;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class StudentAOP {
@Before("execution(* com.tka.controller.Student_AOP.get() )")
public void msg1()
{
	System.out.println("Project is Started");
}
}

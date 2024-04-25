package com.tka.myspringapp;


import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;

import com.tka.entity.User;

@SpringBootApplication
@ComponentScan("com")
@EntityScan("com")
public class MyspringappApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyspringappApplication.class, args);
		System.out.println("hi..");
	}

}
 
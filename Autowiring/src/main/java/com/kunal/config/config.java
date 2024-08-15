package com.kunal.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;


@Configuration
public class config {
	@Bean
	public Address add() {
		return new Address("First Bean");
	}
	
	
	@Bean(name= {"emps"})
	public Emp getEmp() {
		return new Emp(add());
	}

}

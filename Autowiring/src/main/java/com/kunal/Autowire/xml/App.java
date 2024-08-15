package com.kunal.Autowire.xml;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.ApplicationContext;

public class App {
	public static void main(String args[]) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/kunal/Autowire/xml/config.xml");

		Student st = context.getBean("st", Student.class);
		System.out.println(st);
	}
}

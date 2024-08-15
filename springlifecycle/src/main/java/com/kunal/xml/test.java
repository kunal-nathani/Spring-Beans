
//Lifecycle of Bean
package com.kunal.xml;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.ApplicationContext;

public class test {
	public static void main(String args[]) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/kunal/xml/config.xml");
		
		context.registerShutdownHook();
		
		Student st = context.getBean("st1", Student.class);
		System.out.println(st);
	}
}

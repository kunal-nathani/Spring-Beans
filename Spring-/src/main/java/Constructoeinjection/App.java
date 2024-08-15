package Constructoeinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
public static void main(String args[]) {
		
		ApplicationContext context= new ClassPathXmlApplicationContext("Constructoeinjection/config.xml");
//		//ambigity issue 
//		Student st = context.getBean("st",Student.class);
//		Student st1 = context.getBean("st1",Student.class);
//		System.out.println(st);
//		System.out.println(st1);
		
		Student st1 = context.getBean("st1", Student.class);
		System.out.println(st1);
	}

}

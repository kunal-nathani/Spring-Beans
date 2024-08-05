package com.kunal.First_Spring_App;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

    	ApplicationContext context = new ClassPathXmlApplicationContext("com/kunal/First_Spring_App/config.xml");
    	System.out.println(context);
    	
    	Ram sh= context.getBean("person",Ram.class);
    	sh.eat();
    	sh.sleep();
    }
}

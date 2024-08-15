package autowireannot;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.ApplicationContext;

public class App {
public static void main(String args[]) {
	ApplicationContext context = new ClassPathXmlApplicationContext("autowireannot/config.xml");
	
	Student student= context.getBean("st",Student.class);
	System.out.println(student);
}
}

package com.kunal.Daojava;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.kunal.DAO.StudentDao;
import com.kunal.model.Student;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) throws SQLException {
		ApplicationContext context = new AnnotationConfigApplicationContext(config.class);


		StudentDao dao = context.getBean("stDao", StudentDao.class);
//		 Insert
//		Student st = new Student();
		/*
		 * st.setId(5); st.setName("LOVE"); st.setAddress("LY");
		 * 
		 * int i = dao.insert(st); System.out.println("insert successful" + i);
		 */

		
//		 st.setId(5); st.setName("Gunner op");
//		 st.setAddress("Goa1");
//		 
//		  int i = dao.UpdateDetails(st); System.out.println("updated successful"+i);
//		 

		/*
		 * Delete data int i = dao.delete(5);
		 * System.out.println("Deleted successful"+i);
		 */

		/*
		 * Particulardata of student*/ 
		  Student st = dao.getStudentById(2);
		  System.out.println(st);
		 

		/*
		 * List<Student> list = dao.getAllStudent(); for (Student sts : list) {
		 * System.out.println(sts); }
		 */
	}
}

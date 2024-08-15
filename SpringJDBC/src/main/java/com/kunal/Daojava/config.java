package com.kunal.Daojava;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.kunal.DAO.StudentDao;
import com.kunal.DAO.StudentDaoimpl;

@Configuration
@ComponentScan(basePackages = "com.kunal.dao")

public class config {

	@Bean
	public DataSource getDataSource() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("com.mysql.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://Localhost:3306/spring_jdbc?useSSL=false");
		dataSource.setUsername("root");
		dataSource.setPassword("Kunal@123");
		return dataSource;

	}
	@Bean("jdbc")
	public JdbcTemplate getJdbcTemplate(){
		JdbcTemplate jd = new JdbcTemplate();
		jd.setDataSource(getDataSource());
		return jd;
	}
	
//	@Bean("stDao")
//	public StudentDao studentDao() {
//		StudentDaoimpl dao = new StudentDaoimpl(); 
//		dao.setJdbcTemplate(getJdbcTemplate());
//		return dao;
//	}
}

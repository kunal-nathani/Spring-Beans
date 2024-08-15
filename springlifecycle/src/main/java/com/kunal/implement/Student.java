package com.kunal.implement;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
//java based using implementations of class without writing anything in xml file
public class Student implements InitializingBean,DisposableBean{
	private int id;
	private String name;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}

	@Override
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Destroyed obj");
		
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Initialize obj");
	}

	
}

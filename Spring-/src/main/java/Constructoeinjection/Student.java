package Constructoeinjection;

import java.util.List;

public class Student {
	private int id;
	private String name;
	private String address;
	private List<String> course;
	private Certificate certificate;
	
	
	public Student(int id, String name, String address, List<String> course, Certificate certificate) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.course = course;
		this.certificate = certificate;
	}
	
	
	public Student(int id, String name) {
		super();
		System.out.println("int string");
		this.id = id;
		this.name = name;
	}
	public Student(String name,int id) {
		super();
		System.out.println("string int");
		this.id = id;
		this.name = name;
	}
	public Student(String name, String address) {
		super();
		System.out.println("String string");
		this.name = name;
		this.address = address;
	}
//	@Override
//	public String toString() {
//		return "Student [id=" + id + ", name=" + name + ", address=" + address + "]";
//	}


	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", address=" + address + ", course=" + course + ", certificate="
				+ certificate + "]";
	}
	
}

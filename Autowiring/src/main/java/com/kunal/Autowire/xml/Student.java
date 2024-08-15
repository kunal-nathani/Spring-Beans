package com.kunal.Autowire.xml;

public class Student {
	private Address address;

	public Student(Address address) {
		super();
		System.out.println("Constructor Called");
		this.address = address;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Student [address=" + address + "]";
	}
}

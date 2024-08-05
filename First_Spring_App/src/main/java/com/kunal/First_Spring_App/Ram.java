package com.kunal.First_Spring_App;



public class Ram implements Action{
	 public Ram() {
		 System.out.println("RAM Object Created");
	 }
	public void eat() {
		System.out.println("Ram is Eating");
	}
	public void sleep() {
		System.out.println("Ram is Sleeping");
	}
}

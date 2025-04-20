package com.spring.bean;

//this class is created for the select query in the main method (app class) it's required for this.
public class Student {
	private int rollno;
	private String name;
	private float marks;
	
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getMarks() {
		return marks;
	}
	public void setMarks(float marks) {
		this.marks = marks;
	}
}

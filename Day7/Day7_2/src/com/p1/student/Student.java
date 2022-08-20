package com.p1.student;

import java.util.Arrays;

public class Student {
	 String name;
	 int rollno;
	 int[] m = new int[3];
	 Date dob = new Date();
	public Student() {
		
	}
	public Student(String name, int rollno, int[] m, Date dob) {
		super();
		this.name = name;
		this.rollno = rollno;
		this.m = m;
		this.dob=dob;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public int[] getM() {
		return m;
	}
	public void setM(int[] m) {
		this.m = m;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", rollno=" + rollno + ", m=" + Arrays.toString(m) + ", dob=" + dob + "]";
	}
	
	
}

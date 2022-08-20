package com.p1.student;



public class Student {
	 private  String name;
	 private  int rollno;
	 private int m1 ;
	 private int m2 ; 
	 private int m3 ; 
	 
	 
	
	public Student() {
		
	}
	
	public Student(String name, int rollno, int m1, int m2, int m3) {
		
		this.name = name;
		this.rollno = rollno;
		this.m1 = m1;
		this.m2 = m2;
		this.m3 = m3;
	}

	public String getName() {
		return name;
	}
	public  void setName(String name) {
		this.name = name;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	
	public int getM1() {
		return m1;
	}
	public void setM1(int m1) {
		this.m1 = m1;
	}
	public int getM2() {
		return m2;
	}
	public void setM2(int m2) {
		this.m2 = m2;
	}
	public int getM3() {
		return m3;
	}
	public void setM3(int m3) {
		this.m3 = m3;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", rollno=" + rollno + ", m1=" + m1 + ", m2=" + m2 + ", m3=" + m3 + "]";
	}
	
	
}

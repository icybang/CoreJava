package com.p1.student;
import java.util.Scanner;

public class StudentFunctionality {
	
	public static void accept(Student s) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the name: ");
		s.setName(sc.next());
		
		System.out.print("Enter the roll no: ");
		s.setRollno(sc.nextInt());
		
		System.out.print("Enter the 3 subjects marks: ");
		System.out.println();
		
		System.out.print("Enter the marks in 1st subject: ");
		s.setM1(sc.nextInt());
		
		System.out.print("Enter the marks in 2nd subject: ");
		s.setM2(sc.nextInt());
		
		System.out.print("Enter the marks in 3rd subject: ");
		s.setM3(sc.nextInt());
		
		sc.close();
	}
	public static float calculate_avg(Student s)
	{
		float avg;
		avg = (s.getM1()+s.getM2()+s.getM3())/3;
		return avg;
		
	}
	public static  String generate_grade(float avg)
	{
		if(avg>75) return "A";
		else if(avg>50) return "B";
		else return "C";
		
	}
	
}

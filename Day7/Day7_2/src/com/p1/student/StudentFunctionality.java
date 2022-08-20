package com.p1.student;
import java.util.Scanner;

public class StudentFunctionality {
	
	public static void accept(Student s) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the name: ");
		s.name = sc.next();
		
		System.out.println("Enter the roll no: ");
		s.rollno = sc.nextInt();
		
		System.out.println("Enter the 3 subjects marks");
		for(int i = 0;i<s.m.length ; i++)
			s.m[i]=sc.nextInt();
		
		System.out.println("Enter date of birth");
		
		System.out.println("Enter day:");
		s.dob.day = sc.nextInt();
		
		System.out.println("Enter month:");
		s.dob.month = sc.nextInt();
		
		System.out.println("Enter year:");
		s.dob.year = sc.nextInt();
		
		sc.close();
	}
	public static float calculate_avg(Student s)
	{
		float avg;
		avg = (s.m[0]+s.m[1]+s.m[2])/3;
		return avg;
		
	}
	public static  String generate_grade(float avg)
	{
		if(avg>75) return "A";
		else if(avg>50) return "B";
		else return "C";
		
	}
	
}

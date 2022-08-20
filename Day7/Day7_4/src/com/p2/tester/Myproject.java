package com.p2.tester;

import com.p1.student.Student;
import static com.p1.student.StudentFunctionality.*;


public class Myproject {

	public static void main(String[] args) {
		Student s = new Student();
		accept(s);
		float avg = calculate_avg(s);
		System.out.println("Your grade is "+generate_grade(avg));

	}

}

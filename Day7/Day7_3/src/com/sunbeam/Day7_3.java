package com.sunbeam;

import java.util.Arrays;
import java.util.Scanner;

public class Day7_3 {

	public static void main(String[] args) {
		int [] a = new int [5];
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the array element:");
		for(int i=0 ; i<a.length ; i++)
			a[i] = sc.nextInt();
		
		
		System.out.println("Array element are :");
		System.out.println(Arrays.toString(a));
		
		System.out.println("Array element are :");
		for(int i=0 ; i<a.length ; i++)
			System.out.print(a[i]+"\t"); 
		
		sc.close();
	}

}

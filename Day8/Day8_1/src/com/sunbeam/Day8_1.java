package com.sunbeam;

import java.util.Scanner;

public class Day8_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//int [] a= new int[5];
		//System.out.println(a[5]);  //ArrayIndexOutOfBoundsException
		//int arr[] = null; //valid
		
		int [][] arr = new int[3][3];
		
		System.out.println("Enter the Array element");
		for(int i=0 ; i<arr.length ; i++)
			for(int j=0;j<arr[i].length ; j++)
				arr[i][j] = sc.nextInt();
				
				
		System.out.println("Array element");
		for(int []row : arr)
		{
			for(int value : row)
			{
				System.out.print(value+"\t"); 
				
			}
			System.out.println();
		}
			
				
		sc.close();
		
	}

}

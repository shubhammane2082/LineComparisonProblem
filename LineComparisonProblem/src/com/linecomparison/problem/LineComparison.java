package com.linecomparison.problem;

import java.util.Scanner;

public class LineComparison {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Please Enter the Value of x1Line1 : ");
		int x1Line1=sc.nextInt();
		
		System.out.println("Please Enter the Value of x2Line1 : ");
		int x2Line1=sc.nextInt();
		
		System.out.println("Please Enter the Value of y1Line1 : ");
		int y1Line1=sc.nextInt();
		
		System.out.println("Please Enter the Value of y2Line1 : ");
		int y2Line1=sc.nextInt();
		
		LengthLine1 length1=new LengthLine1();
		length1.CalculateLengthLine1(x1Line1, x2Line1, y1Line1, y2Line1);
		
		

	}

}

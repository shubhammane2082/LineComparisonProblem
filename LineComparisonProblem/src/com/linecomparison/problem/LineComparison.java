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
		
		System.out.println("Please Enter the Value of x1Line2 : ");
		int x1Line2=sc.nextInt();
		
		System.out.println("Please Enter the Value of x2Line2 : ");
		int x2Line2=sc.nextInt();
		
		System.out.println("Please Enter the Value of y1Line2 : ");
		int y1Line2=sc.nextInt();
		
		System.out.println("Please Enter the Value of y2Line2 : ");
		int y2Line2=sc.nextInt();
		
		LengthLine1 length1=new LengthLine1();
		int Line1Result=length1.CalculateLengthLine1(x1Line1, x2Line1, y1Line1, y2Line1);
		System.out.println("Length of Line One is : "+Line1Result);
		
		LengthLine2 length2=new LengthLine2();
		int Line2Result=length1.CalculateLengthLine1(x1Line2, x2Line2, y1Line2, y2Line2);
		System.out.println("Length of Line Two is : "+Line2Result);
		
		int LengthResult=Integer.compare(Line1Result, Line2Result);
		
		LineLengthResult result=new LineLengthResult();
		result.display(LengthResult);
	}

}

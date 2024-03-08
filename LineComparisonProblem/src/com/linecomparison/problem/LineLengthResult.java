package com.linecomparison.problem;

public class LineLengthResult 
{
	public void display(int Allresult)
	{
		if(Allresult ==0)
		{
			System.out.println("Two Lines are equal...");
		}
		else if(Allresult == 1)
		{
			System.out.println("Length of Line 1 is Greater");
		}
		else if(Allresult == -1)
		{
			System.out.println("Length of Line 2 is Greater");
		}
		else 
		{
			System.out.println("No Result");
		}
	}

}

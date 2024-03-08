package com.linecomparison.problem;

public class LengthLine1 {

	public int CalculateLengthLine1(int x1Line1, int x2Line1, int y1Line1,int y2Line1)
	{
		int difference1=x2Line1-x1Line1;
		int difference2=y2Line1-y1Line1;

		int result1=(int)Math.pow(difference1, 2);
		int result2=(int)Math.pow(difference2, 2);

		int totalresult1=result1+result2;

		int LengthofLine1=(int)Math.sqrt(totalresult1);
		
		return LengthofLine1;
   }
	
}
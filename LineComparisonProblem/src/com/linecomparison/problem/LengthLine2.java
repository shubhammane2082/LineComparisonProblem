package com.linecomparison.problem;

public class LengthLine2 
{
	public void CalculateLengthLine2(int x1Line2, int x2Line2, int y1Line2, int y2Line2)
	{
		int difference1=x2Line2-x1Line2;
		int difference2=y2Line2-y1Line2;

		int result1=(int)Math.pow(difference1, 2);
		int result2=(int)Math.pow(difference2, 2);

		int totalresult1=result1+result2;

		int LengthofLine1=(int)Math.sqrt(totalresult1);
		System.out.println("Length of Line Two is : "+LengthofLine1);
	}

}

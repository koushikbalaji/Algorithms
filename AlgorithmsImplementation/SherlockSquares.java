package AlgoImplementation;

import java.util.Scanner;

public class SherlockSquares {
	
	public static int findSquares(int a, int b)
	{
		int squares=0;
		double first=0.0;
		double second=0.0;
		
		for(int i=a;i<=b;i++)
		{
			double x= Math.sqrt(i);
			if(Math.floor(x)==x)
			{
				first=x;
				System.out.println(first);
				break;
			}
		}
		

		for(int i=b;i>=a;i--)
		{
			double x= Math.sqrt(i);
			if(Math.floor(x)==x)
			{
				second=x;
				System.out.println(second);
				break;
			}
		}
		
		if(second==0&&first==0)
        {
        squares=0;
    }
    else
        {
    squares=(int)(second-first+1);
    }
		return squares;
	}
	
	public static void main(String ar[])
	{
		Scanner scan=new Scanner(System.in);
		int testCase=scan.nextInt();
		int output[]=new int[testCase];
		
		for(int i=1;i<=testCase;i++)
		{
			int a=scan.nextInt();
			int b=scan.nextInt();
			output[i-1]=findSquares(a,b);
			
		}
		
		for(int i=0;i<output.length;i++)
		{
			System.out.println(output[i]);
		}
		scan.close();
	}
}

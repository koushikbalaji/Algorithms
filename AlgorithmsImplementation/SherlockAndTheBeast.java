package AlgoImplementation;

import java.util.Scanner;

public class SherlockAndTheBeast {
	
	public static StringBuilder findDecent(int num)
	{
		StringBuilder decentNum=new StringBuilder();
		
		if(num==1||num==2||num==4)
		{
			decentNum=new StringBuilder("-1");
		}
			else if(num==5||num==10)
			{
				decentNum=repeatString(decentNum,num,"3");
			}
				else if(num%3==0)
				{
					decentNum=repeatString(decentNum,num,"5");
				}
				else if(findFactor(num)!=0)
				{
					int factor=findFactor(num);
					decentNum=repeatString(decentNum,num-factor,"5");
					decentNum=repeatString(decentNum,factor,"3");
				}
				else
				{
					decentNum=new StringBuilder("-1");	
				}
		
		return decentNum;
	}

	public static StringBuilder repeatString(StringBuilder decentNum,int num, String digit)
	{
		for(int i=1;i<=num;i++)
		{
			decentNum.append(digit);
		}
		return decentNum;
	}
	
	
	public static int findFactor(int num)
	{
		int factor=0;
		for(int i=0;5*i<=num;i++)
		{
			if((num-5*i)%3==0)
			{
				factor=5*i;
				return factor;
			}
		}
		
		return factor;
	}
	public static void main(String ar[])
	{
		Scanner scan=new Scanner(System.in);
		int testCase=scan.nextInt();
		StringBuilder output[]=new StringBuilder[testCase];
		
		
		for(int i=1;i<=testCase;i++)
		{
			int num=scan.nextInt();
			output[i-1]=findDecent(num);
			
		}
		
		for(int i=0;i<output.length;i++)
		{
			System.out.println(output[i]);
		}
		
		scan.close();
	}
	
}

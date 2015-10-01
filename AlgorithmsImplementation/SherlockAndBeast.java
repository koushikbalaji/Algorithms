package AlgoImplementation;

import java.util.Scanner;

public class SherlocakAndBeast {

	public static String findDecent(int num)
	{
		
		String decentNum="no case";
		
		if(num==1)
		{
			decentNum="-1";
		}
			else if(num>10&&(num-5)%3==0)
			{
//				System.out.println("inside num");
				decentNum=new String(new char[num-5]).replace("\0", "5")+new String(new char[5]).replace("\0", "3");
//				System.out.println(decentNum);
			}
		
			else if(num%5==0)
			{
				decentNum=new String(new char[num]).replace("\0", "3");
			}
				else if(num%3==0)
				{
					decentNum=new String(new char[num]).replace("\0", "5");
				}
						else if(findFactor(num)!=0)
						{
							int factor=findFactor(num);
						decentNum=new String(new char[num-factor]).replace("\0", "5")+new String(new char[factor]).replace("\0", "3");
						}
							else if(num%2==0)
							{
								decentNum="-1";
							}
								else
								{
									decentNum="-1";
								}
			
		return decentNum;
		
	}
	
	public static int findFactor(int num)
	{
		int factor=0;
		
		for(int i=1;i*3<num;i++)
		{
			
			if((num-(3*i))%5==0)
			{
				factor=num-(3*i);
//				System.out.println("factro "+factor);
				break;
			}
		}
		
		
		return factor;
	}
	
/*	public static String multiplyString(String text,int num)
	{
		
		String temp=text;
		
		for(int i=1;i<num;i++)
		{
			text=text+temp;
		}
		return text;
	}*/
	

	public static void main(String ar[])
	{
		Scanner scan=new Scanner(System.in);
		int testCase=scan.nextInt();
		String output[]=new String[testCase];
		
		
		for(int i=1;i<=testCase;i++)
		{
			int num=scan.nextInt();
			output[i-1]=new String(findDecent(num));
			
		}
		
		for(int i=0;i<output.length;i++)
		{
			/*if(output[i].length()<4000)
			{
			System.out.append(output[i]);
			}
			else
			{
				System.out.println(output[i].substring(0, 4000));
				System.out.println(output[i].substring(4000));
			}*/
			
			System.out.println(output[i]);
		}
		
		scan.close();
	}
	/*input 9
	20
	69835
	97167
	9909
	14953
	81707
	9283
	66850
	98100
	50170
	4317
	65154
	68262
	42750
	98509
	46974
	98203
	6181
	34738
	1795
	78539*/
	
}

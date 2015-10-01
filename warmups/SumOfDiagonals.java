package Warmups;
import java.util.Scanner;
import java.lang.Math;


public class SumOfDiagonals {

	public static int SumOf()
	{
		int sum=0;
		Scanner scan = new Scanner(System.in);
		int length = scan.nextInt();
		//System.out.println("length "+length);
		int elements[][]=new int[length][length];
		for(int i=0;i<length;i++)
		{
			for(int j=0;j<length;j++)
			{
				
				elements[i][j]=scan.nextInt();
				//System.out.println(i+","+j+","+elements[i][j]);
			}
			
		}
		
		for(int i=0;i<length;i++)
		{
			for(int j=0;j<length;j++)
			{
				System.out.println(elements[i][j]+" ");
			}
			System.out.println();}
		
		int a=0,b=0;
		
		for(int k=0;k<length;k++)
		{
			 a=a+elements[k][k];
			 
			
		}
		
		int k=0;
		for(int m=length-1;m>=0;m--)
		{
			
			 b=b+elements[m][k];
			 k++;
			 
			
		}
		
		sum=a-b;
		
		scan.close();
		return Math.abs(sum);
		
		
	}
	
	public static void main(String ar[])
	{
		System.out.println(SumOf());
		
	}
	
}

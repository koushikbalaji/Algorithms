package AlgoImplementation;

import java.util.Scanner;

public class UtopianTree {
	
	public static int findGrowth(int cycles)
	{
		int growth=1;
		
		for(int i=1;i<=cycles;i++)
		{
			if(i%2==0)
			{
				growth=growth+1;
			}
			else{
				growth=growth*2;
			}
		}
		return growth;
	}
	
	public static void main(String ar[])
	{
		Scanner scan=new Scanner(System.in);
		int testCase=scan.nextInt();
		int output[]=new int[testCase];
		
		
		
		for(int i=1;i<=testCase;i++)
		{
			int cycles=scan.nextInt();
			
	
			
			output[i-1]=findGrowth(cycles);
			
		}
		
		for(int i=0;i<output.length;i++)
		{
			System.out.println(output[i]);
		}
		
		scan.close();
	}
}

package SearchAlgos;

import java.util.Scanner;

public class LeftandRightSum {
	public static void main(String ar[])
		{
		Scanner scan= new Scanner(System.in);
		int testCases=scan.nextInt();
		for(int i=0;i<testCases;i++)
		OUTER:
		{
			int size=scan.nextInt();
		
			int[] input=new int[size];
			for(int j=0;j<size;j++)
				input[j]=scan.nextInt();
			if(size==1)
			{
			System.out.println("YES");
			break OUTER;
			}
			int[] leftSum=new int[size];
			int[] rightSum=new int[size+1];
			rightSum[size]=0;
			int leftSumCounter=0,rightSumCounter=0;
			for(int j=0;j<size;j++)
			{
				leftSumCounter=leftSumCounter+input[j];
				leftSum[j]=leftSumCounter;
			}
			for(int j=size-1;j>=0;j--)
			{
				rightSumCounter=rightSumCounter+input[j];
				rightSum[j]=rightSumCounter;
			}
			
			for(int j=1;j<size;j++)
			{
				if(leftSum[j-1]==rightSum[j+1])
				{
					System.out.println("YES");
					break OUTER;
				}
			}
			System.out.println("NO");
		}
		
		}
}

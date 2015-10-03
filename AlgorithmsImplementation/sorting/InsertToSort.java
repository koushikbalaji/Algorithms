package sorting;

import java.util.Scanner;

public class InsertToSort {
	
	public static void insertAndSort(int arrayGiven[])
	{
		int length=arrayGiven.length;
		int toBeSorted=arrayGiven[length-1];
		int lastElement=length-1;
		
		for(int i=lastElement;i>=0;i--)
		{
			if(i==0)
			{
				arrayGiven[i]=toBeSorted;
				for(int j=0;j<arrayGiven.length;j++)
				{
					System.out.print(arrayGiven[j]+" ");
					
				}
				return;
			}
			if(toBeSorted<arrayGiven[i-1])
			{
				arrayGiven[i]=arrayGiven[i-1];
				for(int j=0;j<arrayGiven.length;j++)
				{
					System.out.print(arrayGiven[j]+" ");
				}
					System.out.println();
			}
			
			else
			{
				arrayGiven[i]=toBeSorted;
				for(int j=0;j<arrayGiven.length;j++)
				{
					System.out.print(arrayGiven[j]+" ");
					
				}
				return;
			}
		}
	}

	public static void main(String ar[])
	{
	Scanner scan=new Scanner(System.in);
	int size=scan.nextInt();
	int arrayGiven[]=new int[size];


	for(int i=0;i<size;i++)
	{
		arrayGiven[i]=scan.nextInt();
		}

	insertAndSort(arrayGiven);
	scan.close();
	}
}

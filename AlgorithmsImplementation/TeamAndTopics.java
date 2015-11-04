package AlgoImplementation;

import java.math.BigInteger;
import java.util.BitSet;
import java.util.Scanner;

public class TeamAndTopics {
	
	
	public static void main(String ar[])
	{
		Scanner scan=new Scanner(System.in);
		int number=scan.nextInt();
		int topics=scan.nextInt();
		Boolean check=true;
		BitSet[] data=new BitSet[number];
		for(int i=0;i<number;i++)
		{
			String tempString=scan.next();
			data[i]=new BitSet(tempString.length());
			for(int j=0;j<tempString.length();j++)
			{
				if(tempString.charAt(j)=='1')
				data[i].set(j,check);
			}
		}
		
	
		int maxTopics=Integer.MIN_VALUE;
		int maxTeams=0;
		for(int i=0;i<data.length;i++)
		{
			for(int j=i+1;j<data.length;j++)
			{
				int tempCount=0;
				BitSet temp=new BitSet();
				temp.or(data[i]);
				temp.or(data[j]);
				
				tempCount=temp.cardinality();
				
				if(tempCount>maxTopics)
				{
					maxTopics=tempCount;
					maxTeams=1;
				}
				else if(maxTopics==tempCount)
				{
					maxTeams++;
				}
				
			}
		}
		System.out.println(maxTopics);
		System.out.println(maxTeams);
	}

}

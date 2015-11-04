package AlgoImplementation;

import java.math.BigInteger;
import java.util.Scanner;

public class TeamAndTopics {
	
	
	public static void main(String ar[])
	{
		Scanner scan=new Scanner(System.in);
		int number=scan.nextInt();
		int topics=scan.nextInt();
		
		String[] data=new String[number];
		for(int i=0;i<number;i++)
		{
			data[i]=scan.next();
		}
		
	
		int maxTopics=Integer.MIN_VALUE;
		int maxTeams=0;
		for(int i=0;i<data.length;i++)
		{
			for(int j=i+1;j<data.length;j++)
			{
				String tempString;
				int tempCount=0;
				BigInteger tempInt=new BigInteger(data[i]);
				BigInteger tempInt2=new BigInteger(data[j]);
				tempInt=tempInt.add(tempInt2);
				tempString=tempInt.toString();
				for(int k=0;k<tempString.length();k++)
				{
					if(tempString.charAt(k)=='0')
					{
						tempCount++;
					}
				}
				tempCount=tempString.length()-tempCount;
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

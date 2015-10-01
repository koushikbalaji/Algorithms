package AlgoImplementation;

import java.util.Scanner;

public class AngryProfessor {

	public static String checkClass(int condition[],int time[])
	{
		String result=null;
		int lateComers=0;
		
		for(int i=0;i<time.length;i++)
		{
			if(time[i]>0)
			{
			lateComers++;	
			}
			
		}
		
		if(lateComers>condition[0]-condition[1])
		{
			result="YES";
		}
		else
		{
			result="NO";
		}
//		System.out.println(condition[1]+" "+lateComers);
		return result;
	}
	
	public static void main(String ar[])
	{
		Scanner scan=new Scanner(System.in);
		int testCase=scan.nextInt();
		String output[]=new String[testCase];
		
		
		
		for(int i=1;i<=testCase;i++)
		{
			int totalNo=scan.nextInt();
			int requiredNo=scan.nextInt();
			int condition[];
			int time[] = new int[totalNo];
			condition=new int[]{totalNo,requiredNo};
			
			for(int j=0;j<totalNo;j++)
			{
				time[j]=scan.nextInt();
			}
			
			output[i-1]=new String(checkClass(condition,time));
			
		}
		
		for(int i=0;i<output.length;i++)
		{
			System.out.println(output[i]);
		}
		
		scan.close();
	}
	
}

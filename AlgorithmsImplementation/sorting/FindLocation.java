package sorting;

import java.util.Arrays;
import java.util.Scanner;

public class FindLocation {
	
public static int findLocation(int arrayGiven[],int value)
{ 
	int location=0;
	int size=arrayGiven.length;
	
	if(size<=3)
	{
		
	}
	
	int half=size/2;
	int mid=arrayGiven[half];
	if(value==mid)
	{
		location=half;
		return location; 
	}
	
		else if(value>mid)
		{
			location=findLocation(Arrays.copyOfRange(arrayGiven, half-1, size-1),value);
		}
	
			else if(value<mid)
			{
				location=findLocation(Arrays.copyOfRange(arrayGiven, 0, half-1),value);
			}
				else
				{
					location=-1;
				}
	return location;
	}

public static int findLocationBrute(int arrayGiven[],int value)
{//needs some changes. Come back later
	int location=-1;
	for(int i=0;i<arrayGiven.length;i++)
	{
		if(arrayGiven[i]==value)
		{
			location=i;
			return location;
		}
		
	}
	
	return location;
	}

public static void main(String ar[])
{
Scanner scan=new Scanner(System.in);
int value=scan.nextInt();
int size=scan.nextInt();
int arrayGiven[]=new int[size];


for(int i=0;i<size;i++)
{
	arrayGiven[i]=scan.nextInt();
	}

System.out.println(findLocationBrute(arrayGiven,value));
scan.close();
}
}

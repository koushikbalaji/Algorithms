package GraphTheory;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class QuickestWayUp {
	
	public static int findQuickestWayUp(HashMap<Integer,ArrayList> laddersMap,HashMap<Integer,ArrayList> snakesMap)
	{
		int noOfMoves=0;
		ArrayList maxLadder=laddersMap.get(findMaxLadder(laddersMap));
		int startSquare=(int)maxLadder.get(0);
//		System.out.println(startSquare);
		int endSquare=(int)maxLadder.get(1);
//		System.out.println(endSquare);
		
		int square;
		
		//move till foot of biggest ladder
		for(square=1;square<=startSquare;square++)
		{
		if(!(checkIfSnake(snakesMap,square)))
		{
			square=square+6;
			noOfMoves++;
		}
		else
		{
			square=square-1;
		}
		}
		
		if(square<startSquare)
		{
			noOfMoves++;
		}
		
//		System.out.println(noOfMoves);
		
		//move till top of ladder till 100
		for(square=endSquare;square<=100;square++)
		{
		if(!(checkIfSnake(snakesMap,square)))
		{
			square=square+6;
			noOfMoves++;
		}
		else
		{
			square=square-1;
		}
		}
		
		if(square<startSquare)
		{
			noOfMoves++;
		}
		
		return noOfMoves;
	}
	

	public static boolean checkIfSnake(HashMap<Integer,ArrayList> snakesMap,int i)
	{
		Boolean check=false;
		
		//check if given square has a snake head
		for(Integer key:snakesMap.keySet())
		{
		if((int)snakesMap.get(key).get(0)==i)
		{
			check=true;
		}
		}
		
		return check;
	}
	
	public static int findMaxLadder(HashMap<Integer,ArrayList> laddersMap)
	{
		int maxLadder=0;
		for(Integer key:laddersMap.keySet())
		{
		if((int)laddersMap.get(key).get(2)>maxLadder)
		{
			maxLadder=key;
		}
		}
		return maxLadder;
	}
	
	
	
	public static void main(String ar[])
	{
		Scanner scan=new Scanner(System.in);
		int testCases=scan.nextInt();
		ArrayList<Integer> moves=new ArrayList();
		for(int i=1;i<=testCases;i++)
		{
			//getting ladders
			int ladders=scan.nextInt();
			HashMap<Integer,ArrayList> laddersMap=new HashMap<Integer,ArrayList>();
			for(int j=1;j<=ladders;j++)
			{
				ArrayList laddersList=new ArrayList();
				int a=scan.nextInt();
				int b=scan.nextInt();
				laddersList.add(a);
				laddersList.add(b);
				laddersList.add(b-a);
				laddersMap.put(j,laddersList);
			}
			
			//getting snakes
			int snakes=scan.nextInt();
			HashMap<Integer,ArrayList> snakesMap=new HashMap<Integer,ArrayList>();
			for(int j=1;j<=snakes;j++)
			{
			
				ArrayList<Integer> snakesList=new ArrayList();
				if(scan.hasNext())
				{
				int a=scan.nextInt();
				int b=scan.nextInt();
				snakesList.add(a);
				snakesList.add(b);
				}
//				System.out.println(a+" "+b);
				snakesMap.put(j,snakesList);
			}
		int movesMade=findQuickestWayUp(laddersMap,snakesMap);
		moves.add(movesMade);
		}
		
		for(int i=0;i<moves.size();i++)
		{
			System.out.println(moves.get(i));
		}
//		scan.close();
	}
	
}

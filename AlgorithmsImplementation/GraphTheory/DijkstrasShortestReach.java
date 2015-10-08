package GraphTheory;

import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class DijkstrasShortestReach {
	
	@SuppressWarnings("unchecked")
	public static int[][] findShortestReach(int[][] adjacencyMatrix,int source,int nodes)
	{
		HashMap distances=new HashMap();
		distances.put(source, 0);
		int closestToSource=findClosest(adjacencyMatrix,source,distances);
//		if(closestToSource==-1)
//		{
//			distances.put(closestToSource,adjacencyMatrix[source][closestToSource]);
//			closestToSource=findClosest(adjacencyMatrix,source,distances);
//		}
		distances.put(closestToSource,adjacencyMatrix[source][closestToSource]);
		int node;
		
		for(int i=0;i<nodes;i++)
		{
			if(!(distances.containsKey(i)))
			{
			node=findClosest(adjacencyMatrix,closestToSource,distances);
			adjacencyMatrix[source][node]=adjacencyMatrix[source][closestToSource]+adjacencyMatrix[closestToSource][node];
			adjacencyMatrix[node][source]=adjacencyMatrix[source][closestToSource]+adjacencyMatrix[closestToSource][node];
			distances.put(node, adjacencyMatrix[source][node]);
			node=closestToSource;
			}
		}
		
		
		return adjacencyMatrix;
	}
	

	public static int findClosest(int[][] adjacencyMatrix,int source,HashMap distances)
	{
		int nearest=-1;
		int min=Integer.MAX_VALUE;;
		
		for(int i=0;i<adjacencyMatrix.length;i++)
		{
			if(!(i==source||distances.containsKey(i)))
			{
				if(adjacencyMatrix[source][i]>0)
				{
					if(adjacencyMatrix[source][i]<min)
					{
					min=adjacencyMatrix[source][i];
					nearest=i;
					}
				}
			}
		}
		return nearest;
	}

	public static void main(String ar[]) 
	{

		Scanner scan=new Scanner(System.in);
		int testCases=scan.nextInt();
		
		//for every test case
		for(int i=1;i<=testCases;i++)
		{
			int nodes=scan.nextInt();
//			System.out.println(nodes);
			int edges=scan.nextInt();
//			System.out.println(edges);
			int adjacencyMatrix[][]=new int[nodes][nodes];
			
			
			//initialize array with -1
			for(int row=0;row<nodes;row++)
			{
				for(int col=0;col<nodes;col++)
				{
					if(row==col)
					{
						adjacencyMatrix[row][col]=0;
					}
					else
					{
					adjacencyMatrix[row][col]=-1;
					adjacencyMatrix[col][row]=-1;
					}
				}
			}
			
			//fill up adjacency Matrix with user inputs
			int j=0;
			while(j<edges)
				{
				int a=scan.nextInt();
				int b=scan.nextInt();
				int length=scan.nextInt();
//				System.out.println(a+" "+b+" "+length);
				if(adjacencyMatrix[a-1][b-1]==-1)
				{
					adjacencyMatrix[a-1][b-1]=length;
					adjacencyMatrix[b-1][a-1]=length;
				}
				else if(length<=adjacencyMatrix[a-1][b-1])
				{
					adjacencyMatrix[a-1][b-1]=length;
					adjacencyMatrix[b-1][a-1]=length;
				}
				j++;
				}			
			
			int source=scan.nextInt()-1;
//			System.out.println(source);
			
			adjacencyMatrix=findShortestReach(adjacencyMatrix,source,nodes);
			
			for(int node=0;node<nodes;node++)
			{
				if(node!=source)
				System.out.print(adjacencyMatrix[source][node]+" ");
			}
			System.out.println();
		}

		scan.close();
	}
	
}

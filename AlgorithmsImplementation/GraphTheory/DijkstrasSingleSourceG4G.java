package GraphTheory;

import java.util.Scanner;

public class DijkstrasSingleSourceG4G {
	
	public static void dijkstra(int adjacencyMatrix[][], int source)
	{
		int nodes=adjacencyMatrix.length;
		int distance[]=new int[adjacencyMatrix.length];//output array d[i] shortest distance from source to i
		Boolean[] treeSet=new Boolean[adjacencyMatrix.length];//treeSet[i] true if i's distance is already found
		
		//initialize treeSet and distance array as false and infinite respectively
		for(int i=0;i<nodes;i++)
		{
			distance[i]=Integer.MAX_VALUE;
			treeSet[i]=false;
		}
		
		//distance of source to itself is zero
		distance[source]=0;
		
		//finding shortest path
		for(int count=0;count<nodes-1;count++)
		{
			int u=minDistance(distance,treeSet);
			treeSet[u]=true;
			
			//update distance vertex of adjacent vertices
			for(int v=0;v<nodes;v++)
			{
				if(!treeSet[v]&&adjacencyMatrix[u][v]>0&&distance[u]!=Integer.MAX_VALUE&&(distance[u]+adjacencyMatrix[u][v]<distance[v]))
				{
					distance[v]=distance[u]+adjacencyMatrix[u][v];
				}
			}
		}
		
		for(int k=0;k<nodes;k++)
		{
			if(k!=source)
			System.out.print(distance[k]+" ");
		}
		System.out.println();
	}

	public static int minDistance(int distance[],Boolean[] treeSet)
	{
		int min=Integer.MAX_VALUE;
		int minIndex=0;
		
		for(int v=0;v<distance.length;v++)
		{
			if(treeSet[v]==false&&distance[v]<=min)
			{
				min=distance[v];
				minIndex=v;
				
			}
		}
		return minIndex;
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
			dijkstra(adjacencyMatrix,source);
		}
		scan.close();
	}
	
	
}

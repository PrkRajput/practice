package graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class Graph {
///////// A list of lists to represent adjacency list
		List<List<Node>> adj = new ArrayList<>();
		
//////////////////////// Constructor to construct graph //////////////////////////////
		public Graph(List<Edge> edges)
		{
			// allocate memory for adjacency list
			for (int i = 0; i < edges.size(); i++)
				adj.add(i, new ArrayList<>());

			// add edges to the undirected graph
			for (Edge e : edges)
			{
				// allocate new node in adjacency List from src to dest
				adj.get(e.src).add(new Node(e.dest, e.weight));

				// undirected graph
				// allocate new node in adjacency List from dest to src
				// adj.get(e.dest).add(new Node(e.src, e.weight));
			}
		}
////////////////// print adjacency list representation of graph //////////////////////
		public void printGraph(Graph graph)
		{
			int src = 0;
			int n = graph.adj.size();

			while (src < n)	{
				// print current vertex and all its neighboring vertices
				for (Node edge : graph.adj.get(src))
					System.out.print(src + " -> " + edge.value + " (" + edge.weight + ")\t");
				System.out.println();
				src++;
			}
		}
		
////////////////// Breadth First Search of graph ///////////////////////////////////////
		public void bfsGraph(Graph graph,int src){
			
			boolean visited[] = new boolean[adj.size()];
			LinkedList<Integer> queue = new LinkedList<>();
			
			visited[src] = true;
			queue.add(src);
			
			while(queue.size()!=0){
				src = queue.poll();
				System.out.println(src+" ");
				adj.get(src).stream().filter(x->!visited[x.value]).peek(x->queue.add(x.value)).peek(x->visited[x.value]=true).collect(Collectors.toList());			
			}
			
		}
		
		
}













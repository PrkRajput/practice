package graph;

import java.util.Arrays;
import java.util.List;

public class DriverClass {

	public static void main(String[] args) {
		// Input: List of edges in a weighted di graph (as per above diagram)
				// tuple (x, y, w) represents an edge from x to y having weight w
				List<Edge> edges = Arrays.asList(new Edge(0, 1, 6), new Edge(1, 2, 7),
												new Edge(5, 3, 3),	new Edge(5, 4, 6),
												new Edge(2, 0, 5), new Edge(2, 3, 4),new Edge(2, 5, 4),
												new Edge(3, 1, 10), new Edge(4, 5, 1),
												
												new Edge(5, 1, 4));

				// construct graph from given list of edges
				Graph graph = new Graph(edges);

				// print adjacency list representation of the graph
				graph.printGraph(graph);
				System.out.println();
				graph.bfsGraph(graph, 0);
	}
}

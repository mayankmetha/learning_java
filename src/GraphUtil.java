package graphs;

public class GraphUtil {
	public static void main(String args[]) {
		Graph graph = new Graph(5);
		graph.addEdge(1, 2);
		graph.addEdge(1, 3);
		graph.addEdge(2, 3);
		graph.addEdge(3, 4);
		graph.display(graph);
	}
	
}

package graphs;

import java.util.LinkedList;

public class Graph {
	int vertices;
	LinkedList[] adjacentVertices;
	public Graph(int vertices) {
		this.vertices = vertices;
		adjacentVertices = new LinkedList[vertices];
		for(int i=0;i<vertices;i++) {
			adjacentVertices[i] = new LinkedList();
		}
	}
	public void addEdge(int src,int dest) {
		if(src<=adjacentVertices.length&&dest<=adjacentVertices.length)
			adjacentVertices[src-1].add(dest);
		else 
			System.err.println("Adding vertices error (node limit exceeded) : "+src+" -> "+dest);
	}
	
	public static void display(Graph graph) {
		LinkedList[] temp = graph.adjacentVertices;
		for(int i = 0 ; i< temp.length; i++ ) {
			LinkedList list = temp[i];
			System.out.println((i+1)+" -> "+list.toString());
		}
	}
	
}

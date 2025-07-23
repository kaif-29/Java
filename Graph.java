package day17;
import java.util.*;
public class Graph {
	public static void addEdge(List<List<Integer>>adj,int i,int j) {
		adj.get(i).add(j);
		adj.get(j).add(i);
	}
		public static void displayAdjList(List<List<Integer>>adj) {
			for(int i=0;i<adj.size();i++){
				System.out.println(i+": ");
				for(int j:adj.get(i)) {
					System.out.println(j+"");
				}
				System.out.println();
					
				}
		}
			public static void bfs(List<List<Integer>>adj,int start)
			{
				boolean[]visited=new boolean[adj.size()];
				Queue<Integer>queue=new LinkedList<>();
				visited[start]=true;
				queue.offer(start);
				System.out.println("BFS Traversal start from:"+ start +":");
				while(!queue.isEmpty()) {
					int current=queue.poll();
					System.out.println(current+"");
					for(int neighbour:adj.get(current)) {
						if(!visited[neighbour]) {
							visited[neighbour]=true;
							queue.offer(neighbour);
						}
					}
				}
				System.out.println();
			
		}

	public static void main(String[] args) {
		int v=4;
		List<List<Integer>>adj=new ArrayList<>();
		for(int i=0;i<v;i++) {
			adj.add(new ArrayList<>());
		}
				addEdge(adj,0,1);
				addEdge(adj,0,2);
				addEdge(adj,1,2);
				addEdge(adj,2,3);
	
	System.out.println("Adajency List Represntation");
	displayAdjList(adj);
	bfs(adj,0);
	}

}

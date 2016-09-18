package BTree;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class MinHeightTrees {
	public static void main(String[] args) {
		MinHeightTrees mt = new MinHeightTrees();
		int[][] edges = { { 1, 0 } };
		mt.findMinHeightTrees(2, edges);
	}

	public List<Integer> findMinHeightTrees(int n, int[][] edges) {
		if (edges.length == 0) {
			return new ArrayList<Integer>();
		}
		List<List<Integer>> graph = new ArrayList<List<Integer>>();
		for (int i = 0; i < n; i++) {
			graph.add(new ArrayList<Integer>());
		}
		for (int i = 0; i < edges.length; i++) {
			graph.get(edges[i][0]).add(edges[i][1]);
			graph.get(edges[i][1]).add(edges[i][0]);
		}
		int[] levels = new int[graph.size()];
		int lastNode = bfs(graph, 0, levels);
		levels = new int[graph.size()];
		for(int i=0;i<levels.length;i++){
			levels[i] = -1;
		}
		int lastNode2 = bfs(graph, lastNode, levels);
		List<Integer> path = new ArrayList<Integer>();
		int count =0;
		while (lastNode2 != -1 && count < n) {
			path.add(lastNode2);
			lastNode2 = levels[lastNode2];
			count++;
		}
		List<Integer> result = new ArrayList<Integer>();
		if (path.size() % 2 == 0) {
			result.add(path.get(path.size() / 2 - 1));
			result.add(path.get(path.size() / 2));
			return result;
		} else {
			result.add(path.get(path.size() / 2));
			return result;
		}
	}

	// private void dfs(List<Integer>[] graph , List<Integer> visitedNodes,int
	// start,int length){

	// if(length > maxLengthSoFar){
	// maxLengthSoFar = length;
	// ma
	// }
	// List<Integer> list = graph.get(start);
	// for(Integer i : list){
	// if(isVisited[start]==false){
	// isVisited[i] = true;
	// visitedNodes.add(i);
	// for(Integet i : graph.get(i)){
	// dfs(graph ,visitedNodes);
	// }

	// }
	// }
	// }

	private int bfs(List<List<Integer>> graph, int start, int[] levels) {
		boolean[] isVisited = new boolean[graph.size()];
		Queue<Integer> queue = new LinkedList<Integer>();
		queue.add(start);
		int maxLength = Integer.MIN_VALUE;
		int lastNode = -1;
		int length = 0;
		while (!queue.isEmpty()) {
			isVisited[queue.peek()] = true;
			int u = queue.poll();
			for (Integer i : graph.get(u)) {
				if (!isVisited[i]) {
					queue.add(i);
					levels[i] = u;
				}
			}
			length++;
			if (maxLength < length) {
				maxLength = length;
				lastNode = u;
			}
		}
		return lastNode;
	}
}

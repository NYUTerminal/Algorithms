package Graph;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.PriorityQueue;
import java.util.Set;

public class Dijkstra<K> {

	public static void main(String[] args) {

	}

	public int shortestDistance(HashMap<K, List<K>> graph, K start, K end) {

		PriorityQueue<K> heap = new PriorityQueue<K>();
		Map<K, Integer> shortestSoFar = new HashMap<K, Integer>();
		Map<K, K> parent = new HashMap<K, K>();
		parent.con

		for (K keys : graph.keySet()) {
			heap.add(keys);
		}
		for (Entry e : parent.entrySet()) {
			System.out.println(e.getKey());
			System.out.println(e.getValue());
		}

		return 1;
	}

}

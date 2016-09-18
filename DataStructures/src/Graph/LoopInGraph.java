package Graph;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class LoopInGraph {

	public static void main(String[] args) {


	}

	private boolean isLoopExists(Map<Node, List<Node>> graph, Set<Node> visited, Node current) {
		if (visited.contains(current)) {
			return true;
		}
		for (Node children : graph.get(current)) {
			isLoopExists(graph, visited, children);
		}
		return false;

	}

}

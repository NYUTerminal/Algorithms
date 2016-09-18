package Graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Graph {

		public static void main(String[] args) {
			
		}
		
		
		
		public Map<Node, List<Node>> getSampleAcyclicGraph(){
			Map<Node,List<Node>> graph = new HashMap<Node,List<Node>>();
			List<Node> children = new ArrayList<>();
			children.add(new Node(2));
			children.add(new Node(3));
			children.add(new Node(8));
			graph.put(new Node(1),children);
			children = new ArrayList<>();
			graph.put(new Node(1),children);
			children.add(new Node(2));
			children.add(new Node(3));
			children.add(new Node(8));
			
			
			
			
			return null;
			
		}
}

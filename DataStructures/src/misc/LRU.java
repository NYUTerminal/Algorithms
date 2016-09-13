package misc;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;

class Node {

	int val;
	Node next;
	Node prev;

	Node(int val) {
		this.val = val;
	}

	@Override
	public int hashCode() {
		return val;
	}

}

public class LRU {

	private Map<Integer, Node> lru = new HashMap<Integer, Node>();

	private Node start = null;
	private Node end = null;

	public static void main(String[] args) {
		Queue<Integer> pq = new PriorityQueue<Integer>(new Comparator<Integer>() {

			@Override
			public int compare(Integer i, Integer j) {
				if (i > j) {
					return -1;
				} else if (i < j) {
					return 1;
				} else {
					return 0;
				}
			}

		});
		pq.add(5);
		pq.add(4);
		pq.add(8);
		pq.add(1);
		System.out.println(pq.poll());
		System.out.println(pq.poll());
		System.out.println(pq.poll());
		System.out.println(pq.poll());
		
	}

	private void insertNode(Node node) {
		if (start == null && end == null) {
			start = node;
			end = node;
			lru.put(node.hashCode(), node);
			return;
		} else {
			if (lru.containsKey(node.hashCode())) {
				start = lru.get(node.hashCode());
				Node prev = node.prev;
				Node next = node.next;
				prev.next = next;
				next.prev = prev;
			}
		}

	}

}

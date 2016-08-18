class Node {
	int data;
	Node link;

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public Node getLink() {
		return link;
	}

	public void setLink(Node link) {
		this.link = link;
	}

}

public class LinkedList {

	private static Node headReverse = null;

	private static void printList(Node root) {
		while (root != null) {
			System.out.println("\n" + root.getData());
			root = root.getLink();
		}
	}

	public static void main(String[] args) {
		Node n = new Node();
		n.setData(1);
		n.setLink(null);
		Node n1 = new Node();
		n1.setData(2);
		n1.setLink(n);
		Node n2 = new Node();
		n2.setData(3);
		n2.setLink(n1);
		Node n3 = new Node();
		n3.setData(4);
		n3.setLink(n2);
		Node n4 = new Node();
		n4.setData(5);
		n4.setLink(n3);
		Node n5 = new Node();
		n5.setData(6);
		n5.setLink(n4);
		printList(n5);
		deleteNode(1, n5);
		printList(n5);
		// mergeLinkedList(n5);
		// printList(n5);
		// reverseLinkedList(n5);
		// reverseLinkedList(n4, n5);
		// printList(reverseGeneral(n5));
		// printList(reverseBest(n5));
	}

	private static Node reverseLinkedList(Node currNode, Node prev) {
		if (currNode == null) {
			headReverse = prev;
			return currNode;
		}
		Node temp = reverseLinkedList(currNode.link, currNode);
		prev.link = temp;
		currNode.link = prev;
		return temp;
	}

	private static Node reverseLinkedList(Node currNode) {
		if (currNode.link == null && headReverse == null) {
			headReverse = currNode;
			return currNode.link;
		}
		if (currNode.link.link == null) {
			headReverse = currNode.link;
			currNode.link.link = currNode;
			currNode.link = null;
			return currNode;
		}
		Node temp = reverseLinkedList(currNode.link);
		currNode.link = temp.link;
		temp.link = currNode;
		temp = currNode;
		return temp;
	}

	private static Node reverseBest(Node now) {
		if (now == null) {
			return null;
		}
		if (now.link == null) {
			return now;
		}
		Node second = now.link;
		now.link = null;
		Node reverse = reverseBest(second);
		second.link = now;
		return reverse;
	}

	private static Node reverseGeneral(Node start) {
		Node current = null;
		Node prev = null;
		Node next = null;
		if (start == null) {
			return null;
		}
		if (start.link == null) {
			return start;
		}
		current = start;
		while (current != null) {
			next = current.link;
			current.link = prev;
			prev = current;
			current = next;
		}
		return prev;
	}

	private static void mergeLinkedList(Node root) {
		if (root == null) {
			return;
		}
		int n = getLength(root);
		Node second = root;
		Node first = root;
		for (int i = 0; i < n / 2; i++) {
			second = second.link;
		}

		/*
		 * for (int j = 0; i < n / 2; j++) { Node temp = first.link; first.link
		 * = second; second = second.link; first.link.link = temp;
		 * 
		 * }
		 */

		while (second != null) {
			Node temp = null;
			if (second.link != null) {
				temp = first.link;
			}
			first.link = second;
			second = second.link;
			first.link.link = temp;
			first = temp;
		}
	}

	private static int getLength(Node start) {
		int length = 0;
		Node temp = start;
		while (temp != null) {
			length++;
			temp = temp.link;
		}
		return length;
	}

	private static void deleteNode(int n, Node root) {
		Node temp = root;
		if (root.data == n) {
			root = root.link;
			return;
		}
		while (temp != null) {
			if (temp.data == n) {
				if (temp.link != null) {
					temp.data = temp.link.data;
					temp.link = temp.link.link;
					return;
				} else if (temp.link == null) {
					// wont work
					temp = null;
					return;
				}
			}
			temp = temp.link;
		}
	}
}

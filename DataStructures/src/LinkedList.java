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
		printList(n1);
	}

}

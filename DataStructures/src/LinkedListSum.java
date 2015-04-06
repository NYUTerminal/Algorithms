/**
 * 
 * @author MeanMachine
 * 
 */

public class LinkedListSum {

	public static void main(String[] args) {
		Node n = new Node();
		n.setData(1);
		n.setLink(null);
		Node n1 = new Node();
		n1.setData(2);
		n1.setLink(n);
		Node n2 = new Node();
		n2.setData(7);
		n2.setLink(n1);
		Node n3 = new Node();
		n3.setData(9);
		n3.setLink(n2);
		/*
		 * Node n4 = new Node(); n4.setData(5); n4.setLink(n3); Node n5 = new
		 * Node(); n5.setData(6); n5.setLink(n4);
		 */
		Node nn = new Node();
		nn.setData(3);
		nn.setLink(null);
		Node nn1 = new Node();
		nn1.setData(4);
		nn1.setLink(nn);
		Node nn2 = new Node();
		nn2.setData(2);
		nn2.setLink(nn1);
		Node nn3 = new Node();
		nn3.setData(9);
		nn3.setLink(nn2);
		// printList(n5);
		printList(addRecursively(nn3, n3));
		// Node addNormal = addNormal(n5, nn3);
		// printList(newSum);
	}

	private static void printList(Node root) {
		while (root != null) {
			System.out.println("\n" + root.getData());
			root = root.getLink();
		}
	}

	private static Node addNormal(Node n1, Node n2) {
		if (n1 == null) {
			return n2;
		}
		Node temp1 = n1;
		Node temp2 = n2;
		int carry = 0;
		Node n = null;
		while (temp1 != null) {
			Node next = new Node();
			if (temp2 != null) {
				int sum = temp1.data + temp2.data + carry;
				carry = (sum) / 10;
				next.setData(sum % 10);
				next.setLink(null);
				temp1 = temp1.link;
				temp2 = temp2.link;
				if (n == null) {
					n = next;
					continue;
				}
				addInTheEnd(n, next);
				continue;
			}
			int sum = temp1.data + carry;
			carry = (sum) / 10;
			next.setData(sum % 10);
			next.setLink(null);
			addInTheEnd(n, next);
			temp1 = temp1.link;
		}
		return n;
	}

	private static void addInTheEnd(Node root, Node end) {
		if (root == null) {
			root = end;
		}
		while (root.link != null) {
			root = root.link;
		}
		root.link = end;
	}

	private static Node addRecursively(Node n1, Node n2) {
		if (n1 == null) {
			return null;
		}
		// do padding for smaller one .
		if (n1.link == null) {
			Node next = new Node();
			int sum = n1.data + n2.data;
			next.setData(sum % 10);
			next.setLink(null);
			return next;
		}
		Node node = addRecursively(n1.link, n2.link);
		int carry = node.data / 10;
		node.data = node.data % 10;
		Node newNode = new Node();
		newNode.data = (n1.data + n2.data + carry);
		newNode.setLink(node);
		return newNode;
	}

}

/**
 * 
 * @author MeanMachine 
 * 		   To arrange all elements smaller than give 'X' should be
 *         before elements greater than 'X'
 */

public class XPartition {

	public static void main(String[] args) {
		Node n = new Node();
		n.setData(11);
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
		Node n4 = new Node();
		n4.setData(5);
		n4.setLink(n3);
		Node n5 = new Node();
		n5.setData(6);
		n5.setLink(n4);
		xPart(8, n5);
		printList(n5);
	}

	private static void printList(Node root) {
		while (root != null) {
			System.out.println("\n" + root.getData());
			root = root.getLink();
		}
	}

	private static void xPart(int x, Node root) {
		Node small = root;
		Node larger = root;
		while (larger != null) {
			if (larger.data > x) {
				small = larger;
				while (small != null && small.data > x) {
					small = small.link;
				}
				if (small == null) {
					return;
				}
				int temp = larger.data;
				larger.data = small.data;
				small.data = temp;
			}
			larger = larger.link;
		}
	}

}

package LinkedLists;

public class CloneLinkedList {

	public static void main(String[] args) {
		Node<Integer> root = new Node<Integer>(5);
		root.next = new Node<Integer>(61);
		root.next.next = new Node<Integer>(7);
		root.next.next.next = new Node<Integer>(82);
		root.next.next.next.next = new Node<Integer>(25);
		root.next.next.next.next.next = new Node<Integer>(68);
		new CloneLinkedList().cloneList(root);
	}

	private void cloneList(Node root) {
		System.out.println(root);
		
	}

}

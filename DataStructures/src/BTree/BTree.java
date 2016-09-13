package BTree;

/*
 *6
 * 4 5
 * 2893
 * 7   
 * 
 * 
 * 
 * 
 */

public class BTree {
	public BNode getSampleBTree() {
		BNode root = new BNode(6);
		root.left = new BNode(4);
		root.right = new BNode(5);
		root.left.left = new BNode(2);
		root.left.right = new BNode(8);
		root.right.left = new BNode(9);
		root.right.right = new BNode(3);
		root.left.left.left = new BNode(7);
		return root;
	}
	
	public BNode getSampleBTreeDup() {
		BNode root = new BNode(21);
		root.left = new BNode(4);
		root.right = new BNode(33);
		root.left.left = new BNode(2);
		root.left.right = new BNode(13);
		root.right.left = new BNode(92);
		root.right.right = new BNode(3);
		return root;
	}
	
	
}

class BNode {
	int val;
	BNode left;
	BNode right;

	BNode(int val) {
		this.val = val;
	}

}
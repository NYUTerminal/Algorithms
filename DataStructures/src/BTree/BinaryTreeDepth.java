package BTree;

public class BinaryTreeDepth {

	public static void main(String[] args) {
		BNode root = new BTree().getSampleBTree();
		System.out.println(new BinaryTreeDepth().depth(root));
	}

	private int depth(BNode root) {
		if (root == null) {
			return 0;
		}
		return Math.max(depth(root.left), depth(root.right)) + 1;
	}

}



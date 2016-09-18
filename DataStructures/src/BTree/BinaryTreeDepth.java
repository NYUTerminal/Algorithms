package BTree;

public class BinaryTreeDepth {

	public static void main(String[] args) {
		BNode root = new BTree().getSampleBTree();
		System.out.println(new BinaryTreeDepth().depth(root));
	}

	private int depth(BNode root) {
		return root == null ? 0 : Math.max(depth(root.left), depth(root.right)) + 1;
	}

}

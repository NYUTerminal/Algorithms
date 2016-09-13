package BTree;

public class BTreeLeafs {
	
	public static void main(String[] args) {
		BNode root = new BTree().getSampleBTree();
		new BTreeLeafs().printLeafs(root);
	}

	public void printLeafs(BNode root) {
		if (root == null) {
			return;
		}
		printLeafs(root.left);
		if (root.left == null && root.right == null) {
			System.out.println(root.val);
		}
		printLeafs(root.right);
	}

}

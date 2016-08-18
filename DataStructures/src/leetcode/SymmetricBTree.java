package leetcode;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class SymmetricBTree {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("test.txt"));
		br.readLine();
		BNode tree = new BNode(1);
		tree.left = new BNode(2);
		tree.right = new BNode(2);
		tree.left.left = new BNode(3);
		tree.left.right = new BNode(4);
		tree.right.left = new BNode(4);
		tree.right.right = new BNode(3);
		System.out.println(new SymmetricBTree().isSymmetric(tree,tree));
	}

	private boolean isSymmetric(BNode root, BNode root1) {
		if (root == null && root1 == null) {
			return true;
		}
		if (root == null || root1 == null) {
			return false;
		}
		return root.val == root1.val && isSymmetric(root.left, root1.right) && isSymmetric(root.right, root1.left);
	}

}

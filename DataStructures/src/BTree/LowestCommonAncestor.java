package BTree;

public class LowestCommonAncestor {

	private BNode getLowestCommonAncestor(BNode root, BNode first, BNode second) {
		if (root == null) {
			return null;
		}
		if (root == first || root == second) {
			return root;
		}
		BNode lowCommonFirst = getLowestCommonAncestor(root.left, first, second);
		BNode lowCommonSecond = getLowestCommonAncestor(root.right, first, second);
		return lowCommonFirst != null && lowCommonSecond != null ? root
				: (lowCommonFirst == null ? lowCommonSecond : lowCommonFirst);

	}

}

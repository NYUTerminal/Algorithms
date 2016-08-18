package leetcode;
import java.util.ArrayList;
import java.util.List;

public class RightViewOfBTree {
	public List<Integer> rightView(TreeNode root) {
		List<Integer> rightView = new ArrayList<Integer>();
		traversal(root,1,rightView);
		return rightView;
	}

	private void traversal(TreeNode root, int level, List<Integer> rightView) {
			if(root == null){
				return;
			}
			if(rightView.size()<level){
				rightView.add(root.val);
			}
			traversal(root.right,level+1,rightView);
			traversal(root.left,level+1,rightView);
	}
}

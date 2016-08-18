package leetcode;
class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }


public class LowestCommonAncestor {
	
	public static void main(String[] args) {
		
	}
	
	private TreeNode getLowestCA(TreeNode t,TreeNode p , TreeNode q){
		
		
		
		
		return t;
	}
	
	private static TreeNode getLowestUtil(TreeNode root , TreeNode p , TreeNode q){
		
		if(p.val<=root.val && q.val>root.val)
		
		return null;
	}

}

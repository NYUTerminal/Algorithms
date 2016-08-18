package leetcode;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class SymmetricMirror101 {
	public static void main(String[] args) {
		Queue<Integer> queue = new LinkedList<Integer>();
		Stack<Integer> stack = new Stack<Integer>();
		
	}
	    public boolean isSymmetric(TreeNode root) {
	        if(root == null){
	            return true;
	        }
	        return isSymmetric( root , root);
	    }
	    
	    private boolean isSymmetric(TreeNode leftT , TreeNode rightT){
	        if(leftT==null && rightT == null){
	            return true;
	        }
	        if(leftT==null || rightT == null){
	            return false;
	        }
	        return (leftT.val==rightT.val)&&isSymmetric(leftT.left,rightT.right)&&isSymmetric(leftT.right,rightT.left);
	    }
}

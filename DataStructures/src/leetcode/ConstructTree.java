package leetcode;

public class ConstructTree {
	/**
	 * Definition for a binary tree node.
	 * public class TreeNode {
	 *     int val;
	 *     TreeNode left;
	 *     TreeNode right;
	 *     TreeNode(int x) { val = x; }
	 * }
	 */
	public static void main(String[] args) {
		ConstructTree ct = new ConstructTree();
		int[] in = {1,3,2};
		int[] post = {3,2,1};
		ct.buildTree(in, post);
	}
	public TreeNode buildTree(int[] inorder, int[] postorder) {
        if(inorder.length ==0 && postorder.length ==0){
            return null;
        }
        return build(inorder, postorder,0,inorder.length-1, 0,postorder.length-1);
    }
    
    public TreeNode build(int[] inorder, int[]postorder,int inStart,int inEnd , int pStart,int pEnd){
        if(inStart<=inEnd && pStart<=pEnd){
            //TreeNode root = new TreeNode();
            TreeNode root = new TreeNode(postorder[pEnd]);
            int index = indexInInorder(inorder ,inStart , inEnd, postorder[pEnd]);
            // if(index==-1){
            //     return null;
            // }
            pEnd--;
            int left = index - inStart -1;
            int right = inEnd-index;
            root.left = build(inorder, postorder,inStart,index-1, pStart,pStart+left);
            root.right = build(inorder, postorder,index+1,inEnd, pEnd-right,pEnd);
            return root;
        }else{
            return null;
        }
    }
    
    public int indexInInorder(int[] inorder,int start , int end , int target){
        for(int i=start;i<=end;i++){
            if(inorder[i] == target){
                return i;
            }
        }
        return -1;
    }
}

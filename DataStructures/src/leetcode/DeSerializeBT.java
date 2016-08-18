package leetcode;
import java.util.LinkedList;
import java.util.Queue;

public class DeSerializeBT {
	
	public static void main(String[] args) {
		DeSerializeBT ds = new DeSerializeBT();
		String s = "12";
		int i = Integer.valueOf(s);
		TreeNode root = ds.constructTree("1,2,3,6,7,4,5,$,$,$,$,$,$,$,$");
		System.out.println(ds.serializeBT(root));
	}
	private TreeNode constructTree(String levelOrder){
		if(levelOrder.equals("")){
			return null;
		}
		 return constructTree(levelOrder.split(",") ,0);
	}
	
	
	private TreeNode constructTree(String[] levelOrder , int index){
		if(index>levelOrder.length){
			return null;
		}
		if(levelOrder[index].equals("$")){
			return null;
		}
		TreeNode tempRoot = null;
		tempRoot = new TreeNode(Integer.valueOf(levelOrder[index]));
		tempRoot.left = constructTree(levelOrder , 2*index+1);
		tempRoot.right = constructTree(levelOrder , 2*index+2);
		return tempRoot;
	}
	
	
	private String serializeBT(TreeNode root){
		if(root == null){
			return null;
		}
		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		queue.add(root);
		
		StringBuffer sb = new StringBuffer();
		while(!queue.isEmpty()){
			TreeNode currentNode = queue.poll();
			sb.append(currentNode.val);
			if(currentNode.left== null){
//				queue.add("$");
			}else{
				queue.add(currentNode.left);
			}
			if(currentNode.right== null){
				sb.append("$");
			}else{
				queue.add(currentNode.right);
			}
		}
		return sb.toString();
	}
}

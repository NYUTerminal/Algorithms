package leetcode;
import java.util.LinkedList;
import java.util.Queue;

class TreeLinkNode {
     int val;
     TreeLinkNode left, right, next;
TreeLinkNode(int x) { val = x; }
 }

public class NextPointerBtree116 {
	public static void main(String[] args) {
	
	}
	
	 public void connect(TreeLinkNode root) {
		 root.next = null;
		 while(root.left!=null){
			 TreeLinkNode temp = root;
			 while(temp!=null){
				 root.left.next = root.right;
				 if(root.next!=null){
					 root.right.next = root.next.left;
				 }
				 temp = temp.next;
			 }
			 root = root.left;
		 }
	 }
}

/*
 * /**
 * Definition for binary tree with next pointer.
 * public class TreeLinkNode {
 *     int val;
 *     TreeLinkNode left, right, next;
 *     TreeLinkNode(int x) { val = x; }
 * }
 */
//public class Solution {
//    public void connect(TreeLinkNode root) {
//        if(root == null){
//            return;
//        }
//        Queue<TreeLinkNode> queue = new LinkedList<TreeLinkNode>();
//        queue.add(root);
//        int count =1;
//        while(queue.peek()!=null){
//            int tempCount = count;
//            while(tempCount>0){
//                TreeLinkNode currentNode = queue.poll();
//                if(tempCount == 1){
//                    currentNode.next = null;
//                    pushLeftRightToQueue(queue,currentNode);
//                    break;
//                }
//                pushLeftRightToQueue(queue,currentNode);
//                currentNode.next = queue.peek();
//                tempCount--;
//            }
//            count *=2;
//        }
//    }
//    
//    private void pushLeftRightToQueue(Queue queue , TreeLinkNode node){
//        if(node.left!=null){
//            queue.add(node.left);
//        }if(node.right!=null){
//            queue.add(node.right);
//        }
//    }
//}
 

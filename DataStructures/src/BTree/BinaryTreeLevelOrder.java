package BTree;
import java.util.*;


public class BinaryTreeLevelOrder{
  
  public static void main(String[] args){
	  
      BNode root = new BNode(1);
      root.left = new BNode(2);
      root.right = new BNode(3);
      new BinaryTreeLevelOrder().printLevels(root);
  }
  
  private void printLevel(BNode root){
      
    if(root == null){
      return;
    }
    
    Queue<BNode> queue = new LinkedList<BNode>();
    queue.add(root);
    while(queue.isEmpty()){
      int size = queue.size();
        for(int i=0;i<size;i++){
          BNode temp = queue.poll();
          System.out.print(temp.val);
          if(temp.left!=null){
            queue.add(temp.left);
          }
          if(temp.right!=null){
            queue.add(temp.right);
          }
        }
      System.out.println("\n");
    }
  }
  
  public void printLevels(BNode root){
	    if(root == null){
	      return;
	    }
	    Queue<BNode> queue = new LinkedList<BNode>();
	    queue.add(root);
	    while(!queue.isEmpty()){
	        BNode current = queue.poll();
	        System.out.print(current.val);
	        if(current.left!=null)queue.add(current.left);
	        if(current.right!=null) queue.add(current.right);
	    }
	  }
  
  
}

class BNode{
  int val;
  BNode left;
  BNode right;
  public BNode(int v){
    this.val = v;
    this.left = null;
    this.right = null;
  }
  
}
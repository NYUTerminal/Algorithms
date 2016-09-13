package BTree;

public class IsSameTree {
	
	public static void main(String[] args) {
		BNode first = new BTree().getSampleBTree();
		BNode second = new BTree().getSampleBTreeDup();
		boolean result = new IsSameTree().isSameTree(first,second);
		System.out.println(result);
	}
	
	private boolean isSameTree(BNode first , BNode second){
		if(first==null && second==null){
			return true;
		}
		if(first==null || second ==null){
			return false;
		}
		if(first.val!=second.val){
			return false;
		}
		return isSameTree(first.left,second.left) && isSameTree(first.right,second.right); 
	}

}

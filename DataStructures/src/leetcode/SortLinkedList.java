package leetcode;

public class SortLinkedList {
	/**
	 * Definition for singly-linked list.
	 * public class ListNode {
	 *     int val;
	 *     ListNode next;
	 *     ListNode(int x) { val = x; }
	 * }
	 */
	public static void main(String[] args) {
		SortLinkedList sl = new SortLinkedList();
		ListNode root = new ListNode(2);
		root.next = new ListNode(1);
		sl.sortList(root);
	}
	    public ListNode sortList(ListNode head) {
	        if(head == null || head.next==null) return head;
	        ListNode mid = middleOfList(head);
	        ListNode rightHead = mid.next;
	        mid.next = null;
	        //System.out.println(mid.val);
	        return merge(sortList(head),sortList(rightHead));
	    }
	    
	    private ListNode merge(ListNode left , ListNode right){
	        ListNode root = new ListNode(0);
	        ListNode temp = root;
	        while(left!=null && right!=null){
	            if(left.val<=right.val){
	                temp.next = left;
	                left = left.next;
	            }else{
	                temp.next = right;
	                right = right.next;
	            }
	        }
	        if(left!=null){
	            temp.next = left;
	        }else{
	            temp.next = right;
	        }
	        return root.next;
	    }
	    
	    private ListNode middleOfList(ListNode head){
	        if(head == null) return null;
	        ListNode prev = null;
	        ListNode slow = head;
	        ListNode fast = head;
	        while(fast!=null && fast.next!=null){
	            prev = slow;
	            fast = fast.next.next;
	            slow = slow.next;
	        }
	        return prev;
	    }
}

package leetcode;

 // Definition for singly-linked list.
  class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }

public class RemoveDuplicates83 {
	public static void main(String[] args) {
		RemoveDuplicates83 rd = new RemoveDuplicates83();
		ListNode head = new ListNode(1);
		head.next = new ListNode(1);
		head.next.next = new ListNode(2);
		head.next.next.next = null;
		rd.deleteDuplicates(head);
	}
	 public ListNode deleteDuplicates(ListNode head) {
	        ListNode nextNode = head;
	        ListNode newHead = head;
	        if(head == null){
	            return head;
	        }
	        while(head!=null && head.next!=null){
	            while(nextNode.next!=null && nextNode.next.val != nextNode.val){
	                nextNode = nextNode.next;
	            }
	            head.next = nextNode.next;
	            head = head.next;
	            nextNode = head;
	        }
	        return newHead;
	    }
}

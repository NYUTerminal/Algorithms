package leetcode;

public class DeleteNthNodeFromEnd {
	public static void main(String[] args) {
		 char[] dict = new char[256];
		 int a =1;
		 int c = a;
		 int c1 = Integer.MAX_VALUE+2;
		 System.out.println(c1);
	}
	   public ListNode removeNthFromEnd(ListNode head, int n) {
	        if(head == null){
	            return null;
	        }
	        ListNode front = head;
	        ListNode back = head;
	        while(n>0){
	            if(front.next==null){
	                return null;
	            }
	            front = front.next;
	            n--;
	        }
	        while(front.next!=null){
	            front = front.next;
	            back = back.next;
	        }
	        if(front == head){
	            head = head.next;
	            return head;
	        }else{
	            back.next = back.next.next;
	            return head;
	        }
	    }
}

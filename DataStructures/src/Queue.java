class ListNode{
   int val;
   ListNode next = null;
   
   public ListNode(int x){
	   this.val = x;
   }
}
/*
 *    1 > 2 > 3 > 4 > 5
 * 
 */
public class Queue {
	private ListNode front = null;
	private ListNode rear = null;
	private int size = 0;
	
	public static void main(String[] args) {
			Queue q = new Queue();
			q.enqueue(2);
			q.enqueue(3);
			System.out.println(q.dequeue());
			System.out.println(q.size());System.out.println(q.dequeue());
			System.out.println(q.size());
	}
	
	public void enqueue(int val){
		if(rear ==null){
			ListNode root = new ListNode(val);
			front = root;
			rear = root;
		}else{
			ListNode temp = new ListNode(val);
			rear.next = temp ;
			rear = rear.next;
		}
		size++;
	}
	
	public Integer dequeue(){
		if(front!=null){
			int val = front.val;
			front = front.next;
			size--;
			return val;
		}
			return null;
	}
	
	public Integer size(){
		return size;
	}
	
	public boolean isEmpty(){
		return rear!=null ? true : false;
	}
	
}

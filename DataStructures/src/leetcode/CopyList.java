package leetcode;
public class CopyList {
	
	public static void main(String[] args) {
		RandomListNode root = new RandomListNode(-1);
		
		RandomListNode temp = new CopyList().copyRandomList(root);
		System.out.println(temp);
	}
	public RandomListNode copyRandomList(RandomListNode head) {
		if (head == null) {
			return head;
		}
		RandomListNode tempHead = head;
		while (tempHead != null) {
			RandomListNode temp = new RandomListNode(tempHead.label);
			RandomListNode tempNext = tempHead.next;
			tempHead.next = temp;
			temp.next = tempNext;
			tempHead = tempHead.next.next;
		}
		tempHead = head;
		while (tempHead != null) {
			if (tempHead.random != null) {
				tempHead.next.random = tempHead.random.next;
			}
			tempHead = tempHead.next.next;
		}
		tempHead = head;
		RandomListNode tempNewStart = new RandomListNode(-1);
		RandomListNode newStart = tempNewStart;
		while (tempHead != null && tempHead.next != null) {
			RandomListNode nextNode = tempHead.next.next;
			tempNewStart.next = tempHead.next;
			tempHead.next = nextNode;
			tempHead = tempHead.next;
			tempNewStart = tempNewStart.next;
		}
		tempNewStart.next = null;
		return newStart.next;
	}
}

class RandomListNode {
	int label;
	RandomListNode next, random;

	RandomListNode(int x) {
		this.label = x;
	}
};
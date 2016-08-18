package leetcode;
import java.util.Comparator;
import java.util.PriorityQueue;



public class CycleInList160 {
	public static void main(String[] args) {
		String s = "temp";
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>(new Com);
		pq.add(3);
		pq.add(2);
		pq.add(5);
		pq.add(1);
		System.out.println(pq.poll());
		System.out.println(pq.peek());
	}
	public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
		if (headA == null && headB == null) {
			return null;
		}
		if (headA == null || headB == null) {
			return null;
		}
		int countA = 0;
		int countB = 0;
		ListNode tempA = headA;
		ListNode tempB = headB;
		while (tempA != null) {
			countA++;
			tempA = tempA.next;
		}
		while (tempB != null) {
			countB++;
			tempB = tempB.next;
		}
		tempA = headA;
		tempB = headB;
		if (countA > countB) {
			for (int i = 0; i < countA - countB; i++) {
				tempA = tempA.next;
			}
		} else {
			for (int i = 0; i < countB - countA; i++) {
				tempB = tempB.next;
			}
		}
		while (tempA != null && tempB != null) {
			if (tempA == tempB) {
				return tempA;
			} else {
				tempA = tempA.next;
				tempB = tempB.next;
			}
		}
		return null;
	}
}

import java.util.Comparator;
import java.util.PriorityQueue;

class MyComparator implements Comparator<Integer> {

	@Override
	public int compare(Integer o1, Integer o2) {
		return o2 - o1;
	}
}

public class PriorityQueueClass {

	public static void main(String[] args) {
		PriorityQueue<Integer> minHeap = new PriorityQueue<Integer>(20,
				new MyComparator());
		minHeap.add(4);
		minHeap.add(5);
		minHeap.add(1);
		minHeap.add(10);
		minHeap.add(11);
		minHeap.add(6);
		minHeap.add(9);
		minHeap.add(8);
		System.out.println(minHeap.peek());
		System.out.println(minHeap.remove());
		System.out.println("elements in min heap");
		for (Integer i : minHeap) {
			System.out.println(i);
		}
	}

}

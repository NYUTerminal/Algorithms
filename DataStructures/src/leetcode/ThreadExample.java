package leetcode;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

public class ThreadExample {
	public static void main(String[] args) {
		
	}
	
	public void sampleQueue(){
		Queue<Integer> queue = new ConcurrentLinkedQueue<Integer>();
		queue.add(1);
		
	}

}

class Person implements Runnable {
	Queue<Integer> queue = new ConcurrentLinkedQueue<Integer>();
	private final int capacity =100;
	@Override
	public void run() {
		try {
			Thread.sleep(2000);
			System.currentTimeMillis();
			Math.abs(12);
			System.out.println("Printing");
		} catch (InterruptedException ie) {

		}

	}
	
	
	public boolean tryConsume(int tId,String name){
		synchronized (queue) {
			if(queue.size()<capacity){
				queue.add(tId);
			}
		}
		return false;
	}
}
	
	
package leetcode;
import java.util.LinkedList;
import java.util.Queue;

class BlockingQueue<K> {

	private Queue<K> queue;
	private int MAX_SIZE;

	public BlockingQueue(int capacity) {
		queue = new LinkedList<K>();
		this.MAX_SIZE = capacity;

	}

	public boolean addValue(K input) throws InterruptedException {

		synchronized (queue) {

			while (queue.size() == MAX_SIZE) {
				queue.wait();
			}

			queue.add(input);

			if (queue.size() == 1) {
				queue.notifyAll();
			}
			return true;
		}
	}

	public K remove() throws InterruptedException {
		synchronized (queue) {

			while (queue.isEmpty()) {
				queue.wait();
			}

			K val = queue.poll();

			if (queue.size() == MAX_SIZE - 1) {
				queue.notifyAll();
			}
			return val;
		}

	}

}

class BlockingQueueTest {

	public static void main(String[] args) {

		BlockingQueue<Integer> bq = new BlockingQueue<Integer>(20);

		Producer p = new Producer(bq);
		Consumer c = new Consumer(bq);
		new Thread(p).start();
		new Thread(c).start();
	}

}

class Producer implements Runnable {

	private BlockingQueue<Integer> blockingQueue;

	public Producer(BlockingQueue<Integer> bq) {
		this.blockingQueue = bq;
	}

	@Override
	public void run() {
		int count = 0;
		while (true) {
			try {
				Thread.sleep(500);
				System.out.println("Adding :" + (count));
				blockingQueue.addValue(count++);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}

class Consumer implements Runnable {

	private BlockingQueue<Integer> blockingQueue;

	public Consumer(BlockingQueue<Integer> bq) {
		this.blockingQueue = bq;
	}

	@Override
	public void run() {
		while (true) {
			try {
				Thread.sleep(2000);
				System.out.println(blockingQueue.remove());
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

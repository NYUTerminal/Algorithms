package leetcode;
import java.util.Comparator;
import java.util.PriorityQueue;

public class LiftDesign {
	static double d = 0.012;
	public static void main(String[] args) {
		System.out.println(d);
	}
}


class elevator{
	
	public Direction direction ;
	
	public int floor;
	
	
	
	
	public void goUp(){
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
}

class Global{
	
	private static Global instance;
	
	//MinQueue.
	public PriorityQueue<Integer> upQueue = new PriorityQueue<Integer>();
	
	public PriorityQueue<Integer> downQueue = new PriorityQueue<Integer>();
	
	
	private Global(){
		
	}
	
	public Global getInstance(){
		return instance;
	}
	
	
	
}

enum Direction{
	UP,DOWN,STILL;
}

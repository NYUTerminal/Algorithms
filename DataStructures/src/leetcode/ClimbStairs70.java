package leetcode;

public class ClimbStairs70 {
	
	public static void main(String[] args) {
		ClimbStairs70 cs = new ClimbStairs70();
		System.out.println(cs.climbStairs(40));
	}
	    
	    public int climbStairs(int n) {
	        int[] record = new int[n];
	        return climbStairsUtil(n,record);
	    }

	    private static int climbStairsUtil(int n , int[] record){
	        if(n==0){
	            return 0;
	        }
	        if(n==1 || n==2){
	            return 1;
	        }
	        int one;
	        int two;
	        if(record[n-1]!=0){
	           one = record[n-1];
	        }else{
	            record[n-1] = climbStairsUtil(n-1,record);
	            one = record[n-1];
	        }
	         if(record[n-2]!=0){
	           two = record[n-2];
	        }else{
	            record[n-2] = climbStairsUtil(n-2,record);
	            two = record[n-2];
	        }
	        return one + two;
	    }
}

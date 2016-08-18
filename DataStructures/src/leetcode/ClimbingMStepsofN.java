package leetcode;

public class ClimbingMStepsofN {
	
	public static void main(String[] args) {
		
	}
	
	private int numberofWays(int s , int m){
		int[] record = new int[s+1];
		record[0] = 1;
		record[1] = 1;
		for(int i =2;i<=s;i++){
			for(int j=1;j<m&&j<i;j++){
				record[i]+=record[i-j];
			}
		}
		
		
		return 0;
	}

}

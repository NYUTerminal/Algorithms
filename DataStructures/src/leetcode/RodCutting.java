package leetcode;

public class RodCutting {
	
	public static void main(String[] args) {
		
		
	}
	
	private int maxProfit(int[][] rod){
		
		
		
		
		//1 2 3 4  5  6  7 
		//3 5 7 6 14  2  9
		
		
		// 10
		
		
		
		//        3                             4
		// 111    12               1111    13 22 4 
		
		// 1 2 11 3 111 12 4 1111 13 22
		//temp[n]
		/*
		 *  temp[0] = 1
		 *  temp[1] = 1
		 *
		 *    4*0 0*4
		 *    3*1 1*3
		 *    2*2 2*2
		 *	  1*3 3*1
		 *
		 *
 			for(int i = 1;i<=n;i++){	     
			     int priceMax = i*temp[0];
			     for(intj=1;j<i && j<=m;j++){
			     	primeMax =  Math.max(priceMax, (i-j)*temp[i-j] + j*temp[j]);
			     }
			     temp[i] = priceMax;
			
			}
		
		
		*/
		int n = 10,m=5;
		int[] cache = new int[n+1];
		int[] price = new int[5];
		//cache[0] = 0;
		for(int i =1;i<n;i++){
			int tempPrice = 0;
			for(int j =0;j<i && j<m;j++){
				tempPrice = Math.max(price[j] + cache[i-j-1],tempPrice);
			}
			cache[i] = tempPrice;
		}
		return cache[n];
	}

}

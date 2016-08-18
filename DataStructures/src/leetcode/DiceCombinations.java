package leetcode;

public class DiceCombinations {
	
	public static void main(String[] args) {
		DiceCombinations dc = new DiceCombinations();
		System.out.println(dc.totalCombinations(3));
	}
	// 1 2
	public long totalCombinations(int n){
		long[] cache = new long[n+1];
		cache[0] =1;
		for(int i=1;i<n+1;i++){
			long comb =0;
			for(int j=0;j<i&&j<6;j++){
				comb +=cache[i-j-1];
			}
			cache[i] = comb;
		}
		return cache[n];
	}

}

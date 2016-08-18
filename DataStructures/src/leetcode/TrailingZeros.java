package leetcode;

public class TrailingZeros {
	public static void main(String[] args) {
		TrailingZeros tz = new TrailingZeros();
		System.out.println(tz.trailingZeroes(1808548329));
		System.out.println(tz.trailingZeroes1(1808548329));
	}
	public int trailingZeroes(int n) {
        int count =0;
        if(n<0){
            return -1;
        }
        if(n==0){
            return 0;
        }
        for(int i=5;n/i>=1;i*=5){
           count+=n/i;     
        }
        return count;
    }
	
	public int trailingZeroes1(int n) {
	       int sum = 0;
	       int count = 1;
	       while((n/Math.pow(5,count))>=1){
	           sum = sum + n/(int)Math.pow(5,count);
	           count = count+1;
	       }
	       return sum;
	    }
}

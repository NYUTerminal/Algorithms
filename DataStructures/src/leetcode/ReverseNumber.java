package leetcode;

public class ReverseNumber {
	public static void main(String[] args) {
		ReverseNumber r = new ReverseNumber();
		System.out.println((int)Math.pow(10,10-1));
		System.out.println((Integer.MAX_VALUE));
		System.out.println(r.reverse(Integer.MAX_VALUE-1));
	}
	 public int reverse(int x) {
	        if(0<=x && x<10){
	            return x;
	        }
	        if(x==Integer.MIN_VALUE){
	            return 0;
	        }
	        boolean negative = false;
	        if(x<0){
	            negative = true;
	            x = x*(-1);
	        }
	        int count = 0;
	        int tempX = x;
	        while(tempX>0){
	            tempX/=10;
	            count++;
	        }
	        int result =0;
	        while(x>0){
	            result+=(x%10)*(int)Math.pow(10,count-1);
	            x/=10;
	            count--;
	            if(result<0){
	                return 0;
	            }
	        }
	        return negative ? result*(-1):result;
	    }
}

package leetcode;

public class DivideTwoNumbers {
	
	public static void main(String[] args) {
		DivideTwoNumbers dn = new DivideTwoNumbers();
		System.out.println(dn.divide(-2147483648, -1));	
	}
	
	 public int divide(int dividend, int divisor) {
	        boolean isNegative = false;
	        if(dividend < 0 && divisor > 0 || dividend > 0 && divisor < 0 ){
	            isNegative = true;
	        }
	        if(divisor == 1 && dividend==Integer.MAX_VALUE){
	        	return dividend;
	        }
	        long dividendLong = Math.abs((long)dividend);
	        long divisorLong = Math.abs((long)divisor);
	        int result = 0;
	        while(dividendLong >= divisorLong){
	        	long tempDivisor = divisorLong;
	        	long tempResult =1;
	            while((tempDivisor<<1)<=dividendLong){
	                tempResult = tempResult<<1;
	                tempDivisor = tempDivisor<<1;
	            }
	            dividendLong -= tempDivisor;
	            result += tempResult;
	        }
	        
	        return isNegative? (0-result) : result;
	    }
}

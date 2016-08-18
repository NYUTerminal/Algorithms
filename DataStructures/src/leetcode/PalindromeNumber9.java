package leetcode;

public class PalindromeNumber9 {
	public static void main(String[] args) {
		PalindromeNumber9 p = new PalindromeNumber9();
		System.out.println((Integer.MAX_VALUE)*-1);
		p.isPalindrome(-1);
	} 
	
	public boolean isPalindrome(int x) {
		 int tempX = x;
	        if(x==Integer.MIN_VALUE){
	            tempX = Integer.MAX_VALUE;
	        }else if(x<0){
	            tempX *= -1;
	        }
	        int count = 0;
	        while(tempX>0){
	            tempX/=10;
	            count++;
	        }
	        if(count ==1){
	            return true;
	        }
	        for(int i =0;i<count/2;i++){
	            if((x/10*(count-i-1)) != (x/10*i+1)){
	                return false;
	            }
	        }
	        return true;
	}
}

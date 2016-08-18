package leetcode;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class HappyNumber202 {
	public static void main(String[] args) {
		HappyNumber202 hp = new HappyNumber202();
		System.out.println(hp.isHappy(3));
		System.out.println(Integer.MAX_VALUE&8);
		Stack<Integer> sk = new Stack<Integer>();
	}
	
    public boolean isHappy(int n) {
        HashSet<Integer> cache = new HashSet<Integer>();
        while(true){
            n = getSquareSum(n);
            if(n == 1){
                return true;
            }
            if(cache.contains(n)){
                return false;
            }else{
                cache.add(n);
            }
        }
    }
    
    private static int getSquareSum(int n){
        int temp =0;
        while(n>0){
            temp+= (n%10) * (n%10);
            n /=10;
        }
        return temp;
    }
}

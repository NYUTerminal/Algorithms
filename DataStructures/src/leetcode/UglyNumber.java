package leetcode;
import java.util.ArrayList;
import java.util.HashSet;

public class UglyNumber {
	
	public static void main(String[] args) {
		System.out.println(13%2);
		HashSet<Integer> ss = new HashSet<Integer>();
		ss.contains(1);
		int num = 232332323;
		int num2=10,p=10;
		System.out.println(String.valueOf(num).toCharArray()[3]);
		long temp = (long)Math.pow(5, 2);
		System.out.println(temp);
		System.out.println((long)Math.pow(Character.getNumericValue('2'), 2));
		ArrayList<Integer> ss = new ArrayList<Integer>();
		ss.
	}
	public boolean isUgly(int num) {
        if(num == 0){
            return false;
        }
        if(num == 1){
            return true;
        }
        int[] prime = {2,3,5};
        int tempNum = num;
        for(int i = 0;i<prime.length;i++){
            while(tempNum%prime[i]==0){
                tempNum /= prime[i];
                if(tempNum == 0){
                    return true;
                }
            }
        }
        return (tempNum==0) ?  true : false;
    }
}

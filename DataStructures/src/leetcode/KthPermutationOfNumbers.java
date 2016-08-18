package leetcode;
import java.util.HashSet;
import java.util.Set;

public class KthPermutationOfNumbers {
	public static void main(String[] args) {
		KthPermutationOfNumbers perm = new KthPermutationOfNumbers();
		System.out.println(perm.getPermutation(3, 5));
	}
	    public String getPermutation(int n, int k) {
	        
	        int[] fact = new int[n+1];
	        fact[0] = 1;
	        int tempN = n;
	        Set<Integer> used = new HashSet<Integer>();
	        for(int i =1;i<=n;i++){
	        	used.add(i);
	            fact[i] = i*fact[i-1];
	        }
	        int[] result = new int[n];
	        for(int i=0;i<tempN;i++){
	            if(n==0){
	                break;
	            }
	            for(int j = 1;j<=tempN;j++){
	                if(!used.contains(j)){
	                    continue;
	                }
	                if(k>fact[n-1]){
	                    k-=fact[n-1];
	                    continue;
	                }else{
	                    used.remove(j);
	                    result[i] = j;
	                    n = n-1;
	                    break;
	                }
	            }
	        }
	        StringBuffer sb = new StringBuffer();
	        for(int i= 0;i<tempN;i++){
	            sb.append(result[i]+"");
	        }
	        return sb.toString();
	    }
}
